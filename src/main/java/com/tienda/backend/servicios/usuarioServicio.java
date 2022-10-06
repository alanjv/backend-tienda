package com.tienda.backend.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.backend.modelos.usuarioModelo;
import com.tienda.backend.repositorio.usuarioRepositorio;

@Service
public class usuarioServicio {
    @Autowired
    usuarioRepositorio usuarioRepositorio;

    public ArrayList<usuarioModelo> obtenerUsuario() {
        return (ArrayList<usuarioModelo>) usuarioRepositorio.findAll();
    }

    public usuarioModelo crearUsuario(usuarioModelo usuario) {
        return usuarioRepositorio.save(usuario);
    }
}
