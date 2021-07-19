package com.uisrael.AgendaWeb.controlador;

import java.util.List;
import com.uisrael.AgendaWeb.modelo.entidades.Cuenta;

public interface CuentaControlador {
	public void insertarCuenta(Cuenta nuevoCuenta);

	public void actualizarCuenta(Cuenta actualizarCuenta);

	public void eliminarCuenta(Cuenta eliminaCiente);
	
	public Cuenta buscarCuentaId(int id);
	
	public Cuenta buscarCuentaUsu(String usuario);

	public List<Cuenta> listarCuentas();
}
