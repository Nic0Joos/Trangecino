package com.time.trangecino.Data.Domain;

import javax.persistence.Entity;

//written by Luca Weisskopf
@Entity
public class Employee extends User {
    protected Long ID;

    @Override
    public Long getID() {
        return ID;
    }

    @Override
    public void setID(Long ID) {
        this.ID = ID;
    }
}