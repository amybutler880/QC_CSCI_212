public class SortedBulbList extends BulbList {
	
	public SortedBulbList() { //Constructor
		super(); //Uses the constructor from the super class
	}
	
	public void add(Bulb b) {
		
		BulbNode tempNode = new BulbNode(b); //Create a new BublNode
		BulbNode nextNode = first.next; //BulbNode that keeps track of the next node
		BulbNode prevNode = first; //BulbNode that keeps track of the previous node
		
		while(nextNode!=null) { //Loops through the list until there are no more nodes
			//If the next node has a greater wattage than the new node break the loop
			if(nextNode.data.getWattage()>tempNode.data.getWattage()) break; 
			prevNode=nextNode;
			nextNode=nextNode.next;
		}
		
		//Add the new box:
		prevNode.next=tempNode;
		tempNode.next=nextNode;
	}

}
