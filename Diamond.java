/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompgraflaba1;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import sun.java2d.loops.DrawRect;
import java.awt.Graphics;
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author VRV
 */
public class Diamond extends JFrame {

    JButton options;
    JButton diam;
    JButton exit;

    Option opt = new Option();
    Options opts = new Options("");

    DrowDiamond dd = new DrowDiamond();
    EXIT ex = new EXIT();

    public Diamond(String s) {
        super(s);
        setSize(getMaximumSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        options = new JButton("Options");
        add(options);

        diam = new JButton("Drow Diamond");
        add(diam);

        exit = new JButton("EXIT");
        add(exit);

        options.addActionListener(opt);
        diam.addActionListener(dd);
        exit.addActionListener(ex);
    }

    public class Option implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == options) {
                Options opt = new Options("Options for Diamond");

                opt.setVisible(true);
                opt.setSize(275, 150);
                opt.setLocationRelativeTo(null);
            }
        }

    }

    public class DrowDiamond implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == diam) {
                JFrame Diamond = new JFrame();
                Diamond = new JFrame("Diamond");
                Diamond.setSize(0 + opts.HD, 0 + opts.LD);
                Diamond.setVisible(true);
                Diamond.setLocationRelativeTo(null);
            }
        }

    }

    public class EXIT implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == exit) {
                System.exit(0);
            }
        }

    }

    //  public void paint(Graphics g) {
//        Options opt = new Options("");
//        int HD = opt.HD;
//        int LD = opt.LD;
//        g.setColor(Color.LIGHT_GRAY);
//        g.drawLine(100, 100, 100, 200);
//        g.drawLine(50, 150, 150, 150);
//        g.drawLine(150, 100, 100, 200);
//        g.setColor(Color.DARK_GRAY);
//        g.drawOval(119, 139, 61, 61);
//        g.setColor(Color.red);
//        g.drawPolygon(new int[]{100 * 2, 150 * 2, 200 * 2}, new int[]{(-100) + 200 * 2, (-100) + 100 * 2, (-100) + 200 * 2}, 3);
//        g.setColor(Color.orange);
//        g.fillOval(119 * 2, (-101) + 139 * 2, 62 * 2, 62 * 2);
//
//        g.setColor(Color.red);
//        g.fillOval(119 * 2, 160 + 139 * 2, 62 * 2, 62 * 2);
//        g.setColor(Color.black);
//        for (int i = 0; i < 12; i++) { //rotation
//            g.drawPolygon(new int[]{100 * 2 - 2 * i, 150 * 2 + 10 * i, 200 * 2 - 8 * i}, new int[]{160 + 200 * 2 - 11 * i, 160 + 100 * 2 + 5 * i, 160 + 200 * 2 + 8 * i}, 3);
//        }
//
//        for (int i = 0; i < 5; i++) { //pattern
//            g.drawPolygon(new int[]{500 + 100 * i, 550 + 100 * i, 600 + 100 * i}, new int[]{500, 400, 500}, 3);
//            g.fillOval(519 + 100 * i, 439, 62, 62);
//            g.drawPolygon(new int[]{500 + 100 * i, 550 + 100 * i, 600 + 100 * i}, new int[]{500, 600, 500}, 3);
//            g.fillOval(519 + 100 * i, 501, 62, 62);
//        }
//    }
}
