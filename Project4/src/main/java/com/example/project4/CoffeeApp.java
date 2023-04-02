package com.example.project4;
import rucafe.*

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CoffeeApp {
    @FXML
    private MenuButton coffeeSize;

    private String size;
    @FXML
    public void selectedCoffeeSize(ActionEvent event) {
        MenuItem item = (MenuItem) event.getSource();
        size = item.getText();
        coffeeSize.setText(size);
    }

    @FXML



}
