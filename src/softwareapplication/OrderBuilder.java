/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapplication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Firefox
 */
public class OrderBuilder {
     private String customerName;
    private List<MenuItem> items = new ArrayList<>();  // List to hold menu items
    private Table table;

    // Method to set the customer's name
    public OrderBuilder setCustomer(String customerName) {
        this.customerName = customerName;
        return this;  // Return the builder to allow method chaining
    }

    // Method to add a menu item to the order
    public OrderBuilder addItem(MenuItem item) {
        items.add(item);
        return this;  // Return the builder to allow method chaining
    }

    // Method to set the table for the order
    public OrderBuilder setTable(Table table) {
        this.table = table;
        return this;  // Return the builder to allow method chaining
    }

    // Method to build and return the final order
    public order build() {
        return new order(customerName, items, table);
    }

   
}
