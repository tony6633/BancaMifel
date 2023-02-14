package com.examen.BancaMifel.service.implementacion;

import com.examen.BancaMifel.service.IApiConsumoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ApiConsumoServiceImplementacion implements IApiConsumoService {
    @Override
    public ResponseEntity<String> consumo() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://pokeapi.co/api/v2/pokemon/ditto";
        return restTemplate.getForEntity(url, String.class);
    }
}
