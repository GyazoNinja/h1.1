package rp;

public class Armor extends Item{
public int resistance;
//constructor for the armor class, defines description and resistance
public Armor(String itemName, int Weight, int armorResistance){
	this.name = itemName;
	this.weight = Weight;
	this.resistance = armorResistance;
}

//sets the resistance value of the armor as an integer
	public void setResistance(int armorResistance){
	this.resistance = armorResistance;
}
//gets the resistance value of the armor
	public int getResistance(){
		return this.resistance;
	}
	public void examineArmorDescription(){
		System.out.println("This piece of armor is a " + this.name + ". It has a weight of " + this.weight + " kilograms. It has a protection value of " + this.resistance + "." );
	}

}
