package lesson2.hw2;

public class Cat extends Animal {

    int maxRun = setMaxRun(200);
    int maxSwim = setMaxSwim(0);

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int x){
        System.out.println("Коты не умеют плавать.");
    }
}
