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
	private String descripcion;
	
//	Relacion Prioridad con DetalleTarea
	@OneToMany(mappedBy = "fkPrioridad", cascade = CascadeType.ALL)
	private List<DetalleTarea> listaDetalleTarea = new ArrayList<DetalleTarea>();

	public List<DetalleTarea> getListaDetalleTarea() {
		return listaDetalleTarea;
	}


	public Prioridad() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Prioridad [idPrioridad=" + idPrioridad + ", descripcion=" + descripcion + ", listaDetalleTarea="
				+ listaDetalleTarea + "]";
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setListaDetalleTarea(List<DetalleTarea> listaDetalleTarea) {
		this.listaDetalleTarea = listaDetalleTarea;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	

	public int getIdPrioridad() {
		return idPrioridad;
	}

	public void setIdPrioridad(int idPrioridad) {
		this.idPrioridad = idPrioridad;
	}


	
	
	
	
}
