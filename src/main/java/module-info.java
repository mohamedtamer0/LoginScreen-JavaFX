module com.example.loginscreenjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.example.loginscreenjavafx to javafx.fxml;
    exports com.example.loginscreenjavafx;
}