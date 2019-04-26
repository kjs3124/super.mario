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

public class findpwPanel extends JPanel {

   ImageIcon icon;
   private JTextField textField;
   private JTextField textField2;
   private JPasswordField passwordField;

   public findpwPanel(MainFrame mf) {

      JPanel back = new JPanel() {
         public void paintComponent(Graphics g) {
            Image img = new ImageIcon("images/findpwbackground.png").getImage().getScaledInstance(1000, 800, 0);
            g.drawImage(new ImageIcon(img).getImage(), 0, 0, null);

            setOpaque(false);
            super.paintComponent(g);
         }
      };

      //setContentPane(back);
      back.setLayout(null);

      //아이디 입력 칸 
      textField = new JTextField();
      textField.setBounds(420, 300, 260, 40);
      back.add(textField);
      textField.setColumns(10);

      //이름 입력 칸
      textField2 = new JTextField();
      textField2.setBounds(420, 420, 260, 40);
      back.add(textField2);
      textField2.setColumns(10);
      

      //비밀번호 찾기 라벨
      JLabel lblFindpw = new JLabel();
      Image findpw = new ImageIcon("images/findpw2.png").getImage().getScaledInstance(300, 60, 0);
      lblFindpw.setIcon(new ImageIcon(findpw));
      lblFindpw.setBounds(380, 570, 300, 200);
      back.add(lblFindpw);

   }

   public static void main(String[] args) {
      findpwPanel frame = new findpwPanel();
      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1000, 800);
      frame.setVisible(true);
   }
}