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
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Sub1 extends JPanel {
 private final JLabel label1;
 private final Dimension dimension;
 public Sub1() {
  setLayout(new FlowLayout());
  dimension = new Dimension(180, 25);
  setPreferredSize(dimension);
  setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 0));
  //set up label for digital timer//
  label1 = new JLabel("DIGITAL TIMER");
  add(label1);
 }

}