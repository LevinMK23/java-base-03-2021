package lesson1.hw1;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food = food - n;
    }

    public boolean checkFood(int n) {
        if ((food - n) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addFood() {
        this.food = this.food + (100 - this.food);
        System.out.println("В миску доложили еды и теперь она снова полна, в ней " + this.food + " кусочков корма.");
    }

    public void info() {
        System.out.println("Еды в миске: " + this.food);
    }

}
