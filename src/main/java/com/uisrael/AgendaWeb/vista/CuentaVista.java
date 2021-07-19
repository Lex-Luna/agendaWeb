package com.uisrael.AgendaWeb.vista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.uisrael.AgendaWeb.controlador.CuentaControlador;
import com.uisrael.AgendaWeb.controlador.impl.CuentaControladorImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Cuenta;


@ManagedBean
@ViewScoped
public class CuentaVista  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String usuario, contrase�a;
	private CuentaControlador cuentaControlador;
	private Cuenta nuevoCuenta, cuentaSeleccionado;

	private List<Cuenta> listaCuentas;
	 CuentaVista(){
		 
	 }
	 @PostConstruct
		public void init() {
			listaCuentas = new ArrayList<Cuenta>();
			cuentaControlador = new CuentaControladorImpl();
			cuentaSeleccionado = new Cuenta();
			listarCuenta();
		}
	 public void insertarCuenta() {
			nuevoCuenta = new Cuenta();
			nuevoCuenta.setContrase�a(contrase�a);
			nuevoCuenta.setUsuario(usuario);;
			
		}
	 public void listarCuenta() {
			listaCuentas = cuentaControlador.listarCuentas();
		}
	 public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
		}

		public void showInfo() {
			addMessage(FacesMessage.SEVERITY_INFO, "Cuenta", "Se Inserto correctamente..");
		}

		public void showInfoDelete() {
			addMessage(FacesMessage.SEVERITY_INFO, "Cuenta", "Se Elimino correctamente..");
		}

		public void deleteCuenta() {
			// this.products.remove(this.selectedProduct);

			cuentaControlador.eliminarCuenta(cuentaSeleccionado);
			this.cuentaSeleccionado = null;
			listarCuenta();
			showInfoDelete();
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getContrase�a() {
			return contrase�a;
		}
		public void setContrase�a(String contrase�a) {
			this.contrase�a = contrase�a;
		}
		public CuentaControlador getCuentaControlador() {
			return cuentaControlador;
		}
		public void setCuentaControlador(CuentaControlador cuentaControlador) {
			this.cuentaControlador = cuentaControlador;
		}
		public Cuenta getNuevoCuenta() {
			return nuevoCuenta;
		}
		public void setNuevoCuenta(Cuenta nuevoCuenta) {
			this.nuevoCuenta = nuevoCuenta;
		}
		public Cuenta getCuentaSeleccionado() {
			return cuentaSeleccionado;
		}
		public void setCuentaSeleccionado(Cuenta cuentaSeleccionado) {
			this.cuentaSeleccionado = cuentaSeleccionado;
		}
		public List<Cuenta> getListaCuentas() {
			return listaCuentas;
		}
		public void setListaCuentas(List<Cuenta> listaCuentas) {
			this.listaCuentas = listaCuentas;
		}
		
		
}
