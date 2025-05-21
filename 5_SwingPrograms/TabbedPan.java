package javaass;
import javax.swing.*;
import java.awt.*;

public class TabbedPan {
	
	
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            // Frame setup
	            JFrame frame = new JFrame("Color Tabs");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setSize(300, 200);

	            // Create tabbed pane
	            JTabbedPane tabbedPane = new JTabbedPane();

	            // Red tab
	            JPanel redPanel = new JPanel();
	            redPanel.setBackground(Color.RED);
	            tabbedPane.addTab("RED", redPanel);

	            // Blue tab
	            JPanel bluePanel = new JPanel();
	            bluePanel.setBackground(Color.BLUE);
	            tabbedPane.addTab("BLUE", bluePanel);

	            // Green tab
	            JPanel greenPanel = new JPanel();
	            greenPanel.setBackground(Color.GREEN);
	            tabbedPane.addTab("GREEN", greenPanel);

	            // Add tabbed pane to frame
	            frame.add(tabbedPane);
	            frame.setVisible(true);
	        });
	    }
	

}
