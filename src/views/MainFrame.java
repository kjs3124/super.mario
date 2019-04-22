package views;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame(){
		this.setTitle("super.Mario");
		this.setBounds(200, 100, 1000, 800);
	
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/icon.png"));
		
		new BackgroundPanel(this);
		
	
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
