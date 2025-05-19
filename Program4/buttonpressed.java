package javaass;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class buttonpressed {
	
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Country Button");
	        JLabel label = new JLabel("Press a button", SwingConstants.CENTER);
	        JButton indiaBtn = new JButton("India");
	        JButton srilankaBtn = new JButton("Srilanka");

	        indiaBtn.addActionListener(e -> label.setText("India is pressed"));
	        srilankaBtn.addActionListener(e -> label.setText("Srilanka is pressed"));

	        frame.setLayout(new BorderLayout());
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.add(indiaBtn);
	        buttonPanel.add(srilankaBtn);

	        frame.add(label, BorderLayout.CENTER);
	        frame.add(buttonPanel, BorderLayout.SOUTH);
	        frame.setSize(400, 150);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null); // center the window
	        frame.setVisible(true);
	    }
	}


