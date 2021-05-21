package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.Admin;
import com.time.trangecino.Data.Domain.HR;
import com.time.trangecino.Repository.EmployeeRepository;
import com.time.trangecino.Repository.HRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;


//Written by Alex
@Service
public class HRService {

	@Autowired
	private HRRepository HRRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	//add and save HR
	public void addHR(@Valid HR HR) throws Exception {
		if (HR.getID() == null) {
			if (HRRepository.findByEmail(HR.getEmail()) != null) {
				throw new Exception("Please enter a new email address");
			}
		}
		HR.setPassword(passwordEncoder.encode(HR.getPassword()));
		HRRepository.save(HR);
	}

	//edit HR
	public HR editHR(@Valid HR HR) throws Exception {
		if (HR.getID() == null) {
			throw new Exception("No HR found");
		} else {
			return HRRepository.save(HR);
		}
	}


	//delete HR
	public void deleteHR (Long HRID){
		HRRepository.deleteById(HRID);
	}
}


