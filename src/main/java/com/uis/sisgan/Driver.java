package com.uis.sisgan;

public class Driver extends User{

    private String id_driving_license;

    public Driver(String email, String password) {
        super(email, password);
    }

    public String getIdDrivingLicense() {
        return id_driving_license;
    }

    public void setIdDrivingLicense(String id_driving_license) {
        this.id_driving_license = id_driving_license;
    }



}
