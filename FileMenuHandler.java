import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {
   JFrame jframe;
  
   public FileMenuHandler (JFrame jf) { //Constructor
      jframe = jf;
   }
   
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Open")) 
    	  OpenFile();
      else if (menuName.equals("Quit"))
    	  System.exit(0);
   } //actionPerformed
   
   //Open file method:
   public void OpenFile() {
	   JFileChooser jchoose = new JFileChooser("./"); 
	   jchoose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	   jchoose.showOpenDialog(null);
	   String filename = (jchoose.getSelectedFile()).getAbsolutePath();
	   Project4.readFile(filename);
   }
   
}
