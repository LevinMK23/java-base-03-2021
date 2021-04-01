package lesson6.animals;

public class Fish implements Sayable, Movable {

    @Override
    public void say() {
        System.out.println("Nothing!");
    }

    @Override
    public void move() {
        System.out.println("I'm go!");
    }
}
