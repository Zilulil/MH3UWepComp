package com.mh3udc;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class Main {
	private static Text weaponNameInput;
	private static Text affinityInput;
	private static Text rawInput;
	private static Text elementalInput;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setSize(424, 340);
		shell.setLayout(new FormLayout());
		
		Label lblWeaponName = new Label(shell, SWT.NONE);
		FormData fd_lblWeaponName = new FormData();
		fd_lblWeaponName.top = new FormAttachment(0, 5);
		fd_lblWeaponName.left = new FormAttachment(0, 6);
		lblWeaponName.setLayoutData(fd_lblWeaponName);
		lblWeaponName.setText("Weapon Name");
		
		Label lblSharpness = new Label(shell, SWT.NONE);
		FormData fd_lblSharpness = new FormData();
		fd_lblSharpness.top = new FormAttachment(0, 5);
		fd_lblSharpness.left = new FormAttachment(0, 91);
		lblSharpness.setLayoutData(fd_lblSharpness);
		lblSharpness.setText("Sharpness");
		
		Label lblRaw = new Label(shell, SWT.NONE);
		FormData fd_lblRaw = new FormData();
		fd_lblRaw.top = new FormAttachment(0, 5);
		fd_lblRaw.left = new FormAttachment(0, 200);
		lblRaw.setLayoutData(fd_lblRaw);
		lblRaw.setText("Raw");
		
		Label lblElemental = new Label(shell, SWT.NONE);
		FormData fd_lblElemental = new FormData();
		fd_lblElemental.right = new FormAttachment(0, 341);
		fd_lblElemental.top = new FormAttachment(0, 5);
		fd_lblElemental.left = new FormAttachment(0, 265);
		lblElemental.setLayoutData(fd_lblElemental);
		lblElemental.setText("Elemental");
		
		Label lblAffinity = new Label(shell, SWT.NONE);
		FormData fd_lblAffinity = new FormData();
		fd_lblAffinity.top = new FormAttachment(0, 5);
		fd_lblAffinity.left = new FormAttachment(0, 346);
		lblAffinity.setLayoutData(fd_lblAffinity);
		lblAffinity.setText("Affinity");
		
		weaponNameInput = new Text(shell, SWT.BORDER);
		FormData fd_weaponNameInput = new FormData();
		fd_weaponNameInput.top = new FormAttachment(0, 26);
		fd_weaponNameInput.left = new FormAttachment(0, 5);
		weaponNameInput.setLayoutData(fd_weaponNameInput);
		weaponNameInput.setToolTipText("Name of the Weapon");
		weaponNameInput.setText("Test Weapon");
		
		Combo sharpnessInput = new Combo(shell, SWT.NONE);
		FormData fd_sharpnessInput = new FormData();
		fd_sharpnessInput.right = new FormAttachment(0, 195);
		fd_sharpnessInput.top = new FormAttachment(0, 25);
		fd_sharpnessInput.left = new FormAttachment(0, 91);
		sharpnessInput.setLayoutData(fd_sharpnessInput);
		sharpnessInput.setToolTipText("Sharpness");
		sharpnessInput.setItems(new String[] {"Red", "Orange", "Yellow", "Green", "Blue", "White", "Purple"});
		sharpnessInput.select(2);
		
		rawInput = new Text(shell, SWT.BORDER);
		FormData fd_rawInput = new FormData();
		fd_rawInput.right = new FormAttachment(0, 260);
		fd_rawInput.top = new FormAttachment(0, 26);
		fd_rawInput.left = new FormAttachment(0, 200);
		rawInput.setLayoutData(fd_rawInput);
		rawInput.setText("230");
		
		elementalInput = new Text(shell, SWT.BORDER);
		FormData fd_elementalInput = new FormData();
		fd_elementalInput.right = new FormAttachment(0, 341);
		fd_elementalInput.top = new FormAttachment(0, 26);
		fd_elementalInput.left = new FormAttachment(0, 265);
		elementalInput.setLayoutData(fd_elementalInput);
		elementalInput.setText("200");
		
		affinityInput = new Text(shell, SWT.BORDER);
		FormData fd_affinityInput = new FormData();
		fd_affinityInput.right = new FormAttachment(lblAffinity, 0, SWT.RIGHT);
		fd_affinityInput.left = new FormAttachment(lblAffinity, -39);
		fd_affinityInput.top = new FormAttachment(0, 26);
		affinityInput.setLayoutData(fd_affinityInput);
		affinityInput.setText("5");
		
		Label label = new Label(shell, SWT.NONE);
		FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(0, 29);
		fd_label.left = new FormAttachment(0, 390);
		label.setLayoutData(fd_label);
		label.setText("%");
		
		Button newRow = new Button(shell, SWT.NONE);
		FormData fd_newRow = new FormData();
		fd_newRow.right = new FormAttachment(0, 53);
		fd_newRow.top = new FormAttachment(0, 53);
		fd_newRow.left = new FormAttachment(0, 5);
		newRow.setLayoutData(fd_newRow);
		newRow.setImage(SWTResourceManager.getImage(Main.class, "/org/eclipse/jface/dialogs/images/popup_menu.gif"));
		
		Button btnCompute = new Button(shell, SWT.NONE);
		FormData fd_btnCompute = new FormData();
		fd_btnCompute.top = new FormAttachment(100, -36);
		fd_btnCompute.left = new FormAttachment(100, -79);
		fd_btnCompute.bottom = new FormAttachment(100);
		fd_btnCompute.right = new FormAttachment(100);
		btnCompute.setLayoutData(fd_btnCompute);
		btnCompute.setText("Compute");
		
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		shell.dispose();
	}
}
