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
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
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
        double subTotal = 0.0;
        
        ComboBox<String> Beverage = new ComboBox();
        ComboBox<String> Appetizer  = new ComboBox();      
        ComboBox<String> mainCourse = new ComboBox();
        ComboBox<String> Dessert = new ComboBox();  
        
        Beverage.getItems().addAll("Coffee","Tea","Soft Drink","Water","Milk","Juice");
        Appetizer.getItems().addAll("Soup","Salad","Spring Rolls","Garlic Bread","Chips and Salsa");
        mainCourse.getItems().addAll("Steak","Grilled Chicken","Chicken Alfredo","Turkey Club");
        Dessert.getItems().addAll("Apple Pie","Carrot Cake","Mud Cake","Pudding","Apple Crisp");
        
        Label txtSubtotal = new Label();
        Label txtTax = new Label();
        Label txtTip = new Label();
        Label txtSumtotal = new Label();
        
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
        
        grid.add(new Label("Appetizer"),0,1);
        grid.add(Appetizer,1,1);
        
        grid.add(new Label("Main Course"),0,2);
        grid.add(mainCourse,1,2);
        
        grid.add(new Label("Dessert"),0,3);
        grid.add(Dessert,1,3);
        
        Slider slider = new Slider(0 ,20 ,0);
        
        
        
        String selectedBev = Beverage.getValue();
        
        if ( selectedBev != null && menuPrices.containsKey(selectedBev)) {
            double price = menuPrices.get(selectedBev);
            subTotal += price;
        }
        
        String selectedAppe = Appetizer.getValue();
        if ( selectedAppe != null && menuPrices.containsKey(selectedAppe)) {
            double price = menuPrices.get(selectedAppe);
            subTotal += price;
        }
        String selectedMainc = mainCourse.getValue();
        if ( selectedMainc != null && menuPrices.containsKey(selectedMainc)) {
            double price = menuPrices.get(selectedMainc);
            subTotal += price;
        }
        String selectedDess = Dessert.getValue();
        if ( selectedDess != null && menuPrices.containsKey(selectedDess)) {
            double price = menuPrices.get(selectedDess);
            subTotal += price;
        }
        Double tax = subTotal * 0.13;
        double tip = subTotal * (slider.getValue() / 100);
        double totalSum = subTotal + tax + tip;
        
        txtSubtotal.setText("Sub Total: " + subTotal);
        txtTax.setText("Tax: " + tax);
        txtTip.setText("Tip: " + tip);
        txtSumtotal.setText("Total Sum: " + totalSum);
                
        grid.add(slider,2,0);
        Scene scene = new Scene(grid, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    private void calculate() {
    
    }
    
 public static void main(String[] args) {
        launch(args);
    }   
}
