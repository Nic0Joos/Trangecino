package com.time.trangecino.business.service;


import com.time.trangecino.Repository.EmployeeRepository;
import com.time.trangecino.Repository.WorkScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//written by Kaan
@Service

public class WorkScheduleService {

    @Autowired
    private WorkScheduleRepository workschedulerepository;

      private WorkingDaysStatus status;


      public enum WorkingDaysStatus {
  // possible workdays
      WORKDAY,
      HOLIDAY,
      ILLNESS;
}}

 /*
 public boolean areUWorking() {
      if (getWorkingDaysStatus() == WorkingDaysStatus.WORKDAY) {
            return true;
          }
          return false;
      }


    private void getWorkingDaysStatus() {
    }


}*/
