package com.examen.BancaMifel.service.implementacion;

import com.examen.BancaMifel.entity.ItemCatalogo;
import com.examen.BancaMifel.repository.CatalogoRepository;
import com.examen.BancaMifel.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalagoServiceImplementacion implements ICatalogService {

    @Autowired
    private CatalogoRepository repository;


    @Override
    public String saveCatalalog(ItemCatalogo request) {

        this.repository.save(request);

        return "OK.";
    }

    @Override
    public List<ItemCatalogo> getCatalog(String nombre) {
        return this.repository.findByNombre(nombre);
    }

    @Override
    public List<ItemCatalogo> getCatalogAll() {
        return this.repository.findAll();
    }
}
