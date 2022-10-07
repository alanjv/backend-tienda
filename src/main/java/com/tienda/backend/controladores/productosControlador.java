package com.tienda.backend.controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.backend.modelos.productosModelo;
import com.tienda.backend.servicios.productosServicio;

@RestController
@RequestMapping("/productos")
public class productosControlador {

    @Autowired
    productosServicio productosServicio;

    @GetMapping()
    public ArrayList<productosModelo> obtenerProductos() {
        return productosServicio.obtenerProductos();
    }

    @GetMapping(path = "/{id}")
    public ArrayList<productosModelo> obtenerProducto(@PathVariable("id") Integer id) {
        return this.productosServicio.obtenerProductosPorCategoria();
    }

    @GetMapping(path = "/{id}")
    public ArrayList<productosModelo> obtenerProductoDescripcion(@PathVariable("id") Integer id) {
        return this.productosServicio.obtenerProductosPorDescripcion();
    }

    @PostMapping()
    public productosModelo guardarProducto(@RequestBody productosModelo producto) {
        return this.productosServicio.crearProducto(producto);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarProducto(@PathVariable("id") Integer id) {
        boolean ok = this.productosServicio.eliminarProducto(id);
        if (ok) {
            return "Se eliminó la producto " + id;
        } else {
            return "No pudo eliminar la producto" + id;
        }
    }

}
