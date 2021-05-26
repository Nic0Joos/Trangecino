package com.time.trangecino.Data.Domain;

//written by Lennart

public class Admin extends User {

    private String CompanyName;

    //getter and setter for CompanyName
    public String getCompanyName() {
        return CompanyName;
    }
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }
}
