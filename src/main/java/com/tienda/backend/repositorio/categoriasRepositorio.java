package com.tienda.backend.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.backend.modelos.categoriasModelo;

@Repository
public interface categoriasRepositorio extends CrudRepository<categoriasModelo, Integer> {

}
