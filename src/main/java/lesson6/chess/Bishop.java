package lesson6.chess;

public class Bishop extends Figure {

    public Bishop(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean can(int x, int y) {
        // diagonal
        int dx = x - getX();
        int dy = y - getY();

        return Math.abs(dy) == Math.abs(dx);
    }
}
