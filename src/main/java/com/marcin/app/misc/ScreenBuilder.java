package com.marcin.app.misc;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ScreenBuilder {
    public static Scene adjustScreen(Stage stage, Parent parent){
        // Transparent scene with rounded corners
        Group root = new Group();
        Scene scene = new Scene(root, Color.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);

        // A rounded-corner rectangle that covers the entire window
        Rectangle rectangle = new Rectangle(600, 400);
        rectangle.setArcWidth(40);
        rectangle.setArcHeight(40);
        rectangle.setFill(Color.WHITE); // Change the fill color as needed
        root.getChildren().add(rectangle);
        root.getChildren().add(parent); // Add your content to the scene
        return scene;
    }
}
