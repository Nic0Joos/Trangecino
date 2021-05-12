package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.HR;
import com.time.trangecino.Data.Domain.User;
import com.time.trangecino.Repository.EmployeeRepository;
import com.time.trangecino.Repository.HRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

//Written by Alex

@Service
public class HRService {
	
	@Autowired
	HRRepository hrRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	/*public HR getCurrentHRUser() {
		String email = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return HRRepository.findByEmail(email);
	}
*/

	/* public String createOverview(){
		return null;
	}
	
	public void assignProject () {


	}
	public void createWorkschedule () {
	     
	}
*/
}
