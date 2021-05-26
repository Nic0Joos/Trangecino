package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.WorkSchedule;
import com.time.trangecino.business.service.WorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//written by Kaan


@RestController
@RequestMapping(path= "/api")
public class WorkScheduleEndpoint {
    @Autowired
    WorkScheduleService workscheduleservice;

    //create a workscheduleplan, POSTMap
    @PostMapping(path = "/Workschedule", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> createWorkschedule(@RequestBody WorkSchedule workschedule) {
        try {
         workscheduleservice.createWorkschedule(workschedule);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
         }
    }

    //edit a workscheduleplan, PUTMap
    @PutMapping(path = "/Workschedule/{WorkscheduleID}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> editWorkschedule(@RequestBody WorkSchedule workSchedule){
        try {
            workscheduleservice.editWorkschedule(workSchedule);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    //delete a workscheduleplan, DELETEMap
    @DeleteMapping(path = "/Workschedule/{WorkscheduleID}")
    public ResponseEntity<Void> deleteWorkschedule(WorkSchedule workSchedule){
        try {
            workscheduleservice.deleteWorkSchedule(workSchedule.getWorkscheduleID());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.accepted().build();
    }

   // all workschedules from the logged-in employee
    @GetMapping (path = "/Workschedule", produces = "application/json")
    public List<WorkSchedule> getAllWorkSchedule(){
        return workscheduleservice.FindAllWorkSchedule();
    }

    // one workschedule from one employee
    @GetMapping(path = "/Workschedule/{WorkscheduleID}", produces = "application/json")
    public ResponseEntity<WorkSchedule> getOneWorkSchedule(@PathVariable Long WorkscheduleID) {
        WorkSchedule workSchedule = null;
        try {
            workSchedule = workscheduleservice.FindOneWorkSchedule(WorkscheduleID);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return ResponseEntity.ok(workSchedule);
    }

}
