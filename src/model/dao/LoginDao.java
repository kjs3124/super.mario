package model.dao;

import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginDao extends JFrame{//�α���ȭ��
	private Image img = null;
	
	public LoginDao()
	{
		
		join.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ȸ������â���� �̵�
				JoinDao f2= new JoinDao();
			}
		});;
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {//�α��� �Ҷ� 
				
				try{
					String s = null;
					
					boolean result = true;
					BufferedReader br = new BufferedReader(new FileReader("ȸ�����.txt"));
					
					
					

					while((s=br.readLine()) != null){
						
						String [] array=s.split("/");

						if(tf1.getText().equals(array[1])) {

							if(tf2.getText().equals(array[2]))
							{
								result = false;
								JOptionPane.showMessageDialog(null, "�α����� �Ǿ����ϴ�!!");
								
							}
						}
					}
					if(result) {
						JOptionPane.showMessageDialog(null, "�α��� ����");
						return;
					}
						
					

		               
					
					
					
					
					
				}catch (IOException E10){
					E10.printStackTrace();
				}
			}
		});
	}
}

