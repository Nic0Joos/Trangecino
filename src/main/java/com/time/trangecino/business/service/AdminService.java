package com.time.trangecino.business.service;

//written by Lennart

import com.time.trangecino.Data.Domain.Admin;
import com.time.trangecino.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public void registerAdmin(@Validated Admin admin) throws Exception {
        if (admin.getID() == null) {
            if (adminRepository.findbyEmail(admin.getEmail()) != null) ;

            throw new Exception("Email address " + admin.getEmail() + "already assigned to another Admin.");

        }
        adminRepository.save(admin);
    }
}


