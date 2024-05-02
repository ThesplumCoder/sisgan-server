package com.uis.sisgan.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="lots")
public class Lot {


    @Id
    @GeneratedValue
    @Column(name="id_lots")
    private String lotsId;

    @Column(name = "id_cattle")
    private String cattlesId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "lots")
    private List<Cattle> cattles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLotsId() {
        return lotsId;
    }

    public void setLotsId(String lotsId) {
        this.lotsId = lotsId;
    }

    public String getCattlesId() {
        return cattlesId;
    }

    public void setCattlesId(String cattlesId) {
        this.cattlesId = cattlesId;
    }




}
