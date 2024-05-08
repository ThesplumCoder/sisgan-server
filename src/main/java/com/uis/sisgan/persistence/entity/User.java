package com.uis.sisgan.persistence.entity;

<<<<<<< HEAD
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
public abstract class User {


    @GeneratedValue
    @Id
    @Column(name = "id_user")
    private String userId;

    @Column(name="id_card")
    private String cardId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name= "password")
    private String password;

    @Column(name= "birth_date")
    private Date birthDate;

    @Column(name= "email")
    private String email;




    @OneToMany(mappedBy = "users")
    private List<Rol> roles;




    public User(String email ,String password) {
        this.email = email;
        this.password = password;

    }

    public User() {

    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import java.time.LocalDate;
import org.hibernate.annotations.DiscriminatorFormula;

@Entity
@Table(name = "USERS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorFormula("CASE "
        + "WHEN id_card_ica IS NOT NULL THEN 'IcaOfficial' "
        + "WHEN id_card_ica IS NULL AND id_driving_license IS NOT NULL THEN 'Transporter' "
        + "ELSE 'Propietary' END")
public abstract class User {

    @Id
    private Integer id;

    @Column(name = "id_card", length = 20)
    private String idCard;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "password", length = 200)
    private String password;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "email", length = 100)
    private String email;

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
>>>>>>> development
    }

    public String getFirstName() {
        return firstName;
    }

<<<<<<< HEAD
    public void setFirstName(String first_name) {
        this.firstName = first_name;
=======
    public void setFirstName(String firstName) {
        this.firstName = firstName;
>>>>>>> development
    }

    public String getLastName() {
        return lastName;
    }

<<<<<<< HEAD
    public void setLastName(String last_name) {
        this.lastName = last_name;
=======
    public void setLastName(String lastName) {
        this.lastName = lastName;
>>>>>>> development
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birth_date) {
        this.birthDate = birth_date;
=======
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
>>>>>>> development
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
<<<<<<< HEAD

    public String getCardId() {
        return cardId;
    }
    public void setCardId(String id_card) {
        this.cardId = id_card;
    }
=======
>>>>>>> development
}
