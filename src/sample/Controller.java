package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea textArea;
    @FXML
    TextField inputText;

    public void btnClickAction(ActionEvent actionEvent) {
        textArea.appendText(inputText.getText() + "\n");
    }
}
