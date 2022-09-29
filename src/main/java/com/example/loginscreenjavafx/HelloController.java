package com.example.loginscreenjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button btnCancel;
    @FXML
    private Label lblMSG;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;


    public void btnCancelOnAction(ActionEvent e ){
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    public void btnLoginOnAction(ActionEvent e ){

        if (txtUserName.getText().isBlank() == false && txtPassword.getText().isBlank() == false) {
            lblMSG.setText("You try to Login");
        }else {
            lblMSG.setText("Please enter username and password.");
        }
    }

}