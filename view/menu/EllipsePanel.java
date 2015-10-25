package view.menu;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import view.graphs.EllipseFrame;
import view.graphs.VectorFrame;

public class EllipsePanel extends JPanel{
	private JTextField txtX;
	private JTextField txtY;
	private JLabel lblCenterCoordinates;
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblHorizontal;
	private JTextField txtHorizontal;
	private JTextField txtVertical;
	private JButton btnPlot;
	
	public EllipsePanel() {
		SpringLayout sl_ellipsePanel = new SpringLayout();
		setLayout(sl_ellipsePanel);
		
		lblX = new JLabel("X:");
		sl_ellipsePanel.putConstraint(SpringLayout.WEST, lblX, 110, SpringLayout.WEST, this);
		sl_ellipsePanel.putConstraint(SpringLayout.EAST, lblX, -290, SpringLayout.EAST, this);
		add(lblX);
		
		txtX = new JTextField();
		sl_ellipsePanel.putConstraint(SpringLayout.NORTH, txtX, -3, SpringLayout.NORTH, lblX);
		sl_ellipsePanel.putConstraint(SpringLayout.WEST, txtX, 175, SpringLayout.WEST, this);
		add(txtX);
		txtX.setColumns(10);
		
		lblY = new JLabel("Y:");
		sl_ellipsePanel.putConstraint(SpringLayout.NORTH, lblY, 6, SpringLayout.SOUTH, lblX);
		sl_ellipsePanel.putConstraint(SpringLayout.WEST, lblY, 110, SpringLayout.WEST, this);
		add(lblY);
		
		txtY = new JTextField();
		sl_ellipsePanel.putConstraint(SpringLayout.EAST, lblY, -44, SpringLayout.WEST, txtY);
		sl_ellipsePanel.putConstraint(SpringLayout.NORTH, txtY, 1, SpringLayout.NORTH, lblY);
		sl_ellipsePanel.putConstraint(SpringLayout.WEST, txtY, 0, SpringLayout.WEST, txtX);
		add(txtY);
		txtY.setColumns(10);
		
		JLabel lblDistance = new JLabel("Distance");
		sl_ellipsePanel.putConstraint(SpringLayout.WEST, lblDistance, 57, SpringLayout.WEST, this);
		sl_ellipsePanel.putConstraint(SpringLayout.SOUTH, lblDistance, -149, SpringLayout.SOUTH, this);
		lblDistance.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblDistance);
		
		lblCenterCoordinates = new JLabel("Center Coordinates");
		sl_ellipsePanel.putConstraint(SpringLayout.SOUTH, lblCenterCoordinates, -233, SpringLayout.SOUTH, this);
		sl_ellipsePanel.putConstraint(SpringLayout.NORTH, lblX, 3, SpringLayout.SOUTH, lblCenterCoordinates);
		lblCenterCoordinates.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblCenterCoordinates);
		
		lblHorizontal = new JLabel("Horizontal:");
		sl_ellipsePanel.putConstraint(SpringLayout.WEST, lblHorizontal, 110, SpringLayout.WEST, this);
		sl_ellipsePanel.putConstraint(SpringLayout.EAST, lblHorizontal, -247, SpringLayout.EAST, this);
		sl_ellipsePanel.putConstraint(SpringLayout.SOUTH, lblY, -47, SpringLayout.NORTH, lblHorizontal);
		sl_ellipsePanel.putConstraint(SpringLayout.SOUTH, lblHorizontal, -126, SpringLayout.SOUTH, this);
		add(lblHorizontal);
		
		txtHorizontal = new JTextField();
		sl_ellipsePanel.putConstraint(SpringLayout.NORTH, txtHorizontal, -3, SpringLayout.NORTH, lblHorizontal);
		sl_ellipsePanel.putConstraint(SpringLayout.EAST, txtHorizontal, 0, SpringLayout.EAST, txtX);
		add(txtHorizontal);
		txtHorizontal.setColumns(10);
		
		JLabel lblVertical = new JLabel("Vertical:");
		sl_ellipsePanel.putConstraint(SpringLayout.NORTH, lblVertical, 15, SpringLayout.SOUTH, lblHorizontal);
		sl_ellipsePanel.putConstraint(SpringLayout.WEST, lblVertical, 110, SpringLayout.WEST, this);
		sl_ellipsePanel.putConstraint(SpringLayout.EAST, lblCenterCoordinates, 0, SpringLayout.EAST, lblVertical);
		add(lblVertical);
		
		txtVertical = new JTextField();
		sl_ellipsePanel.putConstraint(SpringLayout.EAST, lblVertical, -11, SpringLayout.WEST, txtVertical);
		sl_ellipsePanel.putConstraint(SpringLayout.NORTH, txtVertical, -3, SpringLayout.NORTH, lblVertical);
		sl_ellipsePanel.putConstraint(SpringLayout.EAST, txtVertical, 0, SpringLayout.EAST, txtX);
		add(txtVertical);
		txtVertical.setColumns(10);
		
		btnPlot = new JButton("Plot!");
		sl_ellipsePanel.putConstraint(SpringLayout.NORTH, btnPlot, 35, SpringLayout.SOUTH, txtVertical);
		sl_ellipsePanel.putConstraint(SpringLayout.EAST, btnPlot, -160, SpringLayout.EAST, this);
		add(btnPlot);
		
		/** ACTION LISTENERS HERE */
		btnPlot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x_coord = null;
				x_coord = Double.parseDouble(txtX.getText());
				Double y_coord = null;
				y_coord = Double.parseDouble(txtY.getText());
				Double hori = null;
				hori = Double.parseDouble(txtHorizontal.getText());
				Double verti = null;
				verti = Double.parseDouble(txtVertical.getText());
				
				if (x_coord != null && y_coord != null && hori != null && verti != null ) {
					EllipseFrame ellipseGraph = new EllipseFrame();
					ellipseGraph.setVisible(true);
				} else JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid input.");
			}
		});
	}
}
