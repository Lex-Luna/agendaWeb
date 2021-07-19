package com.uisrael.AgendaWeb.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Calendario  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCalendario;
	private Date mes, dia, año;
	
	// RELACION Calendario CON Tarea
	@OneToMany(mappedBy = "fkCalendario", cascade = CascadeType.ALL)
	private List<Tarea> listaTarea = new ArrayList<Tarea>();

	public Calendario() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Calendario [idCalendario=" + idCalendario + ", mes=" + mes + ", dia=" + dia + ", año=" + año
				+ ", listaTarea=" + listaTarea + "]";
	}

	public int getIdCalendario() {
		return idCalendario;
	}

	public void setIdCalendario(int idCalendario) {
		this.idCalendario = idCalendario;
	}

	public Date getMes() {
		return mes;
	}

	public void setMes(Date mes) {
		this.mes = mes;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Date getAño() {
		return año;
	}

	public void setAño(Date año) {
		this.año = año;
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
