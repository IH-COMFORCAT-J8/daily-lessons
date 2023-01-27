package com.ironhack.netflix.models;

import com.ironhack.netflix.enums.*;
import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "users")
public  class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String profilePicture;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_media",
    joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "media_id")
    )
    private List<Media> favoriteMedia = new ArrayList<>();

    public User(String name, Status status, String profilePicture, Account account) {
        this.name = name;
        this.status = status;
        this.profilePicture = profilePicture;
        this.account = account;
    }

    public User() {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Media> getFavoriteMedia() {
        return favoriteMedia;
    }

    public void setFavoriteMedia(List<Media> favoriteMedia) {
        this.favoriteMedia = favoriteMedia;
    }

    public void addFavoriteMedia(Media media) {
        this.favoriteMedia.add(media);
    }
}
