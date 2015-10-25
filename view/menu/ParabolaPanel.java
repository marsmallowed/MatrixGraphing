package view.menu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

import view.graphs.EllipseFrame;

public class ParabolaPanel extends JPanel {
	private JTextField txtX;
	private JTextField txtY;
	private JLabel lblCenterCoordinates;
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblMagnitude;
	private JTextField txtMagnitude;
	private JLabel lblOrientation;
	private JComboBox orientationComboBox;
	private JButton btnPlot;
	
	public ParabolaPanel() {
		SpringLayout s1_parabolaPanel = new SpringLayout();
		setLayout(s1_parabolaPanel);
		
		lblX = new JLabel("X:");
		s1_parabolaPanel.putConstraint(SpringLayout.WEST, lblX, 108, SpringLayout.WEST, this);
		add(lblX);
		
		txtX = new JTextField();
		add(txtX);
		txtX.setColumns(10);
		
		lblY = new JLabel("Y:");
		s1_parabolaPanel.putConstraint(SpringLayout.NORTH, lblY, 6, SpringLayout.SOUTH, lblX);
		s1_parabolaPanel.putConstraint(SpringLayout.WEST, lblY, 0, SpringLayout.WEST, lblX);
		s1_parabolaPanel.putConstraint(SpringLayout.SOUTH, lblY, 26, SpringLayout.SOUTH, lblX);
		add(lblY);
		
		txtY = new JTextField();
		s1_parabolaPanel.putConstraint(SpringLayout.NORTH, txtX, 3, SpringLayout.SOUTH, txtY);
		s1_parabolaPanel.putConstraint(SpringLayout.EAST, txtX, 0, SpringLayout.EAST, txtY);
		s1_parabolaPanel.putConstraint(SpringLayout.NORTH, lblX, 3, SpringLayout.NORTH, txtY);
		s1_parabolaPanel.putConstraint(SpringLayout.EAST, lblX, -17, SpringLayout.WEST, txtY);
		s1_parabolaPanel.putConstraint(SpringLayout.NORTH, txtY, 53, SpringLayout.NORTH, this);
		add(txtY);
		txtY.setColumns(10);
		
		lblCenterCoordinates = new JLabel("Vertex Coordinates");
		s1_parabolaPanel.putConstraint(SpringLayout.NORTH, lblCenterCoordinates, 28, SpringLayout.NORTH, this);
		lblCenterCoordinates.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblCenterCoordinates);
		
		lblMagnitude = new JLabel("Magnitude:");
		s1_parabolaPanel.putConstraint(SpringLayout.WEST, lblCenterCoordinates, 0, SpringLayout.WEST, lblMagnitude);
		s1_parabolaPanel.putConstraint(SpringLayout.WEST, lblMagnitude, 57, SpringLayout.WEST, this);
		add(lblMagnitude);
		
		txtMagnitude = new JTextField();
		s1_parabolaPanel.putConstraint(SpringLayout.WEST, txtY, 0, SpringLayout.WEST, txtMagnitude);
		s1_parabolaPanel.putConstraint(SpringLayout.WEST, txtMagnitude, 175, SpringLayout.WEST, this);
		s1_parabolaPanel.putConstraint(SpringLayout.NORTH, lblMagnitude, 0, SpringLayout.NORTH, txtMagnitude);
		s1_parabolaPanel.putConstraint(SpringLayout.SOUTH, lblMagnitude, 0, SpringLayout.SOUTH, txtMagnitude);
		s1_parabolaPanel.putConstraint(SpringLayout.EAST, lblMagnitude, -25, SpringLayout.WEST, txtMagnitude);
		add(txtMagnitude);
		txtMagnitude.setColumns(10);
		
		lblOrientation = new JLabel("Orientation:");
		s1_parabolaPanel.putConstraint(SpringLayout.WEST, lblOrientation, 57, SpringLayout.WEST, this);
		add(lblOrientation);
		
		Vector<String> orientations = new Vector<String>();
		orientations.add("Horizontal");
		orientations.add("Vertical");
		orientationComboBox = new JComboBox(orientations);
		s1_parabolaPanel.putConstraint(SpringLayout.WEST, orientationComboBox, 175, SpringLayout.WEST, this);
		s1_parabolaPanel.putConstraint(SpringLayout.EAST, lblOrientation, -15, SpringLayout.WEST, orientationComboBox);
		s1_parabolaPanel.putConstraint(SpringLayout.NORTH, orientationComboBox, 159, SpringLayout.NORTH, this);
		s1_parabolaPanel.putConstraint(SpringLayout.SOUTH, txtMagnitude, -8, SpringLayout.NORTH, orientationComboBox);
		s1_parabolaPanel.putConstraint(SpringLayout.NORTH, lblOrientation, 0, SpringLayout.NORTH, orientationComboBox);
		s1_parabolaPanel.putConstraint(SpringLayout.SOUTH, lblOrientation, 0, SpringLayout.SOUTH, orientationComboBox);
		add(orientationComboBox);
		
		btnPlot = new JButton("Plot!");
		s1_parabolaPanel.putConstraint(SpringLayout.EAST, lblY, -85, SpringLayout.WEST, btnPlot);
		s1_parabolaPanel.putConstraint(SpringLayout.SOUTH, btnPlot, -38, SpringLayout.SOUTH, this);
		s1_parabolaPanel.putConstraint(SpringLayout.EAST, btnPlot, -174, SpringLayout.EAST, this);
		add(btnPlot);
		
		/** ACTION LISTENERS HERE */
		btnPlot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x_coord = null;
				x_coord = Double.parseDouble(txtX.getText());
				Double y_coord = null;
				y_coord = Double.parseDouble(txtY.getText());
				Double magni = null;
				magni = Double.parseDouble(txtMagnitude.getText());
				
				if (x_coord != null && y_coord != null && magni != null ) {
					EllipseFrame ellipseGraph = new EllipseFrame();
					ellipseGraph.setVisible(true);
				} else JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid input.");
			}
		});
	}	
}
