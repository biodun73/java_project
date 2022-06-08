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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author johns
 */
@SuppressWarnings("serial")
public class Sub3 extends JPanel {
 private final Dimension dimension;
 JTextField field1;
 JTextField field2;
 JTextField field3;
 JTextField field4;
 JTextField field5;
 //private final JTextField field6;
 JLabel label1;
 JLabel label2;
 JLabel label3;
 JButton button1;
 JButton button2;
 public Sub3() {
  setLayout(new FlowLayout());
  dimension = new Dimension(180, 110);
  setPreferredSize(dimension);
  //set textfield
  /////////////////////////
  field1 = new JTextField(2);
  field1.setHorizontalAlignment(JTextField.CENTER);
  field1.setText("00");
  add(field1);
  //set up button
  button1 = new JButton("<L");
  button1.setPreferredSize(new Dimension(50, 20));
  button1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true));
  add(button1);
  //set up button
  //////////////////////////
  button2 = new JButton("R>");
  button2.setPreferredSize(new Dimension(50, 20));
  button2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true));
  add(button2);
  //set up textfield
  /////////////////////////
  field2 = new JTextField(2);
  field2.setHorizontalAlignment(JTextField.CENTER);
  field2.setText("00");
  add(field2);
  //set up label/
  /////////////////////////
  label1 = new JLabel("Option");
  label1.setPreferredSize(new Dimension(70, 20));
  add(label1);
  //set up textfield
  ////////////////////////
  field3 = new JTextField(6);
  field3.setHorizontalAlignment(JTextField.CENTER);
  field3.setText("2 Player");
  add(field3);
  //set up label
  /////////////////////////
  label2 = new JLabel("Square");
  label2.setPreferredSize(new Dimension(70, 20));
  add(label2);
  //set up textfield
  ////////////////////////
  field4 = new JTextField(6);
  field4.setHorizontalAlignment(JTextField.CENTER);
  field4.setText("101");
  add(field4);
  //set up label
  /////////////////////////
  label3 = new JLabel("Direction");
  label3.setPreferredSize(new Dimension(70, 20));
  add(label3);
  //set up textfield
  ////////////////////////
  field5 = new JTextField(6);
  field5.setHorizontalAlignment(JTextField.CENTER);
  field5.setText("SE");
  add(field5);



 }
}