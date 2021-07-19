package com.uisrael.AgendaWeb.modelo.dao;

import java.util.List;

import com.uisrael.AgendaWeb.modelo.entidades.Cliente;

public interface ClienteDao {
	public void insertarCliente(Cliente nuevoCliente);

	public void actualizarCliente(Cliente actualizarCliente);

	public void eliminarCliente(Cliente eliminaCiente);
	
	public Cliente buscarClienteId(int id);
	
	public Cliente buscarClienteNombe(String nombre);
	
	public Cliente buscarClienteApellido(String apellido);
	
	public Cliente buscarClienteEmail(String email);
	
	public Cliente buscarClienteTelefono(int telefono);

	public List<Cliente> listarClientes();
	
}
