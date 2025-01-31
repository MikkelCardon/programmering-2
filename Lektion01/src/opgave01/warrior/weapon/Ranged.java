package opgave01.warrior.weapon;

public class Ranged extends Weapon{
    private int range;

    public Ranged(String name, int range) {
        super(name);
        this.range = range;
    }

    public int getRange() {
        return range;
    }
}
