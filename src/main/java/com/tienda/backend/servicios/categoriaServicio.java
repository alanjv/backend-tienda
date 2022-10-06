package com.tienda.backend.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.backend.modelos.categoriasModelo;
import com.tienda.backend.repositorio.categoriasRepositorio;

@Service
public class categoriaServicio {
    @Autowired
    categoriasRepositorio categoriasRepositorio;

    public ArrayList<categoriasModelo> obtenerCategorias() {
        return (ArrayList<categoriasModelo>) categoriasRepositorio.findAll();
    }

    public categoriasModelo crearCategoria(categoriasModelo categoria) {
        return categoriasRepositorio.save(categoria);
    }

    public boolean eliminarCategoria(Integer id) {
        try {
            categoriasRepositorio.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}