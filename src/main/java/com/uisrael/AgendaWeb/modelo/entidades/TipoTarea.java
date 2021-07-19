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
public class TipoTarea implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoTarea;
	private String descripcion;
	
//	Relacion TipoTarea con DetalleTarea
	@OneToMany(mappedBy = "fkTipoTarea", cascade = CascadeType.ALL)
	private List<DetalleTarea> listaDetalleTarea = new ArrayList<DetalleTarea>();

	public int getIdTipoTarea() {
		return idTipoTarea;
	}

	public void setIdTipoTarea(int idTipoTarea) {
		this.idTipoTarea = idTipoTarea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<DetalleTarea> getListaDetalleTarea() {
		return listaDetalleTarea;
	}

	public void setListaDetalleTarea(List<DetalleTarea> listaDetalleTarea) {
		this.listaDetalleTarea = listaDetalleTarea;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TipoTarea [idTipoTarea=" + idTipoTarea + ", descripcion=" + descripcion + ", listaDetalleTarea="
				+ listaDetalleTarea + "]";
	}

	public TipoTarea() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
