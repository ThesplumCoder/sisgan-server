package com.uis.sisgan;

public class Driver extends User{

    private String idDrivingLicense;

    public Driver(String email, String password) {
        super(email, password);
    }

    public String getIdDrivingLicense() {
        return idDrivingLicense;
    }

    public void setIdDrivingLicense(String idDrivingLicense) {
        this.idDrivingLicense = idDrivingLicense;
    }



}
