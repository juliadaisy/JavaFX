package org.example.javafxnew1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AfterLogin {
    @FXML
    private Button logout;

    @FXML
    protected void userLogOut() throws IOException {
        Main m = new Main();
        m.changeScene("hello-view.fxml");

    }

}
