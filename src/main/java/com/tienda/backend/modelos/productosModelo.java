package com.tienda.backend.modelos;

public class productosModelo {

    private Integer id_producto;
    private Integer id_categorias;
    private String nombre;
    private String descripcion;
    private String url_omagen;

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getId_categorias() {
        return id_categorias;
    }

    public void setId_categorias(Integer id_categorias) {
        this.id_categorias = id_categorias;
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
