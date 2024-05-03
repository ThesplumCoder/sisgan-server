package com.uis.sisgan.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Propietary")
public class Propietary extends User {

    @Column(name = "mark")
    private String mark;

    @Column(name="farm_name")
    private String farmName;
}
