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
public class paymentproxy {
    private  paymentSystem paymentSystem;

    // Constructor to initialize the payment system
    public paymentproxy() {
        this.paymentSystem =  paymentSystem.getInstance();  // Get the singleton instance
    }

    // Method to process the payment with additional checks
    public  void processPayment(String customerName, double amount) {
        // Additional check or validation could be added here
    
        paymentSystem.processPayment(customerName, amount);  // Delegate to the real payment system
    }
}
