package view.graphs.modes;

import java.util.Vector;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class RotatePanel extends JPanel {
	public RotatePanel() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		Vector<String> rotateModes = new Vector<String>();
		rotateModes.add("-Select-");
		rotateModes.add("90 degrees counterclockwise");
		rotateModes.add("90 degrees clockwise");
		rotateModes.add("180 degrees");
		
		JComboBox rotateComboBox = new JComboBox(rotateModes);
		springLayout.putConstraint(SpringLayout.NORTH, rotateComboBox, 120, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, rotateComboBox, -255, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, rotateComboBox, 140, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, rotateComboBox, -43, SpringLayout.EAST, this);
		add(rotateComboBox);
	}
}