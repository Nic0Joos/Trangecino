package com.time.trangecino.business.service;

/*
import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.WorkSchedule;
import com.time.trangecino.Repository.EmployeeRepository;
import com.time.trangecino.Repository.WorkScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

//written by Kaan
/*
@Service

public class WorkScheduleService {

    @Autowired
    private WorkScheduleRepository workschedulerepository;

      private WorkingDaysStatus status;

    public void createWorkschedule(@Valid WorkSchedule workschedule) throws Exception {
        if (workschedule.getWorkSchedule == "Holiday") {
            if (WorkScheduleRepository.findByHoliday(workschedule.getWorkschedule()) != null) {
                throw new Exception("Please create a Workschedule");
            }
        }



      public enum WorkingDaysStatus {
  // possible workdays
      OutOfOffice,
      InOffice,
      ;
}}


 public boolean areUWorking() {
      if (getWorkingDaysStatus() == WorkingDaysStatus.InOffice) {
            return true;
          }
          return false;
      }


    private void getWorkingDaysStatus() {
    }

 public void createWorkschedule(@Valid Workschedule workschedule) throws Exception {
        if (WorkSchedule.getID() == null) {
            if (WorkScheduleRepository.findByEmail(Workschedule.getEmail()) != null) {
                throw new Exception("Please enter a new email address");
            }
        }
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        employeeRepository.save(employee);
    }






}
*/