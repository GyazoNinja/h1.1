package rp;

public class Armor extends Item{
	
int Resistance;
String armorDescription;
//constructor for the armor class, defines description and resistance
public Armor(String armorExamineDescription, int armorResistance){
	armorExamineDescription = armorDescription;
	armorResistance = Resistance;
}

//sets the resistance value of the armor as an integer
	private void setResistance(Resistance){
}
//gets the resistance value of the armor
	private int getResistance(){
		return (Resistance);
	}
//sets the armor description of the armor when it is examined	
	private void setArmorDescription(armorDescription){	
	}
//gets the armor description and displays it when examined	
	private String getArmorDescription(){
		return (armorDescription);
	}
}
