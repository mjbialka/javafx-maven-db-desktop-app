package com.marcin.app.gui;

import com.marcin.app.database.HeatersList;
import com.marcin.app.misc.ScreenBuilder;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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


    @FXML
    public void initialize(Stage primaryStage) {
        //initialization of interface's elements
        text1.setText("Good morning");
        textField1.setPromptText("np.1380.000");
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/main_icon.png")));
        imageView.setImage(image);
        this.primaryStage=primaryStage;
        label1.setText("Wybierz grzejnik");

        // listView
        HeatersList heatersList = new HeatersList();
        ObservableList<String> availablePhrases = heatersList.getAvailablePhrases();
        listView.setItems(availablePhrases);

        //implementation of listView's logic - dynamic filtr a suggestions of heatersModels
//        textField1.textProperty().addListener((observable, oldValue, newValue) -> {
//            listView.setItems(availablePhrases.filtered(phrase -> phrase.startsWith(newValue)));
//        });

    }

    @FXML
    private void enterPressedAction(KeyEvent event) {
        System.out.println("Pressed Enter");
        if(event.getCode()== KeyCode.ENTER){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/marcin/app/gui/resultWindow.fxml"));
            Parent parent = null;
            try {
                parent = fxmlLoader.load();
                ResultWindow resultWindow = fxmlLoader.getController();
                resultWindow.initialize(primaryStage);
                Scene scene = ScreenBuilder.adjustScreen(primaryStage,parent);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }}

        String searchHeater = textField1.getText();

    }
    public Scene getSearchWindow() {
        return searchWindow;
    }


}

