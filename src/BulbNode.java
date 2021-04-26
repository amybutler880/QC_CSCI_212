public class BulbNode { //BulbNode
	
	protected Bulb data; // Protected instance variable aBulb
	protected BulbNode next; //Protected instance variable BulbNode

	public BulbNode() { //Default constructor
		data = null;
		next = null;
	}
	
	public BulbNode(Bulb data) { //One arguments constructor that creates a BulbNode
		this.data=data;
		next=null;
	}
}
