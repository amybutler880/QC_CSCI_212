import java.util.StringTokenizer;

public class Project2 {
	
	public static void main(String[] args) { //Main method
		
		TextFileInput fileinput = new TextFileInput("C:\\Users\\aliza\\Desktop\\Project2Data.txt"); //Reads off of the file
		
		UnsortedBulbList Unsorted = new UnsortedBulbList(); //Stores an unsorted list
		SortedBulbList Sorted = new SortedBulbList(); //Stores a sorted list
		
		String Line = fileinput.readLine(); //Stores each line of the file
		
		while(Line!=null) { //Loops through the file until there are no more lines
			
			String [] info = new String[4]; //Stores the 4 strings from the file
			
			StringTokenizer st = new StringTokenizer(Line,","); //Seperate the line where there is a comma
			
			int numberofCommas = st.countTokens(); //Counts the number of commas in each line
			
			for(int i=0;i<numberofCommas;i++) {
				info[i]=st.nextToken(","); //Stores the strings in the array
			}
			
			Unsorted.add(new Bulb(info[0],info[1],info[2],info[3])); //Stores the 4 strings in unsorted list
			Sorted.add(new Bulb(info[0],info[1],info[2],info[3])); //Stores the 4 strings in sorted list
			
			Line=fileinput.readLine(); //Reads the nest line
		}
		
		BulbGUI gui = new BulbGUI(Unsorted,Sorted); //Displays the GUI
	}

} //End Project 2
