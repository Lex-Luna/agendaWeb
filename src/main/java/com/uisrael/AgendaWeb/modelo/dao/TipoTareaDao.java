package com.uisrael.AgendaWeb.modelo.dao;

import java.util.List;

import com.uisrael.AgendaWeb.modelo.entidades.TipoTarea;

public interface TipoTareaDao {
	public void insertarTipoTarea(TipoTarea nuevoTipoTarea);

	public void actualizarTipoTarea(TipoTarea actualizarTipoTarea);

	public void eliminarTipoTarea(TipoTarea elimina);
	
	public TipoTarea buscarTipoTareaId(int id);
	
	public TipoTarea buscarTipoTareaDescripcion(String descripcion);
	
	public List<TipoTarea> listarTipoTareas();
}
