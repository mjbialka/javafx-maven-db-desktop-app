package com.marcin.app.gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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

    public ResultWindow(Stage primaryStage) {
        this.primaryStage = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/marcin/app/gui/resultWindow.fxml"));
        loader.setController(this);

        try {
            resultScene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        //initialization of interface's elements

        label2.setText("Wynik dla grzejnika: ");
        // var text1 is equal to value of String convector from Convector class

        //tableView1 have 4 columns with

        label3.setText("Konwektor");

    }

    public Scene getResultScene() {
        return resultScene;
    }
}