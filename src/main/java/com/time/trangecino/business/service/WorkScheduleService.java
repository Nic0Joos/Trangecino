package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.WorkSchedule;
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


    // create workschedule
    public void createWorkschedule(@Valid WorkSchedule workschedule) throws Exception {
        if(workschedule.getID() == null) {
            workschedulerepository.save(workschedule);
        }
            throw new Exception("There is already a workschedule in place. ");
    }

    // edit workschedule
    public void editWorkschedule(@Valid WorkSchedule workschedule) throws Exception {
        if (workschedule.getID() == null) {
            throw new Exception("No Workschedule found!");
        }
        workschedulerepository.save(workschedule);
    }

    //delete workschedule
    public void deleteWorkSchedule (Long WorkScheduleID){
        workschedulerepository.deleteById(WorkScheduleID);
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



}