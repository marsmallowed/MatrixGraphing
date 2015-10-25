package view.graphs;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import view.graphs.modes.ReflectPanel;
import view.graphs.modes.RotatePanel;
import view.graphs.modes.ShearPanel;
import view.graphs.modes.TranslatePanel;

public class ParabolaFrame extends JFrame {
	private JTextArea currentObjectTextArea;
	private JPanel choiceBlankPanel;
	private JComboBox choicesComboBox;
	private JPanel graphPanel;
	
	private Double transX;
	private Double transY;
	
	private JPanel translatePanel;
	private JPanel shearPanel;
	private JPanel rotatePanel;
	private JPanel scalePanel;
	private JPanel reflectPanel;
	private JTextArea logTextArea;
	
	public ParabolaFrame() {
		setResizable(false);
		setSize(880, 600);
		setType(Type.UTILITY);
		setTitle("Graph");
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		currentObjectTextArea = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, currentObjectTextArea, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, currentObjectTextArea, -465, SpringLayout.SOUTH, getContentPane());
		currentObjectTextArea.setEditable(false);
		springLayout.putConstraint(SpringLayout.WEST, currentObjectTextArea, 28, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, currentObjectTextArea, 327, SpringLayout.WEST, getContentPane());
		getContentPane().add(currentObjectTextArea);
		
		currentObjectTextArea.setText("Current Object:");
		// TODO: add here equation of ellipse <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		Vector<String> choices = new Vector<String>();
		choices.add("-Select-");
		choices.add("Translate");
		choices.add("Shear");
		choices.add("Rotate");
		choices.add("Scale");
		choices.add("Reflect");
		
		logTextArea = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, logTextArea, 6, SpringLayout.SOUTH, currentObjectTextArea);
		springLayout.putConstraint(SpringLayout.WEST, logTextArea, 0, SpringLayout.WEST, currentObjectTextArea);
		logTextArea.setEditable(false);
		getContentPane().add(logTextArea);
		
		choicesComboBox = new JComboBox(choices);
		springLayout.putConstraint(SpringLayout.SOUTH, logTextArea, -15, SpringLayout.NORTH, choicesComboBox);
		springLayout.putConstraint(SpringLayout.NORTH, choicesComboBox, 223, SpringLayout.NORTH, getContentPane());
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
		
		shearPanel = new ShearPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, choicesComboBox, -22, SpringLayout.NORTH, choiceBlankPanel);
		springLayout.putConstraint(SpringLayout.EAST, shearPanel, 326, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, shearPanel, 276, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, shearPanel, -27, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, shearPanel, 27, SpringLayout.WEST, getContentPane());
		getContentPane().add(shearPanel);
		shearPanel.setVisible(false);
		
		rotatePanel = new RotatePanel();
		springLayout.putConstraint(SpringLayout.SOUTH, choicesComboBox, -22, SpringLayout.NORTH, choiceBlankPanel);
		springLayout.putConstraint(SpringLayout.EAST, rotatePanel, 326, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, rotatePanel, 276, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, rotatePanel, -27, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, rotatePanel, 27, SpringLayout.WEST, getContentPane());
		getContentPane().add(rotatePanel);
		rotatePanel.setVisible(false);
		
		scalePanel = new ShearPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, choicesComboBox, -22, SpringLayout.NORTH, choiceBlankPanel);
		springLayout.putConstraint(SpringLayout.EAST, scalePanel, 326, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, scalePanel, 276, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scalePanel, -27, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scalePanel, 27, SpringLayout.WEST, getContentPane());
		getContentPane().add(scalePanel);
		scalePanel.setVisible(false);
		
		reflectPanel = new ReflectPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, choicesComboBox, -22, SpringLayout.NORTH, choiceBlankPanel);
		springLayout.putConstraint(SpringLayout.EAST, reflectPanel, 326, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, reflectPanel, 276, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, reflectPanel, -27, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, reflectPanel, 27, SpringLayout.WEST, getContentPane());
		getContentPane().add(reflectPanel);
		reflectPanel.setVisible(false);
		
		graphPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, logTextArea, -24, SpringLayout.WEST, graphPanel);
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
					choiceBlankPanel.setVisible(true);
					translatePanel.setVisible(false);
					shearPanel.setVisible(false);
					rotatePanel.setVisible(false);
					scalePanel.setVisible(false);
					reflectPanel.setVisible(false);
				}
				else if(selectedMode.equals("Translate")) {
					choiceBlankPanel.setVisible(false);
					translatePanel.setVisible(true);
					shearPanel.setVisible(false);
					rotatePanel.setVisible(false);
					scalePanel.setVisible(false);
					reflectPanel.setVisible(false);
				}
				else if(selectedMode.equals("Shear")) {
					choiceBlankPanel.setVisible(false);
					translatePanel.setVisible(false);
					shearPanel.setVisible(true);
					rotatePanel.setVisible(false);
					scalePanel.setVisible(false);
					reflectPanel.setVisible(false);
				}
				else if(selectedMode.equals("Rotate")) {
					choiceBlankPanel.setVisible(false);
					translatePanel.setVisible(false);
					shearPanel.setVisible(false);
					rotatePanel.setVisible(true);
					scalePanel.setVisible(false);
					reflectPanel.setVisible(false);
				}
				else if(selectedMode.equals("Scale")) {
					choiceBlankPanel.setVisible(false);
					translatePanel.setVisible(false);
					shearPanel.setVisible(false);
					rotatePanel.setVisible(false);
					scalePanel.setVisible(true);
					reflectPanel.setVisible(false);
				}
				else if(selectedMode.equals("Reflect")) {
					choiceBlankPanel.setVisible(false);
					translatePanel.setVisible(false);
					shearPanel.setVisible(false);
					rotatePanel.setVisible(false);
					scalePanel.setVisible(false);
					reflectPanel.setVisible(true);
				}
				
				repaint();
				revalidate();
			}
		});
	}

}
