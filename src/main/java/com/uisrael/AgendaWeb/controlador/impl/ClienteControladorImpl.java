package com.uisrael.AgendaWeb.controlador.impl;

import java.util.List;

import com.uisrael.AgendaWeb.controlador.ClienteControlador;
import com.uisrael.AgendaWeb.modelo.dao.ClienteDao;
import com.uisrael.AgendaWeb.modelo.dao.impl.ClienteDaoImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Cliente;


public class ClienteControladorImpl implements ClienteControlador{
	private ClienteDao clienteDao;
	
	public ClienteControladorImpl() {
		clienteDao = new ClienteDaoImpl();
	}
	@Override
	public void insertarCliente(Cliente nuevoCliente) {
		// TODO Auto-generated method stub
		clienteDao.insertarCliente(nuevoCliente);
	}

	@Override
	public void actualizarCliente(Cliente actualizarCliente) {
		// TODO Auto-generated method stub
		clienteDao.actualizarCliente(actualizarCliente);
	}

	@Override
	public void eliminarCliente(Cliente eliminaCiente) {
		// TODO Auto-generated method stub
		clienteDao.eliminarCliente( eliminaCiente);
	}

	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return clienteDao.listarClientes();
	}
	@Override
	public Cliente buscarClienteId(int id) {
		// TODO Auto-generated method stub
		Cliente encontrado=new Cliente();
		encontrado=null;
		
		try {
			encontrado= clienteDao.buscarClienteId(id);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
		
	}
	
	@Override
	public Cliente buscarClienteNombe(String nombre) {
		// TODO Auto-generated method stub
		Cliente encontrado=new Cliente();
		encontrado=null;
		
		try {
			encontrado= clienteDao.buscarClienteNombe(nombre);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Cliente buscarClienteApellido(String apellido) {
		// TODO Auto-generated method stub
		Cliente encontrado=new Cliente();
		encontrado=null;
		
		try {
			encontrado= clienteDao.buscarClienteApellido(apellido);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Cliente buscarClienteEmail(String email) {
		Cliente encontrado=new Cliente();
		encontrado=null;
		
		try {
			encontrado= clienteDao.buscarClienteEmail(email);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Cliente buscarClienteTelefono(int telefono) {
		// TODO Auto-generated method stub
		Cliente encontrado=new Cliente();
		encontrado=null;
		
		try {
			encontrado= clienteDao.buscarClienteTelefono(telefono);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	

}
