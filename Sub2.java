package mainframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author johns
 */
@SuppressWarnings("serial")
public class Sub2 extends JPanel {
 private final Dimension dimension;
 JTextField field1;
 JTextField field2;
 JTextField field3;
 JLabel label1;
 JLabel label2;
 JLabel label3;

 //private final JTextField field4;
 public Sub2() {
  setLayout(new FlowLayout());
  dimension = new Dimension(180, 50);
  setPreferredSize(dimension);
  setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 0));
  //set field1 
  /////////////////////////
  field1 = new JTextField(4);
  field1.setHorizontalAlignment(JTextField.CENTER);
  field1.setText("00");
  add(field1);
  //set label1 
  /////////////////////////
  label1 = new JLabel(":");
  add(label1);
  //set field2
  ////////////////////////
  field2 = new JTextField(4);
  field2.setHorizontalAlignment(JTextField.CENTER);
  field2.setText("00");
  add(field2);
  //set label2 
  /////////////////////////
  label2 = new JLabel(":");
  add(label2);
  //set field3
  ////////////////////////
  field3 = new JTextField(4);
  field3.setHorizontalAlignment(JTextField.CENTER);
  field3.setText("00");
  add(field3);
  //set label3
  ////////////////////////
  label3 = new JLabel("SCORE");
  add(label3);
 }
}
