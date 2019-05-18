package inventorysystem;

import inventorysystem.Inventory;

public abstract class Part extends Inventory {
    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;

    //Main constructor
    public Part(int id, String name, double price, int stock, int min, int max) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    //Default constructor
    public Part() {        
    }

    /*Below are the mutators for this class
      I used parameter names identical to the members of the
      class for my benefit (and anyone else's that would theoretically use
      this program) for clarity when calling these methods.
    */

    //Set id
    public void setId(int id) {
        this.id = id;
    }

    //Set name
    public void setName(String name) {
        this.name = name;
    }

    //Set price
    public void setPrice(double price) {
        this.price = price;
    }

    //Set stock
    public void setStock(int stock) {
        this.stock = stock;
    }

    //Set min
    public void setMin(int min) {
        this.min = min;
    }

    //Set max
    public void setMax(int max) {
        this.max = max;
    }

    //Set price at max?
    public void setPrice(int max) {
        this.price = max;
    }

    //Below are the accessors for this class

    //Get id
    public int getId() {
        return id;
    }

    //Get name
    public String getName() {
        return name;
    }

    //Get price
    public double getPrice() {
        return price;
    }

    //Get stock
    public int getStock() {
        return stock;
    }

    //Get min
    public int getMin() {
        return min;
    }

    //Get max
    public int getMax() {
        return max;
    }
}