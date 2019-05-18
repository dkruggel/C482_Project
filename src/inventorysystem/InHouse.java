package inventorysystem;

public class InHouse extends Part {
    private int machineId;

    //Main constructor
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineId) {
        
    }

    //Default constructor
    public InHouse() {
    }

    //Mutators

    //Set machine id
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    //Accessors

    //Get machine id
    public int getMachineId() {
        return machineId;
    }
}