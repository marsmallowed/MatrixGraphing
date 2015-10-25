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
	
	private JTextArea currentObjectTextArea;
	private JPanel choiceBlankPanel;
	private JComboBox choicesComboBox;
	private JPanel graphPanel;
	
	private Double transX;
	private Double transY;
	
	private JPanel translatePanel;
	private JTextArea logTextArea;
	
	public PointFrame(double x, double y) {
		setResizable(false);
		setSize(880, 600);
		setType(Type.UTILITY);
		setTitle("Graph");
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		currentObjectTextArea = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, currentObjectTextArea, 10, SpringLayout.NORTH, getContentPane());
		currentObjectTextArea.setEditable(false);
		springLayout.putConstraint(SpringLayout.WEST, currentObjectTextArea, 28, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, currentObjectTextArea, 327, SpringLayout.WEST, getContentPane());
		getContentPane().add(currentObjectTextArea);
		
		currentObjectTextArea.setText("Current Object:\nP: [" + x + " " + y + "]");
		
		logTextArea = new JTextArea();
		springLayout.putConstraint(SpringLayout.SOUTH, currentObjectTextArea, -6, SpringLayout.NORTH, logTextArea);
		springLayout.putConstraint(SpringLayout.SOUTH, logTextArea, 200, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, logTextArea, 0, SpringLayout.EAST, currentObjectTextArea);
		springLayout.putConstraint(SpringLayout.NORTH, logTextArea, 108, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, logTextArea, 28, SpringLayout.WEST, getContentPane());
		logTextArea.setEditable(false);
		getContentPane().add(logTextArea);
		
		Vector<String> choices = new Vector<String>();
		choices.add("-Select-");
		choices.add("Translate");
		
		choicesComboBox = new JComboBox(choices);
		springLayout.putConstraint(SpringLayout.NORTH, choicesComboBox, 122, SpringLayout.SOUTH, currentObjectTextArea);
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
		springLayout.putConstraint(SpringLayout.WEST, graphPanel, 24, SpringLayout.EAST, currentObjectTextArea);
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
}

