package com.hackaton.base.RetrasoV;

import lombok.Getter;
import lombok.Setter;

public class DTOs {

    // DTOs
    @Getter
    @Setter
    public class DelayRequest {
        private String flightNumber;
        private String weather;
        // getters y setters
    }

    @Getter
    @Setter
    public class DelayResponse {
        private int delayMinutes;
        // getters y setters
    }

}
