package mainframe;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author johns
 */
@SuppressWarnings("serial")
public final class SidePanel extends JPanel {
 Sub1 sub1 = new Sub1();
 Sub2 sub2 = new Sub2();
 Sub3 sub3 = new Sub3();
 Sub4 sub4 = new Sub4();
 Sub5 sub5 = new Sub5();
 Sub6 sub6 = new Sub6();
 Dimension dimension;
 Border innerBorder;
 Border outerBorder;
 public SidePanel() {
  setLayout(new FlowLayout());
  //create inner border for panel
  innerBorder = BorderFactory.createLoweredBevelBorder();
  //create outer border for panel
  outerBorder = BorderFactory.createRaisedBevelBorder();
  //dimension for the layout panel
  dimension = new Dimension(190, 450);
  setPreferredSize(dimension);
  setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));
  add(sub1);
  add(sub2);
  add(sub3);
  add(sub4);
  add(sub5);
  add(sub6);

 }

}