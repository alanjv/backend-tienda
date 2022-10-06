package com.tienda.backend.modelos;

import javax.persistence.*;

@Entity
@Table(name = "tbl_productos")
public class productosModelo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idtbl_producto;
    private Integer idtbl_categorias;
    private String nombre;
    private String descripcion;
    private String url_omagen;

    public Integer getId_producto() {
        return idtbl_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.idtbl_producto = id_producto;
    }

    public Integer getId_categorias() {
        return idtbl_categorias;
    }

    public void setId_categorias(Integer id_categorias) {
        this.idtbl_categorias = id_categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl_omagen() {
        return url_omagen;
    }

    public void setUrl_omagen(String url_omagen) {
        this.url_omagen = url_omagen;
    }

}
