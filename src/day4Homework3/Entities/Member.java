package day4Homework3.Entities;

import day4Homework3.Abstracts.Entities;

public class Member implements Entities {
    private long nationalityNumber;
    private String firstName;
    private String lastName;
    private int dateYear;

    public Member(long nationalityNumber, String firstName, String lastName, int dateYear) {
        this.nationalityNumber = nationalityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateYear = dateYear;
    }

    public long getNationalityNumber() {
        return nationalityNumber;
    }

    public void setNationalityNumber(long nationalityNumber) {
        this.nationalityNumber = nationalityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateYear() {
        return dateYear;
    }

    public void setDateYear(int dateYear) {
        this.dateYear = dateYear;
    }
}
