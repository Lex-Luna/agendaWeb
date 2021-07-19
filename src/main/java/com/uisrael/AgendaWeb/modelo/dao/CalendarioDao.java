package com.uisrael.AgendaWeb.modelo.dao;

import java.util.Date;
import java.util.List;

import com.uisrael.AgendaWeb.modelo.entidades.Calendario;

public interface CalendarioDao {
	public void insertarCalendario(Calendario nuevoCalendario);

	public void actualizarCalendario(Calendario actualizarCalendario);

	public void eliminarCalendario(Calendario eliminaCalendario);

	public List<Calendario> listarCalendarios();

	public Calendario buscarCalendarioId(int id);

	public Calendario buscarCalendarioDia(Date dia);

	public Calendario buscarCalendarioMes(Date mes);

	public Calendario buscarCalendarioAño(Date año);
}
