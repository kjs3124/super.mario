package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class findPwPanel extends JPanel {

	private JTextField textField;
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField passwordField;
   ImageIcon icon;
   private JPanel op;
   private MainFrame mf;

   public findPwPanel(MainFrame mf) {
      
      this.mf = mf;
      this.op = this;

      this.setLayout(null);

      JLabel label = new JLabel(new ImageIcon(new ImageIcon("images/findpwbackground.png").getImage().getScaledInstance(1000, 800, 0)));
      label.setBounds(0, 0, 1000, 800);

      JLabel lblId = new JLabel();

      //���̵� �Է� ĭ 
      textField = new JTextField();
      textField.setBounds(420, 300, 260, 40);
      this.add(textField);

      //�̸� �Է� ĭ
      textField2 = new JTextField();
      textField2.setBounds(420, 420, 260, 40);
      this.add(textField2);
      
      // ��й�ȣ ǥ�� ĭ
      textField3 = new JTextField();
      textField3.setBounds(420, 500, 260, 100);
      this.add(textField3);
      
      
      
      //��й�ȣ ã�� ��
      JLabel lblFindpw = new JLabel();
      Image findpw = new ImageIcon("images/findpw2.png").getImage().getScaledInstance(300, 60, 0);
      lblFindpw.setIcon(new ImageIcon(findpw));
      lblFindpw.setBounds(380, 570, 300, 200);
      this.add(lblFindpw);

      
      this.add(label);
      this.setSize(1000, 800);
      this.setVisible(true);

   }

}