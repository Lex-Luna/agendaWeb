package com.uisrael.AgendaWeb.vista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.uisrael.AgendaWeb.controlador.CalendarioControlador;
import com.uisrael.AgendaWeb.controlador.impl.CalendarioControladorImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Calendario;


@ManagedBean
@ViewScoped
public class CalendarioVista implements Serializable{
	private static final long serialVersionUID = 1L;
	private Date mes, dia, año;
	private CalendarioControlador CalendarioControlador;
	private Calendario nuevoCalendario, CalendarioSeleccionado;

	private List<Calendario> listaCalendarios;
	CalendarioVista(){
		
	}
	@PostConstruct
	public void init() {
		listaCalendarios = new ArrayList<Calendario>();
		CalendarioControlador = new CalendarioControladorImpl();
		CalendarioSeleccionado = new Calendario();
		listarCalendarios();
	}
	public void insertarCalendario() {
		nuevoCalendario = new Calendario();
		nuevoCalendario.setDia(dia);
		nuevoCalendario.setMes(mes);
		nuevoCalendario.setAño(año);
		CalendarioControlador.insertarCalendario(nuevoCalendario);
	}
	public void listarCalendarios() {
		listaCalendarios = CalendarioControlador.listarCalendarios();
	}
	public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
	}

	public void showInfo() {
		addMessage(FacesMessage.SEVERITY_INFO, "Calendario", "Se Inserto correctamente..");
	}

	public void showInfoDelete() {
		addMessage(FacesMessage.SEVERITY_INFO, "Calendario", "Se Elimino correctamente..");
	}
	public void deleteCalendario() {
		// this.products.remove(this.selectedProduct);

		CalendarioControlador.eliminarCalendario(CalendarioSeleccionado);
		this.CalendarioSeleccionado = null;
		listarCalendarios();
		showInfoDelete();
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
	public CalendarioControlador getCalendarioControlador() {
		return CalendarioControlador;
	}
	public void setCalendarioControlador(CalendarioControlador calendarioControlador) {
		CalendarioControlador = calendarioControlador;
	}
	public Calendario getNuevoCalendario() {
		return nuevoCalendario;
	}
	public void setNuevoCalendario(Calendario nuevoCalendario) {
		this.nuevoCalendario = nuevoCalendario;
	}
	public Calendario getCalendarioSeleccionado() {
		return CalendarioSeleccionado;
	}
	public void setCalendarioSeleccionado(Calendario calendarioSeleccionado) {
		CalendarioSeleccionado = calendarioSeleccionado;
	}
	public List<Calendario> getListaCalendarios() {
		return listaCalendarios;
	}
	public void setListaCalendarios(List<Calendario> listaCalendarios) {
		this.listaCalendarios = listaCalendarios;
	}
	
	
}
