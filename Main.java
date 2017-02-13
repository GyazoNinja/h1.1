package rp;

public class Main {

	public static void main(String [] args){

		Item Box = new Item("Heavy Box", 100);
		Box.examineDescription();
		
		Weapon BroadSword = new Weapon ("BroadSword", 15, 100);
		BroadSword.examineWeaponDescription();
		
		Food Apple = new Food("Apple", 5, 10, 10);
		Apple.examineFoodDescription();
		
		Armor ChainmailChestplate = new Armor("Chainmail Chestplate", 50, 62);
		ChainmailChestplate.examineArmorDescription();
		
		
	}

}


