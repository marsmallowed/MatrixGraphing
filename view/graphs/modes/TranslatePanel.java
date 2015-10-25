package view.graphs.modes;

import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TranslatePanel extends JPanel {
	private JTextField txtXTrans;
	private JTextField txtYTrans;
	
	public TranslatePanel() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblXTranslation = new JLabel("X-Translation:");
		add(lblXTranslation);
		
		txtXTrans = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblXTranslation, 0, SpringLayout.NORTH, txtXTrans);
		springLayout.putConstraint(SpringLayout.EAST, lblXTranslation, -27, SpringLayout.WEST, txtXTrans);
		springLayout.putConstraint(SpringLayout.NORTH, txtXTrans, 90, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtXTrans, 148, SpringLayout.WEST, this);
		add(txtXTrans);
		txtXTrans.setColumns(10);
		
		JLabel lblYTranslation = new JLabel("Y-Translation:");
		springLayout.putConstraint(SpringLayout.WEST, lblYTranslation, 0, SpringLayout.WEST, lblXTranslation);
		add(lblYTranslation);
		
		txtYTrans = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblYTranslation, 0, SpringLayout.NORTH, txtYTrans);
		springLayout.putConstraint(SpringLayout.NORTH, txtYTrans, 30, SpringLayout.SOUTH, txtXTrans);
		springLayout.putConstraint(SpringLayout.EAST, txtYTrans, 0, SpringLayout.EAST, txtXTrans);
		add(txtYTrans);
		txtYTrans.setColumns(10);
		
		JButton btnTranslate = new JButton("Translate");
		springLayout.putConstraint(SpringLayout.NORTH, btnTranslate, 38, SpringLayout.SOUTH, txtYTrans);
		springLayout.putConstraint(SpringLayout.WEST, btnTranslate, 3, SpringLayout.WEST, txtXTrans);
		springLayout.putConstraint(SpringLayout.EAST, btnTranslate, 0, SpringLayout.EAST, txtXTrans);
		add(btnTranslate);
		
		/** ACTION LISTENERS HERE */
		btnTranslate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double[] coordinates = new Double[2];
				coordinates[0] = Double.parseDouble(txtXTrans.getText());
				coordinates[1] = Double.parseDouble(txtYTrans.getText());
			}
		});
	}
}
