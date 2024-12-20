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
public class OutdoorTableAdapter extends Table {
private outdoorTable outdoorTable;
// Constructor to initialize the adapter with an outdoor table
    public OutdoorTableAdapter(outdoorTable outdoorTable) {
        this.outdoorTable = outdoorTable;
    }  // Overriding the getTableType method to adapt the outdoor table to the generic Table type  

    @Override
    public String getTableType() {
        return outdoorTable.getTableType();  // Return the outdoor table type
    }
    
}
