package com.time.trangecino.Data.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

//Written by Alex
@Entity
public class HR extends User {
    @Id
    @GeneratedValue
    protected Long ID;
    @Email
    protected String email;
    protected String password;
    protected String name;
    protected String familyname;

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

