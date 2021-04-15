package it.unipd.chess.m2m.marte2mast.common;
/*---------------------------------------------------------------------
--                           Marte2Mast                              --
--      Converter of Schedulability analysis models made with UML2   --
--   and The UML Profile for MARTE to MAST, the Analysis Suite for   --
--                      Real-Time Applications                       --
--                                                                   --
--                     Copyright (C) 2010-2011                       --
--                 Universidad de Cantabria, SPAIN                   --
--                                                                   --
--                                                                   --
--           URL: http://mast.unican.es/umlmast/marte2mast           --
--                                                                   --
--  Authors: Alvaro Garcia Cuesta   alvaro@binarynonsense.com        --
--           Julio Medina           julio.medina@unican.es           --
--           Alessandro Zovi		azovi@math.unipd.it				 --
--                                                                   --
-- This program is free software; you can redistribute it and/or     --
-- modify it under the terms of the GNU General Public               --
-- License as published by the Free Software Foundation; either      --
-- version 2 of the License, or (at your option) any later version.  --
--                                                                   --
-- This program is distributed in the hope that it will be useful,   --
-- but WITHOUT ANY WARRANTY; without even the implied warranty of    --
-- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU --
-- General Public License for more details.                          --
--                                                                   --
-- You should have received a copy of the GNU General Public         --
-- License along with this program; if not, write to the             --
-- Free Software Foundation, Inc., 59 Temple Place - Suite 330,      --
-- Boston, MA 02111-1307, USA.                                       --
--                                                                   --
---------------------------------------------------------------------*/

import it.unipd.chess.m2m.marte2mast.Activator;
import it.unipd.chess.m2m.marte2mast.preferences.PreferenceUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.m2m.internal.qvt.oml.emf.util.EmfUtil;
import org.eclipse.m2m.internal.qvt.oml.emf.util.ModelContent;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaExecHost;
import org.eclipse.papyrus.infra.core.resource.ModelException;
import org.eclipse.papyrus.infra.core.resource.ModelMultiException;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.uml2.uml.util.UMLUtil;

import javax.swing.JFrame;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.polarsys.chess.chessmlprofile.Core.CHESS;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.core.util.uml.UMLUtils;
import org.polarsys.chess.core.views.ViewUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.eclipse.uml2.uml.Package;

/**
 * This class contains a series of methods used to invoke the MAST tool and recover 
 * the data from its output files.
 * 
 * <p>The methods <code>openGmast</code> and <code>recoverMastResults</code> are called from the marte2mast.mtl 
 * template (Acceleo). Both methods only do something if the relevant properties of the SaAnalysisContext in the input model 
 * say so. 
 */
public class Mast {
	
	/** The Resource where we store the model data to be saved on file (xmi), UML:model and stereotypes. */
	static Resource mModelResource;	
	/** MAST will only be invoked if this is <code>true</code> */
	static boolean mOpenGmast=true;//opens mast if it is installed where it should be :) (i.e. eclipse/mast/)
	//save mast results into the model and save it to a file
	/** The results from MAST will only be saved if this is <code>true</code>. */
	static boolean mRecoverResults=true;
	/** If this is <code>true</code> it will delete previous values to store the new one. 
	 * <p>If <code>false</code> it will append the new value to the old ones.*/
	static boolean mOverwriteResults=false;
	/** If this is <code>true</code> it will save the new model with the same name as the input one and
	 *  delete the previous output model, if exits and has the same name. 
	 * <p>If <code>false</code> it will save it with a new name*/
	static boolean mOverwriteOutputModel=true;
	/** Used to generate the mode attribute in some NFP values so values from different invocations are distinguishable.
	 *  <p>the string must be surrounded by single quotes, example: 'aModeString'
	 *  <p>valid characters: a-z A-Z - _ : .
	 *  <p>NEVER use commas or %
	 * */
	static String mModeID="";
	/** Date stamp, used to create a unique new model name. This is set when the analysis context is read. */
	static java.util.Date mDate;
	
	static public class internalEventDataXML{
		String mName;
		String mWorstGlobalTime;
		String mBestGlobalTime;
		String mJitters;
		String mWorstBlockT;
		internalEventDataXML(){
			mName="";
			mWorstGlobalTime="";
			mBestGlobalTime="";
			mJitters="";
			mWorstBlockT="";
		}		
	}//end internalEventDataXML	
	
	static public class transactionDataXML{
		String mName;
		String mSlack;
		Vector<internalEventDataXML> mInternalEvents;
		transactionDataXML(){
			mName="";
			mSlack="";
			mInternalEvents=new Vector<internalEventDataXML> ();
		}
	}//end transactionDataXML
	
	static public class processingDataXML{
		String mName;
		String mSlack;
		String mUtilization;
		processingDataXML(){
			mName="";
			mSlack="";
			mUtilization="";
		}
	}//end transactionDataXML
	
	//ADDED by Alessandro Zovi
	static public class sharedDataXML{
		String mName;
		String mCeiling;
		String mQueueSize;
		String mUtilization;
		sharedDataXML(){
			mName="";
			mCeiling="";
			mQueueSize="";
			mUtilization="";
		}
	}
	
	/** Used to store the transactions' data we extract from the XML file*/
	static Vector<transactionDataXML> transactionsXML;
	/** Used to store the processing resources' data we extract from the XML file*/
	static Vector<processingDataXML> processingXML;
	
	static Vector<sharedDataXML> sharedXML;
	/** Used to store if the context is schedulable - from the XML file*/
	static String mGlobalSlackXML=null;
	private static int exitValue = 3;
	private static String analysisResult;
	private static String tools;
	
	public static Status getExitStatus(){
		switch (exitValue) {
		case 0:
			return new Status(IStatus.OK, Activator.PLUGIN_ID, "");
		case 1:
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Something went wrong, MAST analysis not performed");
		default:
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Something went wrong, make sure MAST is installed");
		}
	}
	
	/**
	 * Invokes MAST graphical tool (GMAST). MAST needs to be installed in a folder called 'mast' inside the root of the Eclipse installation, 
	 * i.e. "/eclipse/mast"
	 * 
	 * @param  theElement   UML element from which it's called in Acceleo
	 * 
	 * @param  thePath      not used, the method's code should be updated to eliminate it
	 * @throws Exception 
	 */
	public static int openGmast()throws Exception {
		
		// os data:
		//	System.getProperty("os.name"));
		//	System.getProperty("os.version"));
		//	System.getProperty("os.arch"));		
		
		exitValue = 3;
		if(mOpenGmast==true){			
			Log.println(">>> Invoking MAST"); 	
			 try {
				 Runtime theRuntime = Runtime.getRuntime();
				 Process theProcess;
				 String mastLocation="";
				 String[] command = null;
				 if(System.getProperty("os.name").equals("Linux")){////////////////LINUX///////////////////////////	
					//http://help.eclipse.org/help33/index.jsp?topic=/org.eclipse.platform.doc.isv/reference/misc/runtime-options.html
					 String eclipseLocation = System.getProperties().get("osgi.install.area").toString().substring(5);//eclipse
					 mastLocation=eclipseLocation+"mast/linux/";
					 String mastLibsLocation=mastLocation+"lib/";
					 //String eclipseLocation = System.getProperties().get("osgi.instance.area").toString().substring(6);//the workspace
					 //TODO ADDED FEATURE by Alessandro Zovi: invoke from command line
					 String commandLine = null;
					 if (PreferenceUtils.useGMAST()){
						 commandLine = "gmast";
					 } else{ 
						 String tool = tools;
						 String options = PreferenceUtils.getCommandLineOptions();
						 commandLine = "mast_analysis " + tool + ' ' + options + " \"" + Marte2mast.mInputMastFile + "\" \"" + Marte2mast.mOutputXMLFile + "\"";
						 System.out.println("export PATH="+mastLocation+":$PATH;export LD_LIBRARY_PATH="+mastLibsLocation+":$LD_LIBRARY_PATH;"+mastLocation+commandLine +"\n" + commandLine);
					 }
					 
					 String[] commandLinux = { "/bin/sh", "-c", "export PATH="+mastLocation+":$PATH;export LD_LIBRARY_PATH="+mastLibsLocation+":$LD_LIBRARY_PATH;"+mastLocation+commandLine};
					 command = commandLinux;
				 }else{////////////////WIN////////////////////////////////
					 String eclipseLocation = System.getProperties().get("osgi.install.area").toString().substring(6);//eclipse
					 mastLocation=eclipseLocation+"mast/windows/";
					 
					 String commandLine = null;
					 String commandLine1 = null;
					 if (PreferenceUtils.useGMAST()){
						 commandLine = "gmast.bat";
					 } else{ 
						 String tool = tools;
						 String options = PreferenceUtils.getCommandLineOptions();
						 commandLine = " " + tool + ' ' + options + " \"" + Marte2mast.mInputMastFile + "\" \"" + Marte2mast.mOutputXMLFile + "\"";
						 commandLine1 = tool + ' ' + options + ' ' + Marte2mast.mInputMastFile + ' ' + Marte2mast.mOutputXMLFile;
					 }
					 
					 //String[] commandWindows = { "cmd.exe", " /c start /D\""+mastLocation+"\" "+mastLocation+commandLine};
					 String commandWindows = "\""+mastLocation+"mast_analysis.exe\""+commandLine;
					 System.out.println(commandWindows);
					 System.err.println(commandWindows);
					 command = new String[] {commandWindows};
				 }	
				 
				 if (command.length>1)
					 theProcess = theRuntime.exec(command);
				 else
					 theProcess = theRuntime.exec(command[0]);

				 StreamGobbler errorGobbler = new StreamGobbler(
					theProcess.getErrorStream(), "ERROR", CHESSProjectSupport.CHESS_CONSOLE_STREAM);
				 StreamGobbler outputGobbler = new StreamGobbler(
					theProcess.getInputStream(), "OUTPUT", CHESSProjectSupport.CHESS_CONSOLE_STREAM);
				 errorGobbler.start();
				 outputGobbler.start();		 
				 exitValue = theProcess.waitFor();
				 //Log.println(Integer.toString(exitValue, 10));
				 if (exitValue>1){
					 //Log.println("("+exitValue+") Something went wrong, make sure MAST is installed in: "+mastLocation);
					 //throw new MastException("Something went wrong, make sure MAST is installed in: "+mastLocation);
				 }
				 if (exitValue == 1){					 
					 //Log.println("Something went wrong, MAST analysis not performed");

					 //throw new MastException("Something went wrong, MAST analysis not performed");
				 }
				 else{
					 if(outputGobbler.getAnalysisResult() != null){
						 analysisResult = outputGobbler.getAnalysisResult();
					 }else{
						 analysisResult = errorGobbler.getAnalysisResult();
					 }
					 Log.println(">>> Finished using MAST\n");
				 }
				 
			  } catch(Exception theException) {
			     Log.println(theException.toString());
			     //throw theException;
			  }			
		}//end if opengmast
		return exitValue;
	}//end openGmast

	/**
	 * Parses the .xml output file from MAST, a GUI asks for its path, modifies the UML model with the necessary 
	 * changes and saves it to a file in the target folder (the same folder where Acceleo saves the rest of the files 
	 * generated, i.e. the .mast model, the log file...).
	 * 
	 * <p>This method calls extractDataFromXML and saveModel2File.
	 * 
	 * @param  theModel     The UML Model 
	 */
	public static void recoverMastResults(IFile modelFile, String psmPackageName){
		
		ModelContent inModel = EmfUtil.loadModel(URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true));
		Model theModel = (Model) inModel.getContent().get(0);
		
		if(isPartitionsInModel(theModel, psmPackageName)){
			tools = "ima";
		} else if(isRUN(theModel, psmPackageName)) {
			tools = "run";
		} else {
			tools = PreferenceUtils.getTools();
		}
		
		try {
			openGmast();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		CHESS stereotypeApplication = UMLUtils.getStereotypeApplication(theModel, CHESS.class);
		//psmPackage = stereotypeApplication.getPsmView().getBase_Package();
		if (exitValue != 0) return;
		if(mRecoverResults==true){
			/////////////////////////
			Log.println(">>> Recovering MAST results");
			Log.println(">> Extracting data from XML");
			if(Marte2mast.mModelURI!=null && extractDataFromXML()){
				Log.println(">> Updating UML model");
				//saveWithPapyrus(theModel, psmPackage);
				try {
					updateUMLModel(theModel, psmPackageName);
					theModel.eResource().save(null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//save to uml file (& put it in the target folder with a copy of the original .di and .notation model files)
				Log.println(">> Saving UML model's files");
				//save(theModel);
			}else{//error extracting
				Log.println(">> Results couldn't be saved");
			}
			Log.println(">>> Finished recovering MAST results\n");
		}//if recoverResults true
	}//recoverMastResults
	
	private static boolean isPartitionsInModel(Model theModel, String psmPackageName) {
		Package psmView = ViewUtils.getCHESSPSMPackage(theModel);
		Package psmPackage = psmView.getNestedPackage(psmPackageName);
		
		return HelperFunctions.functionalPartitions(psmPackage);
	}
	
	private static boolean isRUN(Model theModel, String psmPackageName) {
		Package psmView = ViewUtils.getCHESSPSMPackage(theModel);
		Package psmPackage = psmView.getNestedPackage(psmPackageName);
		
		return HelperFunctions.isRUNSystem(psmPackage);
	}

	private static void saveWithPapyrus(final Model theModel, final Package psmPackage){
		
		ServicesRegistry servicesRegistry = createServicesRegistry();
		try {
			ModelSet modelSet = servicesRegistry.getService(ModelSet.class);
			try {
				modelSet.loadModels(theModel.eResource().getURI());
			} catch (ModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 CommandStack commandStack = modelSet.getTransactionalEditingDomain().getCommandStack();
			 commandStack.execute(new RecordingCommand(modelSet.getTransactionalEditingDomain()) {
				
				@Override
				protected void doExecute() {
					updateUMLModel(theModel, psmPackage.getName());
				}
			});
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	protected static ServicesRegistry createServicesRegistry() {
		ServicesRegistry result = null;
		
		try {
			result = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
		} catch (ServiceException e) {
			// couldn't create the registry? Fatal problem
			//Activator.log.error(e);
		}
		
		try {
			// have to create the model set and populate it with the DI model
			// before initializing other services that actually need the DI
			// model, such as the SashModel Manager service
			result.startServicesByClassKeys(ModelSet.class);
		} catch (ServiceException ex) {
			// Ignore this exception: some services may not have been loaded,
			// which is probably normal at this point
		}
		
		return result;
	}
	
	
	private static void save(Model myModel) {
		
		Resource modelResource = new ResourceSetImpl().createResource(myModel.eResource().getURI());
		EList<EObject> contents = modelResource.getContents();
		contents.add(myModel);

		//by default UML2 does not save the stereotypes so we must do that ourselves
		for (Iterator<EObject> allContents = UMLUtil.getAllContents(myModel, true, false); allContents.hasNext();) 
		{ 
			EObject eObject = (EObject) allContents.next(); 

			if (eObject instanceof Element) 
			{
				contents.addAll(((org.eclipse.uml2.uml.Element) eObject).getStereotypeApplications());
			}
		}
		try 
		{
			modelResource.save(null);
		} 
		catch (IOException ioe) 
		{
			//throw new IOException("Could not save UML 2 Model to file: "+modelURI);
		}
	}
	
	/**
	 * Parses the .xml output file from MAST, a GUI asks for its path, and updates the relevant data 
	 * in the UML model.
	 * 
	 * @return <code>true</code> if everything went right, 
	 *         <code>false</code> if not
	 */
	public static boolean extractDataFromXML(){
		
		String filePath = null;
		//ADDED by Alessandro Zovi
		if (PreferenceUtils.useGMAST()) {
			GUI gui = new GUI("Save MAST results to UML file");
			gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			gui.setVisible(true);
			while (gui.isVisible()) {
				// Log.println("waiting...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// Auto-generated catch block
					e.printStackTrace();
				}
			}// GUI closed
			if (GUI.mFilePath.equals(""))
				return false;
			filePath = GUI.mFilePath;
		} else {
			filePath = Marte2mast.mOutputXMLFile;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Log.println(filePath);
		//filePath="/home/alvaro/Escritorio/2011_01_26_marte2mast/workspaces/workspace_01/es.unican.ctr.marte2mast.files/output_m2m/teleoperated_robot.mast.out.xml";
		
		//create the vector where we store the data from the transactions
		transactionsXML = new Vector<transactionDataXML>();
		//create the vector where we store the data from the processing resources
		processingXML = new Vector<processingDataXML>();
		
		sharedXML = new Vector<sharedDataXML>();
		
		//DOM extraction////////////////////////////////
		try {
			//refs: http://www.java-tips.org/java-se-tips/javax.xml.parsers/how-to-read-xml-file-in-java.html
			//      http://www.developertutorials.com/tutorials/java/read-xml-file-in-java-050611-1112/
			
			File xmlFile = new File(filePath);
			//Fix by Alessandro Zovi, in windows it seems the file is not created as soon the source code goes here
			//however the thread is the same :-(
			while (!xmlFile.exists()){
				Thread.sleep(200);
			}
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document document = docBuilder.parse(xmlFile);
			document.getDocumentElement().normalize();
			//Log.println("Root element " + document.getDocumentElement().getNodeName());
			
			////////TRANSACTIONS:
			NodeList transactionNodes = document.getElementsByTagName("mast_res:Transaction");
			for (int  transactionNodeNumber= 0; transactionNodeNumber < transactionNodes.getLength(); transactionNodeNumber++) {
				
				transactionDataXML transactionData = new transactionDataXML();
				
				Node transactionNode = transactionNodes.item(transactionNodeNumber);
				Element transactionElement = (Element) transactionNode;
				
				/////NAME:
				transactionData.mName = transactionNode.getAttributes().getNamedItem("Name").getNodeValue();
				
				/////SLACK:
				NodeList slackNodes = transactionElement.getElementsByTagName("mast_res:Slack");
				for (int slackNodeNumber = 0; slackNodeNumber < slackNodes.getLength(); slackNodeNumber++) {
					Node slackNode = slackNodes.item(slackNodeNumber);
					String slackValue = slackNode.getAttributes().getNamedItem("Value").getNodeValue();
					transactionData.mSlack=slackValue;
				}
				/////TIMING RESULTS:-> internal events
				NodeList timingNodes = transactionElement.getElementsByTagName("mast_res:Timing_Result");
				for (int timingNodeNumber = 0; timingNodeNumber < timingNodes.getLength(); timingNodeNumber++) {
					
					internalEventDataXML internalEventData = new internalEventDataXML();
					
					Node timingNode = timingNodes.item(timingNodeNumber);
					///Attributes
					internalEventData.mName = timingNode.getAttributes().getNamedItem("Event_Name").getNodeValue();
					internalEventData.mWorstBlockT = timingNode.getAttributes().getNamedItem("Worst_Blocking_Time").getNodeValue();
					///Children
					Element timingElement = (Element) timingNode;
					//worst
					NodeList worstGlobalNodes = timingElement.getElementsByTagName("mast_res:Worst_Global_Response_Times");
					for (int worstGlobalNodeNumber = 0; worstGlobalNodeNumber < worstGlobalNodes.getLength(); worstGlobalNodeNumber++) {
						Node worstGlobalNode = worstGlobalNodes.item(worstGlobalNodeNumber);
						Element worstGlobalElement = (Element) worstGlobalNode;
						NodeList globalNodes = worstGlobalElement.getElementsByTagName("mast_res:Global_Response_Time");
						for (int globalNodeNumber = 0; globalNodeNumber < globalNodes.getLength(); globalNodeNumber++) {
							Node globalNode = globalNodes.item(globalNodeNumber);
							internalEventData.mWorstGlobalTime = globalNode.getAttributes().getNamedItem("Time_Value").getNodeValue();
						}//for global time
					}//for worst global
					//best
					NodeList bestGlobalNodes = timingElement.getElementsByTagName("mast_res:Best_Global_Response_Times");
					for (int bestGlobalNodeNumber = 0; bestGlobalNodeNumber < bestGlobalNodes.getLength(); bestGlobalNodeNumber++) {
						Node bestGlobalNode = bestGlobalNodes.item(bestGlobalNodeNumber);
						Element bestGlobalElement = (Element) bestGlobalNode;
						NodeList globalNodes = bestGlobalElement.getElementsByTagName("mast_res:Global_Response_Time");
						for (int globalNodeNumber = 0; globalNodeNumber < globalNodes.getLength(); globalNodeNumber++) {
							Node globalNode = globalNodes.item(globalNodeNumber);
							internalEventData.mBestGlobalTime = globalNode.getAttributes().getNamedItem("Time_Value").getNodeValue();
						}//for global time
					}//for best global
					//jitter
					NodeList jittersNodes = timingElement.getElementsByTagName("mast_res:Jitters");
					for (int jittersNodeNumber = 0; jittersNodeNumber < jittersNodes.getLength(); jittersNodeNumber++) {
						Node jittersNode = jittersNodes.item(jittersNodeNumber);
						Element jittersElement = (Element) jittersNode;
						NodeList globalNodes = jittersElement.getElementsByTagName("mast_res:Global_Response_Time");
						for (int globalNodeNumber = 0; globalNodeNumber < globalNodes.getLength(); globalNodeNumber++) {
							Node globalNode = globalNodes.item(globalNodeNumber);
							internalEventData.mJitters = globalNode.getAttributes().getNamedItem("Time_Value").getNodeValue();
						}//for global time
					}//for jitters
					
					transactionData.mInternalEvents.add(internalEventData);
					
				}//end for timing nodes
				
				transactionsXML.add(transactionData);
			}//end for transactionNodes
			
			//PROCESSING RESOURCES
			NodeList processingNodes = document.getElementsByTagName("mast_res:Processing_Resource");
			for (int  processingNodeNumber= 0; processingNodeNumber < processingNodes.getLength(); processingNodeNumber++) {
				
				processingDataXML processingData = new processingDataXML();
				
				Node processingNode = processingNodes.item(processingNodeNumber);
				Element processingElement = (Element) processingNode;
				
				/////NAME:
				processingData.mName = processingNode.getAttributes().getNamedItem("Name").getNodeValue();
				
				/////SLACK:
				NodeList slackNodes = processingElement.getElementsByTagName("mast_res:Slack");
				for (int slackNodeNumber = 0; slackNodeNumber < slackNodes.getLength(); slackNodeNumber++) {
					Node slackNode = slackNodes.item(slackNodeNumber);
					processingData.mSlack = slackNode.getAttributes().getNamedItem("Value").getNodeValue();
				}
				
				/////UTILIZATION:
				NodeList utilizationNodes = processingElement.getElementsByTagName("mast_res:Utilization");
				for (int utilizationNodeNumber = 0; utilizationNodeNumber < utilizationNodes.getLength(); utilizationNodeNumber++) {
					Node utilizationNode = utilizationNodes.item(utilizationNodeNumber);
					processingData.mUtilization = utilizationNode.getAttributes().getNamedItem("Total").getNodeValue();
				}
				
				processingXML.add(processingData);
				
			}//end for processing
			
			//ADDED by Alessandro Zovi
			//SHARED RESOURCES
			NodeList sharedNodes = document.getElementsByTagName("mast_res:Shared_Resource");
			for (int  processingNodeNumber= 0; processingNodeNumber < sharedNodes.getLength(); processingNodeNumber++) {
				
				sharedDataXML processingData = new sharedDataXML();
				
				Node processingNode = sharedNodes.item(processingNodeNumber);
				Element processingElement = (Element) processingNode;
				
				/////NAME:
				processingData.mName = processingNode.getAttributes().getNamedItem("Name").getNodeValue();
				
				/////PRIORITY CEILING:
				NodeList slackNodes = processingElement.getElementsByTagName("mast_res:Priority_Ceiling");
				for (int slackNodeNumber = 0; slackNodeNumber < slackNodes.getLength(); slackNodeNumber++) {
					Node slackNode = slackNodes.item(slackNodeNumber);
					processingData.mCeiling = slackNode.getAttributes().getNamedItem("Ceiling").getNodeValue();
				}
				
				/////QUEUE SIZE:
				NodeList queueNodes = processingElement.getElementsByTagName("mast_res:Queue_Size");
				for (int utilizationNodeNumber = 0; utilizationNodeNumber < queueNodes.getLength(); utilizationNodeNumber++) {
					Node utilizationNode = queueNodes.item(utilizationNodeNumber);
					processingData.mQueueSize = utilizationNode.getAttributes().getNamedItem("Max_Num").getNodeValue();
				}
				
				/////UTILIZATION:
				NodeList utilizationNodes = processingElement.getElementsByTagName("mast_res:Utilization");
				for (int utilizationNodeNumber = 0; utilizationNodeNumber < utilizationNodes.getLength(); utilizationNodeNumber++) {
					Node utilizationNode = utilizationNodes.item(utilizationNodeNumber);
					processingData.mUtilization = utilizationNode.getAttributes().getNamedItem("Total").getNodeValue();
				}
				
				sharedXML.add(processingData);
				
			}//end for shared
			
			
			//GLOBAL SLACK
			NodeList globalSlackNodes = document.getElementsByTagName("mast_res:Slack");
			mGlobalSlackXML=null;
			for (int slackNodeNumber = 0; slackNodeNumber < globalSlackNodes.getLength(); slackNodeNumber++) {
				Node slackNode = globalSlackNodes.item(slackNodeNumber);
				Node father = slackNode.getParentNode();				
				if(father.getNodeName().equals("mast_res:REAL_TIME_SITUATION")){
					//Log.println("found global slack data "+mGlobalSlackXML);
					mGlobalSlackXML = slackNode.getAttributes().getNamedItem("Value").getNodeValue();
				}
			}
			/////////////////////////////

	 	} catch (Exception e) {
		    e.printStackTrace();
	 	}//end DOM
	 	
	 	return true;
			 
	}//extractDataFromXML
	
	/**
	 * Updates the UML model with the data extracted from the XML file by extractDataFromXML.
	 * <p>
	 * Uses: 
	 *         ActivityFunctions.mModeText, ActivityFunctions.mTransactionFatherChildrensLists, 
	 *         ActivityFunctions.mIntEvent2OperationMap & ActivityFunctions.fatherChildrenStruct
	 * <p>      
	 * Resets:   
	 *         ActivityFunctions.mIntEvent2OperationMap, ActivityFunctions.mModeText  
	 *         & ActivityFunctions.mTransactionFatherChildrensLists
	 * 
	 * @param  theModel   the UML Model to update
	 */
	public static void updateUMLModel(Model theModel, String psmPackageName){
		//Log.println(">> transactions");
		Package psmView = ViewUtils.getCHESSPSMPackage(theModel);
		Package psmPackage = psmView.getNestedPackage(psmPackageName);
		boolean isSchedulable = true;
		org.eclipse.uml2.uml.Element oneTransactionElement = null;
		for(int transNum=0;transNum<transactionsXML.size();transNum++){
			String transactionName=transactionsXML.get(transNum).mName;
			String transactionSlack=transactionsXML.get(transNum).mSlack;
			
			///check 'global' schedulability/////
			if(mGlobalSlackXML!=null){//could check this outside the for
				//Log.println("****using global slack data value"+mGlobalSlackXML);
				if(Double.parseDouble(mGlobalSlackXML)<0){
					isSchedulable=false;
				}
				//FIX by Alessandro Zovi: "!transactionSlack.isEmpty() &&" 
			}else if(!transactionSlack.isEmpty() && Double.parseDouble(transactionSlack)<0){//MAST 1.38 not always gives the global slack -> BUG  :(
				//Log.println("!!!Found a transaction with slack < 0");
				isSchedulable=false;
			}
			
//			for(int i=0;i<ActivityFunctions.mIntEvent2OperationMap.size();i++){
//				Log.println("map int event - operation");
//				Log.println(ActivityFunctions.mIntEvent2OperationMap.toString());
//				
//			}
			/////////////////////////////////////
			
			Vector<internalEventDataXML> internalEvents = transactionsXML.get(transNum).mInternalEvents;
			for(int evNum=0;evNum<internalEvents.size();evNum++){
				String theName=internalEvents.get(evNum).mName;
				String theWorstValue=internalEvents.get(evNum).mWorstGlobalTime;
				String theBestValue=internalEvents.get(evNum).mBestGlobalTime;
				String theJitter=internalEvents.get(evNum).mJitters;
				String theWorstBlockTime=internalEvents.get(evNum).mWorstBlockT;				
				
				org.eclipse.uml2.uml.Element transactionElement = HelperFunctions.getElementWithShortName(psmPackage,transactionName);
				oneTransactionElement = transactionElement;
				
				String theLastOperationName = ActivityFunctions.mIntEvent2OperationMap.get(theName);
				
				if(theLastOperationName==null){
					Log.println("found a null last operation");
					continue;
				}
				//Log.println("*****"+theLastOperationName +" - "+theName);
				org.eclipse.uml2.uml.Element theElement = HelperFunctions.getElementWithLongName(psmPackage,theLastOperationName);
				String propertyMode="'"+mModeID+"%"+theName+"'";//mode value has to be surrounded by "'" character (ref: old papyrus' VSL editor)
				
				//TODO currently the mode value is invalid
				propertyMode="''";
				
				String maxJitterTime=HelperFunctions.generateNFP_DurationText(null, null, theJitter, "s", "calc", propertyMode);
				
				//respT (NFP_Duration [0..*])
				String respTime=HelperFunctions.generateNFP_DurationText(theWorstValue, theBestValue, null, "s", "calc", propertyMode);
				//update the stereotype's property
				if(respTime!=null){					
					HelperFunctions.setStereotypeProperty(theElement, "SaStep", "respT", respTime, false, mOverwriteResults); 
					//Log.println(">Element updated: "+theLastOperationName);
					//Log.println(" (transaction: "+transactionName+") - respT: "+respTime);
				}
				//blockT (NFP_Duration [0..1])
				String blockTime=HelperFunctions.generateNFP_DurationText(theWorstBlockTime, null, null, "s", "calc", propertyMode);
				//update the stereotype's property
				if(blockTime!=null){
					HelperFunctions.setStereotypeProperty(theElement, "SaStep", "blockT", blockTime, true, mOverwriteResults); 
					//Log.println(" (transaction: "+transactionName+") - blockT: "+blockTime);
				}
				
				// propagate int event operation data to fathers if it was the last operation of 
				// a father = if it is on the list mTransactionFatherChildrensLists as the last one??
				for(int i=0; i<ActivityFunctions.mTransactionFatherChildrensLists.size();i++){
					//Log.println("checking list num "+i);						
					Vector<ActivityFunctions.fatherChildrenStruct> fatherChildrensList = ActivityFunctions.mTransactionFatherChildrensLists.get(i);

//					for(int z=0;z<fatherChildrensList.size();z++){
//						Log.println(HelperFunctions.getElementLongName(fatherChildrensList.get(z).mElement));
//					}
					//Log.println("");
					//Log.println("check father child list");
					if(fatherChildrensList.size()>1){
						for(int j=0; j<fatherChildrensList.size();j++){//don't include the first one
							//Log.println(theLastOperationName + " -> " + HelperFunctions.getElementLongName(fatherChildrensList.get(j).mElement).toLowerCase());
							if(theLastOperationName.equals(HelperFunctions.getElementLongName(fatherChildrensList.get(j).mElement).toLowerCase()) 
							   && fatherChildrensList.get(j).mInternalEventName.toLowerCase().equals(theName))
							{
								//propagate to all fathers
								for(int k=j+1; k<fatherChildrensList.size();k++){//don't include the first one
									//Log.println("> Propagating to fathers:");
									//respT (NFP_Duration [0..*])
									//update the stereotype's property
									if(respTime!=null){					
										HelperFunctions.setStereotypeProperty(fatherChildrensList.get(k).mElement, "SaStep", "respT", respTime, false, mOverwriteResults); 
										//Log.println(">Element updated: "+HelperFunctions.getElementLongName(fatherChildrensList.get(k).mElement));
										//Log.println("respT: "+respTime);
									}
									//blockT (NFP_Duration [0..1])
									//update the stereotype's property
									if(blockTime!=null){
										HelperFunctions.setStereotypeProperty(fatherChildrensList.get(k).mElement, "SaStep", "blockT", blockTime, true, mOverwriteResults); 
										//Log.println("blockT: "+blockTime);
									}
								}
								
							}//end if name = last op & in event is the same

						}//end for fatherChildrensList							
					}//end if size>1					
				}//for mTransactionFatherChildrensLists	
				
				if(evNum==internalEvents.size()-1){//LAST internal event
					if(transactionElement instanceof Activity){						
						//SaEnd2EndFlow -> fill schSlack (NFP_Real [0..1]) & end2endT (NFP_Duration [0..*])
						HelperFunctions.setStereotypeProperty(transactionElement, "SaEndtoEndFlow", "end2EndT", respTime, false, mOverwriteResults);
						HelperFunctions.setStereotypeProperty(transactionElement, "SaEndtoEndFlow", "schSlack", "(value="+transactionSlack+",statQ=calc,mode="+propertyMode+")", true, mOverwriteResults);
						//Log.println(">Element updated: SaEndtoEndFlow");
						//Log.println(" end2EndT: "+respTime);
						//Log.println(" schSlack: "+"(value="+transactionSlack+",statQ=calc,mode="+propertyMode+")");
						//GaLatencyObs  -> fill latency (NFP_Duration [0..*]) & maxJitter (NFP_Duration [0..*])
						EList<org.eclipse.uml2.uml.Element> listOfElements = transactionElement.getOwnedElements();
						//get constraint data (GaLatencyObs)
						Constraint theConstraint=null;
						for(org.eclipse.uml2.uml.Element anElement : listOfElements){
							if(anElement instanceof Constraint){				
								if(HelperFunctions.hasStereotype(anElement, "GaLatencyObs")){
//									if(HelperFunctions.getStereotypeProperty(anElement,"GaLatencyObs","latency")!=null){
										theConstraint=(Constraint) anElement;
										break;
//									}
						    	}//end if SaStep
							}//end if constraint
						}
						if(theConstraint!=null){
							HelperFunctions.setStereotypeProperty(theConstraint, "GaLatencyObs", "latency", respTime, false, mOverwriteResults);
							HelperFunctions.setStereotypeProperty(theConstraint, "GaLatencyObs", "maxJitter", maxJitterTime, false, mOverwriteResults);
							//Log.println(">Element updated: GaLatencyObs");
							//Log.println(" latency: "+respTime);
							//Log.println(" maxJitter: "+maxJitterTime);
						}
						
						//latency and maxJitter are NFP_Duration [0..*]
					}					
					
				}//end last event
			}		
			
		}//end for transactions
		
		//Log.println("***processing resources::");
		for(int procNum=0;procNum<processingXML.size();procNum++){
			String processingName =processingXML.get(procNum).mName;
			String processingSlack =processingXML.get(procNum).mSlack;
			String processingUtil =processingXML.get(procNum).mUtilization;
			String propertyMode="'"+mModeID+"'";//mode value has to be surrounded by "'" character (ref: old papyrus' VSL editor)
			org.eclipse.uml2.uml.Element processingElement = HelperFunctions.getElementWithShortName(psmPackage,processingName);
			
			for (org.eclipse.uml2.uml.Element e : psmPackage.getNestedPackage("Host").allOwnedElements()) {
				if (e instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class c = (org.eclipse.uml2.uml.Class) e;
					boolean b = c.getName().toLowerCase().equals(processingName.toLowerCase()) && UMLUtils.getStereotypeApplication(e, SaExecHost.class)!=null;
					if(b){
						processingElement = c;
						break;
					}
					
				}
			}
			if(HelperFunctions.hasStereotype(processingElement, "SaExecHost")){
				//Log.println("SaExecHost");
				HelperFunctions.setStereotypeProperty(processingElement, "SaExecHost", "schSlack", "(value="+processingSlack+",statQ=calc,mode="+propertyMode+")", true, mOverwriteResults);
				HelperFunctions.setStereotypeProperty(processingElement, "SaExecHost", "schedUtiliz", "(value="+processingUtil+",statQ=calc,mode="+propertyMode+")", true, mOverwriteResults);
				HelperFunctions.setStereotypeProperty(processingElement, "SaExecHost", "utilization", "(value="+processingUtil+",statQ=calc,mode="+propertyMode+")", false, mOverwriteResults);

			}else if(HelperFunctions.hasStereotype(processingElement, "SaCommHost")){
				//Log.println("SaCommHost");
				HelperFunctions.setStereotypeProperty(processingElement, "SaCommHost", "schSlack", "(value="+processingSlack+",statQ=calc,mode="+propertyMode+")", true, mOverwriteResults);
				HelperFunctions.setStereotypeProperty(processingElement, "SaCommHost", "utilization", "(value="+processingUtil+",statQ=calc,mode="+propertyMode+")", false, mOverwriteResults);
			}
		}
		
		//ADDED by Alessandro Zovi
		for(int procNum=0;procNum<sharedXML.size();procNum++){
			String sharedName =sharedXML.get(procNum).mName;
			String sharedCeiling =sharedXML.get(procNum).mCeiling;
			String sharedQueueSize =sharedXML.get(procNum).mQueueSize;
			String sharedUtil =sharedXML.get(procNum).mUtilization;
			String propertyMode="'"+mModeID+"'";//mode value has to be surrounded by "'" character (ref: old papyrus' VSL editor)
			org.eclipse.uml2.uml.Element sharedElement = HelperFunctions.getElementWithShortName(psmPackage,sharedName);
			if(HelperFunctions.hasStereotype(sharedElement, "SaSharedResource")){
				//Log.println("SaExecHost");
				if (sharedCeiling != null && !sharedCeiling.isEmpty())
					HelperFunctions.setStereotypeProperty(sharedElement, "SaSharedResource", "ceiling", "(value="+sharedCeiling+",statQ=calc,mode="+propertyMode+")", true, mOverwriteResults);
//				if (sharedQueueSize != null && !sharedQueueSize.isEmpty())
//					HelperFunctions.setStereotypeProperty(sharedElement, "SaSharedResource", "capacity", "(value="+sharedQueueSize+",statQ=calc,mode="+propertyMode+")", true, mOverwriteResults);
			}
			
			if(HelperFunctions.hasStereotype(sharedElement, "SwMutualExclusionResource")){
				//Log.println("SaExecHost");
				if (sharedCeiling != null && !sharedCeiling.isEmpty())
					HelperFunctions.setStereotypeProperty(sharedElement, "SwMutualExclusionResource", "ceiling", "(value="+sharedCeiling+",statQ=calc,mode="+propertyMode+")", true, mOverwriteResults);
//				if (sharedQueueSize != null && !sharedQueueSize.isEmpty())
//					HelperFunctions.setStereotypeProperty(sharedElement, "SaSharedResource", "capacity", "(value="+sharedQueueSize+",statQ=calc,mode="+propertyMode+")", true, mOverwriteResults);
			}
		}
		
		//SaAnalysisContext <-- is schedulable ??
		//right now: if any of the transactions had slack<0: no schedulable, else: schedulable
		//there's a bug in the current version of MAST, most of the time the 'global' slack is not in the output file
		//FIX by Alessandro Zovi: "oneTransactionElement.getOwner()" does not work!
		//org.eclipse.uml2.uml.Element transOwner = oneTransactionElement.getOwner();
		//if(HelperFunctions.hasStereotype(transOwner, "SaAnalysisContext")){
//		org.eclipse.uml2.uml.Element transOwner = getAnalysisContext(psmView);
		org.eclipse.uml2.uml.Element transOwner = getAnalysisContext(psmPackage);
		//Log.println("the flow: "+HelperFunctions.getElementLongName(transOwner));
		
		if(transOwner != null){
			//Log.println("> Updating analysis context: "+HelperFunctions.getElementLongName(transOwner));
			String isSchedText;
			if(isSchedulable){
				isSchedText="(value=true,statQ=calc,mode='"+mModeID+"')";
			}else{
				isSchedText="(value=false,statQ=calc,mode='"+mModeID+"')";
			}
			HelperFunctions.setStereotypeProperty(transOwner, "SaAnalysisContext", "isSched", isSchedText, true, mOverwriteResults);
			//Log.println("isSched: "+isSchedText);
		}
		
		//clean-up
		transactionsXML.clear();
		processingXML.clear();
		ActivityFunctions.mIntEvent2OperationMap.clear();
		mModeID="";
		ActivityFunctions.mTransactionFatherChildrensLists= new Vector<Vector<ActivityFunctions.fatherChildrenStruct>>();
	}
	
	//get the correct SaAnalysisContext from the psmPackage
	private static org.eclipse.uml2.uml.Class getAnalysisContext(Package psmView){
		for (org.eclipse.uml2.uml.Element e : psmView.allOwnedElements()) {
			if (e instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class c = (org.eclipse.uml2.uml.Class) e;
				if(HelperFunctions.hasStereotype(c, "SaAnalysisContext") 
						&& c.getNearestPackage().getName().equals("AnalysisContext")){
					return c;
				}
			}
		}
		return null;
	}
	
	/**
	 * Saves the modified model, in memory till now, to a file in the target folder (the same folder where Acceleo 
	 * saves the rest of the files generated, i.e. the .mast model, the log file...).
	 * 
	 * @param  theModel   the UML Model 
	 */
	public static void saveModel2File(Model theModel){
		
		if(Marte2mast.mTargetFolder==null){//take the folder's path from acceleo's code
			Log.println("> ERROR: no target folder found");
		}else{
			//Log.println(Marte2mast.mTargetFolder.toString());
			//Model theModel = theElement.getModel();
			String oldModelName=theModel.getName();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
			String formattedDate = formatter.format(mDate);
			String newModelName=theModel.getName()+"_"+formattedDate;
			
			if(mOverwriteOutputModel){
				mModelResource = new ResourceSetImpl().createResource(URI.createFileURI(Marte2mast.mTargetFolder.toString()).appendSegment(oldModelName).appendFileExtension(UMLResource.FILE_EXTENSION));				
			}else{//new model name
				mModelResource = new ResourceSetImpl().createResource(URI.createFileURI(Marte2mast.mTargetFolder.toString()).appendSegment(newModelName).appendFileExtension(UMLResource.FILE_EXTENSION));
				theModel.setName(newModelName);
			}
			
			mModelResource.getContents().add(theModel);
			saveModelStereotypes(theModel);
			try {
				mModelResource.save(null);
			} catch (IOException e) {
				// Auto-generated catch block
				e.printStackTrace();
			}//end catch
			//////////////////////
			if(Marte2mast.mModelURI==null){
				Log.println("> ERROR: no model path :(");
			}else{
				//Log.println(Marte2mast.mModelURI.toString());
				//examples::
				//workspace:
				//file:/home/alvaro/Escritorio/2011_01_26_marte2mast/workspaces/workspace_01/es.unican.ctr.marte2mast.files/models/teleoperated_robot.uml
				//plugin:
				//platform:/resource/es.unican.ctr.marte2mast.files/models/teleoperated_robot.uml
				String modelPath = Marte2mast.mModelURI.toString();
				if(modelPath.contains("file:")){//workspace
					String fileModelString = Marte2mast.mModelURI.toFileString();
					String filebase = fileModelString.substring(0, fileModelString.length()-4);//delete ".uml"
					if(mOverwriteOutputModel){
						//copy .di and .notation files to destination folder
						HelperFunctions.copyFile2Directory(filebase+".di", Marte2mast.mTargetFolder.toString(),true);
						HelperFunctions.copyFile2Directory(filebase+".notation", Marte2mast.mTargetFolder.toString(),true);
					}else{//modify them
						HelperFunctions.modifyAndSafeAuxFiles(filebase, oldModelName, newModelName, Marte2mast.mTargetFolder.toString(),true);
					}
				}else if(modelPath.contains("platform:")){//plugin
					//convert from platform to absolute file uri
					//ref: http://www.eclipsezone.com/eclipse/forums/t108037.html
					URI fileModelURI = CommonPlugin.asLocalURI(Marte2mast.mModelURI);
					String fileModelString = fileModelURI.toFileString();
					String filebase = fileModelString.substring(0, fileModelString.length()-4);//delete ".uml"
					if(mOverwriteOutputModel){
						//copy .di and .notation files to destination folder
						HelperFunctions.copyFile2Directory(filebase+".di", Marte2mast.mTargetFolder.toString(),true);
						HelperFunctions.copyFile2Directory(filebase+".notation", Marte2mast.mTargetFolder.toString(),true);
					}else{//modify them
						HelperFunctions.modifyAndSafeAuxFiles(filebase, oldModelName, newModelName, Marte2mast.mTargetFolder.toString(),true);
					}
					
				}
			}//end else if not model uri
		}
		
		
	}//saveModel2File
	
	/**
	 * Checks all the elements owned by the 'theElement' parameter (recursively), and itself, to find the stereotype 
	 * applications, and adds them to 'mModelResource'.
	 * 
	 * @param  theElement   a UML Element (should be the Model element for the first invocation)
	 */
	public static void saveModelStereotypes(org.eclipse.uml2.uml.Element theElement){
		EList <org.eclipse.uml2.uml.Element> ownedElements = theElement.getOwnedElements();
		mModelResource.getContents().addAll(theElement.getStereotypeApplications());
		for (org.eclipse.uml2.uml.Element anElement : ownedElements){
			saveModelStereotypes(anElement);
		}//end for
	}//saveModelStereotypes

	public static String getAnalysisResult() {
		return analysisResult;
		
	}

}//mast class