package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Person {

    private String id;
    private String name;
    private int age;
    private String occupation;


    public Person(String id, String name, int age, String occupation) {
        this.id = id;
        this.name = name;
        setAge(age);
        this.occupation = occupation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 ) throw new IllegalArgumentException("The age must be greater than 0");
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }



    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(this.getId() + "lkasd", getName(), getAge(), getOccupation());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(occupation, person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, occupation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public static void writePersonToFile(Person person){
        try {
            FileWriter fileWriter = new FileWriter("person.txt");
            fileWriter.write(person.toString());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
