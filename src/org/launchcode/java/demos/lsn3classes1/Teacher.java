package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public void setFirstName(String aFirstName){
        this.firstName = aFirstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String aLastName){
        this.lastName = aLastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setSubject(String aSubject){
        this.subject = aSubject;
    }

    public void setYearsTeaching(int aNumber){
        this.yearsTeaching = aNumber;
    }
}
