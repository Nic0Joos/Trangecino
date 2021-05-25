package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.WorkSchedule;
import com.time.trangecino.Repository.WorkScheduleRepository;
import com.time.trangecino.business.service.WorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

//written by Kaan


@RestController
@RequestMapping(path= "/WorkSchedule")
public class WorkScheduleEndpoint {
    private WorkScheduleService workscheduleservice;
    private WorkScheduleEndpoint workScheduleEndpoint;

    @Autowired
    public WorkScheduleEndpoint(WorkScheduleService workscheduleservice) { this.workscheduleservice = workscheduleservice;}
    @Autowired
    private WorkScheduleRepository workScheduleRepository;


    //create a workscheduleplan, POSTMap
    @PostMapping(path = "/create")
    public ResponseEntity<Void> createWorkschedule(@RequestBody WorkSchedule workschedule) {
        try {
         workscheduleservice.createWorkschedule(workschedule);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
         }
    }

    //edit a workscheduleplan, PUTMap
    @PutMapping(path ="/edit")
    public ResponseEntity<Void> editWorkschedule(@RequestBody WorkSchedule workSchedule){
        try {
            workscheduleservice.editWorkschedule(workSchedule);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    //delete a workscheduleplan, DELETEMap
    @DeleteMapping(path="/delete")
    public ResponseEntity<Void> deleteWorkschedule(WorkSchedule workSchedule){
        try {
            workscheduleservice.deleteWorkSchedule(workSchedule.getID());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.accepted().build();
    }

   // all workschedules from all employees
    @GetMapping
    public List<WorkSchedule> getAllWorkSchedule(){
        return workScheduleRepository.findAll();
    }

    // all workschedules from one employee
    @GetMapping
    public List <WorkSchedule> getWorkScheduleFromUser (@PathVariable Long ID) {
        return workScheduleRepository.findAllFromUser(ID);
    }

    // one workschedule from one employee
    @GetMapping(path = "/{ID}")
    public Optional<WorkSchedule> getOneWorkSchedule(@PathVariable Long ID) {
        return workScheduleRepository.findbyID(ID);
        //optional means return the one workschedule, if there is none return null
    }

}
