package opgave01.warrior;

import opgave01.Character;
import opgave01.warrior.weapon.Weapon;
import org.w3c.dom.ranges.Range;

import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    public Warrior(String name, int level) {
        super(name, level);
    }

    public Warrior(String name, int level, ArrayList<Weapon> weapons) {
        super(name, level);
        this.weapons = weapons;
    }

    public Weapon addWeapon(Weapon newWeapon){
        if (!weapons.contains(newWeapon)){
            weapons.add(newWeapon);
            return newWeapon;
        }
        return null;
    }

    public void getRanges(){
        for (Weapon weapon : weapons) {
            System.out.println(weapon.getClass());
        }
    }
}
