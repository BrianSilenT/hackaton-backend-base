package com.hackaton.base.Cancel;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class ControllerCancel {

    // Controller
    @RestController
    @RequestMapping("/cancel")
    public class CancelController {
        private final ServiceCancel.CancelService service;
        public CancelController(ServiceCancel.CancelService service) { this.service = service; }

        @PostMapping
        public Dtos.CancelResponse predict(@RequestBody Dtos.CancelRequest request) {
            return service.predict(request);
        }
    }

}
