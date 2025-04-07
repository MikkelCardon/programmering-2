package opgave01.models;

public class Troll extends Character {
    public Troll() {
        super.weapon = new AxeBehavior();
    }

    @Override
    public String toString() {
        return "Troll";
    }
}
