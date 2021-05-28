package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.WorkSchedule;
import com.time.trangecino.Repository.WorkScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

//written by Kaan

@Service
@Validated
public class WorkScheduleService {

    @Autowired
    WorkScheduleRepository workschedulerepository;
    @Autowired
    EmployeeService employeeService;


    // create workschedule - possible if statement to be added
    public void createWorkschedule(@Valid WorkSchedule workschedule) {
        workschedule.setEmployee(employeeService.getCurrentEmployee());
        workschedulerepository.save(workschedule);

    }

    // edit workschedule - possible if statement to be added
    public void editWorkschedule(@Valid WorkSchedule workschedule) {
        workschedulerepository.save(workschedule);
    }

    //delete workschedule
    public void deleteWorkSchedule (Long WorkscheduleID){
        workschedulerepository.deleteById(WorkscheduleID);
    }

    // find all Workschedules from the logged-in employee
    public List<WorkSchedule> FindAllWorkSchedule (){
        return workschedulerepository.findByEmployeeID(employeeService.getCurrentEmployee().getID());
    }
    // find one workschedule from a specific employee
    public WorkSchedule FindOneWorkSchedule(Long WorkScheduleID) {
       return workschedulerepository.findById(WorkScheduleID).get();
    }

}