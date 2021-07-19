package com.uisrael.AgendaWeb.modelo.dao;

import java.util.List;

import com.uisrael.AgendaWeb.modelo.entidades.Cuenta;

public interface CuentaDao {
	public void insertarCuenta(Cuenta nuevoCuenta);

	public void actualizarCuenta(Cuenta actualizarCuenta);

	public void eliminarCuenta(Cuenta eliminaCuenta);
	
	public Cuenta buscarCuentaId(int id);
	
	public Cuenta buscarCuentaUsu(String usuario);

	public List<Cuenta> listarCuentas();
}
