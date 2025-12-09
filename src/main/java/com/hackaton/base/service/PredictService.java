package com.hackaton.base.service;

import org.springframework.stereotype.Service;

@Service
public class PredictService {
    public String process(String input) {
        return "processed " + input;
    }
}