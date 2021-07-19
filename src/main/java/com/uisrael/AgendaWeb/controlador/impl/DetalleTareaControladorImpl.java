package com.uisrael.AgendaWeb.controlador.impl;

import java.util.Date;
import java.util.List;

import com.uisrael.AgendaWeb.controlador.DetalleTareaControlador;
import com.uisrael.AgendaWeb.modelo.dao.DetalleTareaDao;
import com.uisrael.AgendaWeb.modelo.dao.impl.DetalleTareaDaoImpl;
import com.uisrael.AgendaWeb.modelo.entidades.DetalleTarea;



public class DetalleTareaControladorImpl implements DetalleTareaControlador{
	private DetalleTareaDao detalleTareaDao;
	public DetalleTareaControladorImpl() {
		detalleTareaDao= new DetalleTareaDaoImpl();
	}
	@Override
	public void insertarDetalleTarea(DetalleTarea nuevoDetalleTarea) {
		// TODO Auto-generated method stub
		detalleTareaDao.insertarDetalleTarea(nuevoDetalleTarea);
	}

	@Override
	public void actualizarDetalleTarea(DetalleTarea actualizarDetalleTarea) {
		// TODO Auto-generated method stub
		detalleTareaDao.actualizarDetalleTarea(actualizarDetalleTarea);
	}

	@Override
	public void eliminarDetalleTarea(DetalleTarea eliminaDetalleTarea) {
		// TODO Auto-generated method stub
		detalleTareaDao.eliminarDetalleTarea(eliminaDetalleTarea);
	}

	@Override
	public DetalleTarea buscarDetalleTareaId(int id) {
		// TODO Auto-generated method stub
		DetalleTarea encontrado=new DetalleTarea();
		encontrado=null;
		
		try {
			encontrado= detalleTareaDao.buscarDetalleTareaId(id);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}

	@Override
	public DetalleTarea buscarFechaInicio(Date fechaInicio) {
		// TODO Auto-generated method stub
		DetalleTarea encontrado=new DetalleTarea();
		encontrado=null;
		
		try {
			encontrado= detalleTareaDao.buscarFechaInicio(fechaInicio);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}

	@Override
	public DetalleTarea buscarFechaLimite(Date fechaLimite) {
		// TODO Auto-generated method stub
		DetalleTarea encontrado=new DetalleTarea();
		encontrado=null;
		
		try {
			encontrado= detalleTareaDao.buscarFechaLimite(fechaLimite);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}

	@Override
	public List<DetalleTarea> listarDetalleTarea() {
		// TODO Auto-generated method stub
		return detalleTareaDao.listarDetalleTarea();
	}

	@Override
	public DetalleTarea buscarObservacion(String observacion) {
		// TODO Auto-generated method stub
		DetalleTarea encontrado=new DetalleTarea();
		encontrado=null;
		
		try {
			encontrado= detalleTareaDao.buscarObservacion(observacion);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}

}
