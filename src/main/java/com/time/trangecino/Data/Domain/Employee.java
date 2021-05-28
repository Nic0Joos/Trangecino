package com.time.trangecino.Data.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import java.util.List;

//written by Luca Weisskopf
@Entity
public class Employee {
    //attributes
    @Id
    @GeneratedValue
    protected Long ID;
    @Email
    protected String email;
    protected String password;
    protected String name;
    protected String familyname;
    //One employee can have many workschedules
    @OneToMany (mappedBy = "employee")
    @JsonIgnore
    protected List<WorkSchedule> Workschedule;

    //getters and setters
    public List<WorkSchedule> getWorkschedule() {
        return Workschedule;
    }
    public void setWorkschedule(List<WorkSchedule> workschedule) {
        Workschedule = workschedule;
    }

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