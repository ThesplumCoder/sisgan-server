package com.uis.sisgan.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
public class Rol {

    @Id
    @Column(name = "id_role")
    private Integer roleId;

    @Column(name = "id_user")
    private Integer userId;

    @ManyToOne
    @JoinColumn(name="id_user", insertable = false, updatable = false)
    private User users;

    private String rol;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
