package com.tienda.backend.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.backend.modelos.usuarioModelo;

@Repository
public interface usuarioRepositorio extends CrudRepository<usuarioModelo, Integer> {

}
