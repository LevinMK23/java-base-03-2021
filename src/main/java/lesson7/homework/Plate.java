package lesson7.homework;

public class Plate {

    private int capacity;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void addFood(int capacity) {
        this.capacity += capacity;
    }

    public boolean eat(int appetite) {
        if (capacity >= appetite) {
            capacity -= appetite;
            return true;
        } else {
            return false;
        }
    }
}
