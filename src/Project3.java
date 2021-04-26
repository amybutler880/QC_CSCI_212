import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

public class Project3 {
	
	
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
		ArrayList<String> UnsortedBulbs = new ArrayList<String>(); //Create an array list
		TextFileInput input = new TextFileInput(filename);
		UnsortedBulbList Unsorted = new UnsortedBulbList(); //Stores an unsorted list
		SortedBulbList Sorted = new SortedBulbList(); //Stores a sorted list
		String Line = input.readLine(); //Stores each line of the file
		while(Line!=null) { //Loops through the file until there are no more lines
			UnsortedBulbs.add(Line); //Add the unsorted bulbs to an array list
			String [] info = new String[4]; //Stores the 4 strings from the file
			StringTokenizer st = new StringTokenizer(Line,","); //Separate the line where there is a comma
			int numberofCommas = st.countTokens(); //Counts the number of commas in each line
			for(int i=0;i<numberofCommas;i++) {
				info[i]=st.nextToken(","); //Stores the strings in an array
			}
			try { //Try statement
				Unsorted.add(new Bulb(info[0],info[1],info[2],info[3])); //Stores the 4 strings in unsorted list
				Sorted.add(new Bulb(info[0],info[1],info[2],info[3])); //Stores the 4 strings in sorted list
			}
			catch (IllegalBulbException ibe) { //Catch statement 
				System.out.println(ibe.getMessage());
			}
			Line=input.readLine(); //Reads the next line
		}
		BulbGUI gui = new BulbGUI(Unsorted, Sorted); //Displays the GUI
		System.out.println(UnsortedBulbs); //Print the saved unsorted bulb array list
	}
	
} //End Project 3
