package com.hackaton.base.VueloRetraso.Service;


import com.hackaton.base.VueloRetraso.Dto.VueloRetrasoRequest;
import com.hackaton.base.VueloRetraso.Dto.VueloRetrasoResponse;
import org.springframework.stereotype.Service;

@Service
public class VueloRetrasoService {

    public VueloRetrasoResponse predict(VueloRetrasoRequest request) {
        VueloRetrasoResponse response = new VueloRetrasoResponse();

        if (request.getNumeroDeVuelo() != null && request.getNumeroDeVuelo().startsWith("MX")){
            response.setRetraso(true);
            response.setMinutosDeRetraso(15);
        } else{
            response.setRetraso(false);
            response.setMinutosDeRetraso(0);
        }
        return response;
    }
}
