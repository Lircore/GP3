package edu.ucalgary.oop;

import java.util.ArrayList;

public class Location {
    // Variables
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants = new ArrayList<>();
    private ArrayList<Supply> supplies = new ArrayList<>();

    // Constructor
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Name getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Address getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Occupant methods
    public ArrayList<DisasterVictim> getOccupants() {
        return occupants;
    }

    public void setOccupants(ArrayList<DisasterVictim> occupants) {
        this.occupants = occupants;
    }

    public void addOccupant(DisasterVictim occupant) {
        this.occupants.add(occupant);
    }

    public void removeOccupant(DisasterVictim occupant) {
        this.occupants.remove(occupant);
    }

    // Supply methods
    public ArrayList<Supply> getSupplies() {
        return supplies;
    }

    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies;
    }

    public void addSupply(Supply supply) {
        this.supplies.add(supply);
    }

    public void removeSupply(Supply supply) {
        this.supplies.remove(supply);
    }
}
