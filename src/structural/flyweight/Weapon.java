package structural.flyweight;

public class Weapon {
	protected String type;
	protected int damage;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Weapon(String type, int damage) {
		this.type = type;
		this.damage = damage;
		System.out.println("Weapons were manufactered.");
	}

	@Override
	public String toString() {
		return "Weapon [type=" + type + ", damage=" + damage + "]";
	}

}
