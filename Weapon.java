package rp;

public class Weapon extends Item{
	String weaponDescription;
	int Damage;
//constructor for the weapon class, defines weapon description and weapon damage
public Weapon (String weaponExamineDescription, int weaponDamage){
	weaponExamineDescription = weaponDescription;
	weaponDamage = Damage;
}
//sets the integer value for the amount of damage the weapon deals
	private void setDamage(weaponDamage){
	}
//gets the integer value for the amount of damage the weapon deals
	private int getDamage(){
		return (weaponDamage);
}
//sets the weapon description as a String so that it shows up when examined	
	private void setWeaponExamineDescription(weaponExamineDescription){
		
	}
//gets the weapon description
	private String getWeaponExamineDescription(){
		return (weaponExamineDescription);
	}
}