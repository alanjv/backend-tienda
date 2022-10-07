package com.tienda.backend.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.backend.modelos.usuarioModelo;
import com.tienda.backend.servicios.usuarioServicio;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class usurariosControlador {

    @Autowired
    usuarioServicio usuarioServicio;

    @GetMapping()
    public ArrayList<usuarioModelo> obtenerUsuarios() {
        return usuarioServicio.obtenerUsuario();
    }

    @PostMapping()
    public usuarioModelo crearUsuario(@RequestBody usuarioModelo usuario) {
        return this.usuarioServicio.crearUsuario(usuario);
    }
}
