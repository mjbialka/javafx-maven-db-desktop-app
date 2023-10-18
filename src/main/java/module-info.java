module com.marcin.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.marcin.app to javafx.fxml;
    exports com.marcin.app;
    exports com.marcin.app.gui;
    opens com.marcin.app.gui to javafx.fxml;
}