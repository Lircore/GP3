/*
Completed by: Jindjeet Cheema 
Email: jindjeet.cheema@ucalgary.ca
*/

package edu.ucalgary.oop;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;


    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        setLocation(location);
        setTreatmentDetails(treatmentDetails);
        setDateOfTreatment(dateOfTreatment);
    }


    public Location getLocation() {
        return location;
    }


    public void setLocation(Location location) {
        if (location == null) {
            throw new IllegalArgumentException("Location cannot be null.");
        }
        this.location = location;
    }


    public String getTreatmentDetails() {
        return treatmentDetails;
    }


    public void setTreatmentDetails(String treatmentDetails) {
        if (treatmentDetails == null || treatmentDetails.trim().isEmpty()) {
            throw new IllegalArgumentException("Treatment details cannot be empty.");
        }
        this.treatmentDetails = treatmentDetails;
    }


    public String getDateOfTreatment() {
        return dateOfTreatment;
    }


    public void setDateOfTreatment(String dateOfTreatment) {
        if (dateOfTreatment == null || !dateOfTreatment.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date of treatment must be in YYYY-MM-DD format.");
        }
        this.dateOfTreatment = dateOfTreatment;
    }
}
