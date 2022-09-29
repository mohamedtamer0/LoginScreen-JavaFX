package com.example.loginscreenjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button btnCancel;

    @FXML
    private Label lblMSG;

    public void btnCancelOnAction(ActionEvent e ){
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    public void lblMSGOnAction(ActionEvent e ){
        lblMSG.setText("You try to Login");
    }
}