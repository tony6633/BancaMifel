package com.examen.BancaMifel.service;

import com.examen.BancaMifel.entity.ItemCatalogo;

import java.util.List;

public interface ICatalogService {

    String saveCatalalog(ItemCatalogo request);

    List<ItemCatalogo> getCatalog(String nombre);

    List<ItemCatalogo> getCatalogAll();
}
