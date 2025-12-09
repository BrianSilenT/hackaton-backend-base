package com.hackaton.base.Cancel.Service;

import com.hackaton.base.Cancel.Dto.CancelRequest;
import com.hackaton.base.Cancel.Dto.CancelResponse;
import org.springframework.stereotype.Service;

@Service
public class CancelService {
    public CancelResponse cancel(CancelRequest request) {
        CancelResponse response = new CancelResponse();

        response.setCanceled(request.getServiceID() != null && !request.getServiceID()
                .isEmpty()) ;
        return response;
    }
}

