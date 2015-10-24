package view;

import javax.swing.*;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dialog.ModalExclusionType;

public class PolygonPopUp extends JFrame {
	private JTextField txtVertex;
	protected Integer numberOfVertices;
	private JLabel errorMessage;
	
	public PolygonPopUp() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setAlwaysOnTop(true);
		setTitle("Vertices");
		setSize(190, 150);
		setResizable(false);
		setType(Type.POPUP);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNoOfVertices = new JLabel("No. of Vertices:");
		getContentPane().add(lblNoOfVertices);
		
		txtVertex = new JTextField();
		getContentPane().add(txtVertex);
		txtVertex.setColumns(10);
		
		JSeparator separator = new JSeparator();
		getContentPane().add(separator);
		
		JButton btnNext = new JButton("Next");
		getContentPane().add(btnNext);
		
		JButton btnBack = new JButton("Back");
		getContentPane().add(btnBack);
		
		errorMessage = new JLabel();
		errorMessage.setForeground(Color.RED);
		errorMessage.setText("Error: Invalid input!");
		getContentPane().add(errorMessage);
		errorMessage.setVisible(false);
		
		
		/** ACTION LISTENERS HERE */
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberOfVertices = Integer.parseInt(txtVertex.getText());
				if (numberOfVertices != null && numberOfVertices > 2)
					setVisible(false);
				else {
					errorMessage.setVisible(true);
					repaint();
					revalidate();
				}
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}
