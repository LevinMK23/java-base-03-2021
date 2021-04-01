package lesson6.chess;

public class ChessTest {
    public static void main(String[] args) {

        Figure[][] desk = new Figure[8][8];

        Figure bishop = new Bishop(1,1);
        System.out.println(bishop.getType());
        bishop.move(3,3);
        bishop.move(2,4);
        bishop.move(8, 8);

        Figure knight = new Knight(1,1);
        System.out.println(knight.can(1,2));
        System.out.println(knight.can(2,3));
        System.out.println(knight.can(3,2));
    }
}
