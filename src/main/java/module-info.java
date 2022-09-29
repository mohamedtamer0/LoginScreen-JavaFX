module com.example.loginscreenjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginscreenjavafx to javafx.fxml;
    exports com.example.loginscreenjavafx;
}