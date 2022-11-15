package org.example;

public class OnSiteStudent extends Student{
    private String campusAddress;

    public OnSiteStudent(String name, String surname, int age, String campusAddress) {
        super(name, surname, age);
        this.campusAddress = campusAddress;
    }

    public String getCampusAddress() {
        return campusAddress;
    }

    public void setCampusAddress(String campusAddress) {
        this.campusAddress = campusAddress;
    }
}
