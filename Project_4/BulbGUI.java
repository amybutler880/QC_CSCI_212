import java.awt.GridLayout;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class BulbGUI extends JFrame {
	
	//Instance variables for a BoxGUI:
	private JTextArea sorted,unsorted;
	private BulbList unsortedList;
	TreeMap<Bulb, String> sortedList; 
	
	//General components of the GUI:
	public BulbGUI(BulbList Unsorted ,TreeMap<Bulb, String> sortedBulbList) {
		unsortedList = Unsorted;
		sortedList = sortedBulbList;
		setTitle("BulbGUI Project 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,400);
		setLocationRelativeTo(null);
		setComponenets();
		setVisible(true);
		setLayout(new GridLayout(1,2));
	}
	
	//Main components of the GUI through set components method:
	private void setComponenets() {
		setLayout(new GridLayout(1,2)); //Grid layout of one row and two columns
		unsorted = new JTextArea();
		unsorted.setEditable(false);
		unsorted.append("Unsorted Bulbs:\n");
		unsorted.append(unsortedList.toString());
		add(unsorted); //Adds the text area to the left side of the GUI
		sorted = new JTextArea();
		sorted.setEditable(false);
		sorted.append("Sorted Bulbs:\n");
		sorted.append(sortedList.toString());
		add(sorted);
		createFileMenu(); //Reference to method below
	}
	
	//Create file menu method:
	 private void createFileMenu() {
	      JMenuItem openItem;
	      JMenuItem quitItem;
	      JMenuBar menuBar = new JMenuBar();
	      this.setJMenuBar(menuBar);
	      JMenu fileMenu = new JMenu("File"); //Create a file menu
	      FileMenuHandler fmh = new FileMenuHandler(this); //Create a file menu handler
	      openItem = new JMenuItem("Open");//Open
	      openItem.addActionListener(fmh);
	      fileMenu.add(openItem);
	      fileMenu.addSeparator();//Add a horizontal separator line
	      quitItem = new JMenuItem("Quit");//Quit
	      quitItem.addActionListener(fmh);
	      fileMenu.add(quitItem);
	      setJMenuBar(menuBar);
	      menuBar.add(fileMenu);
	      createEditMenu(menuBar); //Reference to method below
	   } //createMenu
	 
	 //Create edit menu method:
	 private void createEditMenu(JMenuBar menuBar) {
		 JMenu editMenu = new JMenu("Edit");
		 EditMenuHandler emh = new EditMenuHandler(sortedList); //Create a new edit menu handler
		 JMenuItem item = new JMenuItem("Search"); //Choose "search" as an option
		 item.addActionListener(emh);
		 editMenu.add(item); 
		 setJMenuBar(menuBar);
		 menuBar.add(editMenu);
	 }
	
}