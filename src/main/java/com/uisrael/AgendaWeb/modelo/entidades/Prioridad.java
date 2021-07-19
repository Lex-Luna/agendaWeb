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
public class Prioridad implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPrioridad;
	private int alta;
	private int media;
	private int baja;
	
//	Relacion Prioridad Tarea
	@OneToMany(mappedBy = "fkPrioridad", cascade = CascadeType.ALL)
	private List<Tarea> listaTarea = new ArrayList<Tarea>();

	public Prioridad() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Prioridad [idPrioridad=" + idPrioridad + ", alta=" + alta + ", media=" + media + ", baja=" + baja
				+ ", listaTarea=" + listaTarea + "]";
	}

	public int getIdPrioridad() {
		return idPrioridad;
	}

	public void setIdPrioridad(int idPrioridad) {
		this.idPrioridad = idPrioridad;
	}

	public int getAlta() {
		return alta;
	}

	public void setAlta(int alta) {
		this.alta = alta;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public int getBaja() {
		return baja;
	}

	public void setBaja(int baja) {
		this.baja = baja;
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
	
	
	
}
