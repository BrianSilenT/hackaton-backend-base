package com.hackaton.base.sentimental.Service;

import com.hackaton.base.sentimental.DTO.SentimentRequest;
import com.hackaton.base.sentimental.DTO.SentimentResponse;
import org.springframework.stereotype.Service;

@Service
public class SentimentService {

    public SentimentResponse analyze(SentimentRequest request) {
        String text = request.getText().toLowerCase();
        String sentiment = "neutral";

        if (text.contains("bueno") || text.contains("excelente") || text.contains("feliz")) {
            sentiment = "positive";
        } else if (text.contains("malo") || text.contains("terrible") || text.contains("triste")) {
            sentiment = "negative";
        }

        SentimentResponse response = new SentimentResponse();
        response.setSentiment(sentiment);
        return response;
    }
}