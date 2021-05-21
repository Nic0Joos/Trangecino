package com.time.trangecino.Data.Domain;


import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

//Written by Nico Joos
@Entity
public abstract class User {

    @Id
    @GeneratedValue
    private Long ID;
    @Email
    private String email;
    private String password;
    private String name;
    private String familyname;

    public Long getID() { return ID; }
    public void setID(Long ID) { this.ID = ID; }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return null;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyname() {
        return familyname;
    }
    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }
}
