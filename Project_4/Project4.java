import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

import javax.swing.JFileChooser;

public class Project4 {
	
	
	public static void main(String[] args) { //Main method
	    JFileChooser fd = new JFileChooser("./"); 
	    fd.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	    fd.showOpenDialog(null);
	    File f = fd.getSelectedFile();
	    listFiles(f,"");
	    String filename =(fd.getSelectedFile()).getAbsolutePath();
	    readFile(filename); //Referenced in method below
	}
	
	//List files method
	public static void listFiles(File f, String indent) { //List the files in a chosen folder
		File files[] = f.listFiles(); //Returns all folders inside the current folder
		if (f.isDirectory()) //Only loop if there is a directory
			for (int i = 0; i<files.length; i++) { //Loop through through the files
				File f2 = files[i];
				System.out.print(indent+f2.getName());
				System.out.print("...");
				System.out.print(f2.lastModified());
				System.out.print("...");
				System.out.print(f2.length());
				System.out.println();
				if (f2.isDirectory())
					listFiles(f2, indent+"   "); 
		}
	}
	
	//Read file method:
	public static void readFile(String filename) {
		TextFileInput input = new TextFileInput(filename);
		TreeMap<Bulb, String> SortedBulbList = new TreeMap(new BulbComparator()); //Creates a new tree map using bulb comparator
		UnsortedBulbList Unsorted = new UnsortedBulbList(); //Stores an unsorted list
		String Line = input.readLine(); //Stores each line of the file
		while(Line!=null) { //Loops through the file until there are no more lines
			String [] info = new String[4]; //Stores the 4 strings from the file
			StringTokenizer st = new StringTokenizer(Line,","); //Separate the line where there is a comma
			int numberofCommas = st.countTokens(); //Counts the number of commas in each line
			try { //Try statement
				for(int i=0;i<numberofCommas;i++) {
					info[i]=st.nextToken(","); //Stores the strings in an array
				}
				Bulb temp = new Bulb(info[0], info[1], info[2], info[3]);
				Unsorted.add(new Bulb(info[0],info[1],info[2],info[3])); //Stores the 4 strings in unsorted list
				SortedBulbList.put(temp, temp.getNumber()+"\n"); //Adds the sorted bulbs to the GUI and omits repeat part numbers
			}
			catch (IllegalBulbException ibe) { //Catch statement 
				System.out.println(ibe.getMessage());
			}
			Line=input.readLine(); //Reads the next line
		}
		BulbGUI gui = new BulbGUI(Unsorted, SortedBulbList); //Displays the GUI
	}
	
} //End Project 4
