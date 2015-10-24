package view;

import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {
	public MainFrame() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel headerPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) headerPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(headerPanel, BorderLayout.NORTH);
		
		JLabel lblSelectAMatrix = new JLabel("Select a matrix to plot:");
		lblSelectAMatrix.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelectAMatrix.setFont(new Font("Arial", Font.PLAIN, 16));
		headerPanel.add(lblSelectAMatrix);
		
		JPanel centerPanel = new JPanel();
		getContentPane().add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnPoint = new JButton("Point");
		centerPanel.add(btnPoint);
		
		JButton btnParabola = new JButton("Parabola");
		centerPanel.add(btnParabola);
		
		JButton btnHyperbola = new JButton("Hyperbola");
		centerPanel.add(btnHyperbola);
		
		JButton btnEllipse = new JButton("Ellipse");
		centerPanel.add(btnEllipse);
		
		JButton btnPolygon = new JButton("Polygon");
		centerPanel.add(btnPolygon);
		
		JButton btnVector = new JButton("Vector");
		centerPanel.add(btnVector);
		
		JButton btnSpace = new JButton("");
		btnSpace.setEnabled(false);
		centerPanel.add(btnSpace);
		
		JButton btnLineSegment = new JButton("Line Segment");
		centerPanel.add(btnLineSegment);
		
		JButton btnSpace2 = new JButton("");
		btnSpace2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpace2.setEnabled(false);
		centerPanel.add(btnSpace2);
		
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
	}
	
}
