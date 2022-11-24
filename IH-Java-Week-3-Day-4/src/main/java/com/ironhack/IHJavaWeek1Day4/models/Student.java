package com.ironhack.IHJavaWeek1Day4.models;

import com.ironhack.IHJavaWeek1Day4.models.embedded.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Embedded
    private Address postalAddress;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "address", column = @Column(name = "physical_address")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "physical_postal_code")),
            @AttributeOverride(name = "city", column = @Column(name = "physical_city")),
            @AttributeOverride(name = "country", column = @Column(name = "physical_country"))
    })
    private Address physicalAddress;
    @OneToOne(mappedBy = "student")
    private FinalAssignment finalAssignment;

    /*
    Por defecto, para evitar un consumo de memoria excesiva, al llamar a un objeto de tipo Student de la base de datos no traerá todos sus laboratorios. Esto podemos solucionarlo o bien creándonos un método en el repositorio labs o cambiando el fetch a EAGER
     */
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    List<Lab> labs;

    public Student() {

    }

    public Student(String firstName, String lastName, Address postalAddress, Address physicalAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalAddress = postalAddress;
        this.physicalAddress = physicalAddress;
    }

    public Address getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(Address physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Address getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }

    public FinalAssignment getAssignment() {
        return finalAssignment;
    }

    public void setAssignment(FinalAssignment finalAssignment) {
        this.finalAssignment = finalAssignment;
    }

    public FinalAssignment getFinalAssignment() {
        return finalAssignment;
    }

    public void setFinalAssignment(FinalAssignment finalAssignment) {
        this.finalAssignment = finalAssignment;
    }

    public List<Lab> getLabs() {
        return labs;
    }

    public void setLabs(List<Lab> labs) {
        this.labs = labs;
    }
}
