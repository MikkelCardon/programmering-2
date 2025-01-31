package opgave01.warrior;

import opgave01.warrior.weapon.Weapon;

import java.util.ArrayList;

public class Barbarian extends  Warrior{
    public Barbarian(String name, int level) {
        super(name, level);
    }

    public Barbarian(String name, int level, ArrayList<Weapon> weapons) {
        super(name, level, weapons);
    }
}
