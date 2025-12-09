package com.hackaton.base.sentimental.Controller;


import com.hackaton.base.sentimental.DTO.SentimentRequest;
import com.hackaton.base.sentimental.DTO.SentimentResponse;
import com.hackaton.base.sentimental.Service.SentimentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentiment")
public class SentimentController {

    private final SentimentService service;

    public SentimentController(SentimentService service) {
        this.service = service;
    }

    @PostMapping
    public SentimentResponse analyze(@RequestBody SentimentRequest request) {
        return service.analyze(request);
    }
}

