package com.uisrael.AgendaWeb.modelo.dao;

import java.util.List;

import com.uisrael.AgendaWeb.modelo.entidades.Tarea;

public interface TareaDao {
	public void insertarTarea(Tarea nuevoTarea);

	public void actualizarTarea(Tarea actualizarTarea);

	public void eliminarTarea(Tarea eliminaTarea);

	public List<Tarea> listarTareas();
	
	public Tarea buscarTareaId(int id);
	
	public Tarea buscarTareaTitulo(String titulo);
	
	public Tarea buscarTareaDescripcion(String descripcion);

}
