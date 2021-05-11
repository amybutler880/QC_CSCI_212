public class UnsortedBulbList extends BulbList { //UnsortedBulbList extends BulbList
	
	public UnsortedBulbList() { //Constructor
		super(); //Uses the constructor from the super class
	}
	
	public void add(Bulb b) { //Method that adds a new node to Bulblist
		append (b); //Calls the append method from the super class
	}

}
