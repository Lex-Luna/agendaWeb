package com.uisrael.AgendaWeb.modelo.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.uisrael.AgendaWeb.modelo.dao.CuentaDao;
import com.uisrael.AgendaWeb.modelo.entidades.Cuenta;

public class CuentaDaoImpl implements CuentaDao{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaWeb_PU");
	// abrir paso2
	EntityManager em = emf.createEntityManager();

	@Override
	public void insertarCuenta(Cuenta nuevoCuenta) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.persist(nuevoCuenta);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void actualizarCuenta(Cuenta actualizarCuenta) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		// realizo query paso 4
		em.merge(actualizarCuenta);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public void eliminarCuenta(Cuenta eliminaCuenta) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		eliminaCuenta = em.merge(eliminaCuenta);
		// realizo query paso 4
		em.remove(eliminaCuenta);
		// guardar paso 5
		em.getTransaction().commit();
	}

	@Override
	public List<Cuenta> listarCuentas() {
		// TODO Auto-generated method stub
		TypedQuery<Cuenta> query = em.createQuery("Select cue From Cuenta cue", Cuenta.class);
		// ejecutar consulta paso 4
		return query.getResultList();
	}

	@Override
	public Cuenta buscarCuentaId(int id) {
		// TODO Auto-generated method stub
		TypedQuery<Cuenta> query = em.createQuery("Select cue From Cuenta cue where cue.idCuenta =" + id, Cuenta.class);//'" + id + "'
		return query.getSingleResult();
	}

	@Override
	public Cuenta buscarCuentaUsu(String usuario) {
		// TODO Auto-generated method stub
		TypedQuery<Cuenta> query = em.createQuery("Select cue From Cuenta cue where cue.usuario ='" + usuario +"'", Cuenta.class);//'" + nombre + "'
		return query.getSingleResult();
	}

}
