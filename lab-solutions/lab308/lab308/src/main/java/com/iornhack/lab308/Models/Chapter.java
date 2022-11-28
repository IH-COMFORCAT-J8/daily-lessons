package com.iornhack.lab308.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    private Member president;

    private String district;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Member> memberList;


    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;


    public Chapter(String name, Member president, String district, Association association) {
        this.name = name;
        this.president = president;
        this.district = district;
        this.memberList = new ArrayList<>();
        this.association = association;
    }

    public Chapter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
}
