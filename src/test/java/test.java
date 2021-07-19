import static org.junit.Assert.*;
import java.util.List;
//import javax.xml.transform.Result;

import org.junit.Test;

import com.uisrael.AgendaWeb.controlador.CalendarioControlador;
//import com.uisrael.AgendaWeb.controlador.CalendarioControlador;
//import com.uisrael.AgendaWeb.controlador.CalendarioControlador;
import com.uisrael.AgendaWeb.controlador.ClienteControlador;
import com.uisrael.AgendaWeb.controlador.CuentaControlador;
import com.uisrael.AgendaWeb.controlador.PrioridadControlador;
import com.uisrael.AgendaWeb.controlador.TareaControlador;
import com.uisrael.AgendaWeb.controlador.impl.ClienteControladorImpl;
import com.uisrael.AgendaWeb.controlador.impl.CuentaControladorImpl;
import com.uisrael.AgendaWeb.controlador.impl.PrioridadControladorImpl;
import com.uisrael.AgendaWeb.controlador.impl.TareaControladorImpl;
import com.uisrael.AgendaWeb.modelo.entidades.Cliente;
import com.uisrael.AgendaWeb.modelo.entidades.Cuenta;
import com.uisrael.AgendaWeb.modelo.entidades.Prioridad;
import com.uisrael.AgendaWeb.modelo.entidades.Tarea;


public class test {
	private ClienteControlador clienteControlador;
	private CuentaControlador cuentaControlador;
	private TareaControlador tareaControlador;
	private PrioridadControlador prioridadControlador;
	private CalendarioControlador calendarioControlador;

	@Test
	public void test() {
		System.out.print("Inicio de prueva");
//		Creacion de cliente

		Cliente ncli= new Cliente();
		ncli.setNombres("Flavio");
		clienteControlador = new ClienteControladorImpl();//esta linea es muy importante 
		clienteControlador.insertarCliente(ncli);
		Cliente clienteBuscadoId = clienteControlador.buscarClienteId(1);
		System.out.println("Buscar "+clienteBuscadoId);
//		
		try {
			Cliente cliBusNombre= clienteControlador.buscarClienteNombe("Flavio");
			System.out.println("Buscar "+cliBusNombre);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
		clienteControlador.insertarCliente(ncli);
		try {
			
			List<Cliente> lista = clienteControlador.listarClientes();
			for (Cliente tmp : lista) {
				System.out.println("" + tmp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
//		Creacion de cuenta
		
//		cuentaControlador = new CuentaControladorImpl();
//		Cuenta nCue = new Cuenta();
//		Cuenta cuentaEncontradaId = cuentaControlador.buscarCuentaId(1);
//		System.out.println("Cuenta encontrada"+cuentaEncontradaId);
//		nCue.setUsuario("Admin");
//		nCue.setContraseña("1234");
//		nCue.setFkCliente(clienteBuscadoId);
//		try {
//			
//			List<Cuenta> listaCue = cuentaControlador.listarCuentas();
//			for (Cuenta tmp : listaCue) {
//				System.out.println("" + tmp);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			
//			System.out.println("Error: " + e.getMessage());
//		}
//		
//		Creacion de Tarea

//		tareaControlador = new TareaControladorImpl();
//		Tarea nTar = new Tarea();
//		nTar.setFkCuenta(cuentaEncontradaId);
//		nTar.setTitulo("Deber de progra1");
//		nTar.setDescripcion("Hacer los deberes");
//		nTar.setFechInicio(2021/07/23); 
//		nTar.setFechLimite(2021-07-24);
//		nTar.getFkCuenta();
//		Tarea tareaBuscadoId = tareaControlador.buscarTareaId(1);
//		System.out.println("Buscar tarea ID"+tareaBuscadoId);
//		tareaControlador.insertarTarea(nTar);
//		Tarea tareaEncontradaId = tareaControlador.buscarTareaId(1);
//		System.out.println("Tarea encontrada id"+tareaEncontradaId);
//		Tarea tareaEncontradaTitulo = tareaControlador.buscarTareaTitulo("Deber de progra1");
//		System.out.println("Tarea encontrada titulo"+tareaEncontradaTitulo);
//		try{
//			
//			
//			List<Tarea> listaTar = tareaControlador.listarTareas();
//			for (Tarea tmp : listaTar) {
//			
//				System.out.println("" + tmp);
//		
//			}
//		}catch(Exception e) {
//			// TODO: handle exception
//			System.out.println("Error: " + e.getMessage());
//			
//		}
//		
//		Insetar Prioridad
		
//		prioridadControlador = new PrioridadControladorImpl();
//		Prioridad nPri = new Prioridad();
//		nPri.setAlta(1);
//		nPri.setBaja(3);
//		nPri.setMedia(2);
//		prioridadControlador.insertarPrioridad(nPri);
//		Prioridad prioridadBuscadoId = prioridadControlador.buscarPrioridadId(1);
//		
//		System.out.println("Buscar prioridad alta"+prioridadBuscadoId);
//		try{
//			
//			
//			List<Prioridad> listaTar = prioridadControlador.listarPrioridads();
//			for (Prioridad tmp : listaTar) {
//
//				System.out.println("" + tmp);
//		
//			}
//		}catch(Exception e) {
//			// TODO: handle exception
//			System.out.println("Error: " + e.getMessage());
//			
//		}
	}	
}