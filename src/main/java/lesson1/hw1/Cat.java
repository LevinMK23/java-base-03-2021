package lesson1.hw1;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void checkSatiety() {
        if (this.satiety == true) {
            System.out.println("Котик " + this.name +" сыт.");
        } else {
            System.out.println("Котик " + this.name +" голоден.");
        }
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety = true;
    }

}
