package rp;

public class Food {
	int nutrition;
	int quantity;
	String foodExamineDescription;
	
	//sets the description of the food in question as a string
	public void setFoodExamineDescription(String){
	}
	//gets the food's description as a string
	public String getFoodExamineDescription(){
		return (foodExamineDescription);
	}
	//sets the nutritional value of the food using an integer
	public void setNutrition(int){
	}
	//gets the nutritional value of the food
	public int getNutrition(){
		return (nutrition);
	}
	//sets the amount of food the player has as an integer value
	public void setQuantity(int){
	}
	//gets the amount of food the player
	public int getQuantity(){
		return (quantity);
	}

}
