package lesson2.hw2;

public class Animal {
    private String name;
    private int maxRun;
    private int maxSwim;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int setMaxRun(int maxRun) {
        this.maxRun = maxRun;
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
        return maxSwim;
    }


    //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

    public void run(int x) {
        if (x <= maxRun) {
            System.out.println(name + " пробежал " + x + "м.");
        } else {
            System.out.println(name + " не может столько пробежать.");
        }
    }

    public void swim(int x) {
        if (x <= maxSwim) {
            System.out.println(name + " проплыл " + x + "м.");
        } else {
            System.out.println(name + " не может столько проплыть.");
        }
    }
}
