package com.hackaton.base.sentimental;

import lombok.Getter;
import lombok.Setter;

public class DTO {

    @Getter
    @Setter
    // DTOs
    public class SentimentRequest {
        private String text;
        // getters y setters
    }

    @Getter
    @Setter
    public class SentimentResponse {
        private String sentiment;
        // getters y setters
    }


}
