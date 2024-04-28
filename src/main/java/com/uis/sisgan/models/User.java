package com.uis.sisgan.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    private Integer id;

    @Column(name = "id_card", length = 20)
    private String idCard;

    @Column(name = "id_driving_license")
    private Integer idDrivingLicense;

    @Column(name = "id_ica_official")
    private Integer idIcaOfficial;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "password", length = 200)
    private String password;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "mark", length = 100)
    private String mark;

    @Column(name = "farm_name", length = 100)
    private String farmName;

    @Column(name = "email", length = 100)
    private String email;

    public User(Integer id, String idCard, Integer idDrivingLicense, 
            Integer idIcaOfficial, String firstName, String lastName, 
            String password, LocalDate birtDate, String mark, 
            String farmName, String email) {
        setId(id);
        setIdCard(idCard);
        setIdDrivingLicense(idDrivingLicense);
        setIdIcaOfficial(idIcaOfficial);
        setFirstName(firstName);
        setLastName(lastName);
        setPassword(password);
        setBirthDate(birthDate);
        setMark(mark);
        setFarmName(farmName);
        setEmail(email);
    }

    public Integer getId() {
        return id;
    }

    /**
     * Cambia el identificador del usuario
     *
     * @param id Número que identifique el usuario.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Retorna el identificador del usuario.
     *
     * @return Identificador del usuario.
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Cambia el identificador de la tarjeta de identificación.
     *
     * @param idCard Identificador de la tarjeta de identificación.
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     *
     *
     * @return
     */
    public Integer getIdDrivingLicense() {
        return idDrivingLicense;
    }

    public void setIdDrivingLicense(Integer idDrivingLicense) {
        this.idDrivingLicense = idDrivingLicense;
    }

    public Integer getIdIcaOfficial() {
        return idIcaOfficial;
    }

    public void setIdIcaOfficial(Integer idIcaOfficial) {
        this.idIcaOfficial = idIcaOfficial;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
