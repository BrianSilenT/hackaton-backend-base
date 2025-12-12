package com.hackaton.base.VueloRetraso.Controller;


import com.hackaton.base.VueloRetraso.Dto.VueloRetrasoRequest;
import com.hackaton.base.VueloRetraso.Dto.VueloRetrasoResponse;
import com.hackaton.base.VueloRetraso.Service.VueloRetrasoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/VueloR")
public class VueloRetrasoController {

    private final VueloRetrasoService service;

    public VueloRetrasoController(VueloRetrasoService service) {
        this.service = service;
    }

    @PostMapping
    public VueloRetrasoResponse predict(@RequestBody VueloRetrasoRequest request) {
        return service.predict(request);
    }
}