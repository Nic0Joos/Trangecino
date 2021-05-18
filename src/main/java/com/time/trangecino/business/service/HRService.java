package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.Admin;
import com.time.trangecino.Data.Domain.HR;
import com.time.trangecino.Repository.EmployeeRepository;
import com.time.trangecino.Repository.HRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


//Written by Alex

@Service
public class HRService {
	
	@Autowired
	HR User;

	public String getCurrentHRUser() {
		String email = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return User.getEmail();
	}


	@Autowired
	private HRRepository hRRepository;

	public void registerHR(@Validated HR hr) throws Exception {
		if (hr.getID() == null) {
			if (hRRepository.findByEmail(hr.getEmail()) != null) {
				throw new Exception("Email address " + hr.getEmail() + "already assigned to another HR Employee.");
			} else {
				hRRepository.save(hr);
			}
		}
	/* public String createOverview(){
		return null;
	}

	public void assignProject () {
*/

	}
	/*public void createWorkschedule extends WorkScheduleService {

	}
*/
}
