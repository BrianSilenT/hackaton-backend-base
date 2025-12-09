package com.hackaton.base.Cancel;

import lombok.Getter;
import lombok.Setter;

public class Dtos {

    // DTOs
    @Getter
    @Setter
    public class CancelRequest {
        private String customerId;
        private String serviceType;
        // getters y setters
    }


    @Getter
    @Setter
    public class CancelResponse {
        private boolean willCancel;
        private double probability;
        // getters y setters
    }

}
