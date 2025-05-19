package javaass;
import javax.swing.*;
import java.awt.event.*;

public class clocktype {
	

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Clock Buttons");
	        frame.setSize(300, 250);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null);

	        // Replace these with actual image file paths or URLs
	        ImageIcon digitalClockIcon = new ImageIcon("C:\\Users\\banak\\Downloads/dgc.png");
	        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\banak\\Downloads/hrg.png");

	        JButton digitalClockBtn = new JButton(digitalClockIcon);
	        digitalClockBtn.setBounds(30, 30, 100, 100);

	        JButton hourGlassBtn = new JButton(hourGlassIcon);
	        hourGlassBtn.setBounds(150, 30, 100, 100);

	        JLabel label = new JLabel("");
	        label.setBounds(50, 150, 200, 30);

	        digitalClockBtn.addActionListener(e -> label.setText("Digital Clock is pressed"));
	        hourGlassBtn.addActionListener(e -> label.setText("Hour Glass is pressed"));

	        frame.add(digitalClockBtn);
	        frame.add(hourGlassBtn);
	        frame.add(label);
	        frame.setVisible(true);
	    }
	}


