package lesson5;

public class Point {

    // переменные класса (свойства или филды)
    // Field
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // cmd + N


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object " + this + " killed");
    }

    public void setX(int x) {
        this.x = x;
        System.out.println(this);
    }

    public void setY(int y) {
        this.y = y;
        System.out.println(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // функция класса (метод)
    public void print() {
        System.out.printf("(%d; %d)\n", x, y);
    }
}
