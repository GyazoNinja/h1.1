package rp;
//By Michael Nicholas
public class Item {
	public String name;
	public String description;
	public int weight;
//constructor for item class. defines item name, description, and weight.
 public Item (String itemName, String examineDescription, int Weight){
	itemName = name;
	examineDescription = description;
	Weight = weight;
	 
 }
//allows for super constructor in armor, weapon, and food classes
 public Item (){ 
 }
	//sets the name of the item in question
	private void setName(String name){
		String itemName = name;
	}
	//gets the name of the item in question
	private String getName(){
		return name;
	}
	//sets the description of the item in question
	private void setExamineDescription(String Int){
		String examineDescription = description;
		int Weight = weight;	
	}
	//returns a string description of the item in question
	private String getExamineDescription(){
		return(description);
	}
	//gets the integer value for the weight of the item
	private int getWeight (){
	return(weight);
	}
	//sets the integer value for the weight of the item
	private void setWeight(int Weight){
	Weight = weight;
}
}
