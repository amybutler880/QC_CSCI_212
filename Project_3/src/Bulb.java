public class Bulb {
	
	private String Manufacturer; //instance variable manufacturer
	private String Number; //instance variable part number
	private int Wattage; //instance variable wattage
	private int Lumens; //instance variable lumen
	
	public Bulb() {
		Manufacturer=null;
		Number=null;
		Wattage=0;
		Lumens=0;
	}
	
	public Bulb (String info0, String info1, String info2, String info3) { //Bulb constructor
		this.Manufacturer=info0;
		this.Number=info1;
		this.Wattage=Integer.parseInt(info2);
		this.Lumens=Integer.parseInt(info3);
		runException(Wattage);
	}
	
	//Run exception method:
	public void runException(int w) {
		if(w<5) { //If the bulb wattage is less than five...
			System.out.println(Manufacturer+","+ Number+","+ w + ","+ Lumens);
			throw new IllegalBulbException("The bulb wattage should be greater than five."); //Throw the exception
		}
	}
	
	public String getManufacturer() { //get method for manufacturer
		return Manufacturer;
	}
	
	public String getNumber() { //get method for number
		return Number;
	}
	
	public int getWattage() { //get method for wattage
		return Wattage;
	}
	
	public int getLumens() { //get method for lumens
		return Lumens;
	}
	
	public void setManufacturer(String M) { //set method for manufacturer
		Manufacturer = M;
	}
	
	public void setNumber(String N) { //set method for number
		Number = N;
	}
	
	public void setWattage(int W) {
		Wattage=W;
	}
	
	public void setLumens(int L) { //set method for lumens
		Lumens = L;
	}
	 
	public boolean equals(Bulb b) { //overrides Object equals method
		return this.Manufacturer==b.Manufacturer && this.Number==b.Number && this.Wattage==b.Wattage && this.Lumens==b.Lumens;
	}
	
	public String toString(){ //overrides Object toString method
		return "Manufacturer:"+Manufacturer+", Part Number:"+Number+", Wattage:"+Wattage+", Lumens:"+Lumens;
	}
}
