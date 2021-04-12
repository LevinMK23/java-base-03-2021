package lesson1.hw1;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameXO extends JFrame {


    private static final ImageIcon DEFAULT = new ImageIcon("def.png");
    private static final ImageIcon ICON_X = new ImageIcon("x.png");
    private static final ImageIcon ICON_O = new ImageIcon("o.png");
    private JButton[][] map;
    String vinner;


    public GameXO() throws HeadlessException {
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3,3));
        map = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = new JButton();
                map[i][j].setIcon(DEFAULT);
                JButton cur = map[i][j];
                panel.add(cur);
                cur.addActionListener(a -> {
                    cur.setDisabledIcon(ICON_X);
                    cur.setIcon(ICON_X);
                    cur.setEnabled(false);

                    // TODO: 05.04.2021 check victory
                    if (checkWin(ICON_X)) {
                        vinner = "Игрок";
                        new EndGameDialog(vinner);
                        setVisible(false);
                    } else {
                        movePC();
                        if (checkWin(ICON_O)) {
                            vinner = "Компьютер";
                            new EndGameDialog(vinner);
                            setVisible(false);
                        }
                    }
                });
            }
        }
        add(panel);
        setVisible(true);
    }

    private void movePC() {
        // TODO: 05.04.2021 smart move
        int i = (int) (Math.random() * 3);
        int j = (int) (Math.random() * 3);
        if (map[i][j].getIcon().equals(DEFAULT)) {
            map[i][j].setDisabledIcon(ICON_O);
            map[i][j].setIcon(ICON_O);
            map[i][j].setEnabled(false);
        }
    }

    // TODO: 05.04.2021 check victory
    boolean checkWin(ImageIcon image) {
        int diag1, diag2, hor, ver;
        for (int i = 0; i < 3; i++) {
            hor = 0; ver = 0;
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(image)) {
                    hor++;
                }
                if (map[i][j].getIcon().equals(image)) {
                    ver++;
                }
            }
            if (hor == 3|| ver == 3) {
                return true;
            }
        }
        diag1 = 0; diag2 = 0;
        for (int i = 0; i < 3; i++) {
            if (map[i][i].getIcon().equals(image)) {
                diag1++;
            }
            if (map[i][3 - i - 1].getIcon().equals(image) ) {
                diag2++;
            }
            if (diag1 == 3 || diag2 == 3) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        new GameXO();
    }
}
