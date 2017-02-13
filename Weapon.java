package rp;

public class Weapon extends Item{
	public String weaponDescription;
	public int Damage;
//constructor for the weapon class, defines weapon description and weapon damage
public Weapon (String weaponExamineDescription, int weaponDamage){
	weaponExamineDescription = weaponDescription;
	weaponDamage = Damage;
}
//sets the integer value for the amount of damage the weapon deals
	private void setDamage(String weaponDamage){
	}
//gets the integer value for the amount of damage the weapon deals
	private int getDamage(){
		return(Damage);
}
//sets the weapon description as a String so that it shows up when examined	
	private void setWeaponExamineDescription(String weaponExamineDescription){
		
	}
//gets the weapon description
	private String getWeaponExamineDescription(){
		return (weaponDescription);
	}
}