package opgave01.models;

public class King extends Character {
    public King() {
        super.weapon = new SwordBehavior();
    }

    @Override
    public String toString() {
        return "King";
    }
}
