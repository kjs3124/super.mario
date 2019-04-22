package views;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class findIdPanel extends JPanel {
	JScrollPane scrollPane;

	ImageIcon icon;
	private JTextField textField;
	private JPasswordField passwordField;
	private MainFrame mf;
	private JPanel op;

	public findIdPanel(MainFrame mf) {
		this.mf = mf;
		this.op = this;
		JLabel label = new JLabel(
				new ImageIcon(new ImageIcon("images/findid background.png").getImage().getScaledInstance(1000, 800, 0)));
		label.setBounds(0, 0, 1000, 800);
		
		JLabel lblId = new JLabel();
		lblId.setBounds(100, 480, 200, 40);
		this.add(lblId);

		textField = new JTextField();
		textField.setBounds(415, 300, 260, 40);
		this.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(415, 450, 260, 40);
		this.add(passwordField);


		JButton lblFindId = new JButton();
		Image findId = new ImageIcon("images/findid2.png").getImage().getScaledInstance(300, 100, 0);
		lblFindId.setIcon(new ImageIcon(findId));
		lblFindId.setBounds(400, 570, 300, 200);
		lblFindId.setContentAreaFilled(false);
		lblFindId.setBorderPainted(false);
		
		lblFindId.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, op, new BackgroundPanel(mf));
			}
		});
		
		this.add(lblFindId);
		this.add(label);
		this.setSize(1000, 800);

	}

}
