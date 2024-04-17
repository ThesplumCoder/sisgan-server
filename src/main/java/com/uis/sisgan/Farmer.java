package com.uis.sisgan;

import java.security.PrivateKey;

public class Farmer extends User {

    private String mark;
    private String farm_name;


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
        return farm_name;
    }

    public void setFarmName(String farm_name) {
        this.farm_name = farm_name;
    }

}
