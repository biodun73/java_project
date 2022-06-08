package mainframe;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;

/**
 *
 * @author johns
 */
@SuppressWarnings("serial")
public final class SouthPanel extends JPanel {
 private final Dimension dimension;
 private final Border innerBorder;
 private final Border outerBorder;
 JButton button1;
 JButton button2;
 JButton button3;
 JLabel label;
 JSlider slider;
 ImageIcon icon1, icon2, icon3;

 GridBagConstraints constraint = new GridBagConstraints();
 public SouthPanel() {
  setLayout(new GridBagLayout());
  //create inner border for panel
  innerBorder = BorderFactory.createLoweredBevelBorder();
  //create outer border for panel
  outerBorder = BorderFactory.createRaisedBevelBorder();
  //dimension for the layout panel
  dimension = new Dimension(825, 55);
  setPreferredSize(dimension);
  
  setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));
  constraint.fill = GridBagConstraints.HORIZONTAL;
  constraint.weightx = 0.0;

  //icon image for act button
  icon1 = new ImageIcon("images/act_1.png");
  button1 = new JButton("Act",icon1);

  //icon image for run button
  icon2 = new ImageIcon("images/play.png");
  button2 = new JButton("Run", icon2);

  //icon image for reset button
  icon3 = new ImageIcon("images/reset.png");
  button3 = new JButton("Reset", icon3);

  label = new JLabel("Speed :");
  slider = new JSlider(0, 200, 0);
  slider.setPaintTrack(true);
  slider.setPaintTicks(true);
  slider.setPaintLabels(true);
  slider.setMajorTickSpacing(50);
  slider.setMinorTickSpacing(5);
  slider.setSnapToTicks(true);


  setButton1();
  setButton2();
  setButton3();
  setLabel();
  setSlider();

 }
 public void setButton1() {
  constraint.insets = new Insets(0, 100, 0, 10);
  constraint.gridx = 0;
  constraint.gridy = 1;
  add(button1, constraint);
 }
 public void setButton2() {
  constraint.insets = new Insets(0, 0, 0, 10);
  constraint.gridx = 1;
  constraint.gridy = 1;
  add(button2, constraint);
 }
 public void setButton3() {
  constraint.insets = new Insets(0, 0, 0, 80);
  constraint.gridx = 2;
  constraint.gridy = 1;
  add(button3, constraint);
 }
 public void setLabel() {
  constraint.insets = new Insets(0, 80, 0, 0);
  constraint.gridx = 3;
  constraint.gridy = 1;
  add(label, constraint);
 }
 public void setSlider() {
  constraint.insets = new Insets(0, 0, 0, 5);
  constraint.gridx = 5;
  constraint.gridy = 1;
  add(slider, constraint);
 }

}