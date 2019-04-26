package view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.EventHandler;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
		// textField.addActionListener(new EventHandler());

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

		hpField = new JTextField();
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
				String name = nameField.getText();
				String id = textField.getText();
				char[] pw = passwordField.getPassword();
				String hpN = hpField.getText();
				String pws = new String(pw, 0, pw.length);
				
				try(DataInputStream din = new DataInputStream(new FileInputStream(id));
						DataOutputStream dout = new DataOutputStream(new FileOutputStream(id));) {
					dout.writeUTF(name);
					dout.writeUTF(pws);
					dout.writeUTF(hpN);
					
					while(true) {
						System.out.println("이름 : " + din.readUTF());
						System.out.println("비밀번호 : " + din.readUTF());
						System.out.println("휴대폰번호 : " + din.readUTF());
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println("                        						  회원정보");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
					
				System.out.println("이름 : " + name + " ID : " + id + " PW : " + pws + " H.P : " + hpN);
				if (name.equals("")) {
					nameField.requestFocus();
				} else if (id.equals("")) {
					textField.requestFocus();
				} else if(pw.equals("")){
					passwordField.requestFocus();
				} else if(hpN.equals("")) {
					hpField.requestFocus();
				}	else {
						ChangePanel.changePanel(mf, op, new BackgroundPanel(mf));
				}
			}
		});

		this.add(lblJoin);

		this.add(label);
		this.setSize(1000, 800);
	}
	// 0421
	// class EventHandler implements ActionListener{
	//
	// @Override
	// public void actionPerformed(ActionEvent e) {
	// // TODO Auto-generated method stub
	// String id = textField.getText();
	// System.out.println(id);
	// textField.setText("");
	// }
	// }
}