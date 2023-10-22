package com.marcin.app;

import com.marcin.app.gui.SearchWindow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.initStyle(StageStyle.UNDECORATED);
        System.setProperty("javafx.cachedir", System.getProperty("user.dir") + "/javafx_cache");

        // Inicjalizacja okna SearchWindow
        SearchWindow searchWindow = new SearchWindow(stage);

        String css = Objects.requireNonNull(this.getClass().getResource("Styles.css")).toExternalForm();
        Scene searchScene = searchWindow.getSearchWindow();
        searchScene.getStylesheets().add(css);

        stage.setScene(searchScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

