package com.uis.sisgan;

public abstract class User {
    private String first_name;
    private String last_name;
    private String password;
    private String birth_date;
    private String email;
    private String id_card;

    public User(String email ,String password) {
        this.email = email;
        this.password = password;

    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return id_card;
    }

    public void setIdCard(String id_card) {
        this.id_card = id_card;
    }
}
