package com.tienda.backend.modelos;

import javax.persistence.*;

@Entity
@Table(name = "tbl_categorias")
public class categoriasModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idtbl_categorias;
    private String categoria;

    public Integer getId_categorias() {
        return idtbl_categorias;
    }

    public void setId_categorias(Integer id_categorias) {
        this.idtbl_categorias = id_categorias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
