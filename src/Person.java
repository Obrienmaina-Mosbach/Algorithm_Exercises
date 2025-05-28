import java.util.Scanner;
import java.util.ArrayList;

public class Person {

    private int personID;
    private String firstName;
    private String surName;
    private int personAge;

    public Person(int personID, String firstName, String surName, int personAge){
        this.personID = personID;
        this.firstName = firstName;
        this.surName = surName;
        this.personAge = personAge;
    }

    //getters
    public int getPersonID() {
        return personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getPersonAge() {
        return personAge;
    }

    //setters
    public void setPersonID(int newPersonID){
        this.personID = newPersonID;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public void setSurName(String newSurname){
        this.surName = newSurname;
    }

    public void setPersonAge(int newPersonAge){
        this.personAge = newPersonAge;
    }

    public static void main(String[] args){
        Person myNewPersonObject = new Person(9843, "Ulia", "Mendez", 19);
        myNewPersonObject.setPersonAge(16);
        System.out.println(myNewPersonObject.getPersonAge());
    }

    @Override
    public String toString() {
        return firstName + " " + surName + " is " + personAge + ".";
    }


}

