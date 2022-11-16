package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private List<Person> personList;

    public PersonList(List<Person> personList) {
        this.personList = personList;
    }

    public PersonList(){
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(Person person) {
        this.personList.add(person);
    }

    public Person findByName(String name){
        if(name.split(" ").length != 2) throw new IllegalArgumentException("Name is not properly formatted");

        for(Person p : personList){
            if(p.getName().equals(name)) return p;
        }
        throw new IllegalArgumentException("The person does not exist");
    }
}
