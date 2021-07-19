package com.uisrael.AgendaWeb.controlador;

import java.util.List;
import com.uisrael.AgendaWeb.modelo.entidades.Tarea;

public interface TareaControlador {
	public void insertarTarea(Tarea nuevoTarea);

	public void actualizarTarea(Tarea actualizarTarea);

	public void eliminarTarea(Tarea eliminaCiente);

	public List<Tarea> listarTareas();
	
	public Tarea buscarTareaId(int id);
	
	public Tarea buscarTareaTitulo(String titulo);
	
	public Tarea buscarTareaDescripcion(String descripcion);
}
