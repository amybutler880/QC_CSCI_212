import javax.swing.*;
import java.awt.*;

    public class NumbersGUI extends JFrame { //Start the class NumbersGUI and extend to JFrame.
    
    public static void CreateNumbersGUI(NumbersGUI myNumbersGUI) { //Method that creates the GUI using the class NumbersGUI.
    	
    	myNumbersGUI = new NumbersGUI(); //Creates a GUI object from the class NumbersGUI.
    	myNumbersGUI.setSize(400,400); //Size of the GUI.
    	myNumbersGUI.setLocation(100,100); //Location of the GUI.
    	myNumbersGUI.setLayout(new GridLayout(3,3)); //Creates 3 rows and 3 columns in the GUI.
    	myNumbersGUI.setTitle("NUMBERS GUI"); //Sets the title of the GUI.
    	myNumbersGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits the GUI when the window is closed.
    	
    	Container myContentPane= myNumbersGUI.getContentPane(); //Creates the content pane to put text areas in.
    	
    	TextArea one = new TextArea(); //Creates a text area called one.
    	TextArea two = new TextArea(); //Creates a text area called two.
    	TextArea three = new TextArea(); //Creates a text area called three.
    	TextArea four = new TextArea(); //Creates a text area called four.
    	TextArea five = new TextArea(); //Creates a text area called five.
    	TextArea six = new TextArea(); //Creates a text area called six.
    	TextArea seven = new TextArea(); //Creates a text area called seven.
    	TextArea eight = new TextArea(); //Creates a text area called eight.
    	TextArea nine = new TextArea(); //Creates a text area called nine.
    	
    	myContentPane.add(one); //Adds the text area called "one" into the content pane.
    	myContentPane.add(two); //Adds the text area called "two" into the content pane.
    	myContentPane.add(three); //Adds the text area called "three" into the content pane.
    	myContentPane.add(four); //Adds the text area called "four" into the content pane.
    	myContentPane.add(five); //Adds the text area called "five" into the content pane.
    	myContentPane.add(six); //Adds the text area called "six" into the content pane.
    	myContentPane.add(seven); //Adds the text area called "seven" into the content pane.
    	myContentPane.add(eight); //Adds the text area called "eight" into the content pane.
    	myContentPane.add(nine); //Adds the text area called "nine" into the content pane.
    	
    	for (int i=1; i<=100; i++) { //Loops through the numbers one to one hundred.
    		if(i%2==0) //Finds numbers divisible by two.
    			one.append(i + "\n"); //Adds numbers divisible by two to the text area called one.
    		if(i%3==0) //Finds numbers divisible by three.
    			two.append(i + "\n"); //Adds numbers divisible by three to the text area called two.
    		if(i%4==0) //Finds numbers divisible by four.
    			three.append(i + "\n"); //Adds numbers divisible by four to the text area called three.
    		if(i%5==0) //Finds numbers divisible by five.
    			four.append(i + "\n"); //Adds numbers divisible by five to the text area called four.
    		if(i%6==0) //Finds numbers divisible by six.
    			five.append(i + "\n"); //Adds numbers divisible by six to the text area called five.
    		if(i%7==0) //Finds numbers divisible by seven.
    			six.append(i + "\n"); //Adds numbers divisible by seven to the text area called six.
    		if(i%8==0) //Finds numbers divisible by eight.
    			seven.append(i + "\n"); //Adds numbers divisible by eight to the text area called seven.
    		if(i%9==0) //Finds numbers divisible by nine.
    			eight.append(i + "\n"); //Adds numbers divisible by nine to the text area called eight.
    		if(i%10==0) //Finds numbers divisible by ten.
    			nine.append(i + "\n"); //Adds numbers divisible by ten to the text area called nine.
    	} //End for loop.
    	
    	myNumbersGUI.setVisible(true); //Allow the text to become visible in the GUI.
    } //End CreateNumbersGUI.
    } //End of NumbersGUI.
    