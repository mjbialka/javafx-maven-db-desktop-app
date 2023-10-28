package com.marcin.app;

import com.marcin.app.gui.SearchWindow;
import com.marcin.app.misc.ScreenBuilder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;



public class Main extends Application {

    @Override
    public void start(Stage stage) {

        stage.initStyle(StageStyle.TRANSPARENT);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/marcin/app/gui/searchWindow.fxml"));
        try {
            Parent parent = fxmlLoader.load();
            SearchWindow searchController = fxmlLoader.getController();
            searchController.initialize(stage);
            Scene scene= ScreenBuilder.adjustScreen(stage,parent);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        launch();
    }
}

