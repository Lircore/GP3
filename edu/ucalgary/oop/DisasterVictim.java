package edu.ucalgary.oop;


import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List; 
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String birthDate;
    private static AtomicInteger counter = new AtomicInteger(0);
    private final int ASSIGNED_SOCIAL_ID;
    private List<FamilyRelation> familyConnections;
    private List<MedicalRecord> medicalRecords;
    private List<Supply> personalBelongings;
    private final String ENTRY_DATE;
    private String gender;
    private String comments;
    
    private static final Pattern DATE_PATTERN = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");



    // Constructor for when birthDate is unknown
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        if(!isValidDateFormat(ENTRY_DATE)) {
            throw new IllegalArgumentException("The entered date is invalid");
        }
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
        this.familyConnections = new ArrayList<FamilyRelation>();
        this.medicalRecords = new ArrayList<MedicalRecord>();
        this.personalBelongings = new ArrayList<Supply>();
    }

    // Constructor for when birthDate is known
    public DisasterVictim(String firstName, String ENTRY_DATE, String birthDate) {
        if(!isValidDateFormat(ENTRY_DATE)) {
            throw new IllegalArgumentException("The entered date is invalid");
        } else if(convertDateStringToInt(birthDate) > convertDateStringToInt(ENTRY_DATE)) {
            throw new IllegalArgumentException("The entered date is invalid");
        }
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.setDateOfBirth(birthDate);
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
    }
    // Getters and Setters
    // Based on the UML we need:
    // - FirstName
    // - LastName
    // - birthDate (if applicable)
    // - AssignedSocialID
    // - MedicalRecords
    // - PersonalBelongings
    // - EntryDate
    // - Comments
    // - Gender

    // Methods
    // Based off the UML we need:
    // - addPersonalBelonging
    // - removePersonalBelonging
    // - addFamilyConnection
    // - removeFamilyConnection
    // - addMedicalRecord
    // - generateSocialID
    // - isValidDateFormat
    // - convertDateStringToInt

    //FirstName functions
    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    //LastName functions
    public String getLastName() { return this.lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    // Date functions
    public String getDateOfBirth() { return this.birthDate; } 
    public void setDateOfBirth(String birthDate) {
        if (!isValidDateFormat(birthDate)) {
            throw new IllegalArgumentException("Invalid date format");
        }
        this.birthDate = birthDate;
    }
    public String getEntryDate() { return this.ENTRY_DATE; }
    
    private boolean isValidDateFormat(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }
    
    private int convertDateStringToInt(String dateStr) {
        return Integer.parseInt(dateStr.replaceAll("-", ""));
    }

    // SocialID functions
    public int getAssignedSocialID() { return ASSIGNED_SOCIAL_ID; }
    private int generateSocialID() {
        return counter.incrementAndGet();
    }

    //Comments functions
    public String getComments() { return this.comments; }
    public void setComments(String comments) { this.comments = comments; }
    

    //Gender functions
    public String getGender() { return this.gender; }
    public void setGender(String gender) { this.gender = gender.toLowerCase(); }

    // Family relationship functions
    public FamilyRelation[] getFamilyConnections() {
        return this.familyConnections.toArray(new FamilyRelation[0]);
    }
    public void setFamilyConnections(FamilyRelation[] connections) {
        this.familyConnections = new ArrayList<FamilyRelation>(Arrays.asList(connections));
    }
    public void addFamilyConnection(FamilyRelation record) {
        this.familyConnections.add(record);
    }
    public void removeFamilyConnection(FamilyRelation exRelation) {
        this.familyConnections.remove(exRelation);
    }

    // Medical Record Functions
    public MedicalRecord[] getMedicalRecords() {
        return this.medicalRecords.toArray(new MedicalRecord[0]);
    }
    public void setMedicalRecords(MedicalRecord[] records) {
        this.medicalRecords = new ArrayList<MedicalRecord>(Arrays.asList(records));
    }
    public void addMedicalRecord(MedicalRecord record) {
        this.medicalRecords.add(record);
    }

    //Personal Belonging Functions
    public Supply[] getPersonalBelongings() {
        return this.personalBelongings.toArray(new Supply[0]);
    }
    public void setPersonalBelongings(Supply[] belongings) {
        this.personalBelongings = new ArrayList<Supply>(Arrays.asList(belongings));
    }
    public void addPersonalBelonging(Supply supply) {
        this.personalBelongings.add(supply);
    }
    public void removePersonalBelonging(Supply unwantedSupply) {
        this.personalBelongings.remove(unwantedSupply);
    }

}
