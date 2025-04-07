package opgave01.models;

public class Knight extends Character {
    public Knight() {
        super.weapon = new SwordBehavior();
    }

    @Override
    public String toString() {
        return "Knight";
    }
}
