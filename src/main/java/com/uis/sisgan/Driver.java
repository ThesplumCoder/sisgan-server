package com.uis.sisgan;

public class Driver extends User{

    private String id_driving_license;

    public Driver(String email, String password) {
        super(email, password);
    }

    public String getId_driving_license() {
        return id_driving_license;
    }

    public void setId_driving_license(String id_driving_license) {
        this.id_driving_license = id_driving_license;
    }



}
