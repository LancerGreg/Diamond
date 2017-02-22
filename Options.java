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

/**
 *
 * @author VNVkd
 */
public class Options extends JFrame {

    int HD = 0;
    int LD = 0;

    JButton ok;
    JLabel xd, yd;
    JTextField x, y;

    OK OK = new OK();

    public Options(String s) {
        super(s);
        setLayout(new FlowLayout());

        setVisible(true);
        setSize(275, 150);
        setLocationRelativeTo(null);

        xd = new JLabel("Height diamond  ");
        yd = new JLabel("Length diamond  ");
        x = new JTextField(10);
        y = new JTextField(10);
        ok = new JButton("OK");

        add(xd);
        add(x);
        add(yd);
        add(y);
        add(ok);

        ok.addActionListener(OK);
    }

    public class OK implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == ok) {
                    HD = Integer.parseInt(x.getText());
                    LD = Integer.parseInt(y.getText());
                    dispose();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Write number!");
            }

        }
    }
}
