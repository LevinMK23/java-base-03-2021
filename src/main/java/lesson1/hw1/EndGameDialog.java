package lesson1.hw1;

import javax.swing.*;
import java.awt.GridLayout;

public class EndGameDialog extends JFrame {
    // TODO: 05.04.2021 game result
    String vinner;

    public EndGameDialog(String vinner) {
        setTitle("Завершение игры");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField text = new JTextField("Игра окончена! Победитель: " + vinner);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel panel = new JPanel(new GridLayout(3,1));
        JButton buttonGame = new JButton("Новая игра");
        JButton buttonClose = new JButton("Завершить игру");
        buttonGame.addActionListener(a -> { new GameXO(); setVisible(false);});
        buttonClose.addActionListener(a -> System.exit(1) );
        panel.add(text);
        panel.add(buttonGame);
        panel.add(buttonClose);
        add(panel);
        setVisible(true);
    }

    public EndGameDialog() {
    }

    public static void main(String[] args) {
        new EndGameDialog();
    }

}