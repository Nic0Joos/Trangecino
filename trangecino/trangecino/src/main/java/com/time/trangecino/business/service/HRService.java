package com.time.trangecino.business.service;

import java.sql.Time;
import java.time.DayOfWeek;
import java.util.Date;
import com.time.trangecino.Data.Domain.WorkSchedule;
import com.time.trangecino.Repository.EmployeeRepository;
import com.time.trangecino.Repository.HRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Written by Alex

@Service
public class HRService {
	
	@Autowired
	HRRepository hrRepository;

	@Autowired
	EmployeeRepository employeeRepository;


	public String createOverview() {
		return null;
	}
	
	public void assignProject () {
	}
	
	public void createWorkschedule () {
	     
	}
	

	
}
