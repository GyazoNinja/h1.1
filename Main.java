package rp;

public class Main {

	public static void main(String [] args){

		Item Box = new Item("Box", 100);
		Box.examineDescription();
		Box.getName();
		System.out.println(Box.getWeight());
		
		Weapon BroadSword = new Weapon ("A heavy, two handed sword.", 100);
		System.out.println(BroadSword.getDamage());
		System.out.println(BroadSword.getWeaponExamineDescription());
		
		Armor Chainmail = new Armor("A thin, see-through plating that covers your torso.", 50);
		System.out.println(Chainmail.getResistance());
		Chainmail.getArmorDescription();
		
		Food Apple = new Food("A tasty snack found on a local farm.", 10, 10);
		System.out.println(Apple.getQuantity());
		System.out.println(Apple.getFoodExamineDescription());
	}

}


