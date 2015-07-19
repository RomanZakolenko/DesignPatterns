package structural.flyweight;

public class Dwarf extends Unit {
	public Dwarf() {
		this.name = "Dwarf";
		this.health = 100;
		this.weapon = WeaponFactory.getWeapon(name);
	}
}
