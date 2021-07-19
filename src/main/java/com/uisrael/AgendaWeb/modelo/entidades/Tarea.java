package com.uisrael.AgendaWeb.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTarea;
	private String titulo, descripcion;
	private Date fechInicio, fechLimite;

	// Tarea relacion con Cuenta
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY )//
	@JoinColumn(name = "fkCuenta")
	private Cuenta fkCuenta;

	// Tarea relacion con Calendario
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY )//
	@JoinColumn(name = "fkCalendario")
	private Calendario fkCalendario;

	// Tarea relacion con Prioridad
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY )//
	@JoinColumn(name = "fkPrioridad")
	private Prioridad fkPrioridad;

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

	public Date getFechInicio() {
		return fechInicio;
	}

	public void setFechInicio(Date fechInicio) {
		this.fechInicio = fechInicio;
	}

	public Date getFechLimite() {
		return fechLimite;
	}

	public void setFechLimite(Date fechLimite) {
		this.fechLimite = fechLimite;
	}

	

	@Override
	public String toString() {
		return "Tarea [idTarea=" + idTarea + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fechInicio="
				+ fechInicio + ", fechLimite=" + fechLimite + ", fkCuenta=" + fkCuenta + ", fkCalendario="
				+ fkCalendario + ", fkPrioridad=" + fkPrioridad + "]";
	}

	public Cuenta getFkCuenta() {
		return fkCuenta;
	}

	public void setFkCuenta(Cuenta fkCuenta) {
		this.fkCuenta = fkCuenta;
	}

	public Calendario getFkCalendario() {
		return fkCalendario;
	}

	public void setFkCalendario(Calendario fkCalendario) {
		this.fkCalendario = fkCalendario;
	}

	public Prioridad getFkPrioridad() {
		return fkPrioridad;
	}

	public void setFkPrioridad(Prioridad fkPrioridad) {
		this.fkPrioridad = fkPrioridad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}