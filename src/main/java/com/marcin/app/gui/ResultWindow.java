package com.marcin.app.gui;

import com.marcin.app.misc.ScreenBuilder;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ResultWindow {


    private Stage primaryStage;
    private Scene resultScene;
    @FXML
    private Text text2, text3;
    @FXML
    private Label label2, label3;
    @FXML
    private TextField textField3, textField4;
    @FXML
    private TableView<String> tableView1, tableView2;
    @FXML
    private Button button1, button2, button3;


    @FXML
    public void initialize(Stage primaryStage) {
        //initialization of interface's elements
        this.primaryStage=primaryStage;
        label2.setText("Wynik dla grzejnika: ");
        // var text1 is equal to value of String convector from Convector class

        //tableView1 have 4 columns with

        label3.setText("Konwektor");
        setButtons();
    }
    private void setButtons(){
        //                  Button 1
        button1.setOnAction(event -> {
            showAlert(Alert.AlertType.WARNING,"Title","Message");
        });
        //                  Button 2
        button2.setOnAction(event -> {
            System.out.println("Back to Home");

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/marcin/app/gui/searchWindow.fxml"));
            try {
                Parent parent = fxmlLoader.load();
                SearchWindow searchController = fxmlLoader.getController();
                searchController.initialize(primaryStage);
                Scene scene= ScreenBuilder.adjustScreen(primaryStage,parent);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        //                  Button 3
        button3.setOnAction(event -> {
            showAlert(Alert.AlertType.INFORMATION,"Title","Message");
        });

    }
    public void showAlert(Alert.AlertType type,String title,String message){
        Alert alert = new Alert(type);
//            Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    @FXML
    void pressTouch(MouseEvent event) {
        System.out.println("Press on Close btn");
        this.primaryStage.close();

    }
    public Scene getResultScene() {
        return resultScene;
    }
}