package com.uisrael.AgendaWeb.controlador;

import java.util.List;

import com.uisrael.AgendaWeb.modelo.entidades.Prioridad;

public interface PrioridadControlador {
	public void insertarPrioridad(Prioridad nuevoPrioridad);

	public void actualizarPrioridad(Prioridad actualizarPrioridad);

	public void eliminarPrioridad(Prioridad eliminaPrioridad);

	public List<Prioridad> listarPrioridads();
	
	public Prioridad buscarPrioridadId(int id);
	
	public Prioridad buscarPrioridadAlta(int alta);
	
	public Prioridad buscarPrioridadmedia(int media);
	
	public Prioridad buscarPrioridadBaja(int baja);
}
