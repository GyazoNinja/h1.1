package rp;

public class Food extends Item{
	public int nutrition;
	public int quantity;
//constructor for the food class. defines food nutritional value, and quantity.
public Food(String itemName, int Weight, int foodNutrition, int foodQuantity){
	this.name = itemName;
	this.weight = Weight;
	this.nutrition = foodNutrition;
	this.quantity = foodQuantity; 
}
	//sets the nutritional value of the food using an integer
public void examineFoodDescription(){
	System.out.println("This object is edible! It happens to be an " + this.name + ". It has a weight of " + this.weight + " grams and will restore " + this.nutrition + " hearts. You currently have " + this.quantity + "." );
}
	public void setNutrition(int foodNutrition){
		this.nutrition = foodNutrition;
	}
	//gets the nutritional value of the food
	public int getNutrition(){
		return this.nutrition;
	}
	//sets the amount of food the player has as an integer value
	public void setQuantity(int foodQuantity){
		this.quantity = foodQuantity;
	}
	//gets the amount of food the player
	public int getQuantity(){
		return this.quantity;
	}

}
