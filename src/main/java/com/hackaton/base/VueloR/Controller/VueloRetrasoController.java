package com.hackaton.base.VueloR.Controller;


import com.hackaton.base.VueloR.Dto.VueloRetrasoRequest;
import com.hackaton.base.VueloR.Dto.VueloRetrasoResponse;
import com.hackaton.base.VueloR.Service.VueloRetrasoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/VueloR")
public class VueloRetrasoController {

    private final VueloRetrasoService service;

    public VueloRetrasoController(VueloRetrasoService service){
        this.service = service;
    }

    @PostMapping
    public VueloRetrasoResponse predict(@RequestBody VueloRetrasoRequest request) {
        return service.predict(request);
    }
}
