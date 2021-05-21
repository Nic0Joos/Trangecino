package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.HR;
import com.time.trangecino.business.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
//Written by Alex

@RestController
@RequestMapping(path= "/HR")
public class HREndpoint {
    private HRService HRService;
    private HREndpoint HREndpoint;
    @Autowired
    public HREndpoint(HREndpoint HREndpoint) { this.HREndpoint = HREndpoint; }


    //add HR - Endpoint
    @PostMapping(path = "/create")
    public ResponseEntity<Void> postHR(@RequestBody HR HR) {
        try {
            HRService.addHR(HR);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //edit HR - Endpoint
    @PutMapping(path ="/edit")
    public ResponseEntity<Void> editHR(@RequestBody HR HR){
        try {
            HRService.editHR(HR);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    //delete HR - Endpoint
    @DeleteMapping(path="/delete")
    public ResponseEntity<Void> deleteHR(HR HR){
        try {
            HRService.deleteHR(HR.getID());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.accepted().build();
    }
    //get all HR
    @GetMapping(path = "/HR", produces = "application/json")
    public List<HR> getHR() {
        return HRService.findAllHR();
    }
    //get specific HR
    @GetMapping(path = "/HR/{HRId}", produces = "application/json")
    public ResponseEntity<HR> getHR(@PathVariable(value = "HRId") String HRId) {
        HR HR;
        try {
            HR = HRService.findHRById(Long.parseLong(HRId));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return ResponseEntity.ok(HR);
    }





}

