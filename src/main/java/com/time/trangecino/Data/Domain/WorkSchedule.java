package com.time.trangecino.Data.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.util.Date;

//written by Kaan
@Entity
public class WorkSchedule {
    @Id
    @GeneratedValue
    protected Long WorkscheduleID;
    protected Date date;
    protected boolean OutOfOffice;
    protected Time StartMorning;
    protected Time Lunch;
    protected Time StartAfternoon;
    protected Time EndDay;
    protected String Project;
    @ManyToOne
    @JsonIgnore
    protected Employee employee;


    public WorkSchedule (Date date, Time StartMorning, Time Lunch, Time StartAfternoon, Time EndDay, String Project) {
        this.date = date;
        this.StartMorning = StartMorning;
        this.Lunch = Lunch;
        this.StartAfternoon = StartAfternoon;
        this.EndDay = EndDay;
        this.Project = Project;
    }


    //getter and setter Employee
public Employee getEmployee() { return employee; }
public void setEmployee(Employee employee) { this.employee = employee; }

//getter and setter WorkScheduleID
public Long getWorkscheduleID() { return WorkscheduleID; }
public void setWorkscheduleID(Long workscheduleID) { WorkscheduleID = workscheduleID; }

//getter and setter for date
public Date getdate() {return date;}
public void setDate(Date date) {this.date = date;}

//getter and setter for OutOfOffice
public boolean getOutOfOffice() {return OutOfOffice;}
public void setOutOfOffice(Boolean OutOfOffice) {this.OutOfOffice = OutOfOffice;}

//getter and setter for StartMorning
public Time getStartMorning() {return StartMorning;}
public void setStartMorning(Time StartMorning) {this.StartMorning = StartMorning;}

//getter and setter for Lunch
public Time getLunch() {return Lunch;}
public void setLunch(Time Lunch) {this.Lunch = Lunch;}

//getter and setter for StartAfternoon
public Time getStartAfternoon() {return StartAfternoon;}
public void setStartAfternoon(Time StartAfternoon) {this.StartAfternoon = StartAfternoon;}

//getter and setter for Project
public String getProject() {return Project;}
public void setProject(String Project) {this.Project = Project;}

//getter and setter for EndDay
public Time getEndDay (Time EndDay) {return EndDay;}
public void setEndDay(Time EndDay) {this.EndDay = EndDay;}

}