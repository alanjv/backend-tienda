package com.tienda.backend.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.backend.modelos.productosModelo;

@Repository
public interface productosRepositorio extends CrudRepository<productosModelo, Integer> {

}
