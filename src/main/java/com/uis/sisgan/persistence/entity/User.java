package com.uis.sisgan.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
public abstract class User {


    @GeneratedValue
    @Id
    @Column(name = "id_user")
    private String userId;

    @Column(name="id_card")
    private String cardId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    private String password;

    @Column(name= "birth_date")
    private Date birthDate;
    
    private String email;

    
    

    public User(String email ,String password) {
        this.email = email;
        this.password = password;

    }

    public User() {

    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birth_date) {
        this.birthDate = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @OneToMany(mappedBy = "users")
    private List<Rol> roles;

    public String getCardId() {
        return cardId;
    }
    public void setCardId(String id_card) {
        this.cardId = id_card;
    }
}
