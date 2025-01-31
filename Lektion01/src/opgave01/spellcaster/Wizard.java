package opgave01.spellcaster;

import opgave01.spellcaster.spell.Spell;

import java.util.ArrayList;

public class Wizard extends Spellcaster{
    public Wizard(String name, int level) {
        super(name, level);
    }

    public Wizard(String name, int level, ArrayList<Spell> spells) {
        super(name, level, spells);
    }
}
