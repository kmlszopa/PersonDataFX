package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button sendButton;
    @FXML
    TextField nameTextField;
    @FXML
    TextField surnameTextField;
    @FXML
    Label resultLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sendButton.setOnAction(new EventHandler<ActionEvent>() {


            @Override
            public void handle(ActionEvent event) {

                Person person = new Person(nameTextField.getText(), surnameTextField.getText());
                resultLabel.setText(person.toString());

            }
        });
    }
}
