package view.menu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import view.graphs.PolygonFrame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;

public class PolygonPanel extends JPanel {
	private JTextField txtX;
	private JTextField txtY;
	private JLabel lblCoordinates;
	private JLabel lblX;
	private JLabel lblY;
	private JButton btnPlot;
	private JButton btnAdd;
	private JScrollPane vertexList;
	private JPanel listContents;
	
	private JPanel vertices[];
	private JPanel coordinatesPanel;
	private int givenVertices;
	private ArrayList<Double> xCoordList;
	private ArrayList<Double> yCoordList;
	
	public PolygonPanel(int vertexNum) {
		SpringLayout sl_pointPanel = new SpringLayout();
		setLayout(sl_pointPanel);
		
		lblX = new JLabel("X:");
		sl_pointPanel.putConstraint(SpringLayout.EAST, lblX, -369, SpringLayout.EAST, this);
		add(lblX);
		
		txtX = new JTextField();
		sl_pointPanel.putConstraint(SpringLayout.NORTH, txtX, -3, SpringLayout.NORTH, lblX);
		sl_pointPanel.putConstraint(SpringLayout.WEST, txtX, 6, SpringLayout.EAST, lblX);
		add(txtX);
		txtX.setColumns(10);
		
		lblY = new JLabel("Y:");
		sl_pointPanel.putConstraint(SpringLayout.NORTH, lblY, 14, SpringLayout.SOUTH, lblX);
		sl_pointPanel.putConstraint(SpringLayout.WEST, lblY, 47, SpringLayout.WEST, this);
		add(lblY);
		
		txtY = new JTextField();
		sl_pointPanel.putConstraint(SpringLayout.EAST, lblY, -19, SpringLayout.WEST, txtY);
		sl_pointPanel.putConstraint(SpringLayout.NORTH, txtY, 6, SpringLayout.SOUTH, txtX);
		sl_pointPanel.putConstraint(SpringLayout.WEST, txtY, 0, SpringLayout.WEST, txtX);
		add(txtY);
		txtY.setColumns(10);
		
		lblCoordinates = new JLabel("Coordinates");
		sl_pointPanel.putConstraint(SpringLayout.NORTH, lblX, 6, SpringLayout.SOUTH, lblCoordinates);
		sl_pointPanel.putConstraint(SpringLayout.WEST, lblX, 10, SpringLayout.WEST, lblCoordinates);
		sl_pointPanel.putConstraint(SpringLayout.NORTH, lblCoordinates, 48, SpringLayout.NORTH, this);
		sl_pointPanel.putConstraint(SpringLayout.WEST, lblCoordinates, 37, SpringLayout.WEST, this);
		lblCoordinates.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblCoordinates);
		
		btnPlot = new JButton("Plot!");
		sl_pointPanel.putConstraint(SpringLayout.NORTH, btnPlot, 31, SpringLayout.SOUTH, txtY);
		sl_pointPanel.putConstraint(SpringLayout.EAST, btnPlot, 0, SpringLayout.EAST, txtX);
		add(btnPlot);
		
		btnAdd = new JButton("Add");
		sl_pointPanel.putConstraint(SpringLayout.NORTH, btnAdd, 0, SpringLayout.NORTH, btnPlot);
		sl_pointPanel.putConstraint(SpringLayout.WEST, btnAdd, 0, SpringLayout.WEST, lblCoordinates);
		add(btnAdd);
		
		vertexList = new JScrollPane();
		sl_pointPanel.putConstraint(SpringLayout.NORTH, vertexList, 10, SpringLayout.NORTH, this);
		sl_pointPanel.putConstraint(SpringLayout.WEST, vertexList, 38, SpringLayout.EAST, txtX);
		sl_pointPanel.putConstraint(SpringLayout.SOUTH, vertexList, 300, SpringLayout.NORTH, this);
		sl_pointPanel.putConstraint(SpringLayout.EAST, vertexList, -76, SpringLayout.EAST, this);
		vertexList.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		vertexList.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(vertexList);
		
		listContents = new JPanel();
		vertexList.setViewportView(listContents);
		listContents.setLayout(new BorderLayout(0, 0));
		
		JPanel numberPanel = new JPanel();
		listContents.add(numberPanel, BorderLayout.WEST);
		numberPanel.setLayout(new GridLayout(0, 1, 0, 0));
		for (Integer i = 0; i < vertexNum; i++) {
			Integer temp = i+1;
			JLabel vertexListIndex = new JLabel(temp.toString());
			numberPanel.add(vertexListIndex);
		}
		
		coordinatesPanel = new JPanel();
		coordinatesPanel.setVisible(true);
		coordinatesPanel.setLayout(new GridLayout(0, 1, 0, 0));
		listContents.add(coordinatesPanel, BorderLayout.CENTER);
		vertices = new JPanel[vertexNum];
		for (int i = 0; i < vertexNum; i++) {
			vertices[i] = new JPanel();
			vertices[i].setBorder(BorderFactory.createLineBorder(Color.black));
			coordinatesPanel.add(vertices[i]);
		}
		
		givenVertices = 0;
		xCoordList = new ArrayList<Double>();
		yCoordList = new ArrayList<Double>();
		
		/** ACTION LISTENERS HERE */
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (givenVertices < vertices.length) {
					vertices[givenVertices].setLayout(new BorderLayout(0, 0));
					vertices[givenVertices].setSize(160, 30);
					
					xCoordList.add(Double.parseDouble(txtX.getText()));
					yCoordList.add(Double.parseDouble(txtY.getText()));
					
					lblCoordinates = new JLabel();
					lblCoordinates.setText("(" + txtX.getText() + "," + txtY.getText() + ")");
					lblCoordinates.setHorizontalAlignment(SwingConstants.CENTER);
					vertices[givenVertices].add(lblCoordinates, BorderLayout.CENTER);
					
					vertices[givenVertices].setVisible(true);
					givenVertices++;
					
					vertexList.repaint();
					vertexList.revalidate();
				} else JOptionPane.showMessageDialog(new JFrame(), "You have already entered " + givenVertices + " vertices.");
			}
		});
		
		btnPlot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (givenVertices < vertices.length)
					JOptionPane.showMessageDialog(new JFrame(), "Please enter " + vertices.length + " vertex coordinates.");
				else {
					PolygonFrame polygonGraph = new PolygonFrame(xCoordList, yCoordList);
					polygonGraph.setVisible(true);
				}
			}
		});
	}
}
