import javax.swing.*;

/**
 * @author Amy Butler
 * @date 2/23/21
 * @lab 11E
 */           

public class Project0 { //States the class
	
	static int Counter_e=0; //Sets the counter for "e"
	static int Counter_E=0; //Sets the counter for "E"
	
	/**
	 * @MethodName Main
	 * @description Ask the user for a sentence and return how many "e" and "E".
	 * @param Args
	 * @return Void
	 */
	
	public static void main(String[] args) { //The main method and its input arguments
		String InputSentence; //Declares InputSentence as a string variable
		while (true) {  //Repeats the process
			InputSentence = JOptionPane.showInputDialog(null, "Enter a sentence:"); //Tells user to enter sentence
			Count_Upper_Lower(InputSentence, Counter_e, Counter_E); //Passes parameters                                  
			JOptionPane.showMessageDialog(null,                                                 
				"Number of lower case e's: " + Counter_e +  "\nNumber of upper case E's: " + Counter_E ); //Output to the user
			Counter_e=0; //Resets the counter for lower case "e" to zero
			Counter_E=0; //Resets the counter for lower case "E" to zero
		} //End while loop
	} //End main method
	
	/**
	 * @MethodName Count_Upper_Lower
	 * @description Count the number of "e" and "E" in a sentence.                  
	 * @param String x: The user input sentence. 
	 * @param Integer y: The "e" counter.
	 * @param Integer z: The "E" counter.
	 * @return Void
	 */                                                                             
		                                                                                         
	public static void Count_Upper_Lower(String x, int y, int z) { //Count_Upper_Lower Method                                          
		if(x.equalsIgnoreCase("STOP")) { //"STOP" is typed (with no regard for letter case)
			System.exit(0);} //Program ends
		else
			for(int i=0; i<x.length(); i++) { //Loops through each character in the input sentence
				if(x.charAt(i) == 'e') //Searches for lower case e's
					Counter_e++; //Adds one for every lower case "e"
				if(x.charAt(i) == 'E') //Searches for upper case E's         
					Counter_E++; //Adds one for every upper case "E"                            
			} //End for loop
	 } //End Count_Upper_Lower Method
} //End of Project0


