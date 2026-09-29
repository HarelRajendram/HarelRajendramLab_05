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
import javafx.scene.control.Button;
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
    private final Map<String, Double> menuPrices = new HashMap<>();
    Label txtSubtotal;
    Label txtTax;
    Label txtTip;
    Label txtSumtotal;
    
    private ComboBox<String> beverage;
    private ComboBox<String> appetizer;
    private ComboBox<String> mainCourse;
    private ComboBox<String> dessert;
    
    private Slider slider;
    
    @Override 
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        
        menu();
        
        beverage = new ComboBox<>();
        appetizer = new ComboBox<>();
        mainCourse = new ComboBox<>();
        dessert = new ComboBox<>(); 
        
        beverage.getItems().addAll("Coffee","Tea","Soft Drink","Water","Milk","Juice");
        appetizer.getItems().addAll("Soup","Salad","Spring Rolls","Garlic Bread","Chips and Salsa");
        mainCourse.getItems().addAll("Steak","Grilled Chicken","Chicken Alfredo","Turkey Club");
        dessert.getItems().addAll("Apple Pie","Carrot Cake","Mud Cake","Pudding","Apple Crisp");
        
        Button clearBtn = new Button("Clear");
        txtSubtotal = new Label("Sub Total: $0.00");
        txtTax = new Label("Tax: $0.00");
        txtTip = new Label("Tip: $0.00");
        txtSumtotal = new Label("Total Sum: $0.00");
        
                
        grid.add(new Label("Beverage"),0,0);
        grid.add(beverage,1,0);
        
        grid.add(new Label("Appetizer"),0,1);
        grid.add(appetizer,1,1);
        
        grid.add(new Label("Main Course"),0,2);
        grid.add(mainCourse,1,2);
        
        grid.add(new Label("Dessert"),0,3);
        grid.add(dessert,1,3);
        
        grid.add(txtSubtotal, 0, 5);
        grid.add(txtTax, 0, 6);
        grid.add(txtTip, 0, 7);
        grid.add(txtSumtotal, 0, 8);
        grid.add(clearBtn, 1, 9);
        
        slider = new Slider(0 ,20 ,0);
        slider.setShowTickLabels(true);
        
        clearBtn.setOnAction(e -> {
        beverage.setValue(null);
        appetizer.setValue(null);
        mainCourse.setValue(null);
        dessert.setValue(null);
        slider.setValue(0);
            calculate();
        });
        
        slider.valueProperty().addListener((obs, oldV, newV ) -> calculate());
 
        beverage.setOnAction(e -> calculate());
        appetizer.setOnAction(e -> calculate());
        mainCourse.setOnAction(e -> calculate());
        dessert.setOnAction(e -> calculate());
        
        
        grid.add(slider,2,0);
        Scene scene = new Scene(grid, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Restaurant Bill Calculator");
        stage.show();
    }
    private void calculate() {
        double subTotal = 0.0;
        
        subTotal += getItemPrice(beverage.getValue());
        subTotal += getItemPrice(appetizer.getValue());
        subTotal += getItemPrice(mainCourse.getValue());
        subTotal += getItemPrice(dessert.getValue());
        
        Double tax = subTotal * 0.13;
        double tip = subTotal * (slider.getValue() / 100.0);
        double totalSum = subTotal + tax + tip;
        
        txtSubtotal.setText("Sub Total: " + subTotal);
        txtTax.setText("Tax: " + tax);
        txtTip.setText("Tip: " + tip);
        txtSumtotal.setText("Total Sum: " + totalSum);
    
    }
    private double getItemPrice(String selectedItem) {
        if ( selectedItem != null && menuPrices.containsKey(selectedItem)) {
            return menuPrices.get(selectedItem);
        }
        return 0.0;
    }
    private void menu() {
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
    }
 public static void main(String[] args) {
        launch(args);
    }   
}
