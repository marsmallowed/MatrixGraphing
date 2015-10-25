package view.menu;

import java.awt.Font;

import javax.swing.*;

import view.graphs.PointFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PointPanel extends JPanel {
	private JTextField txtX;
	private JTextField txtY;
	private JLabel lblCoordinates;
	private JLabel lblX;
	private JLabel lblY;
	private JButton btnPlot;
	
	public PointPanel() {
		SpringLayout sl_pointPanel = new SpringLayout();
		setLayout(sl_pointPanel);
		
		lblX = new JLabel("X:");
		sl_pointPanel.putConstraint(SpringLayout.EAST, lblX, -290, SpringLayout.EAST, this);
		add(lblX);
		
		txtX = new JTextField();
		sl_pointPanel.putConstraint(SpringLayout.NORTH, txtX, -3, SpringLayout.NORTH, lblX);
		add(txtX);
		txtX.setColumns(10);
		
		lblY = new JLabel("Y:");
		sl_pointPanel.putConstraint(SpringLayout.WEST, lblY, 110, SpringLayout.WEST, this);
		sl_pointPanel.putConstraint(SpringLayout.WEST, lblX, 0, SpringLayout.WEST, lblY);
		sl_pointPanel.putConstraint(SpringLayout.SOUTH, lblX, -16, SpringLayout.NORTH, lblY);
		add(lblY);
		
		txtY = new JTextField();
		sl_pointPanel.putConstraint(SpringLayout.WEST, txtY, 175, SpringLayout.WEST, this);
		sl_pointPanel.putConstraint(SpringLayout.EAST, txtX, 0, SpringLayout.EAST, txtY);
		sl_pointPanel.putConstraint(SpringLayout.EAST, lblY, -44, SpringLayout.WEST, txtY);
		sl_pointPanel.putConstraint(SpringLayout.NORTH, txtY, 119, SpringLayout.NORTH, this);
		sl_pointPanel.putConstraint(SpringLayout.NORTH, lblY, 3, SpringLayout.NORTH, txtY);
		add(txtY);
		txtY.setColumns(10);
		
		lblCoordinates = new JLabel("Coordinates");
		sl_pointPanel.putConstraint(SpringLayout.WEST, lblCoordinates, 51, SpringLayout.WEST, this);
		sl_pointPanel.putConstraint(SpringLayout.SOUTH, lblCoordinates, -25, SpringLayout.NORTH, lblX);
		lblCoordinates.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblCoordinates);
		
		btnPlot = new JButton("Plot!");
		sl_pointPanel.putConstraint(SpringLayout.NORTH, btnPlot, 42, SpringLayout.SOUTH, txtY);
		sl_pointPanel.putConstraint(SpringLayout.WEST, btnPlot, 190, SpringLayout.WEST, this);
		add(btnPlot);
		
		/** ACTION LISTENERS HERE */
		btnPlot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x_coord = null;
				x_coord = Double.parseDouble(txtX.getText());
				Double y_coord = null;
				y_coord = Double.parseDouble(txtY.getText());
				
				if (x_coord != null && y_coord != null) {
					PointFrame pointGraph = new PointFrame(x_coord, y_coord);
					pointGraph.setVisible(true);
				} else JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid input.");
			}
		});
	}

}
