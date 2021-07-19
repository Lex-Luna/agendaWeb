package com.uisrael.AgendaWeb.modelo.dao;

import java.util.Date;
import java.util.List;

import com.uisrael.AgendaWeb.modelo.entidades.DetalleTarea;

public interface DetalleTareaDao {
	public void insertarDetalleTarea(DetalleTarea nuevoDetalleTarea);

	public void actualizarDetalleTarea(DetalleTarea actualizarDetalleTarea);

	public void eliminarDetalleTarea(DetalleTarea eliminaDetalleTarea);
	
	public DetalleTarea buscarDetalleTareaId(int id);
	
	public DetalleTarea buscarFechaInicio(Date fechaInicio);
	
	public DetalleTarea buscarFechaLimite(Date fechaLimite);
	
	public DetalleTarea buscarObservacion(String observacion);

	public List<DetalleTarea> listarDetalleTarea();
}
