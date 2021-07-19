package com.uisrael.AgendaWeb.vista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.uisrael.AgendaWeb.controlador.PrioridadControlador;
import com.uisrael.AgendaWeb.controlador.impl.PrioridadControladorImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Prioridad;


@ManagedBean
@ViewScoped
public class PrioridadVista  implements Serializable{
	private static final long serialVersionUID = 1L;
	private int alta;
	private int media;
	private int baja;
	private PrioridadControlador prioridadControlador;
	private Prioridad nuevoPrioridad, prioridadSeleccionado;

	private List<Prioridad> listaPrioridads;
	PrioridadVista(){
		
	}
	public void init() {
		listaPrioridads = new ArrayList<Prioridad>();
		prioridadControlador = new PrioridadControladorImpl();
		prioridadSeleccionado = new Prioridad();
		listarPrioridads();
	}
	public void insertarPrioridad() {
		nuevoPrioridad = new Prioridad();
		nuevoPrioridad.setMedia(media);
		nuevoPrioridad.setBaja(baja);
		nuevoPrioridad.setAlta(alta);
		prioridadControlador.insertarPrioridad(nuevoPrioridad);
	}
	public void listarPrioridads() {
		listaPrioridads = prioridadControlador.listarPrioridads();
	}
	public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
	}

	public void showInfo() {
		addMessage(FacesMessage.SEVERITY_INFO, "Prioridad", "Se Inserto correctamente..");
	}

	public void showInfoDelete() {
		addMessage(FacesMessage.SEVERITY_INFO, "Prioridad", "Se Elimino correctamente..");
	}

	public void deletePrioridad() {
		// this.products.remove(this.selectedProduct);

		prioridadControlador.eliminarPrioridad(prioridadSeleccionado);
		this.prioridadSeleccionado = null;
		listarPrioridads();
		showInfoDelete();
		
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
	public PrioridadControlador getPrioridadControlador() {
		return prioridadControlador;
	}
	public void setPrioridadControlador(PrioridadControlador prioridadControlador) {
		this.prioridadControlador = prioridadControlador;
	}
	public Prioridad getNuevoPrioridad() {
		return nuevoPrioridad;
	}
	public void setNuevoPrioridad(Prioridad nuevoPrioridad) {
		this.nuevoPrioridad = nuevoPrioridad;
	}
	public Prioridad getPrioridadSeleccionado() {
		return prioridadSeleccionado;
	}
	public void setPrioridadSeleccionado(Prioridad prioridadSeleccionado) {
		this.prioridadSeleccionado = prioridadSeleccionado;
	}
	public List<Prioridad> getListaPrioridads() {
		return listaPrioridads;
	}
	public void setListaPrioridads(List<Prioridad> listaPrioridads) {
		this.listaPrioridads = listaPrioridads;
	}
}
