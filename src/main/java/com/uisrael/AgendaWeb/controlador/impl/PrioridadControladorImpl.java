package com.uisrael.AgendaWeb.controlador.impl;

import java.util.List;

import com.uisrael.AgendaWeb.controlador.PrioridadControlador;
import com.uisrael.AgendaWeb.modelo.dao.PrioridadDao;
import com.uisrael.AgendaWeb.modelo.dao.impl.PrioridadDaoImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Prioridad;

public class PrioridadControladorImpl implements PrioridadControlador{
	private PrioridadDao prioridadDao;
	public PrioridadControladorImpl() {
		prioridadDao =new PrioridadDaoImpl();
	}
	@Override
	public void insertarPrioridad(Prioridad nuevoPrioridad) {
		// TODO Auto-generated method stub
		prioridadDao.insertarPrioridad(nuevoPrioridad);
	}

	@Override
	public void actualizarPrioridad(Prioridad actualizarPrioridad) {
		// TODO Auto-generated method stub
		prioridadDao.insertarPrioridad(actualizarPrioridad);
	}

	@Override
	public void eliminarPrioridad(Prioridad eliminaPrioridad) {
		// TODO Auto-generated method stub
		prioridadDao.eliminarPrioridad(eliminaPrioridad);
	}

	@Override
	public List<Prioridad> listarPrioridads() {
		// TODO Auto-generated method stub
		return prioridadDao.listarPrioridads();
	}
	@Override
	public Prioridad buscarPrioridadId(int id) {
		// TODO Auto-generated method stub
		Prioridad encontrado=new Prioridad();
		encontrado=null;
		
		try {
			encontrado= prioridadDao.buscarPrioridadId(id);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Prioridad buscarPrioridadAlta(int alta) {
		// TODO Auto-generated method stub
		Prioridad encontrado=new Prioridad();
		encontrado=null;
		
		try {
			encontrado= prioridadDao.buscarPrioridadAlta(alta);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Prioridad buscarPrioridadmedia(int media) {
		// TODO Auto-generated method stub
		Prioridad encontrado=new Prioridad();
		encontrado=null;
		
		try {
			encontrado= prioridadDao.buscarPrioridadmedia(media);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Prioridad buscarPrioridadBaja(int baja) {
		// TODO Auto-generated method stub
		Prioridad encontrado=new Prioridad();
		encontrado=null;
		
		try {
			encontrado= prioridadDao.buscarPrioridadBaja(baja);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}

}
