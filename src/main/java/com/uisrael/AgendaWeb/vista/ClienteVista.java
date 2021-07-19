package com.uisrael.AgendaWeb.vista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

import com.uisrael.AgendaWeb.controlador.ClienteControlador;
import com.uisrael.AgendaWeb.controlador.impl.ClienteControladorImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Cliente;

@ManagedBean
@ViewScoped
public class ClienteVista implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombres;
	private String apellido;
	private String email;
	private int telefono;

	private ClienteControlador clienteControlador;
	private Cliente nuevoCliente, clienteSeleccionado;

	private List<Cliente> listaClientes;

	

	public ClienteVista() {

	}

	@PostConstruct
	public void init() {
		listaClientes = new ArrayList<Cliente>();
		clienteControlador = new ClienteControladorImpl();
		clienteSeleccionado = new Cliente();
		listarCliente();
	}

	public void insertarCliente() {
		nuevoCliente = new Cliente();
		nuevoCliente.setNombres(nombres);
		nuevoCliente.setApellido(apellido);
		nuevoCliente.setEmail(email);
		nuevoCliente.setTelefono(telefono);
		try {
			clienteControlador.insertarCliente(nuevoCliente);
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Cliente Registardo"));
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("ERROR AL REGISTRAR CLIENTE"));
		}
		PrimeFaces.current().executeScript("PF('clienteDialogo').hide()");//desaparezca el dalogo
		PrimeFaces.current().ajax().update("frmCliente:mensaje","frmCliente:cliente");//actualizar tabla clinte
	}

	public void listarCliente() {
		listaClientes = clienteControlador.listarClientes();
	}

	public void limpiar() {
		nombres = "";
		apellido = "";
		email = "";
//		telefono ="0" ;
	}

	public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
	}

	public void showInfo() {
		addMessage(FacesMessage.SEVERITY_INFO, "Cliente", "Se Inserto correctamente..");
	}

	public void showInfoDelete() {
		addMessage(FacesMessage.SEVERITY_INFO, "Cliente", "Se Elimino correctamente..");
	}

	public void deleteCliente() {
		// this.products.remove(this.selectedProduct);

		clienteControlador.eliminarCliente(clienteSeleccionado);
		this.clienteSeleccionado = null;
		listarCliente();
		showInfoDelete();
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public ClienteControlador getClienteControlador() {
		return clienteControlador;
	}

	public void setClienteControlador(ClienteControlador clienteControlador) {
		this.clienteControlador = clienteControlador;
	}

	public Cliente getNuevoCliente() {
		return nuevoCliente;
	}

	public void setNuevoCliente(Cliente nuevoCliente) {
		this.nuevoCliente = nuevoCliente;
	}

	public Cliente getClienteSeleccionado() {
		return clienteSeleccionado;
	}

	public void setClienteSeleccionado(Cliente clienteSeleccionado) {
		this.clienteSeleccionado = clienteSeleccionado;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}
