package view.graphs.modes;

import java.util.Vector;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class ReflectPanel extends JPanel {
	private JComboBox axisComboBox;
	
	public ReflectPanel() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		Vector<String> axes = new Vector<String>();
		axes.add("-Select-");
		axes.add("X-Axis");
		axes.add("Y-Axis");
		
		axisComboBox = new JComboBox(axes);
		springLayout.putConstraint(SpringLayout.NORTH, axisComboBox, 119, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, axisComboBox, 80, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, axisComboBox, 139, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, axisComboBox, -87, SpringLayout.EAST, this);
		add(axisComboBox);
	}
}
