package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.Admin;
import com.time.trangecino.business.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//written by Lennart

@RestController
@RequestMapping(path= "/api")
public class AdminEndpoint {

    @Autowired
    AdminService adminService;

    //add Admin - Endpoint
    @PostMapping(path = "/Admin", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> postAdmin(@RequestBody Admin admin) {
        try {
            adminService.registerAdmin(admin);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //edit Admin - Endpoint
    @PutMapping(path = "/Admin/{AdminID}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> editAdmin(@RequestBody Admin admin){
        try {
            adminService.editAdmin(admin);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    //delete Admin - Endpoint
    @DeleteMapping(path = "/Admin/{AdminID}")
    public ResponseEntity<Void> deleteAdmin(Admin admin){
        try {
            adminService.deleteAdmin(admin.getAdminID());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.accepted().build();
    }
    //get all Admins
    @GetMapping(path = "/Admin", produces = "application/json")
    public List<Admin> getAdmins() {
        return adminService.findAllAdmins();
    }


    //get specific Admin
    @GetMapping(path = "/Admin/{AdminID}", produces = "application/json")
    public ResponseEntity<Admin> getAdmin(@PathVariable(value = "AdminID") String AdminID) {
        Admin admin = null;
        try {
            admin = adminService.findAdminById(Long.parseLong(AdminID));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return ResponseEntity.ok(admin);
    }

    }



