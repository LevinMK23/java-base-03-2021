package lesson7;

public class MyClassTest {

    public static void main(String[] args) {

        Drawable drawable = new MyClass();
        Readable readable = new MyClass();
        MyClass myClass = new MyClass();

        Processor processor = (str) -> {

        };

        processor.process("Hello!");
        Sum sum = Integer::sum;
        sum.sum(1, 5);
        System.out.println(processor.getClass());
    }
}
