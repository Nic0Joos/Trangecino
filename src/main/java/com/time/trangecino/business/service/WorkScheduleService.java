package com.time.trangecino.business.service;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.WorkSchedule;
import com.time.trangecino.Repository.WorkScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

//written by Kaan

@Service
public class WorkScheduleService {

    @Autowired
    private WorkScheduleRepository workschedulerepository;
    @Autowired
    private WorkSchedule workschedule;
    @Autowired
    private EmployeeService employeeService;


    // create workschedule - possible if statement to be added
    public void createWorkschedule(@Valid WorkSchedule workschedule) {
            workschedulerepository.save(workschedule);
            workschedule.setEmployee(employeeService.getCurrentEmployee());
    }

    // edit workschedule - possible if statement to be added
    public void editWorkschedule(@Valid WorkSchedule workschedule) {
        workschedulerepository.save(workschedule);
    }

    //delete workschedule
    public void deleteWorkSchedule (Employee employee, Date date){
        workschedulerepository.deleteByEmployeeAndDate(employee, date);
    }

    // find all Workschedules from the logged-in employee
    public List<WorkSchedule> FindAllWorkSchedule (){
        return workschedulerepository.findAllbyEmployeeID(employeeService.getCurrentEmployee().getID());
    }
    // find one workschedule from a specific employee
    public WorkSchedule FindOneWorkSchedule(Long WorkScheduleID) throws Exception {
        List <WorkSchedule> WorkScheduleList = workschedulerepository.findOneWorkSchedule(WorkScheduleID);
        if (WorkScheduleList.isEmpty()){
            throw new Exception("No Workschedule found.");
        }
        return WorkScheduleList.get(0);
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