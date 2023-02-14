package com.examen.BancaMifel.repository;

import com.examen.BancaMifel.entity.ItemCatalogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogoRepository extends JpaRepository<ItemCatalogo, Long> {

    List<ItemCatalogo> findByNombre(String nombre);

}
