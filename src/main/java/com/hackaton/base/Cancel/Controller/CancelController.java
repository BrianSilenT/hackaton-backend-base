package com.hackaton.base.Cancel.Controller;

import com.hackaton.base.Cancel.Dto.CancelRequest;
import com.hackaton.base.Cancel.Dto.CancelResponse;
import com.hackaton.base.Cancel.Service.CancelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/cancel")
public class CancelController {

    private final CancelService service;

    public CancelController(CancelService service) {
        this.service = service;
    }

    @PostMapping
    public CancelResponse cancel(@RequestBody CancelRequest request) {
        return service.cancel(request);
    }

}
