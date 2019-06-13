/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482_david_kruggel.model;

/**
 *
 * @author dkruggel
 */
public class Outsourced extends Part {
    private String companyName;

    //Main constructor
    public Outsourced(int id, String name, double price, int stock, int min, int max, String machineId) {
        
    }

    //Default constructor
    public Outsourced() {
    }

    //Mutators

    //Set company name
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //Accessors

    //Get machine id
    public String getCompanyName() {
        return companyName;
    }
}
