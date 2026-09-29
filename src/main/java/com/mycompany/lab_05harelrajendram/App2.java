/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_05harelrajendram;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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
        
        ComboBox<String> Beverage = new ComboBox();
        ComboBox<String> Appetizer  = new ComboBox();      
        ComboBox<String> mainCourse = new ComboBox();
        ComboBox<String> Dessert = new ComboBox();  
        
        Beverage.getItems().addAll("Coffee","Tea","Soft Drink","Water","Milk","Juice");
        Appetizer.getItems().addAll("Soup","Salad","Spring Rolls","Garlic Bread","Chips and Salsa");
        mainCourse.getItems().addAll("Steak","Grilled Chicken","Chicken Alfredo","Turkey Club");
        Dessert.getItems().addAll("Apple Pie","Carrot Cake","Mud Cake","Pudding","Apple Crisp");
        
        String bev = Beverage.getValue().toString();
        String appet = Appetizer.getValue().toString();
        String mainC = mainCourse.getValue().toString();
        String dess = Dessert.getValue().toString();
        
        Map<String, Double> menuPrices = new HashMap<>();
        menuPrices.put("Coffee", 2.50);
        menuPrices.put("Tea", 2.00);
        menuPrices.put("Soft Drink", 1.75);
        menuPrices.put("Water", 2.95);
        menuPrices.put("Milk", 1.50);
        menuPrices.put("Juice", 2.50);

        // Appetizers
        menuPrices.put("Soup", 4.50);
        menuPrices.put("Salad", 3.75);
        menuPrices.put("Spring Rolls", 5.25);
        menuPrices.put("Garlic Bread", 3.00);
        menuPrices.put("Chips and Salsa", 6.95);

        // Main Courses
        menuPrices.put("Steak", 15.00);
        menuPrices.put("Grilled Chicken", 13.50);
        menuPrices.put("Chicken Alfredo", 13.95);
        menuPrices.put("Turkey Club", 11.90);
        menuPrices.put("Shrimp Scampi", 18.99);
        menuPrices.put("Pasta", 11.75);
        menuPrices.put("Fish and Chips", 12.25);

        // Desserts
        menuPrices.put("Apple Pie", 5.95);
        menuPrices.put("Carrot Cake", 4.50);
        menuPrices.put("Mud Pie", 4.75);
        menuPrices.put("Pudding", 3.25);
        menuPrices.put("Apple Crisp", 5.98);
                
        grid.add(new Label("Beverage"),0,0);
        grid.add(Beverage,1,0);
        
        grid.add(new Label("Appetizer"),0,0);
        grid.add(Appetizer,1,0);
        
        grid.add(new Label("Main Course"),0,0);
        grid.add(mainCourse,1,0);
        
        grid.add(new Label("Dessert"),0,0);
        grid.add(Dessert,1,0);
        
        Scene scene = new Scene(grid, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    private void calculateBill() {
    
    }
 public static void main(String[] args) {
        launch(args);
    }   
}
