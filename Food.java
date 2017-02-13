package rp;

public class Food extends Item{
	int nutrition;
	int quantity;
	String foodDescription;
//constructor for the food class. defines food description, nutritional value, and quantity.
public Food(String foodExamineDescription, int foodNutrition, int foodQuantity){
	foodExamineDescription = foodDescription;
	foodNutrition = nutrition;
	foodQuantity = quantity; 
}
	//sets the description of the food in question as a string
	private void setFoodExamineDescription(String){
	}
	//gets the food's description as a string
	private String getFoodExamineDescription(){
		return (foodExamineDescription);
	}
	//sets the nutritional value of the food using an integer
	private void setNutrition(int){
	}
	//gets the nutritional value of the food
	public int getNutrition(){
		return (nutrition);
	}
	//sets the amount of food the player has as an integer value
	private void setQuantity(int){
	}
	//gets the amount of food the player
	private int getQuantity(){
		return (quantity);
	}

}
