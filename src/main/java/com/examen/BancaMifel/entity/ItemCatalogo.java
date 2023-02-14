package com.examen.BancaMifel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemCatalogo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String pais;


    public ItemCatalogo() {
    }


    public ItemCatalogo(Long id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ItemCatalogo{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
