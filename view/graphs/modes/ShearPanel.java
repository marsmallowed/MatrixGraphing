package view.graphs.modes;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class ShearPanel extends JPanel {
	private JTextField txtAngle;
	
	public ShearPanel() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblAngle = new JLabel("Angle in Degrees (clockwise):");
		springLayout.putConstraint(SpringLayout.WEST, lblAngle, 75, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblAngle, -182, SpringLayout.SOUTH, this);
		add(lblAngle);
		
		txtAngle = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtAngle, 6, SpringLayout.SOUTH, lblAngle);
		springLayout.putConstraint(SpringLayout.WEST, txtAngle, 0, SpringLayout.WEST, lblAngle);
		springLayout.putConstraint(SpringLayout.EAST, txtAngle, 0, SpringLayout.EAST, lblAngle);
		add(txtAngle);
		txtAngle.setColumns(10);
		
		JButton btnShear = new JButton("Shear");
		springLayout.putConstraint(SpringLayout.NORTH, btnShear, 20, SpringLayout.SOUTH, txtAngle);
		springLayout.putConstraint(SpringLayout.WEST, btnShear, 100, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnShear, -108, SpringLayout.EAST, this);
		add(btnShear);
	}
}
