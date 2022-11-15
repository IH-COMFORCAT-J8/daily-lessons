package org.example;

public class RemoteStudent extends Student {

    private String zoomLink;

    public RemoteStudent(String name, String surname, int age, String zoomLink) {
        super(name, surname, age);
        this.zoomLink = zoomLink;
    }

    public String getZoomLink() {
        return zoomLink;
    }

    public void setZoomLink(String zoomLink) {
        this.zoomLink = zoomLink;
    }
}
