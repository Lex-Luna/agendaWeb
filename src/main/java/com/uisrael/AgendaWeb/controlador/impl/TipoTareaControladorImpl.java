package com.uisrael.AgendaWeb.controlador.impl;

import java.util.List;

import com.uisrael.AgendaWeb.controlador.TipoTareaControlador;
import com.uisrael.AgendaWeb.modelo.dao.TipoTareaDao;
import com.uisrael.AgendaWeb.modelo.dao.impl.TipoTareaDaoImpl;
import com.uisrael.AgendaWeb.modelo.entidades.TipoTarea;

public class TipoTareaControladorImpl implements TipoTareaControlador{
	private TipoTareaDao tipoTareaDao;
	public TipoTareaControladorImpl() {
		tipoTareaDao= new TipoTareaDaoImpl();
	}
	@Override
	public void insertarTipoTarea(TipoTarea nuevoTipoTarea) {
		// TODO Auto-generated method stub
		tipoTareaDao.insertarTipoTarea(nuevoTipoTarea);
	}

	@Override
	public void actualizarTipoTarea(TipoTarea actualizarTipoTarea) {
		// TODO Auto-generated method stub
		tipoTareaDao.actualizarTipoTarea(actualizarTipoTarea);
	}

	@Override
	public void eliminarTipoTarea(TipoTarea elimina) {
		// TODO Auto-generated method stub
		tipoTareaDao.eliminarTipoTarea(elimina);
	}

	@Override
	public TipoTarea buscarTipoTareaId(int id) {
		// TODO Auto-generated method stub
		TipoTarea encontrado=new TipoTarea();
		encontrado=null;
		
		try {
			encontrado= tipoTareaDao.buscarTipoTareaId(id);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}

	@Override
	public List<TipoTarea> listarTipoTareas() {
		// TODO Auto-generated method stub
		return tipoTareaDao.listarTipoTareas();
	
	}

	@Override
	public TipoTarea buscarTipoTareaDescripcion(String descripcion) {
		// TODO Auto-generated method stub
		return tipoTareaDao.buscarTipoTareaDescripcion(descripcion);
	}

}
