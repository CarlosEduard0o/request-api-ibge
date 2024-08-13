package com.playgroundibge.municipio_api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MunicipioService {

    private final RestTemplate restTemplate;

    public MunicipioService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getEstados() {
        //http://localhost:8080/api/estados
        String url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados";
        return restTemplate.getForObject(url, String.class);
    }

    public String getMunicipios(String estado) {
        //http://localhost:8080/api/municipios?estado=RJ
        String url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados/" + estado + "/municipios";
        return restTemplate.getForObject(url, String.class);
    }
}
