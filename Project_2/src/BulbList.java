public abstract class BulbList { //abstract linked list BulbList
	
	protected BulbNode first,last,head; //instance variables
	protected int length; //instance variable
	
	public BulbList() { //No argument constructor pointing to an empty head node
		head = new BulbNode();
		first = head;
		last = head;
		length=0;
	}
	
	public void append(Bulb b) { //adds a BulbNode to the end of the BulbList
		BulbNode n = new BulbNode(b);
		last.next = n;
		last = n;
		length++;
	}
	
	public String toString() { //Represents BulbNode as a string
		String list = "";
		BulbNode display = first.next;
		
		while(display!=null) {
			list += (display.data).toString() +"\n";
			display = display.next;
		}
		return list;
	}
		
} //end class BulbList
