/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_05harelrajendram;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author 2534297
 */
public class App2 extends Application {
    @Override 
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        
        ComboBox<String>  beverage = new ComboBox();
        ComboBox<String> appetizer = new ComboBox();
        ComboBox<String> mainCourse = new ComboBox();
        ComboBox<String> dessert = new ComboBox();      
        
        beverage.getItems().addAll("Coffee","Tea","Soft Drink", "Water","Milk", "Juice");
        appetizer.getItems().addAll("Soup","Salad","Spring Rolls", "Garlic Bread","Chips and Salsa");
        mainCourse.getItems().addAll("Steak","Grilled Chicken","Chicken alfredo", "Turkey Club");
        dessert.getItems().addAll("Apple Pie","Carrot Cake","Mud Cake", "Pudding");
        
        ComboBox<Double> prices = new ComboBox();
        
    //    if (beverage.getItems() = "Coffee" ) {
        
    //    }
                
                
        Scene scene = new Scene(grid,600,600);
       
        stage.setScene(scene);
        stage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }   
}
