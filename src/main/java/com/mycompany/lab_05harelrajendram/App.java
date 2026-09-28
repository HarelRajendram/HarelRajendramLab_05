package com.mycompany.lab_05harelrajendram;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    
    @Override
    public void start(Stage stage) {
        String[] bags = {"Full Decorative", "Beaded", "Pirate Design",
        "Fringed", "Leather", "Plain"};
        
        ObservableList<String> bagList = FXCollections.observableArrayList(bags);
        
        ListView<String> bag = new ListView<>(bagList);
        
        ComboBox<Integer> numList = new ComboBox<>();
        numList.getItems().addAll
        
        Button orderBtn = new Button();
        Button clearBtn = new Button();

        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private static class SecondWindow {

        public SecondWindow() {
        }
    }

}