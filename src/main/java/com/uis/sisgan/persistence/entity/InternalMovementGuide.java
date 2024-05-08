package com.uis.sisgan.persistence.entity;

<<<<<<< HEAD
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "internal_movement_guides")
=======


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "INTERNAL_MOVEMENT_GUIDES")
>>>>>>> development
public class InternalMovementGuide {

    @Id
    @GeneratedValue
<<<<<<< HEAD
    @Column(name = "id_internal_movement")
    private Integer internalMovementGuideId;


    @Column(name="id_lot")
    private Integer lotsId;

    @Column(name="vehicle_plate")
    private String vehiclePlate;

    @Column(name = "origin")
    private String origin;

    @Column(name= "destination")
    private String destination;

    @Column(name="signature_petitioner")
    private String signaturePetitioner;

    @Column(name = "id_driving_license")
    private Integer drivingLicenseId;

    @Column(name = "application_date")
    private Date applicationDate;

    @Column(name="movement_date")
    private Date movementDate;

    @Column(name="signature_ica_official")
    private String signatureIcaOfficial;

    @ManyToOne
    @JoinColumn(name ="id_driving_license",insertable = false,updatable = false )
    private Driver drivers;


    public Integer getInternalMovementGuideId() {
        return internalMovementGuideId;
    }

    public void setInternalMovementGuideId(Integer internalMovementGuideId) {
        this.internalMovementGuideId = internalMovementGuideId;
    }

    public Integer getLotsId() {
        return lotsId;
    }

    public void setLotsId(Integer lotsId) {
        this.lotsId = lotsId;
=======
    @Column(name = "id")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_user_transporter")
    private Transporter transporter;

    @Column(name ="vehicle_plate", length = 10)
    private String vehiclePlate;

    @Column(name = "origin", length = 100)
    private String origin;

    @Column(name = "destination", length = 100)
    private String destination;

    @Column(name = "signature_petitioner", length = 100)
    private String signaturePetitioner;

    @Column(name = "application_date")
    private LocalDate applicationDate;

    @Column(name = "movement_date")
    private LocalDate movementDate;

    @Column(name = "signature_ica_official", length = 100)
    private String signatureIcaOfficial;

    @OneToMany(mappedBy = "internalMovementGuide")
    private List<Lot> lots;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public void setTransporter(Transporter transporter) {
        this.transporter = transporter;
>>>>>>> development
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSignaturePetitioner() {
        return signaturePetitioner;
    }

    public void setSignaturePetitioner(String signaturePetitioner) {
        this.signaturePetitioner = signaturePetitioner;
    }

<<<<<<< HEAD
    public Integer getDrivingLicenseId() {
        return drivingLicenseId;
    }

    public void setDrivingLicenseId(Integer drivingLicenseId) {
        this.drivingLicenseId = drivingLicenseId;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Date getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(Date movementDate) {
=======
    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public LocalDate getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(LocalDate movementDate) {
>>>>>>> development
        this.movementDate = movementDate;
    }

    public String getSignatureIcaOfficial() {
        return signatureIcaOfficial;
    }

    public void setSignatureIcaOfficial(String signatureIcaOfficial) {
        this.signatureIcaOfficial = signatureIcaOfficial;
    }
<<<<<<< HEAD
=======

    public List<Lot> getLots() {
        return lots;
    }

    public void setLots(List<Lot> lots) {
        this.lots = lots;
    }
    
    
>>>>>>> development
}
