/*
Completed by: Moyo Ogunjobi
Email: moyosoreoluwa.ogunjo@ucalgary.ca
*/

package edu.ucalgary.oop;

public class Inquirer {
    // Variables
    private String firstName;
    private String lastName;
    private String servicesPhoneNum;
    private String info;

    // Constructor
    public Inquirer(String firstName, String lastName, String servicesPhoneNum, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.servicesPhoneNum = servicesPhoneNum;
        this.info = info;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getServicesPhoneNum() {
        return servicesPhoneNum;
    }

    public String getInfo() {
        return info;
    }
}
