package com.uis.sisgan;

import java.security.PrivateKey;

public class Farmer extends User {

    private String mark;
    private String farmName;


    public Farmer(String email, String password) {
        super(email, password);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

}
