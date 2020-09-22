package com.mikejh.crud.empleado.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikejh.crud.empleado.model.Empleado;
import com.mikejh.crud.empleado.repository.EmpleadoRepository;
import com.mikejh.crud.empleado.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository repository;

	public Empleado get(String userId) {
		return repository.findById(userId).get();
	}

	public List<Empleado> list() {
		Iterable<Empleado> users = repository.findAll();
		List<Empleado> list = new ArrayList<Empleado>();
		users.forEach(list::add);
		return list;
	}

	public Empleado create(Empleado empleado) {
		return repository.save(empleado);
	}

	public void remove(String empleadoid) {
		repository.deleteById(empleadoid);
	}

}
