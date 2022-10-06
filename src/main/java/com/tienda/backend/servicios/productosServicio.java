package com.tienda.backend.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.backend.modelos.productosModelo;
import com.tienda.backend.repositorio.productosRepositorio;

@Service
public class productosServicio {
    @Autowired
    productosRepositorio productosRepositorio;

    public ArrayList<productosModelo> obtenerProductos() {
        return (ArrayList<productosModelo>) productosRepositorio.findAll();
    }

    public productosModelo guardarProducto(productosModelo categoria) {
        return productosRepositorio.save(categoria);
    }

    public ArrayList<productosModelo> obtenerProductosPorCategoria() {
        return (ArrayList<productosModelo>) productosRepositorio.findAllById(null);
    }

    public ArrayList<productosModelo> obtenerProductosPorDescripcion() {
        return (ArrayList<productosModelo>) productosRepositorio.findAllById(null);
    }

    public boolean eliminarProducto(Integer id) {
        try {
            productosRepositorio.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
