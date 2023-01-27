package com.ironhack.netflix.models;


import jakarta.persistence.*;

import java.util.*;

@Entity
public class emailAccount {

    @Id
    private String email;
    private String password;
    //Many accounts can have one plan
    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;
    //Una cuenta puede tener muchos Usuarios
    //si después del to es Many la propiedad debe ser una lista de objetos, si es to One, es un solo objeto

    /*
    - ¿Cómo se relaciona account con User?
    - Si te vas al atributo account en la clase user, verás la relación
     */
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    private List<User> users = new ArrayList<>();

    public Account(String email, String password, Plan plan) {
        this.email = email;
        this.password = password;
        this.plan = plan;
    }

    public Account(String email, String password, Plan plan, List<User> users) {
        this.email = email;
        this.password = password;
        this.plan = plan;
        this.users = users;
    }

    public Account() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
