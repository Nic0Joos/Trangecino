package com.time.trangecino.Endpoint;

import com.time.trangecino.business.service.AdminService;
import com.time.trangecino.Data.Domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//written by Lennart

@RestController
@RequestMapping(path= "/Admin")
public class AdminEndpoint {

    private AdminService adminService;
    private AdminEndpoint adminEndpoint;
    @Autowired
    public AdminEndpoint(AdminEndpoint adminEndpoint) {
        this.adminEndpoint = adminEndpoint;
    }

    //add Admin - Endpoint
    @PostMapping(path = "/create")
    public ResponseEntity<Void> postAdmin(@RequestBody Admin admin) {
        try {
            adminService.registerAdmin(admin);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //edit Admin - Endpoint
    @PutMapping(path ="/edit")
    public ResponseEntity<Void> editAdmin(@RequestBody Admin admin){
        try {
            adminService.editAdmin(admin);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    //delete Admin - Endpoint
    @DeleteMapping(path="/delete")
    public ResponseEntity<Void> deleteAdmin(Admin admin){
        try {
            adminService.deleteAdmin(admin.getID());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.accepted().build();
    }
    //get all Admins
    @GetMapping(path = "/admin", produces = "application/json")
    public List<Admin> getAdmins() {
        return adminService.findAllAdmins();
    }
    //get specific Admin
    @GetMapping(path = "/admin/{adminId}", produces = "application/json")
    public ResponseEntity<Admin> getAdmin(@PathVariable(value = "adminId") String adminId) {
        Admin admin = null;
        try {
            admin = adminService.findAdminById(Long.parseLong(adminId));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return ResponseEntity.ok(admin);
    }

    }



