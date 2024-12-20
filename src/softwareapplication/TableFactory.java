/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapplication;

/**
 *
 * @author Firefox
 */
public class TableFactory {
     // Factory method to create tables based on the provided type
    public static Table createTable(String tableType) {
        switch (tableType) {
            case "Regular":
                // Create a regular table
                return new Table() {
                    @Override
                    public String getTableType() {
                        return "Regular Table";
                    }
                };
            case "VIP":
                // Create a VIP table
                return new Table() {
                    @Override
                    public String getTableType() {
                        return "VIP Table";
                    }
                };
            case "Outdoor":
                // Create an outdoor table
                return new outdoorTable();
            default:
                throw new IllegalArgumentException("Invalid table type");  // Invalid table type
        }
    }
}
