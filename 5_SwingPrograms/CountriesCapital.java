//Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
display the concerned color whenever the specific tab is selected in the Pan.package javaass;

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountriesCapital {
	public class CountryCapitalSimple {
		    public static void main(String[] args) {
		        JFrame frame = new JFrame("Country Capitals");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(300, 200);

		        // Countries and their capitals
		        String[] countries = {
		            "USA", "India", "Vietnam", "Canada", "Denmark",
		            "France", "Great Britain", "Japan", "Africa",
		            "Greenland", "Singapore"
		        };

		        String[] capitals = {
		            "Washington, D.C.", "New Delhi", "Hanoi", "Ottawa", "Copenhagen",
		            "Paris", "London", "Tokyo", "No capital", "Nuuk", "Singapore"
		        };

		        JList<String> list = new JList<>(countries);
		        frame.add(new JScrollPane(list));

		        list.addListSelectionListener(e -> {
		            if (!e.getValueIsAdjusting()) {
		                for (int i : list.getSelectedIndices()) {
		                    System.out.println(countries[i] + " → " + capitals[i]);
		                }
		            }
		        });

		        frame.setVisible(true);
		    }
		}
	}



