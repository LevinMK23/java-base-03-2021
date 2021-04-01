package lesson6.chess;

public abstract class Figure {

    private static final int DESK_SIZE = 8;

    private int x, y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private boolean isValid(int x, int y) {
        return x >= 1 && x <= DESK_SIZE
                && y >= 1 && y <= DESK_SIZE;
    }

    public abstract boolean can(int x, int y);

    public void move(int x, int y) {
        if (isValid(x, y) && can(x, y)) {
            this.x = x;
            this.y = y;
        } else {
            System.out.println("Ход невозможен!");
        }
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
