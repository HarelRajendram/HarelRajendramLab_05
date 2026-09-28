package com.mycompany.lab_05harelrajendram;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    Label statusLabel = new Label();
    @Override
    public void start(Stage stage) {
        
        GridPane grid = new GridPane();
        String[] bags = {"Full Decorative", "Beaded", "Pirate Design",
        "Fringed", "Leather", "Plain"};
        
        ObservableList<String> bagList = FXCollections.observableArrayList(bags);
        
        ListView<String> bag = new ListView<>(bagList);
        
        String bagType = bag.getSelectionModel().getSelectedItem();
        
        ComboBox<String> numList = new ComboBox<>();
        numList.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
        String amount = numList.getValue();
        
        Button orderBtn = new Button();
        Button clearBtn = new Button();
        
        RadioButton size1 = new RadioButton();
        RadioButton size2 = new RadioButton();
        RadioButton size3 = new RadioButton();
        
        ToggleGroup group = new ToggleGroup();
        group.getToggles().addAll(size1,size2,size3);
        
        grid.add(orderBtn,0,0);
        grid.add(clearBtn,0,1);
        
        grid.add(size1,1,0);
        grid.add(size2,1,0);
        grid.add(size3,1,0);
        
        grid.add(numList, 2, 3);
        
        
        orderBtn.setOnAction(e -> {
            System.out.println("You ordered " + amount + bagType);
        });
        
        Scene scene = new Scene(grid,300,400);
       
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