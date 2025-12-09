package com.hackaton.base.sentimental;

import org.springframework.stereotype.Service;

public class service {

    // Service
    @Service
    public class SentimentService {
        public controller.SentimentResponse analyze(controller.SentimentRequest request) {
            String text = request.getText().toLowerCase();
            String sentiment = "neutral";
            if (text.contains("bueno") || text.contains("excelente")) {
                sentiment = "positive";
            } else if (text.contains("malo") || text.contains("terrible")) {
                sentiment = "negative";
            }
            controller.SentimentResponse response = new controller.SentimentResponse();
            response.setSentiment(sentiment);
            return response;
        }
    }


}
