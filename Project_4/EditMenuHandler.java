import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EditMenuHandler implements ActionListener {
	
	TreeMap bmap; //Instantiate a tree map
	static String input; //Instantiate a string variable
	
	public EditMenuHandler(TreeMap bm) { //Constructor
		bmap= bm;
	}
	
	public void actionPerformed(ActionEvent event) {
		input = null; //Declare a string variables
		String menuName = event.getActionCommand();
	    if (menuName.equals("Search")) //If the user clicks "search"
	    	input = JOptionPane.showInputDialog(null, "Enter a bulb part number:"); //Tell the user to enter a bulb part number
	    	if(bmap.containsValue(input)) //If the tree map has the bulb part number entered by the user...
	    		JOptionPane.showMessageDialog(null, "Part number " +input+ " is in the tree map." ); //Tell the user the bulb part number is in the tree map
	    	else //Or...
	    		JOptionPane.showMessageDialog(null, "Part number " +input+ " is not in the tree map." ); //Tell the user the bulb part number is not in the tree map 	
	 } //actionPerformed

}
