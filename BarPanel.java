/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author johns
 */
@SuppressWarnings("serial")
public class BarPanel extends JPanel {
    private final Dimension dimension;
    private final Border innerBorder;
    private final Border outerBorder;
    private final JMenuBar menubar;
    private final JMenu menu1;
    private final JMenu menu2;
    private final JMenu menu3;
    private final JMenu menu4;
    public BarPanel() {
        setLayout(new BorderLayout());
        //create inner border for panel
        innerBorder = BorderFactory.createLoweredBevelBorder();
        //create outer border for panel
        outerBorder = BorderFactory.createRaisedBevelBorder();
        //dimension for the layout panel
        dimension = new Dimension(825, 30);
        setPreferredSize(dimension);
        setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));
        menubar = new JMenuBar();
        add(menubar, BorderLayout.WEST);
        menu1 = new JMenu("Scenario");
        menubar.add(menu1);
        menu2 = new JMenu("Edit");
        menubar.add(menu2);
        menu3 = new JMenu("Controls");
        menubar.add(menu3);
        menu4 = new JMenu("Help");
        menubar.add(menu4);
    }
}
