package com.time.trangecino.business.service;


import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.WorkSchedule;
import com.time.trangecino.Repository.EmployeeRepository;
import com.time.trangecino.Repository.WorkScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

//written by Kaan

@Service

public class WorkScheduleService {

    @Autowired
    private WorkScheduleRepository workschedulerepository;
    @Autowired
    private WorkSchedule workschedule;



    public void createWorkschedule(@Valid WorkSchedule workschedule) throws Exception {
        workschedulerepository.save(workschedule);

        }



      /*public enum WorkingDaysStatus {
  // possible workdays
      OutOfOffice,
      InOffice,
      ;*/



 public boolean areUWorking() {
      return workschedule.getOutOfOffice();
 }


    private void getWorkingDaysStatus() {
    }

 public void EditWorkschedule(@Valid WorkSchedule workschedule) throws Exception {
        if (workschedule.getID() == null) {
            throw new Exception("WorkSchedule already exists!");

            }
         workschedulerepository.save(workschedule);
 }

    }







