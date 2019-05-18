package inventorysystem;

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