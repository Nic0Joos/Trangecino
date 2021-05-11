package com.time.trangecino.business.service;


//written by Kaan
public class WorkScheduleService {

      private WorkingDaysStatus status;

public enum WorkingDaysStatus {
  // possible workdays
      WORKDAY,
      HOLIDAY,
      INJURY;
}

 /*public boolean areUWorking() {
      if (getWorkingDaysStatus() == WorkingDaysStatus.WORKDAY) {
            return true;
          }
          return false;
      }


    private void getWorkingDaysStatus() {
    }


}
