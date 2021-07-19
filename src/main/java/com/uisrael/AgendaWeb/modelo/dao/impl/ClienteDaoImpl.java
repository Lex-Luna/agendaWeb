package com.uisrael.AgendaWeb.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.uisrael.AgendaWeb.modelo.dao.ClienteDao;
import com.uisrael.AgendaWeb.modelo.entidades.Cliente;

public class ClienteDaoImpl implements ClienteDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaWeb_PU");
	// abrir paso2
	EntityManager em = emf.createEntityManager();
	@Override
	public void insertarCliente(Cliente nuevoCliente) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.persist(nuevoCliente);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void actualizarCliente(Cliente actualizarCliente) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.merge(actualizarCliente);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void eliminarCliente(Cliente eliminaCiente) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		eliminaCiente = em.merge(eliminaCiente);
		// realizo query paso 4
		em.remove(eliminaCiente);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = em.createQuery("Select cli From Cliente cli", Cliente.class);
		// ejecutar consulta paso 4
		return query.getResultList();
	}

	@Override
	public Cliente buscarClienteId(int id) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = em.createQuery("Select cli From Cliente cli where cli.idCliente =" + id, Cliente.class);//'" + id + "'
		return query.getSingleResult();
	}

	@Override
	public Cliente buscarClienteNombe(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = em.createQuery("Select cli From Cliente cli where cli.nombres ='" + nombre +"'", Cliente.class);//'" + nombre + "'
		return query.getSingleResult();
	}

	@Override
	public Cliente buscarClienteApellido(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = em.createQuery("Select cli From Cliente cli where cli.apellido ='" + apellido +"'", Cliente.class);//'" + nombre + "'
		return query.getSingleResult();
	}

	@Override
	public Cliente buscarClienteEmail(String email) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = em.createQuery("Select cli From Cliente cli where cli.email ='" + email +"'", Cliente.class);//'" + nombre + "'
		return query.getSingleResult();
	}

	@Override
	public Cliente buscarClienteTelefono(int telefono) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = em.createQuery("Select cli From Cliente cli where cli.telefono =" + telefono, Cliente.class);//'" + id + "'
		return query.getSingleResult();
	}

//


	

}
