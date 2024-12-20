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
public class MenuItemFactory {
   // Factory method to create menu items based on category and description
    public static MenuItem createMenuItem(String category, String description) {
        switch (category) {
            case "Appetizers":
                return new MenuItem("Appetizer: " + description);
            case "Main Courses":
                return new MenuItem("Main Course: " + description);
            case "Desserts":
                return new MenuItem("Dessert: " + description);
            default:
                throw new IllegalArgumentException("Invalid category");  // Invalid category
        }
        
    }
    // Method to populate available items for each category
    public static void populateMenu() {
        // Displaying appetizers
        System.out.println("Appetizers: ");
        System.out.println("- Tomato Soup");
        System.out.println("- Fattoush Salad");
        System.out.println("- Mini Samosa");
        System.out.println("- Seafood Appetizer");

        // Displaying main courses
        System.out.println("Main Courses: ");
        System.out.println("- Chicken Mandi");
        System.out.println("- Grilled Steak");
        System.out.println("- Pesto Pasta");
        System.out.println("- Beef Shawarma");

        // Displaying desserts
        System.out.println("Desserts: ");
        System.out.println("- Kunafa");
        System.out.println("- Basbousa");
        System.out.println("- Cheesecake");
        System.out.println("- Ice Cream");
    } 
}
