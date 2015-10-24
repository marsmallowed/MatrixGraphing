package view;

import javax.swing.*;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PolygonVertexPanel extends JPanel {
	private JLabel lblCoordinates;
	protected JLabel btnDelete;
	
	public PolygonVertexPanel(int x, int y) {
		setLayout(new BorderLayout(0, 0));
		setSize(160, 30);
		
		lblCoordinates = new JLabel();
		lblCoordinates.setText("(" + x + "," + y + ")");
		lblCoordinates.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblCoordinates, BorderLayout.CENTER);
		
		JButton btnDelete = new JButton("x");
		add(btnDelete, BorderLayout.EAST);
		
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

}
