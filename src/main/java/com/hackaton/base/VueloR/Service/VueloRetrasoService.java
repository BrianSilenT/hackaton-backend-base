package com.hackaton.base.VueloR.Service;


import com.hackaton.base.VueloR.Dto.VueloRetrasoRequest;
import com.hackaton.base.VueloR.Dto.VueloRetrasoResponse;
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
