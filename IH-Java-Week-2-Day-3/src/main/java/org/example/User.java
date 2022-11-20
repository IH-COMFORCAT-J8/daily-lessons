package org.example;

public class User {

    private long id;
    private String name;
    private Status status;
    private String address;

    public User(long id, String name, Status status) {
        this.id = id;
        this.name = name;
        setStatus(status);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
