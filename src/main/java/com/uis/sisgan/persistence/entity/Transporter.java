package com.uis.sisgan.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Transporter")
public class Transporter extends User {

    @Column(name="id_driving_license")
    private String idDrivingLicense;
    
    /**
     * Retorna el identificador de la licencia de conducción.
     * 
     * @return Número de la tarjeta de conducción.
     */
    public String getIdDrivingLicense() {
        return idDrivingLicense;
    }
    
    /**
     * Cambia el identificador de la licencia de conducción.
     * 
     * @param idDrivingLicense Número de la tarjeta de conducción.
     */
    public void setIdDrivingLicense(String idDrivingLicense) {
        this.idDrivingLicense = idDrivingLicense;
    }
}
