package com.uisrael.AgendaWeb.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.uisrael.AgendaWeb.modelo.dao.TipoTareaDao;
import com.uisrael.AgendaWeb.modelo.entidades.TipoTarea;

public class TipoTareaDaoImpl implements TipoTareaDao{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaWeb_PU");
	// abrir paso2
	EntityManager em = emf.createEntityManager();
	@Override
	public void insertarTipoTarea(TipoTarea nuevoTipoTarea) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.persist(nuevoTipoTarea);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void actualizarTipoTarea(TipoTarea actualizarTipoTarea) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.merge(actualizarTipoTarea);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void eliminarTipoTarea(TipoTarea elimina) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
//		eliminarTipoTarea = em.merge(elimina);
		elimina= em.merge(elimina);
		// realizo query paso 4
		em.remove(elimina);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public TipoTarea buscarTipoTareaId(int id) {
		// TODO Auto-generated method stub
		TypedQuery<TipoTarea> query = em.createQuery("Select tTar From TipoTarea tTar where tTar.idTipoTarea=" + id, TipoTarea.class);//'" + id + "'
		return query.getSingleResult();
	}

	@Override
	public List<TipoTarea> listarTipoTareas() {
		// TODO Auto-generated method stub
		TypedQuery<TipoTarea> query = em.createQuery("Select tTar From TipoTarea tTar", TipoTarea.class);
		// ejecutar consulta paso 4
		return query.getResultList();
	}

	@Override
	public TipoTarea buscarTipoTareaDescripcion(String descripcion) {
		// TODO Auto-generated method stub
		TypedQuery<TipoTarea> query = em.createQuery("Select tTar From TipoTarea tTar where tTar.descripcion ='" + descripcion +"'", TipoTarea.class);//'" + nombre + "'
		return query.getSingleResult();
	}

}
