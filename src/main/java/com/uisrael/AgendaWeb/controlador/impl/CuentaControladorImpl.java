package com.uisrael.AgendaWeb.controlador.impl;

import java.util.List;

import com.uisrael.AgendaWeb.controlador.CuentaControlador;
import com.uisrael.AgendaWeb.modelo.dao.CuentaDao;
import com.uisrael.AgendaWeb.modelo.dao.impl.CuentaDaoImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Cuenta;

public class CuentaControladorImpl implements CuentaControlador{
	private CuentaDao cuentaDao;
	public CuentaControladorImpl() {
		cuentaDao= new CuentaDaoImpl();
	}
	@Override
	public void insertarCuenta(Cuenta nuevoCuenta) {
		// TODO Auto-generated method stub
		cuentaDao.insertarCuenta(nuevoCuenta);
	}

	@Override
	public void actualizarCuenta(Cuenta actualizarCuenta) {
		// TODO Auto-generated method stub
		cuentaDao.actualizarCuenta(actualizarCuenta);
	}

	@Override
	public void eliminarCuenta(Cuenta eliminaCuenta) {
		// TODO Auto-generated method stub
		cuentaDao.eliminarCuenta(eliminaCuenta);
	}

	@Override
	public List<Cuenta> listarCuentas() {
		// TODO Auto-generated method stub
		return cuentaDao.listarCuentas();
	}
	@Override
	public Cuenta buscarCuentaId(int id) {
		// TODO Auto-generated method stub
		Cuenta encontrado=new Cuenta();
		encontrado=null;
		
		try {
			encontrado= cuentaDao.buscarCuentaId(id);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}
	@Override
	public Cuenta buscarCuentaUsu(String usuario) {
		// TODO Auto-generated method stub
		Cuenta encontrado=new Cuenta();
		encontrado=null;
		
		try {
			encontrado= cuentaDao.buscarCuentaUsu(usuario);
		} catch (Exception e) {
			encontrado=null;
			System.out.println("Error: " + e.getMessage());
		}
		return encontrado;
	}

}
