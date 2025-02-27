/*
Completed by: Aaron Montesines
Email: aaron.montesines@ucalgary.ca
*/
package edu.ucalgary.oop;

public class FamilyRelation {
  // Variables
  private DisasterVictim personOne;
  private String relationshipTo;
  private DisasterVictim personTwo;

  public FamilyRelation(DisasterVictim firstPerson,
        String connectedTo, 
        DisasterVictim secondPerson
        ) {
        this.personOne = firstPerson;
        this.relationshipTo = connectedTo;
        this.personTwo = secondPerson;
    }

  
  // functions needed:
  // - getPersonOne()
  // - setPersonOne()
  // - getRelationshipTo()
  // - setRelationshipTo()
  // - getPersonTwo()
  // - setPersonTwo()

  // personOne functions
  public DisasterVictim getPersonOne() { return personOne; }
  public void setPersonOne(DisasterVictim person) {
    this.personOne = person;
  }

  //personTwo functions
  public DisasterVictim getPersonTwo() { return personTwo; }
  public void setPersonTwo(DisasterVictim person){
    this.personTwo = person;
  }

  //Relationship functions
  public String getRelationshipTo() { return relationshipTo; }
  public void setRelationshipTo(String connectedTo) {
    this.relationshipTo = connectedTo;
  }
}
