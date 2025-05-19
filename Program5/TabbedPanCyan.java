package javaass;
import javax.swing.*;
import java.awt.*;

public class TabbedPanCyan {
	

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Color Tabbed Pane");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 200);

	        // Create tabbed pane
	        JTabbedPane tabs = new JTabbedPane();

	        // Cyan tab
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);
	        tabs.addTab("Cyan", cyanPanel);

	        // Magenta tab
	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);
	        tabs.addTab("Magenta", magentaPanel);

	        // Yellow tab
	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);
	        tabs.addTab("Yellow", yellowPanel);

	        // Add tabs to frame
	        frame.add(tabs);
	        frame.setVisible(true);
	    }
	}


