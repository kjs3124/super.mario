package view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Login extends JPanel {
	JScrollPane scrollPane;

	ImageIcon icon;
	private JTextField textField;
	private JPasswordField passwordField;
	private MainFrame mf;
	private JPanel op;

	public Login(MainFrame mf) {
		this.mf = mf;
		this.op = this;

		this.setVisible(true);
		this.setLayout(null);

		JLabel label = new JLabel(
				new ImageIcon(new ImageIcon("images/gamebackground.jpg").getImage().getScaledInstance(1000, 800, 0)));
		label.setBounds(0, 0, 1000, 800);

		JLabel lblId = new JLabel();
		Image id = new ImageIcon("images/ID2.png").getImage().getScaledInstance(320, 50, 0);
		lblId.setIcon(new ImageIcon(id));
		lblId.setBounds(320, 180, 320, 50);
		this.add(lblId);

		textField = new JTextField();
		textField.setBounds(400, 180, 220, 50);
		this.add(textField);
		textField.setColumns(10);

		JLabel lblPw = new JLabel("PW");
		Image pw = new ImageIcon("images/PW.png").getImage().getScaledInstance(320, 50, 0);
		lblPw.setIcon(new ImageIcon(pw));
		lblPw.setBounds(320, 300, 320, 50);
		this.add(lblPw);

		passwordField = new JPasswordField();
		passwordField.setBounds(400, 300, 220, 50);
		this.add(passwordField);

		JButton lblLogin = new JButton(
				new ImageIcon(new ImageIcon("images/login.PNG").getImage().getScaledInstance(170, 170, 0)));
		lblLogin.setBounds(700, 170, 200, 200);
		lblLogin.setOpaque(false);
		lblLogin.setContentAreaFilled(false);
		lblLogin.setBorderPainted(false);

		lblLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, op, new BackgroundPanel(mf));
			}
		});

		this.add(lblLogin);

		JButton lblFindId = new JButton();
		Image findId = new ImageIcon("images/findid.png").getImage().getScaledInstance(170, 80, 0);
		lblFindId.setIcon(new ImageIcon(findId));
		lblFindId.setBounds(300, 570, 170, 80);
		lblFindId.setOpaque(false);
		lblFindId.setContentAreaFilled(false);
		lblFindId.setBorderPainted(false);
		
		lblFindId.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, op, new findIdPanel(mf));
			}
		});
		this.add(lblFindId);

		JLabel lblFindPw = new JLabel();
		Image findPw = new ImageIcon("images/findpw.png").getImage().getScaledInstance(170, 80, 0);
		lblFindPw.setIcon(new ImageIcon(findPw));
		lblFindPw.setBounds(600, 570, 170, 80);
		this.add(lblFindPw);

		this.add(label);
		this.setSize(1000, 800);

	}

}