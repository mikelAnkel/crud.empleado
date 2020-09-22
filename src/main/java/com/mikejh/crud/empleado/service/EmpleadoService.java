package com.mikejh.crud.empleado.service;


import java.util.List;

import com.mikejh.crud.empleado.model.Empleado;

public interface  EmpleadoService {
	
	Empleado get(String userId);
   
    List<Empleado> list();

    Empleado create(Empleado empleado);
    
	void remove(String empleadoid);
}
