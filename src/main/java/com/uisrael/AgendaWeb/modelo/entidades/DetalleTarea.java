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
public class DetalleTarea implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalleTarea;
	private Date fechInicio;
	private Date fechLimite;
	private String observacion;
	
//	DetalleTrea relacionada con Priridad
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY )//
	@JoinColumn(name = "fkPrioridad")
	private Prioridad fkPrioridad;

//	DetalleTrea relacionada con Tarea
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY )//
	@JoinColumn(name = "fkTarea")
	private Tarea fkTarea;
	
//	DetalleTrea relacionada con TipoTarea
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY )//
	@JoinColumn(name = "fkTipoTarea")
	private TipoTarea fkTipoTarea;
	
	public TipoTarea getFkTipoTarea() {
		return fkTipoTarea;
	}

	public void setFkTipoTarea(TipoTarea fkTipoTarea) {
		this.fkTipoTarea = fkTipoTarea;
	}

	public int getIdDetalleTarea() {
		return idDetalleTarea;
	}

	public void setIdDetalleTarea(int idDetalleTarea) {
		this.idDetalleTarea = idDetalleTarea;
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

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
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

	public Tarea getFkTarea() {
		return fkTarea;
	}

	public void setFkTarea(Tarea fkTarea) {
		this.fkTarea = fkTarea;
	}

	@Override
	public String toString() {
		return "DetalleTarea [idDetalleTarea=" + idDetalleTarea + ", fechInicio=" + fechInicio + ", fechLimite="
				+ fechLimite + ", observacion=" + observacion + ", fkPrioridad=" + fkPrioridad + ", fkTarea=" + fkTarea
				+ ", fkTipoTarea=" + fkTipoTarea + "]";
	}

	public DetalleTarea() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
