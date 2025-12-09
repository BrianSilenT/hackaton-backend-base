package com.hackaton.base.sentimental;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class controller {

    // Controller
    @RestController
    @RequestMapping("/sentiment")
    public class SentimentController {
        private final service.SentimentService service;
        public SentimentController(service.SentimentService service) { this.service = service; }

        @PostMapping
        public DTO.SentimentResponse analyze(@RequestBody DTO.SentimentRequest request) {
            return service.analyze(request);
        }
    }


}
