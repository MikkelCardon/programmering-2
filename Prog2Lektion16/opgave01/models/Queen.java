package opgave01.models;

public class Queen extends Character {
    public Queen() {
        super.weapon = new KnifeBehavior();
    }

    @Override
    public String toString() {
        return "Queen";
    }
}
