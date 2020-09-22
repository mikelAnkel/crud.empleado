package com.mikejh.crud.empleado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mikejh.crud.empleado.model.Empleado;
import com.mikejh.crud.empleado.service.EmpleadoService;

@RestController
public class EmpleadoController {

	@Autowired
	private EmpleadoService service;

	@RequestMapping(value = "/empleados", method = RequestMethod.GET)
	public ResponseEntity<List<Empleado>> list() {
		System.out.println("lista de empleados");
		return new ResponseEntity(service.list(), HttpStatus.OK);
	}

	@RequestMapping(value = "/empleado", method = RequestMethod.GET)
	public ResponseEntity<Empleado> getById(@RequestParam(value = "idEmpleado") String idEmpleado) {

		Empleado empleado = service.get(idEmpleado);
		return new ResponseEntity(empleado, HttpStatus.OK);
	}

	@RequestMapping(value = "/empleado", method = RequestMethod.POST)
	public ResponseEntity<Empleado> create(@Validated @RequestBody Empleado empleado) {
		Empleado nuevoEmpleado = service.create(empleado);
		return new ResponseEntity(nuevoEmpleado, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/empleado", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@RequestParam(value = "idEmpleado") String idEmpleado) {
		service.remove(idEmpleado);

		return new ResponseEntity(HttpStatus.OK);
	}

}
