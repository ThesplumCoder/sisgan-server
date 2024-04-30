package com.uis.sisgan.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

public class Farmer extends User {


    private String mark;

    @Column(name="id_cattle")
    private String cattleId;
    @OneToMany(mappedBy = "users")
    private List<Cattle> cattles;

    @Column(name="farm_name")
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
