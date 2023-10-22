package com.marcin.app.gui;

import com.marcin.app.database.HeatersList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SearchWindow {

    private Stage primaryStage;
    private Scene searchWindow;
    @FXML
    private Text text1;
    @FXML
    private Label label1;

    @FXML
    private ImageView imageView;
    @FXML
    private TextField textField1;
    @FXML
    private ListView<String> listView;


    public SearchWindow(Stage primaryStage) {
        this.primaryStage = primaryStage;
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("com/marcin/app/gui/searchWindow.fxml"));
        loader1.setController(this);

        try {
            loader1.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        initialize();
    }

    @FXML
    public void initialize() {
        //initialization of interface's elements
        text1.setText("Good morning");

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/main_icon.png")));
        imageView.setImage(image);

        label1.setText("Wybierz grzejnik");

        // listView
        HeatersList heatersList = new HeatersList();
        ObservableList<String> availablePhrases = heatersList.getAvailablePhrases();
        listView.setItems(availablePhrases);

        //implementation of listView's logic - dynamic filtr a suggestions of heatersModels
        textField1.textProperty().addListener((observable, oldValue, newValue) -> {
            listView.setItems(availablePhrases.filtered(phrase -> phrase.startsWith(newValue)));
        });

    }

    @FXML
    private void enterPressedAction(ActionEvent event) {
        textField1.setPromptText("np.1380.000");

        String searchHeater = textField1.getText();

        // skipping to resultWindow
        ResultWindow resultWindow = new ResultWindow(primaryStage);
        Scene resultScene = resultWindow.getResultScene();
        primaryStage.setScene(resultScene);

        //clearing the listView after skipt to resultWindow
        listView.getItems().clear();
    }

    public Scene getSearchWindow() {
        return searchWindow;
    }


}

