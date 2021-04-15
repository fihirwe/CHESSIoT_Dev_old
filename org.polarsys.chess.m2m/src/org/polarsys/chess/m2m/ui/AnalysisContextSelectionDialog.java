package org.polarsys.chess.m2m.ui;

import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;

/**
 * The Class AnalysisContextSelectionDialog.
 */
public class AnalysisContextSelectionDialog extends Dialog {

	/** The choose context field. */
	private Combo chooseContextField;
	
	/** The context. */
	private String context;
	
	/** The title. */
	private String title;
	
	/** The context list. */
	private List<org.eclipse.uml2.uml.Class> contextList;
	
	/**
	 * Instantiates a new analysis context selection dialog.
	 *
	 * @param parentShell the parent shell
	 * @param selection the selection
	 * @param title the title
	 */
	public AnalysisContextSelectionDialog(Shell parentShell, List<Class> selection, String title) {
		super(parentShell);
		contextList = selection;
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout(1, false);

		layout.horizontalSpacing = 4;
		layout.verticalSpacing = 4;
		layout.marginBottom = 5;
		layout.marginTop = 5;
	
		parent.setLayout(layout);
		new Label(parent, SWT.NONE).setText("Contexts found in model: ");
		
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		chooseContextField = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		for(org.eclipse.uml2.uml.Class scenario : contextList){
			chooseContextField.add(scenario.getQualifiedName());
		}
		chooseContextField.setLayoutData(gridData);
		
		new Label(parent, SWT.NONE).setText("");
		
		return parent;	
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(title);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#isResizable()
	 */
	@Override
	protected boolean isResizable() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		setContext(chooseContextField.getText());
		super.okPressed();
	}
	
	/**
	 * Sets the context.
	 *
	 * @param qname the new context
	 */
	public void setContext(String qname) {
		this.context = qname;
	}

	/**
	 * Gets the context.
	 *
	 * @return the context
	 */
	public String getContext() {
		return context;
	}
}
