package com.time.trangecino.Data.Domain;

//written by Lennart

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Admin  {
    @Id
    @GeneratedValue
    protected Long AdminID;
    @Email
    protected String email;
    protected String password;
    protected String name;
    protected String surname;
    private String CompanyName;

    public Long getAdminID() { return AdminID; }
    public void setAdminID(Long AdminID) { this.AdminID = AdminID; }

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

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    //getter and setter for CompanyName
    public String getCompanyName() {
        return CompanyName;
    }
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }
}
