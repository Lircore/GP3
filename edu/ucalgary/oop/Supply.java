package edu.ucalgary.oop;

public class Supply {
    private String type;
    private int quantity;

    public Supply(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    // Type Functions
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    // Quantity functions
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
