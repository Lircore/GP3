package edu.ucalgary.oop;


import java.util.ArrayList; 
// Array list will be used throughout this java file and most lines using this
// Library has taken insiration from https://www.w3schools.com/java/java_arraylist.asp
import java.util.Arrays;
import java.util.List; // To make somethings easier this library is implemented
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String birthDate;
    private static AtomicInteger counter = new AtomicInteger(0);
    private final int SOCIAL_ID_NUMBER;
    private List<FamilyRelation> familyRelationship;
    private List<MedicalRecord> medicalRecords;
    private List<Supply> personalBelongings;
    private final String DATE_OF_ENTRY;
    private String gender;
    private String comments;
    private static final Pattern DATE_PATTERN = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");


    // Constructor for when birthDAte is unknown
    public DisasterVictim(String firstName, String DATE_OF_ENTRY) {
        if(!isValidDateFormat(DATE_OF_ENTRY)) {
            throw new IllegalArgumentException("Invalid date format.");
        }
        this.firstName = firstName;
        this.DATE_OF_ENTRY = DATE_OF_ENTRY;
        this.SOCIAL_ID_NUMBER = generateSocialID();
        this.familyRelationship = new ArrayList<FamilyRelation>();
        this.medicalRecords = new ArrayList<MedicalRecord>();
        this.personalBelongings = new ArrayList<Supply>();
    }

    // Constructor for when birthDate is known
    public DisasterVictim(String firstName, String DATE_OF_ENTRY, String birthDate) {
        if(!isValidDateFormat(DATE_OF_ENTRY)) {
            throw new IllegalArgumentException("Invalid date format.");
        } else if(convertDateStringToInt(birthDate) > convertDateStringToInt(DATE_OF_ENTRY)) {
            throw new IllegalArgumentException("Invalid entry date.");
        }
        this.firstName = firstName;
        this.DATE_OF_ENTRY = DATE_OF_ENTRY;
        this.setDateOfBirth(birthDate);
        this.SOCIAL_ID_NUMBER = generateSocialID();
    }

}
