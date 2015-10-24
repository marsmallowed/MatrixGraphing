package view;

import java.awt.Font;
import java.util.Vector;

import javax.swing.*;

public class HyperbolaPanel extends JPanel {
	private JTextField txtX;
	private JTextField txtY;
	private JLabel lblCenterCoordinates;
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblHorizontal;
	private JTextField txtHorizontal;
	private JTextField txtVertical;
	private JLabel lblOrientation;
	private JComboBox orientationComboBox;
	private JButton btnPlot;
	
	public HyperbolaPanel() {
		SpringLayout sl_hyperbolaPanel = new SpringLayout();
		setLayout(sl_hyperbolaPanel);
		
		lblX = new JLabel("X:");
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, lblX, 110, SpringLayout.WEST, this);
		sl_hyperbolaPanel.putConstraint(SpringLayout.EAST, lblX, -290, SpringLayout.EAST, this);
		add(lblX);
		
		txtX = new JTextField();
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, txtX, -3, SpringLayout.NORTH, lblX);
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, txtX, 52, SpringLayout.EAST, lblX);
		add(txtX);
		txtX.setColumns(10);
		
		lblY = new JLabel("Y:");
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, lblY, 12, SpringLayout.SOUTH, lblX);
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, lblY, 0, SpringLayout.WEST, lblX);
		sl_hyperbolaPanel.putConstraint(SpringLayout.EAST, lblY, -290, SpringLayout.EAST, this);
		add(lblY);
		
		txtY = new JTextField();
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, txtY, -3, SpringLayout.NORTH, lblY);
		sl_hyperbolaPanel.putConstraint(SpringLayout.EAST, txtY, 0, SpringLayout.EAST, txtX);
		add(txtY);
		txtY.setColumns(10);
		
		JLabel lblDistance = new JLabel("Distance");
		sl_hyperbolaPanel.putConstraint(SpringLayout.SOUTH, lblDistance, -160, SpringLayout.SOUTH, this);
		lblDistance.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblDistance);
		
		lblCenterCoordinates = new JLabel("Center Coordinates");
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, lblCenterCoordinates, 57, SpringLayout.WEST, this);
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, lblDistance, 0, SpringLayout.WEST, lblCenterCoordinates);
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, lblX, 6, SpringLayout.SOUTH, lblCenterCoordinates);
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, lblCenterCoordinates, 31, SpringLayout.NORTH, this);
		lblCenterCoordinates.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblCenterCoordinates);
		
		lblHorizontal = new JLabel("Horizontal:");
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, lblHorizontal, 148, SpringLayout.NORTH, this);
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, lblHorizontal, 110, SpringLayout.WEST, this);
		add(lblHorizontal);
		
		txtHorizontal = new JTextField();
		sl_hyperbolaPanel.putConstraint(SpringLayout.EAST, lblHorizontal, -9, SpringLayout.WEST, txtHorizontal);
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, txtHorizontal, -3, SpringLayout.NORTH, lblHorizontal);
		sl_hyperbolaPanel.putConstraint(SpringLayout.EAST, txtHorizontal, 0, SpringLayout.EAST, txtX);
		add(txtHorizontal);
		txtHorizontal.setColumns(10);
		
		JLabel lblVertical = new JLabel("Vertical:");
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, lblVertical, 6, SpringLayout.SOUTH, lblHorizontal);
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, lblVertical, 0, SpringLayout.WEST, lblX);
		sl_hyperbolaPanel.putConstraint(SpringLayout.EAST, lblVertical, -257, SpringLayout.EAST, this);
		add(lblVertical);
		
		txtVertical = new JTextField();
		sl_hyperbolaPanel.putConstraint(SpringLayout.SOUTH, lblVertical, 0, SpringLayout.SOUTH, txtVertical);
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, txtVertical, 6, SpringLayout.SOUTH, txtHorizontal);
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, txtVertical, 0, SpringLayout.WEST, txtX);
		add(txtVertical);
		txtVertical.setColumns(10);
		
		lblOrientation = new JLabel("Orientation:");
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, lblOrientation, 22, SpringLayout.SOUTH, lblVertical);
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, lblOrientation, 0, SpringLayout.WEST, lblDistance);
		sl_hyperbolaPanel.putConstraint(SpringLayout.EAST, lblOrientation, 0, SpringLayout.EAST, lblX);
		add(lblOrientation);
		
		Vector<String> orientations = new Vector<String>();
		orientations.add("Horizontal");
		orientations.add("Vertical");
		orientationComboBox = new JComboBox(orientations);
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, orientationComboBox, -3, SpringLayout.NORTH, lblOrientation);
		sl_hyperbolaPanel.putConstraint(SpringLayout.WEST, orientationComboBox, 0, SpringLayout.WEST, txtX);
		add(orientationComboBox);
		
		btnPlot = new JButton("Plot!");
		sl_hyperbolaPanel.putConstraint(SpringLayout.NORTH, btnPlot, 52, SpringLayout.SOUTH, txtVertical);
		sl_hyperbolaPanel.putConstraint(SpringLayout.EAST, btnPlot, -152, SpringLayout.EAST, this);
		add(btnPlot);
		
		/** ACTION LISTENERS HERE */
	}
}
