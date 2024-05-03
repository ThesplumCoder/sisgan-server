package com.uis.sisgan.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "cattles")
public class Cattle {


    /*
            Es la Entidad de la base de datos
            en todos sus campos contiene getters and setters

     */

    @Id
    @GeneratedValue
    @Column(name="id_cattle")
    private String cattleId;
    @Column(name = "id_user")
    private String userId;

    @Column(name= "birth_date")
    private Date birthDate;

    @Column(name= "weight")
    private Float weight;

    @Column(name= "sex")
    private String sex;

    @Column(name= "breed")
    private String breed;

    /*
            Configuracion de llaves primarias y conexiones entre tablas
            de la base de datos
     */

    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User users;


    @ManyToOne
    @JoinColumn(name = "id_lot", insertable = false, updatable = false)
    private Lot lots;

    public String getCattleId() {
        return cattleId;
    }

    public void setCattleId(String cattleId) {
        this.cattleId = cattleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
