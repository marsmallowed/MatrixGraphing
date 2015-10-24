package view;

import java.awt.Font;

import javax.swing.*;
public class LineSegmentPanel extends JPanel {
	private JTextField txtX1;
	private JTextField txtY1;
	private JLabel lblCoordinates;
	private JLabel lblX1;
	private JLabel lblY1;
	private JButton btnPlot;
	private JLabel lblX;
	private JTextField txtX2;
	private JLabel lblY;
	private JTextField txtY2;
	
	public LineSegmentPanel() {
		SpringLayout sl_lineSegmentPanel = new SpringLayout();
		setLayout(sl_lineSegmentPanel);
		
		lblX1 = new JLabel("X1:");
		sl_lineSegmentPanel.putConstraint(SpringLayout.EAST, lblX1, -370, SpringLayout.EAST, this);
		add(lblX1);
		
		txtX1 = new JTextField();
		sl_lineSegmentPanel.putConstraint(SpringLayout.NORTH, txtX1, -3, SpringLayout.NORTH, lblX1);
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, txtX1, 6, SpringLayout.EAST, lblX1);
		add(txtX1);
		txtX1.setColumns(10);
		
		lblY1 = new JLabel("Y1:");
		sl_lineSegmentPanel.putConstraint(SpringLayout.NORTH, lblY1, 16, SpringLayout.SOUTH, lblX1);
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, lblY1, 51, SpringLayout.WEST, this);
		sl_lineSegmentPanel.putConstraint(SpringLayout.SOUTH, lblY1, -161, SpringLayout.SOUTH, this);
		add(lblY1);
		
		txtY1 = new JTextField();
		sl_lineSegmentPanel.putConstraint(SpringLayout.EAST, lblY1, -14, SpringLayout.WEST, txtY1);
		sl_lineSegmentPanel.putConstraint(SpringLayout.NORTH, txtY1, -2, SpringLayout.NORTH, lblY1);
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, txtY1, 0, SpringLayout.WEST, txtX1);
		add(txtY1);
		txtY1.setColumns(10);
		
		lblCoordinates = new JLabel("Coordinates");
		sl_lineSegmentPanel.putConstraint(SpringLayout.SOUTH, lblCoordinates, -233, SpringLayout.SOUTH, this);
		sl_lineSegmentPanel.putConstraint(SpringLayout.NORTH, lblX1, 25, SpringLayout.SOUTH, lblCoordinates);
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, lblX1, 0, SpringLayout.WEST, lblCoordinates);
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, lblCoordinates, 51, SpringLayout.WEST, this);
		lblCoordinates.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblCoordinates);
		
		btnPlot = new JButton("Plot!");
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, btnPlot, 190, SpringLayout.WEST, this);
		sl_lineSegmentPanel.putConstraint(SpringLayout.SOUTH, btnPlot, -55, SpringLayout.SOUTH, this);
		add(btnPlot);
		
		lblX = new JLabel("X2:");
		sl_lineSegmentPanel.putConstraint(SpringLayout.NORTH, lblX, -3, SpringLayout.NORTH, lblX1);
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, lblX, 41, SpringLayout.EAST, txtX1);
		sl_lineSegmentPanel.putConstraint(SpringLayout.SOUTH, lblX, 0, SpringLayout.SOUTH, txtX1);
		add(lblX);
		
		txtX2 = new JTextField();
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, txtX2, 28, SpringLayout.EAST, lblX);
		sl_lineSegmentPanel.putConstraint(SpringLayout.SOUTH, txtX2, 0, SpringLayout.SOUTH, txtX1);
		add(txtX2);
		txtX2.setColumns(10);
		
		lblY = new JLabel("Y2:");
		sl_lineSegmentPanel.putConstraint(SpringLayout.NORTH, lblY, -3, SpringLayout.NORTH, lblY1);
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, lblY, 0, SpringLayout.WEST, lblX);
		sl_lineSegmentPanel.putConstraint(SpringLayout.SOUTH, lblY, 33, SpringLayout.SOUTH, lblX);
		add(lblY);
		
		txtY2 = new JTextField();
		sl_lineSegmentPanel.putConstraint(SpringLayout.WEST, txtY2, 0, SpringLayout.WEST, txtX2);
		sl_lineSegmentPanel.putConstraint(SpringLayout.SOUTH, txtY2, 0, SpringLayout.SOUTH, lblY1);
		add(txtY2);
		txtY2.setColumns(10);
		
		/** ACTION LISTENERS HERE */
	}
}
