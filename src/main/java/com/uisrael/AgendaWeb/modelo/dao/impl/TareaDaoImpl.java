package com.uisrael.AgendaWeb.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.uisrael.AgendaWeb.modelo.dao.TareaDao;
import com.uisrael.AgendaWeb.modelo.entidades.Tarea;

public class TareaDaoImpl implements TareaDao{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaWeb_PU");
	// abrir paso2
	EntityManager em = emf.createEntityManager();
	@Override
	public void insertarTarea(Tarea nuevoTarea) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.persist(nuevoTarea);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void actualizarTarea(Tarea actualizarTarea) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.merge(actualizarTarea);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void eliminarTarea(Tarea eliminaTarea) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		eliminaTarea = em.merge(eliminaTarea);
		// realizo query paso 4
		em.remove(eliminaTarea);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public List<Tarea> listarTareas() {
		// TODO Auto-generated method stub
		TypedQuery<Tarea> query = em.createQuery("Select tar From Tarea tar", Tarea.class);
		// ejecutar consulta paso 4
		return query.getResultList();
	}

	@Override
	public Tarea buscarTareaId(int id) {
		// TODO Auto-generated method stub
		TypedQuery<Tarea> query = em.createQuery("Select tar From Tarea tar where tar.idTarea =" + id, Tarea.class);//'" + id + "'
		return query.getSingleResult();
	}

	@Override
	public Tarea buscarTareaTitulo(String titulo) {
		// TODO Auto-generated method stub
		TypedQuery<Tarea> query = em.createQuery("Select tar From Tarea tar where tar.titulo ='" + titulo +"'", Tarea.class);//'" + nombre + "'
		return query.getSingleResult();
	}

	@Override
	public Tarea buscarTareaDescripcion(String descripcion) {
		// TODO Auto-generated method stub
		TypedQuery<Tarea> query = em.createQuery("Select tar From Tarea tar where tar.descripcion ='" + descripcion +"'", Tarea.class);//'" + nombre + "'
		return query.getSingleResult();
	}

}
