package com.time.trangecino.Data.Domain;


import java.sql.Time;
import java.util.Date;

//written by Kaan
public class WorkSchedule {


    private int ID;
    private Date date;
    private boolean Holiday;
    private Time StartMorning;
    private Time Lunch;
    private Time StartAfternoon;
    private Time EndDay;


//getter and setter for ID
public int getID(){ return ID; };
public void setID(int ID)  {this.ID = ID;}

//getter and setter for date
public Date getdate() {return date;}
public void setDate(Date date) {this.date = date;}

//getter and setter for holiday
public boolean getHoliday() {return Holiday;}
public void setHoliday(Boolean Holiday) {this.Holiday = Holiday;}

//getter and setter for StartMorning
public Time getStartMorning() {return StartMorning;}
public void setStartMorning(Time StartMorning) {this.StartMorning = StartMorning;}

//getter and setter for Lunch
public Time getLunch() {return Lunch;}
public void setLunch(Time Lunch) {this.Lunch = Lunch;}

//getter and setter for StartAfternoon
public Time getStartAfternoon() {return StartAfternoon;}
public void setStartAfternoon(Time StartAfternoon) {this.StartAfternoon = StartAfternoon;}

//getter and setter for EndDay
public void setEndDay(Time EndDay) {this.EndDay = EndDay;}
        }