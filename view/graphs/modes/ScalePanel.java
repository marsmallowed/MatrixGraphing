package view.graphs.modes;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class ScalePanel extends JPanel {
	private JTextField txtScalar;
	
	public ScalePanel() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblScalar = new JLabel("Scalar:");
		add(lblScalar);
		
		txtScalar = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtScalar, 118, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtScalar, 85, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, lblScalar, 0, SpringLayout.WEST, txtScalar);
		springLayout.putConstraint(SpringLayout.SOUTH, lblScalar, -6, SpringLayout.NORTH, txtScalar);
		add(txtScalar);
		txtScalar.setColumns(10);
		
		JButton btnScale = new JButton("Scale");
		springLayout.putConstraint(SpringLayout.NORTH, btnScale, 22, SpringLayout.SOUTH, txtScalar);
		springLayout.putConstraint(SpringLayout.WEST, btnScale, 0, SpringLayout.WEST, lblScalar);
		springLayout.putConstraint(SpringLayout.EAST, btnScale, 0, SpringLayout.EAST, txtScalar);
		add(btnScale);
	}

}
