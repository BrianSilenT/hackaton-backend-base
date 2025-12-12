package com.hackaton.base.Cancellation.Service;

import com.hackaton.base.Cancellation.Dto.CancellationRequest;
import com.hackaton.base.Cancellation.Dto.CancellationResponse;
import org.springframework.stereotype.Service;

@Service
public class CancellationService {
    public CancellationResponse cancel(CancellationRequest request) {
        CancellationResponse response = new CancellationResponse();

        response.setCanceled(request.getServiceID() != null && !request.getServiceID()
                .isEmpty()) ;
        return response;
    }
}

