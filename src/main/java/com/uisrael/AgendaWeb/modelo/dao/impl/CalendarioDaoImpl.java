package com.uisrael.AgendaWeb.modelo.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.uisrael.AgendaWeb.modelo.dao.CalendarioDao;
import com.uisrael.AgendaWeb.modelo.entidades.Calendario;


public class CalendarioDaoImpl  implements CalendarioDao{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaWeb_PU");
	// abrir paso2
	EntityManager em = emf.createEntityManager();
	@Override
	public void insertarCalendario(Calendario nuevoCalendario) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.persist(nuevoCalendario);
		// guardar paso 5
		em.getTransaction().commit();
		
	}
	@Override
	public void actualizarCalendario(Calendario actualizarCalendario) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.merge(actualizarCalendario);
		// guardar paso 5
		em.getTransaction().commit();
	}
	@Override
	public void eliminarCalendario(Calendario eliminaCalendario) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		eliminaCalendario = em.merge(eliminaCalendario);
		// realizo query paso 4
		em.remove(eliminaCalendario);
		// guardar paso 5
		em.getTransaction().commit();
	}
	@Override
	public List<Calendario> listarCalendarios() {
		// TODO Auto-generated method stub
		TypedQuery<Calendario> query = em.createQuery("Select cal From Calendario cal", Calendario.class);
		// ejecutar consulta paso 4
		return query.getResultList();
	}
	@Override
	public Calendario buscarCalendarioId(int id) {
		// TODO Auto-generated method stub
		TypedQuery<Calendario> query = em.createQuery("Select cal From Calendario cal where cal.idCalendario =" + id, Calendario.class);//'" + id + "'
		return query.getSingleResult();
	}
	@Override
	public Calendario buscarCalendarioDia(Date dia) {
		// TODO Auto-generated method stub
		TypedQuery<Calendario> query = em.createQuery("Select cal From Calendario cal where cal.dia ='" + dia +"'", Calendario.class);//'" + nombre + "'
		return query.getSingleResult();
	}
	@Override
	public Calendario buscarCalendarioMes(Date mes) {
		// TODO Auto-generated method stub
		TypedQuery<Calendario> query = em.createQuery("Select cal From Calendario cal where cal.mes ='" + mes +"'", Calendario.class);//'" + nombre + "'
		return query.getSingleResult();
	}
	@Override
	public Calendario buscarCalendarioAño(Date año) {
		// TODO Auto-generated method stub
		TypedQuery<Calendario> query = em.createQuery("Select cal From Calendario cal where cal.año ='" + año +"'", Calendario.class);//'" + nombre + "'
		return query.getSingleResult();
	}
	
	
	
	
	

}
