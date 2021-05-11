package com.time.trangecino.Controller;

import com.time.trangecino.Data.Domain.HR;
import com.time.trangecino.business.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/")
public class HRController {

    @Autowired
    HRService hrService;

    //@PostMapping("addhr")

  //  public ResponseEntity<CustomMessageWithId> addHradmin(@RequestBody HR request) {
    //    return hrService.addHR(request);
    //}
}
