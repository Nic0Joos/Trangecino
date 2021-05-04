package com.time.trangecino.business.service;


import java.time.DayOfWeek;

//written by Kaan
public class WorkScheduleService {

  //set them as constants
    enum DaysOfWeek {
   //days of the week and the values which I gave them
      MONDAY(1) {
          public DayOfWeek next() { return MONDAY; }
   }, TUESDAY(2) {
          public DayOfWeek next() { return TUESDAY; }
   }, WEDNESDAY(3) {
          public DayOfWeek next() { return WEDNESDAY; }
   }, THURSDAY(4) {
          public DayOfWeek next() { return THURSDAY; }
   }, FRIDAY(5) {
          public DayOfWeek next() { return FRIDAY; }

    }}}
