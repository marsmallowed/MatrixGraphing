package view;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.util.Vector;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Frame extends JFrame {
	/** Center Panels */
	private JPanel blankPanel;
	private JPanel ellipsePanel;
	private JPanel hyperbolaPanel;
	private JPanel parabolaPanel;
	private JPanel pointPanel;
	private JPanel polygonPanel;
	private JFrame polygonPopUp;
	private JPanel vectorPanel;
	private JPanel lineSegmentPanel;
	
	private JComboBox modeComboBox;
	private JTextField txtX;
	private JTextField txtY;
	public Frame() {
		setResizable(false);
		setTitle("ADVDISC MP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 360);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel headerPanel = new JPanel();
		getContentPane().add(headerPanel, BorderLayout.NORTH);
		headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblSelectMode = new JLabel("Select mode:");
		lblSelectMode.setHorizontalAlignment(SwingConstants.LEFT);
		headerPanel.add(lblSelectMode);
		
		Vector<String> modes = new Vector<String>();
		modes.add("-Select-");
		modes.add("Ellipse");
		modes.add("Hyperbola");
		modes.add("Parabola");
		modes.add("Point");
		modes.add("Polygon");
		modes.add("Vector");
		modes.add("Line Segment");
		modeComboBox = new JComboBox<String>(modes);
		headerPanel.add(modeComboBox);
		
		blankPanel = new JPanel();
		getContentPane().add(blankPanel, BorderLayout.CENTER);
		
		ellipsePanel = new EllipsePanel();
		getContentPane().add(ellipsePanel, BorderLayout.CENTER);
		ellipsePanel.setVisible(false);
		
		hyperbolaPanel = new HyperbolaPanel();
		getContentPane().add(hyperbolaPanel, BorderLayout.CENTER);
		hyperbolaPanel.setVisible(false);
		
		parabolaPanel = new ParabolaPanel();
		getContentPane().add(parabolaPanel, BorderLayout.CENTER);
		parabolaPanel.setVisible(false);
		
		pointPanel = new PointPanel();
		getContentPane().add(pointPanel, BorderLayout.CENTER);
		pointPanel.setVisible(false);
		
		vectorPanel = new VectorPanel();
		getContentPane().add(vectorPanel, BorderLayout.CENTER);
		vectorPanel.setVisible(false);
		
		polygonPopUp = new PolygonPopUp();
		polygonPopUp.setVisible(false);
//		polygonPanel = new PolygonPanel();
//		getContentPane().add(polygonPanel, BorderLayout.CENTER);
//		polygonPanel.setVisible(false);
		
		lineSegmentPanel = new LineSegmentPanel();
		getContentPane().add(lineSegmentPanel, BorderLayout.CENTER);
		lineSegmentPanel.setVisible(false);
		
		vectorPanel = new VectorPanel();
		getContentPane().add(vectorPanel, BorderLayout.CENTER);
		vectorPanel.setVisible(false);
		
		
		
		/** NIMBUS LOOK AND FEEL SHITS */
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		/** ACTION LISTENERS HERE */
		modeComboBox.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				String selectedMode = (String)modeComboBox.getSelectedItem(); 
				
				if(selectedMode.equals("-Select-")) {
					getContentPane().add(blankPanel, BorderLayout.CENTER);
					getContentPane().remove(ellipsePanel);
					getContentPane().remove(hyperbolaPanel);
					getContentPane().remove(parabolaPanel);
					getContentPane().remove(pointPanel);
					getContentPane().remove(vectorPanel);
					getContentPane().remove(lineSegmentPanel);
					blankPanel.setVisible(true);
				}
				else if(selectedMode.equals("Ellipse")) {
					getContentPane().add(ellipsePanel, BorderLayout.CENTER);
					getContentPane().remove(blankPanel);
					getContentPane().remove(hyperbolaPanel);
					getContentPane().remove(parabolaPanel);
					getContentPane().remove(pointPanel);
					getContentPane().remove(vectorPanel);
					getContentPane().remove(lineSegmentPanel);
					ellipsePanel.setVisible(true);
				}
				else if(selectedMode.equals("Hyperbola")) {
					getContentPane().add(hyperbolaPanel, BorderLayout.CENTER);
					getContentPane().remove(blankPanel);
					getContentPane().remove(ellipsePanel);
					getContentPane().remove(parabolaPanel);
					getContentPane().remove(pointPanel);
					getContentPane().remove(vectorPanel);
					getContentPane().remove(lineSegmentPanel);
					hyperbolaPanel.setVisible(true);
				}
				else if(selectedMode.equals("Parabola")) {
					getContentPane().add(parabolaPanel, BorderLayout.CENTER);
					getContentPane().remove(blankPanel);
					getContentPane().remove(ellipsePanel);
					getContentPane().remove(hyperbolaPanel);
					getContentPane().remove(pointPanel);
					getContentPane().remove(vectorPanel);
					getContentPane().remove(lineSegmentPanel);
					parabolaPanel.setVisible(true);
				}
				else if(selectedMode.equals("Point")) {
					getContentPane().add(pointPanel, BorderLayout.CENTER);
					getContentPane().remove(blankPanel);
					getContentPane().remove(ellipsePanel);
					getContentPane().remove(hyperbolaPanel);
					getContentPane().remove(parabolaPanel);
					getContentPane().remove(vectorPanel);
					getContentPane().remove(lineSegmentPanel);
					pointPanel.setVisible(true);
				}
				else if (selectedMode.equals("Polygon")) {
					Integer vertexNum = 0;
					
					do {
						vertexNum = Integer.parseInt(JOptionPane.showInputDialog(polygonPopUp, "Enter number of vertices (at least 3):"));
						
						if (vertexNum > 2) {
							polygonPanel = new PolygonPanel(vertexNum);
							getContentPane().add(polygonPanel, BorderLayout.CENTER);
							getContentPane().remove(blankPanel);
							getContentPane().remove(ellipsePanel);
							getContentPane().remove(hyperbolaPanel);
							getContentPane().remove(parabolaPanel);
							getContentPane().remove(pointPanel);
							getContentPane().remove(vectorPanel);
							getContentPane().remove(lineSegmentPanel);
							polygonPanel.setVisible(true);
						}
					} while (vertexNum < 3);
				}
				else if(selectedMode.equals("Line Segment")) {
					getContentPane().add(lineSegmentPanel, BorderLayout.CENTER);
					getContentPane().remove(blankPanel);
					getContentPane().remove(ellipsePanel);
					getContentPane().remove(hyperbolaPanel);
					getContentPane().remove(parabolaPanel);
					getContentPane().remove(pointPanel);
					getContentPane().remove(vectorPanel);
					lineSegmentPanel.setVisible(true);
				}
				else if(selectedMode.equals("Vector")) {
					getContentPane().add(vectorPanel, BorderLayout.CENTER);
					getContentPane().remove(blankPanel);
					getContentPane().remove(ellipsePanel);
					getContentPane().remove(hyperbolaPanel);
					getContentPane().remove(parabolaPanel);
					getContentPane().remove(pointPanel);
					getContentPane().remove(lineSegmentPanel);
					vectorPanel.setVisible(true);
				}
				
				repaint();
				revalidate();
			}
		});

	}
}
