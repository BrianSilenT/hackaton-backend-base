package com.hackaton.base.Cancellation.Controller;

import com.hackaton.base.Cancellation.Dto.CancellationRequest;
import com.hackaton.base.Cancellation.Dto.CancellationResponse;
import com.hackaton.base.Cancellation.Service.CancellationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/cancel")
public class CancellationController {

    private final CancellationService service;

    public CancellationController(CancellationService service) {
        this.service = service;
    }

    @PostMapping
    public CancellationResponse cancel(@RequestBody CancellationRequest request) {
        return service.cancel(request);
    }

}
