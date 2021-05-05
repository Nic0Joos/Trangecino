package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.WorkSchedule;
import com.time.trangecino.business.service.WorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





    @RestController
    @RequestMapping(path = "/api")
    public class WorkScheduleEndpoint {
        @Autowired
        private WorkScheduleService workSService;
        private Object WorkSchedule;}

