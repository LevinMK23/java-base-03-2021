package lesson8;

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
    private char[][] charMap;


    public GameXO() throws HeadlessException {
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dispose();
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
                    movePC();
                    // TODO: 05.04.2021 check victory

                });
            }
        }
        add(panel);
        setVisible(true);
    }

    private void movePC() {
        // TODO: 05.04.2021 smart move
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(DEFAULT)) {
                    map[i][j].setDisabledIcon(ICON_O);
                    map[i][j].setIcon(ICON_O);
                    map[i][j].setEnabled(false);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new GameXO();
    }
}
