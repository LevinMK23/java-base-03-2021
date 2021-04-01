package lesson6.chess;

public class Knight extends Figure {

    public Knight(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean can(int x, int y) {
        // +1 +2
        int dx = x - getX();
        int dy = y - getY();
        return dx * dx + dy * dy == 5;
    }
}
