package com.examen.BancaMifel.controller;

import com.examen.BancaMifel.algoritmo.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aes")
public class AesController {

    @Autowired
    private EncryptionService service;

    @PostMapping("/cifrar")
    public String cifrar(@RequestBody String data) throws Exception {
        return this.service.encrypt(data);
    }

    @PostMapping("/desCifrar")
    public String desCifrar(@RequestBody String data) throws Exception {
        return this.service.decrypt(data);
    }
}
