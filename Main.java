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

/**
 *
 * @author VRV
 */
public class Main {

    
    public static void main(String[] args) throws InterruptedException {
        Diamond d = new Diamond("Computer Graphics");
        
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.setSize(1000, 1000);
    }
    
}
