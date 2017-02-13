package rp;

public class Weapon extends Item{
	public int Damage;
//constructor for the weapon class, defines weapon description and weapon damage
public Weapon (String itemName, int Weight, int weaponDamage){
	this.Damage = weaponDamage;
	this.weight = Weight;
	this.name = itemName;
}
//sets the integer value for the amount of damage the weapon deals
	public void setDamage(int weaponDamage){
		this.Damage = weaponDamage;
	}
//gets the integer value for the amount of damage the weapon deals
	public int getDamage(){
		return this.Damage;
}
	public void examineWeaponDescription(){
		System.out.println("This is a " + this.name + ". It has a weight of " + this.weight + " kilograms. It deals " + this.Damage + " damage in one swing!" );
	}
}