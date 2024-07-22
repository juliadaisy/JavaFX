package org.example.javafxnew1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogIn {

    private static final String AFTER_LOGIN_SCENE = "afterLogin.fxml";
    @FXML
    private Label label;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button login;

    @FXML
    protected void userLogIn() throws IOException {
        checkLogIn();
    }
    private void checkLogIn(){
        Main m = new Main();
        if (username.getText().equals("javacoding") && password.getText().equals("123")) {
            //wrongLogIn.setText("Success!");

            m.changeScene(AFTER_LOGIN_SCENE);
        }

        else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            label.setText("Please enter your data.");
        }

        else {
            label.setText("Wrong username or password!");
        }


    }

}