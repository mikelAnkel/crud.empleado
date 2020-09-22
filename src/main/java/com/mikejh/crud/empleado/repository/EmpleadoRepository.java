package com.mikejh.crud.empleado.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mikejh.crud.empleado.model.Empleado;

@Repository
public interface EmpleadoRepository extends MongoRepository< Empleado, String > {
    
	
	
}