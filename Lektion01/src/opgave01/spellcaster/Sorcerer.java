package opgave01.spellcaster;

import opgave01.spellcaster.spell.Spell;

import java.util.ArrayList;

public class Sorcerer extends Spellcaster{
    public Sorcerer(String name, int level) {
        super(name, level);
    }

    public Sorcerer(String name, int level, ArrayList<Spell> spells) {
        super(name, level, spells);
    }
}
