package com.hackaton.base.Cancel;

import org.springframework.stereotype.Service;

public class ServiceCancel {


    // Service
    @Service
    public class CancelService {
        public Dtos.CancelResponse predict(Dtos.CancelRequest request) {
            Dtos.CancelResponse response = new Dtos.CancelResponse();
            // Regla simple: si el servicio es "trial" → alta probabilidad de cancelación
            if ("trial".equalsIgnoreCase(request.getServiceType())) {
                response.setWillCancel(true);
                response.setProbability(0.8);
            } else {
                response.setWillCancel(false);
                response.setProbability(0.2);
            }
            return response;
        }
    }

}
