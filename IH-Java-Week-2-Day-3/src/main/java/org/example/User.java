package org.example;

public class User {

    private long id;
    private String name;
    private Status status;

    public User(long id, String name, Status status) {
        this.id = id;
        this.name = name;
        setStatus(status);
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
