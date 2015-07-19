package structural.flyweight;

public class Elf extends Unit {
	public Elf() {
		this.name = "Elf";
		this.health = 200;
		this.weapon = WeaponFactory.getWeapon(name);
	}
}
