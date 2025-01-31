package opgave01;

import opgave01.spellcaster.Wizard;
import opgave01.spellcaster.spell.Duration;
import opgave01.spellcaster.spell.Spell;
import opgave01.warrior.Barbarian;
import opgave01.warrior.weapon.Ranged;
import opgave01.warrior.weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        Barbarian fofstelr = new Barbarian("fofstelr", 1);
        Wizard orlemaex = new Wizard("Orlemaex", 1);

        Spell fireball = new Spell(150, Duration.INSTANTANEOUS);
        Weapon longsword = new Weapon("Longsword");
        Ranged shortbow = new Ranged("Shortbow", 80);

        fofstelr.addWeapon(longsword);
        fofstelr.addWeapon(shortbow);
        orlemaex.addSpell(fireball);

        fofstelr.getRanges();
    }
}
