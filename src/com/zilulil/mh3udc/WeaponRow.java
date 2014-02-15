package com.zilulil.mh3udc;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class WeaponRow {
	private Text weaponNameInput;
	private Text affinityInput;
	private Text rawInput;
	private Text elementalInput;
	private Combo sharpnessInput;
	private Label percent;
	
	//Giant hideous constructors
	public WeaponRow(Shell shell){
		weaponNameInput = new Text(shell, SWT.BORDER);
		FormData fd_weaponNameInput = new FormData();
		fd_weaponNameInput.top = new FormAttachment(0, 25);
		fd_weaponNameInput.left = new FormAttachment(0, 5);
		weaponNameInput.setLayoutData(fd_weaponNameInput);
		weaponNameInput.setToolTipText("Name of the Weapon");
		weaponNameInput.setText("Test Weapon");
		
		sharpnessInput = new Combo(shell, SWT.NONE);
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
		fd_rawInput.top = new FormAttachment(0, 25);
		fd_rawInput.left = new FormAttachment(0, 200);
		rawInput.setLayoutData(fd_rawInput);
		rawInput.setText("230");
		
		elementalInput = new Text(shell, SWT.BORDER);
		FormData fd_elementalInput = new FormData();
		fd_elementalInput.right = new FormAttachment(0, 341);
		fd_elementalInput.top = new FormAttachment(0, 25);
		fd_elementalInput.left = new FormAttachment(0, 265);
		elementalInput.setLayoutData(fd_elementalInput);
		elementalInput.setText("200");
		
		affinityInput = new Text(shell, SWT.BORDER);
		FormData fd_affinityInput = new FormData();
		fd_affinityInput.right = new FormAttachment(0, 385);
		fd_affinityInput.left = new FormAttachment(0, 345);
		fd_affinityInput.top = new FormAttachment(0, 25);
		affinityInput.setLayoutData(fd_affinityInput);
		affinityInput.setText("5");
		
		percent = new Label(shell, SWT.NONE);
		FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(0, 25);
		fd_label.left = new FormAttachment(0, 390);
		fd_label.height = 20;
		percent.setLayoutData(fd_label);
		percent.setText("%");
	}
	
	public WeaponRow(Shell shell, WeaponRow o){
		weaponNameInput = new Text(shell, SWT.BORDER);
		FormData fd_weaponNameInput = new FormData();
		fd_weaponNameInput.top = new FormAttachment(o.weaponNameInput, 5, SWT.BOTTOM);
		fd_weaponNameInput.left = new FormAttachment(0, 5);
		weaponNameInput.setLayoutData(fd_weaponNameInput);
		weaponNameInput.setToolTipText("Name of the Weapon");
		weaponNameInput.setText("Test Weapon");
		
		sharpnessInput = new Combo(shell, SWT.NONE);
		FormData fd_sharpnessInput = new FormData();
		fd_sharpnessInput.right = new FormAttachment(0, 195);
		fd_sharpnessInput.top = new FormAttachment(o.sharpnessInput, 3, SWT.BOTTOM);
		fd_sharpnessInput.left = new FormAttachment(0, 91);
		sharpnessInput.setLayoutData(fd_sharpnessInput);
		sharpnessInput.setToolTipText("Sharpness");
		sharpnessInput.setItems(new String[] {"Red", "Orange", "Yellow", "Green", "Blue", "White", "Purple"});
		sharpnessInput.select(2);
		
		rawInput = new Text(shell, SWT.BORDER);
		FormData fd_rawInput = new FormData();
		fd_rawInput.right = new FormAttachment(0, 260);
		fd_rawInput.top = new FormAttachment(o.rawInput, 5, SWT.BOTTOM);
		fd_rawInput.left = new FormAttachment(0, 200);
		rawInput.setLayoutData(fd_rawInput);
		rawInput.setText("230");
		
		elementalInput = new Text(shell, SWT.BORDER);
		FormData fd_elementalInput = new FormData();
		fd_elementalInput.right = new FormAttachment(0, 341);
		fd_elementalInput.top = new FormAttachment(o.elementalInput, 5, SWT.BOTTOM);
		fd_elementalInput.left = new FormAttachment(0, 265);
		elementalInput.setLayoutData(fd_elementalInput);
		elementalInput.setText("200");
		
		affinityInput = new Text(shell, SWT.BORDER);
		FormData fd_affinityInput = new FormData();
		fd_affinityInput.right = new FormAttachment(0, 385);
		fd_affinityInput.left = new FormAttachment(0, 345);
		fd_affinityInput.top = new FormAttachment(o.affinityInput, 5, SWT.BOTTOM);
		affinityInput.setLayoutData(fd_affinityInput);
		affinityInput.setText("5");
		
		percent = new Label(shell, SWT.NONE);
		FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(o.percent, 5, SWT.BOTTOM);
		fd_label.left = new FormAttachment(0, 390);
		fd_label.height = 21;
		percent.setLayoutData(fd_label);
		percent.setText("%");
	}

	public Text getWeaponNameInput(){
		return weaponNameInput;
	}
	
	public Text getAffinityInput(){
		return affinityInput;
	}
	
	public Text getRawInput(){
		return rawInput;
	}
	
	public Text getElementalInput(){
		return elementalInput;
	}
	
	public Combo getSharpnessInput(){
		return sharpnessInput;
	}
	
	public Label getPercent(){
		return percent;
	}
}