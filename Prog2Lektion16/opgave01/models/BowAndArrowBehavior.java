package opgave01.models;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting an arrow with a bow");
    }
}
