package com.hackaton.base.RetrasoV;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controllers {
    // Controller
    @RestController
    @RequestMapping("/delay")
    public class DelayController {
        private final Services.DelayService service;
        public DelayController(Services.DelayService service) { this.service = service; }

        @PostMapping
        public DTOs.DelayResponse estimate(@RequestBody DTOs.DelayRequest request) {
            return service.estimate(request);
        }
    }

}
