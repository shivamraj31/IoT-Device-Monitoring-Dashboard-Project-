package com.iotmonitoring;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a simple text to show on the dashboard
        Text deviceStatusText = new Text("Device Status: Online");
        
        // Set up the layout
        StackPane root = new StackPane();
        root.getChildren().add(deviceStatusText);
        
        // Create the scene
        Scene scene = new Scene(root, 300, 250);
        
        // Set the title of the window
        primaryStage.setTitle("IoT Device Monitoring Dashboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
