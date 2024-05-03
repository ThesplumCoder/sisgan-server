package com.uis.sisgan.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "internal_movement_guides")
public class InternalMovementGuide {

    @Id
    @GeneratedValue
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
    private Transporter drivers;


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
        this.movementDate = movementDate;
    }

    public String getSignatureIcaOfficial() {
        return signatureIcaOfficial;
    }

    public void setSignatureIcaOfficial(String signatureIcaOfficial) {
        this.signatureIcaOfficial = signatureIcaOfficial;
    }
}
