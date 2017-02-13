package rp;

public class Armor extends Item{
	
public int Resistance;
public String armorDescription;
//constructor for the armor class, defines description and resistance
public Armor(String armorExamineDescription, int armorResistance){
	armorExamineDescription = armorDescription;
	armorResistance = Resistance;
}

//sets the resistance value of the armor as an integer
	private void setResistance(int Resistance){
		int armorResistance = Resistance;
}
//gets the resistance value of the armor
	private int getResistance(){
		return (Resistance);
	}
//sets the armor description of the armor when it is examined	
	private void setArmorDescription(String armorDescription){	
		String armorExamineDescription = armorDescription;
	}
//gets the armor description and displays it when examined	
	private String getArmorDescription(){
		return (armorDescription);
	}
}
