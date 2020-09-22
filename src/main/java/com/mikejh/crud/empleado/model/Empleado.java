package com.mikejh.crud.empleado.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "empleado")
public class Empleado {

	@Id
	private String id;

	private String nombre;
	private String NoEmpleado;
	private double sueldo;
	private String empresa;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNoEmpleado() {
		return NoEmpleado;
	}

	public void setNoEmpleado(String noEmpleado) {
		NoEmpleado = noEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
