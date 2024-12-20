/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapplication;

import java.util.List;

/**
 *
 * @author Firefox
 */
public class order {
     private String customerName;  // Customer name
    private List<MenuItem> items;  // List of items in the order
    private Table table;  // Table for the order

    // Constructor to initialize the order
    public order(String customerName, List<MenuItem> items, Table table) {
        this.customerName = customerName;
        this.items = items;
        this.table = table;
    }

    // Method to print the details of the order
    public void printOrderDetails() {
        System.out.println("Order for " + customerName);
        System.out.println("Table Type: " + table.getTableType());
        System.out.println("Items: ");
        for (MenuItem item : items) {
            System.out.println("- " + item.getName());
        }
    }
}
