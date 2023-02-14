package com.examen.BancaMifel.controller;

import com.examen.BancaMifel.service.IApiConsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api")
public class ApiController {

    @Autowired
    private IApiConsumoService service;

    @GetMapping("/consumo")
    public ResponseEntity<String> getApi(){
        return this.service.consumo();
    }
}
