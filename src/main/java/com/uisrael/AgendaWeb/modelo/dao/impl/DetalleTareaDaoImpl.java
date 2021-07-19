package com.uisrael.AgendaWeb.modelo.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.uisrael.AgendaWeb.modelo.dao.DetalleTareaDao;
import com.uisrael.AgendaWeb.modelo.entidades.DetalleTarea;



public class DetalleTareaDaoImpl implements DetalleTareaDao{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaWeb_PU");
	// abrir paso2
	EntityManager em = emf.createEntityManager();
	
	@Override
	public void insertarDetalleTarea(DetalleTarea nuevoDetalleTarea) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.persist(nuevoDetalleTarea);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void actualizarDetalleTarea(DetalleTarea actualizarDetalleTarea) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.merge(actualizarDetalleTarea);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void eliminarDetalleTarea(DetalleTarea eliminaDetalleTarea) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		eliminaDetalleTarea = em.merge(eliminaDetalleTarea);
		// realizo query paso 4
		em.remove(eliminaDetalleTarea);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public DetalleTarea buscarDetalleTareaId(int id) {
		// TODO Auto-generated method stub
		TypedQuery<DetalleTarea> query = em.createQuery("Select dTar From DetalleTarea dTar where dTar.idDetalleTarea =" + id, DetalleTarea.class);//'" + id + "'
		return query.getSingleResult();
	}

	@Override
	public DetalleTarea buscarFechaInicio(Date fechaInicio) {
		// TODO Auto-generated method stub
		TypedQuery<DetalleTarea> query = em.createQuery("Select dTar From DetalleTarea dTar where dTar.fechInicio =" + fechaInicio+ "'", DetalleTarea.class);//'" + id + "'
		return query.getSingleResult();
	}

	@Override
	public DetalleTarea buscarFechaLimite(Date fechaLimite) {
		// TODO Auto-generated method stub
		TypedQuery<DetalleTarea> query = em.createQuery("Select dTar From DetalleTarea dTar where dTar.fechLimite =" + fechaLimite+ "'", DetalleTarea.class);//'" + id + "'
		return query.getSingleResult();
	}
	
	@Override
	public DetalleTarea buscarObservacion(String observacion) {
		// TODO Auto-generated method stub
		TypedQuery<DetalleTarea> query = em.createQuery("Select dTar From DetalleTarea dTar where dTar.observacion =" + observacion+ "'", DetalleTarea.class);//'" + id + "'
		return query.getSingleResult();
	}

	@Override
	public List<DetalleTarea> listarDetalleTarea() {
		// TODO Auto-generated method stub
		TypedQuery<DetalleTarea> query = em.createQuery("Select dTar From DetalleTarea dTar", DetalleTarea.class);
		// ejecutar consulta paso 4
		return query.getResultList();
	}

	

}
