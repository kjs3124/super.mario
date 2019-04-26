package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class todayCoin extends JPanel {

   ImageIcon icon;
   private MainFrame mf;
   private JPanel op;
   
   public todayCoin(MainFrame mf) {
      this.mf = mf;
      this.op = this;
      
      this.setVisible(true);
      this.setLayout(null);

      JLabel label = new JLabel(new ImageIcon(new ImageIcon("images/bakground.png").getImage().getScaledInstance(1250, 800, 0)));
      label.setBounds(0, 0, 1250, 800);
      
      JLabel lblUser = new JLabel("0000´Ô");
      lblUser.setBounds(10, 0, 250, 200);
      this.add(lblUser);
      lblUser.setForeground(Color.WHITE);
      lblUser.setFont(lblUser.getFont().deriveFont(30.0f));


      
      JLabel lblStart = new JLabel();
      Image start = new ImageIcon("images/start.png").getImage().getScaledInstance(150, 60, 0);
      lblStart.setIcon(new ImageIcon(start));
      lblStart.setBounds(300, 570, 250, 200);
      this.add(lblStart);

      JLabel lblStore = new JLabel();
      Image store = new ImageIcon("images/store.png").getImage().getScaledInstance(150, 60, 0);
      lblStore.setIcon(new ImageIcon(store));
      lblStore.setBounds(600, 570, 450, 200);
      this.add(lblStore);
      
      JButton lblRank = new JButton();
      Image rank = new ImageIcon("images/rk.png").getImage().getScaledInstance(100, 80, 0);
      lblRank.setIcon(new ImageIcon(rank));
      lblRank.setBounds(800, 100, 100, 80);
      lblRank.setOpaque(false);
      lblRank.setContentAreaFilled(false);
      lblRank.setBorderPainted(false);
      this.add(lblRank);


      /*JLabel lb = new JLabel("ÄÚÀÎ °³¼ö : ");
      lb.setLocation(50, 100);
      lb.setSize(150, 50);
      this.add(lb);*/
      this.add(label);
      this.setSize(1000, 800);
   }

}