package it.unipd.chess.m2m.marte2mast.common;

import java.io.*;

public class StreamGobbler extends Thread {
	private InputStream is;
	private String type;
	private OutputStream os;
	private String analysisResult;

	StreamGobbler(InputStream is, String type) {
		this(is, type, null);
	}

	StreamGobbler(InputStream is, String type, OutputStream redirect) {
		this.is = is;
		this.type = type;
		this.os = redirect;
	}

	public void run() {
		try {
			PrintWriter pw = null;
			if (os != null)
				pw = new PrintWriter(os);

			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			while ((line = br.readLine()) != null) {
				if (pw != null)
					pw.println(line);
				System.out.println(type + ">" + line);
				if(line.contains("schedulable") || line.contains("SCHEDULABLE")){
					this.analysisResult = line;
				}
			}
			if (pw != null)
				pw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public String getAnalysisResult() {
		return analysisResult;
	}
}