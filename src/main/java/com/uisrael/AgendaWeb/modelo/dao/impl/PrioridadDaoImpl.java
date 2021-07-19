package com.uisrael.AgendaWeb.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import com.uisrael.AgendaWeb.modelo.dao.PrioridadDao;
import com.uisrael.AgendaWeb.modelo.entidades.Prioridad;



public class PrioridadDaoImpl  implements PrioridadDao{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaWeb_PU");
	// abrir paso2
	EntityManager em = emf.createEntityManager();
	@Override
	public void insertarPrioridad(Prioridad nuevoPrioridad) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.persist(nuevoPrioridad);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void actualizarPrioridad(Prioridad actualizarPrioridad) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.merge(actualizarPrioridad);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void eliminarPrioridad(Prioridad eliminaPrioridad) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		eliminaPrioridad = em.merge(eliminaPrioridad);
		// realizo query paso 4
		em.remove(eliminaPrioridad);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public List<Prioridad> listarPrioridads() {
		// TODO Auto-generated method stub
		TypedQuery<Prioridad> query = em.createQuery("Select pri From Prioridad pri", Prioridad.class);
		// ejecutar consulta paso 4
		return query.getResultList();
	}

	@Override
	public Prioridad buscarPrioridadId(int id) {
		// TODO Auto-generated method stub
		TypedQuery<Prioridad> query = em.createQuery("Select pri From Prioridad pri where pri.idPrioridad =" + id, Prioridad.class);//'" + id + "'
		return query.getSingleResult();
	}

	@Override
	public Prioridad buscarDescripcion(String descripcion) {
		// TODO Auto-generated method stub
		TypedQuery<Prioridad> query = em.createQuery("Select pri From Prioridad pri where pri.descripcion ='" + descripcion +"'", Prioridad.class);//'" + nombre + "'
		return query.getSingleResult();
	}



}
