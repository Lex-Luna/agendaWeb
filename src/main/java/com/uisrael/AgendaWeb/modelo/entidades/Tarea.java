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
public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTarea;
	private String titulo, descripcion;

	// Tarea relacion con Cuenta
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY )//
	@JoinColumn(name = "fkCuenta")
	private Cuenta fkCuenta;

	
//	Relacion Tarea con DetalleTarea
	@OneToMany(mappedBy = "fkPrioridad", cascade = CascadeType.ALL)
	private List<DetalleTarea> listaDetalleTarea = new ArrayList<DetalleTarea>();
	

	public Tarea() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	Cuenta getFkCuenta() {
		return fkCuenta;
	}

	public void setFkCuenta(Cuenta fkCuenta) {
		this.fkCuenta = fkCuenta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}