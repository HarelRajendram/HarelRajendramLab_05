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
    
    @Override
    public void start(Stage stage) {
        //layout of the page
        Label statusLabel = new Label();
        GridPane grid = new GridPane();
        
        grid.setHgap(10);
        grid.setVgap(10);
        String[] bags = {"Full Decorative", "Beaded", "Pirate Design",
        "Fringed", "Leather", "Plain"};
        
        ObservableList<String> bagList = FXCollections.observableArrayList(bags);
        
        ListView<String> bag = new ListView<>(bagList);
        
        ComboBox<String> numList = new ComboBox<>();
        numList.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
       
        
        Button orderBtn = new Button("Order");
        Button clearBtn = new Button("Clear");
        
        RadioButton size1 = new RadioButton("Small");
        RadioButton size2 = new RadioButton("Medium");
        RadioButton size3 = new RadioButton("Large");
        
        ToggleGroup group = new ToggleGroup();
        group.getToggles().add(size1);
        group.getToggles().add(size2);
        group.getToggles().add(size3);
        
        grid.add(orderBtn,5,3);
        grid.add(clearBtn,6,3);
        
        grid.add(size1,1,0);
        grid.add(size2,2,0);
        grid.add(size3,3,0);
        
        grid.add(numList, 1, 3);
        
        orderBtn.setOnAction(e -> {
             String amount = numList.getValue();
             String bagType = bag.getSelectionModel().getSelectedItem();
             
            if (size1.isSelected()) {
                statusLabel.setText("You ordered " + amount + " Small " + bagType);
            }
            if (size2.isSelected()) {
                statusLabel.setText("You ordered " + amount + " Medium "+ bagType);
            }
            if (size3.isSelected()) {
                statusLabel.setText("You ordered " + amount + " Large " + bagType);
            }
            
        });
        grid.add(bag, 0, 0);
        grid.add(statusLabel,0,4);
        
        clearBtn.setOnAction(e -> {
        statusLabel.setText("Selected: None");
        });
        
        Scene scene = new Scene(grid,600,600);
       
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}