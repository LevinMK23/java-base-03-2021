package lesson6;

public class A {

    private int a;
    int b;
    protected int c;
    public int d;

    public A(int a) {
        this.a = a;
        System.out.println("A created: " + this);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void foo() {
        System.out.println(1);
    }

    void bar() {
        System.out.println(3);
    }

    protected void localFoo() {
        System.out.println(2);
    }
}
