package rp;
//By Michael Nicholas
public class Item {
	public String name;
	public String description;
	public int weight;
//constructor for item class. defines item name, description, and weight.
 public Item (String itemName, int Weight){
	this.name = itemName;
	this.weight = Weight;
	 
 }
//allows for super constructor in armor, weapon, and food classes
 public Item (){ 
 }
	//sets the name of the item in question
	public void setName(String itemName){
		this.name = itemName;
	}
	//gets the name of the item in question
	public String getName(){
		return this.name;
	}
	//sets the description of the item in question
	public void examineDescription(){
		System.out.println("This is a " + this.name + ". It has a weight of " + this.weight + " kilograms." );
	}
	//gets the integer value for the weight of the item
	public int getWeight (){
	return this.weight;
	}
	//sets the integer value for the weight of the item
	public void setWeight(int Weight){
	this.weight = Weight;
	}
}
