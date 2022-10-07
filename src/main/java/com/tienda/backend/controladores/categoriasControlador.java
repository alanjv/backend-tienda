package com.tienda.backend.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.backend.modelos.categoriasModelo;
import com.tienda.backend.servicios.categoriaServicio;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class categoriasControlador {

    @Autowired
    categoriaServicio categoriaServicio;

    @GetMapping()
    public ArrayList<categoriasModelo> obtenerCategrias() {
        return categoriaServicio.obtenerCategorias();
    }

    @PostMapping()
    public categoriasModelo crearCategoria(@RequestBody categoriasModelo categoria) {
        return this.categoriaServicio.crearCategoria(categoria);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarCategoria(@PathVariable("id") Integer id) {
        boolean ok = this.categoriaServicio.eliminarCategoria(id);
        if (ok) {
            return "Se eliminó la categoria " + id;
        } else {
            return "No pudo eliminar la categoria" + id;
        }
    }

}
