package com.hackaton.base.RetrasoV;

import org.springframework.stereotype.Service;

public class Services {

    // Service
    @Service
    public class DelayService {
        public DTOs.DelayResponse estimate(DTOs.DelayRequest request) {
            DTOs.DelayResponse response = new DTOs.DelayResponse();
            // Regla simple: si clima es "storm" → retraso de 60 min
            if ("storm".equalsIgnoreCase(request.getWeather())) {
                response.setDelayMinutes(60);
            } else {
                response.setDelayMinutes(10);
            }
            return response;
        }
    }


}
