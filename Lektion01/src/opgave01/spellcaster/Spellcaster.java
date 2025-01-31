package opgave01.spellcaster;

import opgave01.Character;
import opgave01.spellcaster.spell.Spell;

import java.util.ArrayList;

public class Spellcaster extends Character {
    private ArrayList<Spell> spells = new ArrayList<Spell>();

    public Spellcaster(String name, int level) {
        super(name, level);
    }

    public Spellcaster(String name, int level, ArrayList<Spell> spells) {
        super(name, level);
        this.spells = spells;
    }

    public Spell addSpell(Spell newSpell){
        if (!spells.contains(newSpell)) {
            spells.add(newSpell);
            return newSpell;
        }
        return null;
    }
}
