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

/**
 *
 * @author VRV
 */
public class Diamond extends JFrame {


    GridBagConstraints gbc = new GridBagConstraints();
    //ImageIcon imageLabel;// = new JLabel(new ImageIcon("F:\\Roman\\Proga\\Progect\\New Java Project.jpg"));

    JLabel label0;
    JPanel panel0;

    JLabel label;
    JPanel panel;

    JLabel label1;
    JPanel panel1;

    JLabel label2;
    JPanel panel2;

    JLabel label3;
    JPanel panel3;

    public Diamond(String s) throws InterruptedException {
        super(s);
        setLayout(new GridBagLayout());

        //imageLabel = new ImageIcon(getClass().getResource("F:\\Roman\\Proga\\Progect\\New Java Project\\img.jpg"));
//        label0 = new JLabel();
//        panel0 = new JPanel();
//        label0.setIcon(new ImageIcon("F:\\Roman\\Proga\\Progect\\New Java Project\\fon.jpg"));
//
//        gbc.fill = java.awt.GridBagConstraints.BOTH;
//        panel0.add(label0, gbc);
//        add(panel0, gbc);
//        validate();
        label = new JLabel();
        panel = new JPanel();
        label.setIcon(new ImageIcon("F:\\Roman\\Proga\\Progect\\New Java Project\\img.jpg"));

        gbc.gridx = 100;
        gbc.gridy = 0;
        panel.add(label, gbc);
        add(panel, gbc);
        validate();

        label1 = new JLabel();
        panel1 = new JPanel();
        label1.setIcon(new ImageIcon("F:\\Roman\\Proga\\Progect\\New Java Project\\img.jpg"));

        gbc.gridx = 0;
        gbc.gridy = 100;
        panel1.add(label1, gbc);
        add(panel1, gbc);
        validate();

        label2 = new JLabel();
        panel2 = new JPanel();
        label2.setIcon(new ImageIcon("F:\\Roman\\Proga\\Progect\\New Java Project\\img.jpg"));

        gbc.gridx = 200;
        gbc.gridy = 100;
        panel2.add(label2, gbc);
        add(panel2, gbc);
        validate();
        
        label3 = new JLabel();
        panel3 = new JPanel();
        label3.setIcon(new ImageIcon("F:\\Roman\\Proga\\Progect\\New Java Project\\img.jpg"));

        gbc.gridx = 100;
        gbc.gridy = 200;
        panel3.add(label3, gbc);
        add(panel3, gbc);
        validate();

//        final JPanel labPanel = new JPanel();
//        final JScrollPane scrollPane = new JScrollPane(labPanel);
//        labPanel.setLayout(new BoxLayout(labPanel, BoxLayout.Y_AXIS));
//        final Font font = new Font("Verdana", Font.PLAIN, 25);

//        addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent evt) {
//                switch (evt.getKeyChar()) {
//                    case 'w':
//                        for (int i = 0; i < 10; i++) {
//
//                        }
//                        break;
//                    case 's':
//                        int number = labels.size() + 1;
//                        labels.add(panel);
//                        panel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
//                        panel.setFont(font);
//                        labPanel.add(panel);
//                        scrollPane.revalidate();
//                    case 'a':
//
//                        break;
//                    case 'd':
//
//                        break;
//                }
//            }
//        });
//        for (int i = 0; i < 10; i++) {
//            int number = labels.size() + 1;
//            labels.add(panel);
//            panel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
//            panel.setFont(font);
//            labPanel.add(panel);
//            scrollPane.revalidate();
//        }
    }
}
