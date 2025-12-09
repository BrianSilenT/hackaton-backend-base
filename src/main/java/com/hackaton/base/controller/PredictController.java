package com.hackaton.base.controller;

import com.hackaton.base.model.PredictionRequest;
import com.hackaton.base.service.PredictService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PredictController {

    private final PredictService predictService;

    public PredictController(PredictService predictService) {
        this.predictService = predictService;
    }

    @PostMapping("/predict")
    public Map<String, String> predict(@RequestBody PredictionRequest request) {
        String result = predictService.process(request.getInput());
        return Map.of("result", result);
    }
}