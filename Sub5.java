/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author johns
 */
@SuppressWarnings("serial")
public final class Sub5 extends JPanel {
 Dimension dimension;
 Graphics graphic;
 JLabel imagelabel;
 ImageIcon icon1,icon2;
 public Sub5() {
  setLayout(new FlowLayout());
  //dimension for the layout panel
  dimension = new Dimension(120, 50);
  setPreferredSize(dimension);
  setBackground(Color.WHITE);
  
  //set the image on image label
  
  imagelabel = new JLabel();
  icon1 = new ImageIcon("images/west.jpg");
  imagelabel.setIcon(icon1);
  imagelabel.setPreferredSize(new Dimension(90, 50));
  add(imagelabel);

 }

}