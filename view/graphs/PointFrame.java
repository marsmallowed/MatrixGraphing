package view.graphs;

import javax.swing.*;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Vector;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import view.graphs.modes.TranslatePanel;

public class PointFrame extends JFrame {
	
	private JTextPane currentObjectPane;
	private JPanel choiceBlankPanel;
	private JComboBox choicesComboBox;
	private JPanel graphPanel;
	
	private Double transX;
	private Double transY;
	
	private JPanel translatePanel;
	private JTextPane translatedObjectPane;
	
	public PointFrame(double x, double y) {
		setResizable(false);
		setSize(880, 600);
		setType(Type.UTILITY);
		setTitle("Graph");
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		currentObjectPane = new JTextPane();
		springLayout.putConstraint(SpringLayout.SOUTH, currentObjectPane, 110, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, currentObjectPane, 326, SpringLayout.WEST, getContentPane());
		currentObjectPane.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, currentObjectPane, 21, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, currentObjectPane, 27, SpringLayout.WEST, getContentPane());
		getContentPane().add(currentObjectPane);
		
		currentObjectPane.setText("Current Object:\nP: [" + x + " " + y + "]");
		
		Vector<String> choices = new Vector<String>();
		choices.add("-Select-");
		choices.add("Translate");
		
		translatedObjectPane = new JTextPane();
		translatedObjectPane.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, translatedObjectPane, 2, SpringLayout.SOUTH, currentObjectPane);
		springLayout.putConstraint(SpringLayout.WEST, translatedObjectPane, 0, SpringLayout.WEST, currentObjectPane);
		springLayout.putConstraint(SpringLayout.SOUTH, translatedObjectPane, 91, SpringLayout.SOUTH, currentObjectPane);
		springLayout.putConstraint(SpringLayout.EAST, translatedObjectPane, 0, SpringLayout.EAST, currentObjectPane);
		getContentPane().add(translatedObjectPane);
		
		choicesComboBox = new JComboBox(choices);
		springLayout.putConstraint(SpringLayout.NORTH, choicesComboBox, 116, SpringLayout.SOUTH, currentObjectPane);
		springLayout.putConstraint(SpringLayout.WEST, choicesComboBox, 74, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, choicesComboBox, 240, SpringLayout.WEST, getContentPane());
		getContentPane().add(choicesComboBox);
		
		choiceBlankPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, choicesComboBox, -22, SpringLayout.NORTH, choiceBlankPanel);
		springLayout.putConstraint(SpringLayout.EAST, choiceBlankPanel, 326, SpringLayout.WEST, getContentPane());
		choiceBlankPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		springLayout.putConstraint(SpringLayout.NORTH, choiceBlankPanel, 276, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, choiceBlankPanel, -27, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, choiceBlankPanel, 27, SpringLayout.WEST, getContentPane());
		getContentPane().add(choiceBlankPanel);
		
		translatePanel = new TranslatePanel();
		springLayout.putConstraint(SpringLayout.SOUTH, choicesComboBox, -22, SpringLayout.NORTH, choiceBlankPanel);
		springLayout.putConstraint(SpringLayout.EAST, translatePanel, 326, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, translatePanel, 276, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, translatePanel, -27, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, translatePanel, 27, SpringLayout.WEST, getContentPane());
		getContentPane().add(translatePanel);
		translatePanel.setVisible(false);
		
		graphPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, graphPanel, 24, SpringLayout.EAST, currentObjectPane);
		springLayout.putConstraint(SpringLayout.EAST, graphPanel, -26, SpringLayout.EAST, getContentPane());
		graphPanel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, graphPanel, 43, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, graphPanel, 498, SpringLayout.NORTH, getContentPane());
		getContentPane().add(graphPanel);
		
		/** ACTION LISTENERS HERE */
		choicesComboBox.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				String selectedMode = (String)choicesComboBox.getSelectedItem(); 
				
				if(selectedMode.equals("-Select-")) {
					translatePanel.setVisible(true);
					choiceBlankPanel.setVisible(true);
				}
				else if(selectedMode.equals("Translate")) {
					translatePanel.setVisible(true);
					choiceBlankPanel.setVisible(false);
				}
				
				repaint();
				revalidate();
			}
		});
	}
	
	public JTextPane getLogTextPane() {
		return translatedObjectPane;
	}
}

