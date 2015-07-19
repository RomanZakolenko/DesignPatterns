package structural.flyweight;

import java.util.HashMap;

public class WeaponFactory {
	private static HashMap<String, Weapon> weapons = new HashMap<String, Weapon>();

	public static Weapon getWeapon(String name) {
		if (!weapons.containsKey(name)) {
			if (name.equals("Elf")) {
				weapons.put("Elf", new Sword());
			}
			if (name.equals("Dwarf")) {
				weapons.put("Dwarf", new Ax());
			}
		}
		return weapons.get(name);
	}
}
