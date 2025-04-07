package examples.ducks.models;

public abstract class Duck {
    public void quack() {
        System.out.println("Quack");
    }
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }


}
