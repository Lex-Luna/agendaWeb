package com.uisrael.AgendaWeb.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cuenta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCuenta;
	private String usuario, contraseña;
	private int estado;

	// Cuenta relacion con Cliente

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY )//
	@JoinColumn(name = "fkCliente")
	private Cliente fkCliente;
	
	// RELACION Cuenta CON Tarea
	@OneToMany(mappedBy = "fkCuenta", cascade = CascadeType.ALL)
	private List<Tarea> listaTarea = new ArrayList<Tarea>();

	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Cliente getFkCliente() {
		return fkCliente;
	}

	public void setFkCliente(Cliente fkCliente) {
		this.fkCliente = fkCliente;
	}

	public List<Tarea> getListaTarea() {
		return listaTarea;
	}

	public void setListaTarea(List<Tarea> listaTarea) {
		this.listaTarea = listaTarea;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", usuario=" + usuario + ", contraseña=" + contraseña + ", estado="
				+ estado + ", fkCliente=" + fkCliente + ", listaTarea=" + listaTarea + "]";
	}

		

}
