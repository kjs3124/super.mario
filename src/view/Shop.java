package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Shop extends JPanel {

	private JPanel op;
	private MainFrame mf;

	public Shop(MainFrame mf) {

		this.mf = mf;
		this.op = this;

		this.setLayout(null);

		JLabel label = new JLabel(
				new ImageIcon(new ImageIcon("images/store background.PNG").getImage().getScaledInstance(1000, 800, 0)));
		label.setBounds(0, 0, 1000, 800);

		JButton buy1 = new JButton(
				new ImageIcon(new ImageIcon("images/buy.PNG").getImage().getScaledInstance(200, 100, 0)));
		buy1.setBounds(700, 350, 180, 80);
		buy1.setContentAreaFilled(false);
		buy1.setBorderPainted(false);
		buy1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, op, new Join(mf));
			}
		});
		
		
		JButton buy2 = new JButton(
				new ImageIcon(new ImageIcon("images/buy.PNG").getImage().getScaledInstance(200, 100, 0)));

		buy2.setBounds(700, 650, 180, 80);
		buy2.setContentAreaFilled(false);
		buy2.setBorderPainted(false);
		

		buy2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, op, new Login(mf));
			}
		});
		
		JButton home = new JButton(
				new ImageIcon(new ImageIcon("images/home.png").getImage().getScaledInstance(80, 80, 0)));
		home.setBounds(0, 0, 80, 80);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, op, new Join(mf));
			}
		});
		this.add(label);
		this.add(buy1);
		this.add(buy2);
		this.add(home);
		
		this.setComponentZOrder(label, 3);
		this.setSize(1000, 800);
		mf.add(this);
	}
}
