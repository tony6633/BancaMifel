package com.examen.BancaMifel.service;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;

public interface IApiConsumoService {

     ResponseEntity<String> consumo();
}
