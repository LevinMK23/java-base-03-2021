package lesson5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(3, 5);
        System.out.println(point);

        point.setX(3);
        point.setY(4);
        point.print();

        Point p2 = new Point();
        p2.setX(4);

        DArray a = new DArray();

        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.print();
        a.add(4, 22);
        a.print();
        a.remove(3);
        a.print();

        Cat cat = new Cat();

        Point pp1 = new Point(1,2);
        Point pp2 = new Point(3, 4);
        Point pp3 = new Point(5, 6);


        pp2 = pp3;
        pp2.print();

    }
}
