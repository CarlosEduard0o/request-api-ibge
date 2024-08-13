package com.playgroundibge.municipio_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playgroundibge.municipio_api.service.MunicipioService;


@RestController
@RequestMapping("/api")
public class MunicipioController {

    private final MunicipioService municipioService;

    public MunicipioController(MunicipioService municipioService) {
        this.municipioService = municipioService;
    }

    @GetMapping("/estados")
    public String getEstados() {
        return municipioService.getEstados();
    }

    @GetMapping("/municipios")
    public String getMunicipios(@RequestParam String estado) {
        return municipioService.getMunicipios(estado);
    }
}
