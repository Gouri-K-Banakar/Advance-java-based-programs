package javaass;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;
public class AddCountries {
	

	
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            // Frame setup
	            JFrame frame = new JFrame("Country List");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setSize(300, 200);

	            // Country array
	            String[] countries = {
	                "USA", "India", "Vietnam", "Canada",
	                "Denmark", "France", "Great Britain",
	                "Japan", "Africa", "Greenland", "Singapore"
	            };

	            // JList setup
	            JList<String> countryList = new JList<>(countries);
	            countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	            frame.add(new JScrollPane(countryList));

	            // Listener to handle selection
	            countryList.addListSelectionListener(e -> {
	                if (!e.getValueIsAdjusting()) {
	                    List<String> selected = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries: " + selected);
	                }
	            });

	            frame.setVisible(true);
	        });
	    }
	

}
