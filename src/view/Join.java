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

public class Join extends JPanel {
	JScrollPane scrollPane;
	ImageIcon icon;
	private MainFrame mf;
	private JTextField nameField;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField hpField;
	private JPanel op;

	public Join(MainFrame mf) {
		this.mf = mf;
		this.op = this;
		this.setVisible(true);
		this.setLayout(null);

		JLabel label = new JLabel(
				new ImageIcon(new ImageIcon("images/gamebackground.jpg").getImage().getScaledInstance(1000, 800, 0)));
		label.setBounds(0, 0, 1000, 800);

		JLabel lblName = new JLabel();
		Image name = new ImageIcon("images/NAME.png").getImage().getScaledInstance(200, 50, 0);
		lblName.setIcon(new ImageIcon(name));
		lblName.setBounds(100, 90, 320, 50);
		this.add(lblName);

		nameField = new JTextField();
		nameField.setBounds(380, 90, 320, 40);
		this.add(nameField);
		nameField.setColumns(10);

		JLabel lblId = new JLabel();
		Image id = new ImageIcon("images/ID.png").getImage().getScaledInstance(200, 50, 0);
		lblId.setIcon(new ImageIcon(id));
		lblId.setBounds(100, 180, 320, 50);
		this.add(lblId);

		textField = new JTextField();
		textField.setBounds(380, 180, 320, 40);
		this.add(textField);
		textField.setColumns(10);

		JLabel lblPw = new JLabel();
		Image pw = new ImageIcon("images/PASSWORD.png").getImage().getScaledInstance(200, 50, 0);
		lblPw.setIcon(new ImageIcon(pw));
		lblPw.setBounds(100, 280, 320, 50);
		this.add(lblPw);

		passwordField = new JPasswordField();
		passwordField.setBounds(380, 280, 320, 40);
		this.add(passwordField);

		JLabel lblHp = new JLabel();
		Image hp = new ImageIcon("images/H.P.png").getImage().getScaledInstance(200, 50, 0);
		lblHp.setIcon(new ImageIcon(hp));
		lblHp.setBounds(100, 380, 320, 50);
		this.add(lblHp);

		hpField = new JPasswordField();
		hpField.setBounds(380, 380, 320, 40);
		this.add(hpField);

		JButton lblJoin = new JButton();
		Image login = new ImageIcon("images/joinus.png").getImage().getScaledInstance(300, 60, 0);
		lblJoin.setIcon(new ImageIcon(login));
		lblJoin.setBounds(260, 450, 300, 200);

		lblJoin.setContentAreaFilled(false);
		lblJoin.setBorderPainted(false);

		lblJoin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, op, new BackgroundPanel(mf));
			}
		});

		this.add(lblJoin);

		this.add(label);
		this.setSize(1000, 800);
	}
//0421
}