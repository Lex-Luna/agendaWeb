package com.uisrael.AgendaWeb.controlador.impl;

import java.util.Date;
import java.util.List;

import com.uisrael.AgendaWeb.controlador.CalendarioControlador;
import com.uisrael.AgendaWeb.modelo.dao.CalendarioDao;
import com.uisrael.AgendaWeb.modelo.dao.impl.CalendarioDaoImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Calendario;


public class CalendarioControladorImpl implements CalendarioControlador{
	private CalendarioDao calendarioDao;
//	CalendarioDao ao= new CalendarioDaoImpl();
	public CalendarioControladorImpl() {
//		calendarioDao = new CalendarioDaoImpl();
		calendarioDao = new CalendarioDaoImpl();
	}
	@Override
	public void insertarCalendario(Calendario nuevoCalendario) {
		// TODO Auto-generated method stub
		calendarioDao.insertarCalendario(nuevoCalendario);
	}

	@Override
	public void actualizarCalendario(Calendario actualizarCalendario) {
		// TODO Auto-generated method stub
		calendarioDao.actualizarCalendario(actualizarCalendario);
	}

	@Override
	public void eliminarCalendario(Calendario eliminaCalendario) {
		// TODO Auto-generated method stub
		calendarioDao.eliminarCalendario(eliminaCalendario);
	}

	@Override
	public List<Calendario> listarCalendarios() {
		// TODO Auto-generated method stub
		return calendarioDao.listarCalendarios();
	}
	@Override
	public Calendario buscarCalendarioId(int id) {
		// TODO Auto-generated method stub
		Calendario encontrado=new Calendario();
		encontrado=null;
		
		try {
			encontrado= calendarioDao.buscarCalendarioId(id);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Calendario buscarCalendarioDia(Date dia) {
		// TODO Auto-generated method stub
		Calendario encontrado=new Calendario();
		encontrado=null;
		
		try {
			encontrado= calendarioDao.buscarCalendarioDia(dia);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
		
	}
	@Override
	public Calendario buscarCalendarioMes(Date mes) {
		// TODO Auto-generated method stub
		Calendario encontrado=new Calendario();
		encontrado=null;
		
		try {
			encontrado= calendarioDao.buscarCalendarioMes(mes);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Calendario buscarCalendarioAño(Date año) {
		// TODO Auto-generated method stub
		Calendario encontrado=new Calendario();
		encontrado=null;
		
		try {
			encontrado= calendarioDao.buscarCalendarioAño(año);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	
	
	

}
