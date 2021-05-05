package com.time.trangecino.business.service;


import com.time.trangecino.Data.Domain.WorkSchedule;

//written by Kaan
public class  WorkScheduleService {




enum DaysOfWeek {
   //days of the week and the values which I gave them
      MONDAY(1) {
          public DaysOfWeek next() { return MONDAY; }
   }, TUESDAY(2) {
          public DaysOfWeek next() { return TUESDAY; }
   }, WEDNESDAY(3) {
          public DaysOfWeek next() { return WEDNESDAY; }
   }, THURSDAY(4) {
          public DaysOfWeek next() { return THURSDAY; }
   }, FRIDAY(5) {
          public DaysOfWeek next() { return FRIDAY; }
   }, SATURDAY(6) {
            public DaysOfWeek next() { return SATURDAY; }
   }, SUNDAY(7) {
            public DaysOfWeek next() { return SUNDAY; }
      };

        DaysOfWeek(int i) {
        }
    }}
