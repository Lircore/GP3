/*
Completed by: Kareem Hussein
Email: kareem.hussein1@ucalgary.ca
*/

package edu.ucalgary.oop;

import java.util.regex.Pattern;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;
    private static final Pattern DATE_PATTERN = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");


    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided,
            Location lastKnownLocation) {
        if (!isValidDateFormat(dateOfInquiry)) {
            throw new IllegalArgumentException("Invalid date format. Use YYYY-MM-DD.");
        }
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    // Inquirer Functions
    public Inquirer getInquirer() { return inquirer; }
    public void setInquirer(Inquirer inquirer) { this.inquirer = inquirer; }

    // missing persons functions
    public DisasterVictim getMissingPerson() { return missingPerson; }
    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    // Date Functions
    public String getDateOfInquiry() { return dateOfInquiry; }
    
    public void setDateOfInquiry(String dateOfInquiry) {
        if (!isValidDateFormat(dateOfInquiry)) {
            throw new IllegalArgumentException("Invalid date format. Use YYYY-MM-DD.");
        }
        this.dateOfInquiry = dateOfInquiry;
    }
    private boolean isValidDateFormat(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }

    // Info functions
    public String getInfoProvided() { return infoProvided; }
    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    // Location Functions
    public Location getLastKnownLocation() { return lastKnownLocation; }
    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    //Log Functions
    public String getLogDetails() {
        return String.format(
                "Inquirer: %s, Missing Person: %s, Date of Inquiry: %s, Info Provided: %s, Last Known Location: %s",
                inquirer.getFirstName(), missingPerson.getFirstName(), dateOfInquiry, infoProvided,
                lastKnownLocation.getName());
    }
    
}
