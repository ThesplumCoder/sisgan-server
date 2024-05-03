package com.uis.sisgan.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Transporter")
public class Transporter extends User {

    @Column(name="id_driving_license")
    private String idDrivingLicense;
}
