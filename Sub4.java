/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author johns
 */
@SuppressWarnings("serial")
public class Sub4 extends JPanel {
 private final Dimension dimension;
 Border innerBorder;
 JButton button1;
 JButton button2;
 JButton button3;
 JButton button4;
 JButton button5;
 JButton button6;
 JButton button7;
 JButton button8;
 JButton button9;
 ImageIcon icon1, icon2, icon3, icon4, icon5;
 public Sub4() {
  setLayout(new FlowLayout());
  dimension = new Dimension(180, 90);
  //create inner border for panel
  innerBorder = BorderFactory.createLoweredBevelBorder();
  setPreferredSize(dimension);
  //set up button
  ///////////////////////
  button1 = new JButton();
  button1.setPreferredSize(new Dimension(50, 25));
  button1.setBorder(innerBorder);
  button1.setBackground(Color.LIGHT_GRAY);
  add(button1);
  //set up button
  ////////////////////////
  icon1 = new ImageIcon("images/up.png");
  button2 = new JButton(icon1);
  button2.setText("");
  button2.setPreferredSize(new Dimension(50, 20));
  button2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true));
  add(button2);
  //set up button
  ////////////////////////
  button3 = new JButton();
  button3.setPreferredSize(new Dimension(50, 25));
  button3.setBorder(innerBorder);
  button3.setBackground(Color.LIGHT_GRAY);
  add(button3);
  //set up button
  ////////////////////////
  icon2 = new ImageIcon("images/left.png");
  button4 = new JButton(icon2);
  button4.setText("");
  button4.setPreferredSize(new Dimension(50, 20));
  button4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true));
  add(button4);
  //set up button
  ///////////////////////
  icon3 = new ImageIcon("images/ball.png");
  button5 = new JButton(icon3);
  button5.setText("");
  button5.setPreferredSize(new Dimension(50, 20));
  button5.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true));
  add(button5);
  //set up button
  ///////////////////////
  icon4 = new ImageIcon("images/right.png");
  button6 = new JButton(icon4);
  button6.setText("");
  button6.setPreferredSize(new Dimension(50, 20));
  button6.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true));
  add(button6);
  //set up button
  button7 = new JButton();
  button7.setPreferredSize(new Dimension(50, 25));
  button7.setBackground(Color.LIGHT_GRAY);
  button7.setBorder(innerBorder);
  add(button7);
  //set up button
  ////////////////////////
  icon5 = new ImageIcon("images/down.png");
  button8 = new JButton(icon5);
  button8.setText("");
  button8.setPreferredSize(new Dimension(50, 20));
  button8.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true));
  add(button8);
  //set up button
  button9 = new JButton();
  button9.setPreferredSize(new Dimension(50, 25));
  button9.setBackground(Color.LIGHT_GRAY);
  button9.setBorder(innerBorder);
  add(button9);

 }

}
