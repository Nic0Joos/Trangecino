package com.time.trangecino.Controller;

import com.time.trangecino.Data.Domain.HR;
import com.time.trangecino.business.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/HR")
public class HRController {

   private HRService hrService;

   @Autowired
    public HRController(HRService hrService) {
        this.hrService = hrService;
    }

  /*  @PostMapping
    public void registerHR(@RequestBody HR hr) {
      return HRService.registerHR(hr);
    }
*/
}





/*  @GetMapping
    public String getHRView(Model model) {
        try {
            if (HRService.getCurrentHRUser().isHR())
                return "HR";
            else
                return "dashboard";
        } catch (Exception e) {
            return "login";
    }

  //  public ResponseEntity<CustomMessageWithId> addHradmin(@RequestBody HR request) {
    //    return hrService.addHR(request);
    //} */
