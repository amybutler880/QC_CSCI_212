import java.util.Comparator;

public class BulbComparator implements Comparator <Bulb>  { //Bulb comparator
	   public int compare(Bulb num1, Bulb num2) { //Compare two bulb part numbers
		      return num1.compareTo(num2); //Return one of the bulbs - calls on compareTo method
	   }
}
