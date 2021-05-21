package com.time.trangecino.business.service;

//written by Lennart

import com.time.trangecino.Data.Domain.Admin;
import com.time.trangecino.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import java.util.List;

@Service
@Validated
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //register Admin
    public void registerAdmin(@Validated Admin admin) throws Exception {
        if (admin.getID() == null) {
            if (adminRepository.findbyEmail(admin.getEmail()) != null) ;

            throw new Exception("Email address " + admin.getEmail() + "already assigned to another Admin.");

        }
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        adminRepository.save(admin);
    }
    //edit Admin
    public Admin editAdmin(@Valid Admin admin) throws Exception {
        if (admin.getID() == null) {
            throw new Exception("No admin found");
        } else {
            return adminRepository.save(admin);
        }
    }

    //delete Admin
    public void deleteAdmin (Long adminID) {
        adminRepository.deleteById(adminID);
        }

     //find Admins
    public List<Admin> findAllAdmins() {
        return adminRepository.findAll();
    }
    //find one Admin
    public Admin findAdminById(long adminID) throws Exception {
        List<Admin> adminList = adminRepository.findbyID(adminID);
        if (adminList.isEmpty()){
            throw new Exception("No admin with ID "+adminID+" found.");
        }
        return adminList.get(0);
    }
}


