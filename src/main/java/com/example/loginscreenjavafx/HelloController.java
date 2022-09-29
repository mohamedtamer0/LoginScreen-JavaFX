package com.example.loginscreenjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
            //lblMSG.setText("You try to Login");
            validateLogin();
        }else {
            lblMSG.setText("Please enter username and password.");
        }
    }

    public void validateLogin() {
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectionDB = connectionNow.getConnection();

        String verifyLogin = "select count(1) from [YourTableName] where username =  '"+txtUserName.getText()+"' and password = '"+txtPassword.getText()+"' ";

        try {
            Statement statement = connectionDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);
            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    lblMSG.setText("Welcome!");
                }else {
                    lblMSG.setText("Invalid Login. Please try again.");
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}