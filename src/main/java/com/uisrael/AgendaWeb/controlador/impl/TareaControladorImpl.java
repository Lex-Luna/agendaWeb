package com.uisrael.AgendaWeb.controlador.impl;

import java.util.List;

import com.uisrael.AgendaWeb.controlador.TareaControlador;
import com.uisrael.AgendaWeb.modelo.dao.TareaDao;
import com.uisrael.AgendaWeb.modelo.dao.impl.TareaDaoImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Tarea;

public class TareaControladorImpl implements TareaControlador{
	private TareaDao tareaDao;
	public TareaControladorImpl() {
		tareaDao=new TareaDaoImpl();
	}
	@Override
	public void insertarTarea(Tarea nuevoTarea) {
		// TODO Auto-generated method stub
		tareaDao.insertarTarea(nuevoTarea);
	}

	@Override
	public void actualizarTarea(Tarea actualizarTarea) {
		// TODO Auto-generated method stub
		tareaDao.actualizarTarea(actualizarTarea);
	}

	@Override
	public void eliminarTarea(Tarea eliminaCiente) {
		// TODO Auto-generated method stub
		tareaDao.eliminarTarea(eliminaCiente);
	}

	@Override
	public List<Tarea> listarTareas() {
		// TODO Auto-generated method stub
		return tareaDao.listarTareas();
	}
	@Override
	public Tarea buscarTareaId(int id) {
		// TODO Auto-generated method stub
		Tarea encontrado=new Tarea();
		encontrado=null;
		
		try {
			encontrado= tareaDao.buscarTareaId(id);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Tarea buscarTareaTitulo(String titulo) {
		// TODO Auto-generated method stub
		Tarea encontrado=new Tarea();
		encontrado=null;
		
		try {
			encontrado= tareaDao.buscarTareaTitulo(titulo);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Tarea buscarTareaDescripcion(String descripcion) {
		// TODO Auto-generated method stub
		Tarea encontrado=new Tarea();
		encontrado=null;
		
		try {
			encontrado= tareaDao.buscarTareaDescripcion(descripcion);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}

}
