package com.zilulil.mh3udc;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;



public class Main {
	private static List<WeaponRow> weaponRows;
	private static Button newRow;
	private static Button removeRow;
	private static Shell shell;
	
	public static void main(String[] args) {
		
		Display display = new Display();
		shell = new Shell(display);
		shell.setSize(420, 263);
		shell.setLayout(new FormLayout());
		
		//add initial widgets to screen
		init();
		
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		shell.dispose();
	}
	
	private static void init(){
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
		
		weaponRows = new ArrayList<WeaponRow>();
		weaponRows.add(new WeaponRow(shell));
		
		newRow = new Button(shell, SWT.NONE);
		newRow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				weaponRows.add(new WeaponRow(shell, weaponRows.get(weaponRows.size()-1)));
				FormData fd_newRow = new FormData();
				fd_newRow.top = new FormAttachment(weaponRows.get(weaponRows.size()-1).getWeaponNameInput(), 5, SWT.BOTTOM);
				fd_newRow.left = new FormAttachment(0, 5);
				fd_newRow.right = new FormAttachment(0, 53);
				newRow.setLayoutData(fd_newRow);
				
				FormData fd_removeRow = new FormData();
				fd_removeRow.top = new FormAttachment(weaponRows.get(weaponRows.size()-1).getAffinityInput(), 5, SWT.BOTTOM);
				fd_removeRow.left = new FormAttachment(100, -53);
				fd_removeRow.right = new FormAttachment(100, -5);
				removeRow.setLayoutData(fd_removeRow);
				//redraw the shell to show new rows
				shell.layout();
			}
		});
		FormData fd_newRow = new FormData();
		fd_newRow.right = new FormAttachment(0, 53);
		fd_newRow.top = new FormAttachment(weaponRows.get(0).getWeaponNameInput(), 5, SWT.BOTTOM);
		fd_newRow.left = new FormAttachment(0, 5);
		newRow.setLayoutData(fd_newRow);
		newRow.setImage(SWTResourceManager.getImage(Main.class, "/javax/swing/plaf/metal/icons/sortDown.png"));
		
		removeRow = new Button(shell, SWT.NONE);
		removeRow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(weaponRows.size() == 1)
					return;
				//remove them from the screen
				WeaponRow toRemove = weaponRows.get(weaponRows.size()-1);
				toRemove.getWeaponNameInput().dispose();
				toRemove.getAffinityInput().dispose();
				toRemove.getElementalInput().dispose();
				toRemove.getRawInput().dispose();
				toRemove.getSharpnessInput().dispose();
				toRemove.getPercent().dispose();
				
				//remove from list and move buttons
				weaponRows.remove(weaponRows.size()-1);
				FormData fd_newRow = new FormData();
				fd_newRow.top = new FormAttachment(weaponRows.get(weaponRows.size()-1).getWeaponNameInput(), 5, SWT.BOTTOM);
				fd_newRow.left = new FormAttachment(0, 5);
				fd_newRow.right = new FormAttachment(0, 53);
				newRow.setLayoutData(fd_newRow);
				
				FormData fd_removeRow = new FormData();
				fd_removeRow.top = new FormAttachment(weaponRows.get(weaponRows.size()-1).getAffinityInput(), 5, SWT.BOTTOM);
				fd_removeRow.left = new FormAttachment(100, -53);
				fd_removeRow.right = new FormAttachment(100, -5);
				removeRow.setLayoutData(fd_removeRow);
				//redraw the shell to show new rows
				shell.layout();
			}
		});
		FormData fd_removeRow = new FormData();
		fd_removeRow.right = new FormAttachment(100, -5);
		fd_removeRow.top = new FormAttachment(weaponRows.get(0).getAffinityInput(), 5, SWT.BOTTOM);
		fd_removeRow.left = new FormAttachment(100, -53);
		removeRow.setLayoutData(fd_removeRow);
		removeRow.setImage(SWTResourceManager.getImage(Main.class, "/javax/swing/plaf/metal/icons/sortUp.png"));
		
		Button btnCompute = new Button(shell, SWT.NONE);
		FormData fd_btnCompute = new FormData();
		fd_btnCompute.top = new FormAttachment(100, -36);
		fd_btnCompute.left = new FormAttachment(100, -79);
		fd_btnCompute.bottom = new FormAttachment(100);
		fd_btnCompute.right = new FormAttachment(100);
		btnCompute.setLayoutData(fd_btnCompute);
		btnCompute.setText("Compute");
	}
}
