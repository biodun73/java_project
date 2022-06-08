package mainframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author johns
 */
@SuppressWarnings("serial")
public class Sub6 extends JPanel {
 Dimension dimension;
 JButton button1;
 JButton button2;
 JButton button3;
 JButton button4;
 Sub6() {
  setLayout(new FlowLayout());
  //dimension for the layout panel
  dimension = new Dimension(180, 75);
  setPreferredSize(dimension);
  setBackground(Color.WHITE);
  
  //create button 1 and add it to the panel
  
  button1 = new JButton("2 Player");
  button1.setPreferredSize(new Dimension(82, 30));
  button1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3, true));
  add(button1);
  
  //create button 2 and add it to the panel
  
  button2 = new JButton("4 Player");
  button2.setPreferredSize(new Dimension(82, 30));
  button2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3, true));
  add(button2);
  
  //create button 3 and add it to the panel
  
  button3 = new JButton("Multi");
  button3.setPreferredSize(new Dimension(82, 30));
  button3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3, true));
  add(button3);
  
  //create button 4 and add it to the panel
  
  button4 = new JButton("Exit");
  button4.setPreferredSize(new Dimension(82, 30));
  button4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3, true));
  add(button4);
 }
}