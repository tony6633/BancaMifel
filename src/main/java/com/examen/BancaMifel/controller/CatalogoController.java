package com.examen.BancaMifel.controller;

import com.examen.BancaMifel.entity.ItemCatalogo;
import com.examen.BancaMifel.model.Request;
import com.examen.BancaMifel.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    private ICatalogService catalogo; // asumiendo que tienes un repositorio para acceder a la tabla

    @PostMapping("/consulta")
    public List<ItemCatalogo> getCatalogo(@RequestBody Request request) {
        if (request != null && !request.getNombre().isEmpty()) {
            return this.catalogo.getCatalog(request.getNombre()); // método en el repositorio para filtrar por nombre
        } else {
            return this.catalogo.getCatalogAll(); // método en el repositorio para obtener todo el catálogo
        }
    }

    @PostMapping("/guardar")
    public String saveCat(@RequestBody ItemCatalogo request){
        return this.catalogo.saveCatalalog(request);
    }

}