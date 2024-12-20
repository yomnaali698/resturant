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
public class paymentSystem {
     private static paymentSystem instance;  // Single instance of PaymentSystem

    // Private constructor to prevent instantiation
    private paymentSystem() {}

    // Method to get the singleton instance of PaymentSystem
    public static paymentSystem getInstance() {
        if (instance == null) {
            instance = new paymentSystem();  // Create an instance if it doesn't exist
        }
        return instance;  // Return the existing instance
    }

    // Method to process the payment
    public void processPayment(String customerName, double amount) {
        System.out.println("Processing payment of " + amount + " for " + customerName);
    }
}
