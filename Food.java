package rp;

public class Food extends Item{
	public int nutrition;
	public int quantity;
	public String foodDescription;
//constructor for the food class. defines food description, nutritional value, and quantity.
public Food(String foodExamineDescription, int foodNutrition, int foodQuantity){
	foodExamineDescription = foodDescription;
	foodNutrition = nutrition;
	foodQuantity = quantity; 
}
	//sets the description of the food in question as a string
	private void setFoodExamineDescription(String foodExamineDescription){
	}
	//gets the food's description as a string
	private String getFoodExamineDescription(){
		return (foodDescription);
	}
	//sets the nutritional value of the food using an integer
	private void setNutrition(int foodNutrition){
	}
	//gets the nutritional value of the food
	public int getNutrition(){
		return (nutrition);
	}
	//sets the amount of food the player has as an integer value
	private void setQuantity(int foodQuantity){
	}
	//gets the amount of food the player
	private int getQuantity(){
		return (quantity);
	}

}
