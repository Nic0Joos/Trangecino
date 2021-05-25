package com.time.trangecino.Data.Domain;

import java.sql.Time;
import java.util.Date;

//written by Kaan
public class WorkSchedule {

    private Long WorkScheduleID;
    private Date date;
    private boolean OutOfOffice;
    private Time StartMorning;
    private Time Lunch;
    private Time StartAfternoon;
    private Time EndDay;
    private String Project;
    private Employee employee;

   // ...
    public WorkSchedule (Date date, Time StartMorning, Time Lunch, Time StartAfternoon, Time EndDay, String Project) {
        this.date = date;
        this.StartMorning = StartMorning;
        this.Lunch = Lunch;
        this.StartAfternoon = StartAfternoon;
        this.EndDay = EndDay;
        this.Project = Project;
    }

    //getter and setter employee
public Employee getEmployee() { return employee; }
public void setEmployee(Employee employee) { this.employee = employee; }

    //getter and setter WorkScheduleID
public Long getWorkScheduleID() { return WorkScheduleID; }
public void setWorkScheduleID(Long workScheduleID) { WorkScheduleID = workScheduleID; }

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
public void setEndDay(Time EndDay) {this.EndDay = EndDay;}

}