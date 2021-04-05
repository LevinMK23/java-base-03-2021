import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    private int left = 0;
    public TextField text;

    public void click(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String title = button.getText();
        switch (title) {
            case "0":
            case "1":
                text.appendText(title);
                break;
            case "+":
                left = Integer.parseInt(text.getText());
                text.clear();
                break;
            case "=":
                int right = Integer.parseInt(text.getText());
                right += left;
                text.setText(String.valueOf(right));
        }
    }
}
