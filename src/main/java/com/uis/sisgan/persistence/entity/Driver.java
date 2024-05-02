package com.uis.sisgan.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import org.springframework.http.InvalidMediaTypeException;

import java.util.List;


@Entity
public class Driver extends User {

    @Column(name="id_driving_license")
    private String drivingLicenseId;

    @OneToMany(mappedBy = "drivers")
    private List<InternalMovementGuide> internalMovementGuides;

    public Driver(String email, String password) {
        super(email, password);
    }

    public Driver() {

    }


    public String getDrivingLicenseId() {
        return drivingLicenseId;
    }

    public void setDrivingLicenseId(String drivingLicenseId) {
        this.drivingLicenseId = drivingLicenseId;
    }



}
