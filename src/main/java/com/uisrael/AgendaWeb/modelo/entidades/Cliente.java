package com.uisrael.AgendaWeb.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	private String nombres;
	private String apellido;
	private String email;
	private int telefono;

	

	// RELACION CLIENTE CON cuenta
	@OneToMany(mappedBy = "fkCliente", cascade = CascadeType.ALL)
	private List<Cuenta> listaCuenta = new ArrayList<Cuenta>();



	

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombres=" + nombres + ", apellido=" + apellido + ", email="
				+ email + ", telefono=" + telefono + ", listaCuenta=" + listaCuenta + "]";
	}

	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
}
