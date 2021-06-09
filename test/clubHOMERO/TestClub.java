package clubHOMERO;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestClub {

	@Test
	public void queSePuedaCrearUnClub() {
		Club nuevoClub = new Club("La Taberna");
		Cliente nuevoCliente = new Cliente("Gonzalo", 25);

		nuevoClub.agregarCliente(nuevoCliente);

		List<Cliente> lista = new ArrayList<>();
		lista.addAll(nuevoClub.obtenerListaCliente());
		
		assertEquals("Gonzalo", lista.get(0).getNombre());
	}
	
	@Test
	public void queSePuedaNoSePuedaAgregarDosClientesIgualesAlClub() {
		Club nuevoClub = new Club("La Taberna");
		Cliente nuevoCliente1 = new Cliente("Gonzalo", 25);
		nuevoClub.agregarCliente(nuevoCliente1);
		
		Cliente nuevoCliente2 = new Cliente("Gonzalo", 25);
		nuevoClub.agregarCliente(nuevoCliente2);
		
		Cliente nuevoCliente3 = new Cliente("Marcelo", 25);
		nuevoClub.agregarCliente(nuevoCliente3);
		
		assertEquals(2, nuevoClub.obtenerCantidadDeClientes(), 0.01);
	}
	
	@Test
	public void queSePuedaOrdenarAlfabeticamenteLosCliente() {
		Club nuevoClub = new Club("La Taberna");
		Cliente nuevoCliente1 = new Cliente("Gonzalo", 25);
		nuevoClub.agregarCliente(nuevoCliente1);
		
		Cliente nuevoCliente2 = new Cliente("Agustin", 25);
		nuevoClub.agregarCliente(nuevoCliente2);
		
		Cliente nuevoCliente3 = new Cliente("Marcelo", 25);
		nuevoClub.agregarCliente(nuevoCliente3);
		
		List<Cliente> lista = new ArrayList<>();
		lista.addAll(nuevoClub.obtenerListaCliente());
		
		assertEquals("Agustin", lista.get(0).getNombre());
		assertEquals("Gonzalo", lista.get(1).getNombre());
		assertEquals("Marcelo", lista.get(2).getNombre());
	}
	
	@Test
	public void queSePuedaOrdenarPorEdadLosClientes() {
		Club nuevoClub = new Club("La Taberna");
		Cliente nuevoCliente1 = new Cliente("Gonzalo", 25);
		nuevoClub.agregarCliente(nuevoCliente1);
		
		Cliente nuevoCliente2 = new Cliente("Agustin", 23);
		nuevoClub.agregarCliente(nuevoCliente2);
		
		Cliente nuevoCliente3 = new Cliente("Marcelo", 22);
		nuevoClub.agregarCliente(nuevoCliente3);
		
		List<Cliente> lista = new ArrayList<>();
		lista.addAll(nuevoClub.obtenerClientesPorNombreYEdad());
		
		assertEquals("Marcelo", lista.get(0).getNombre());
		assertEquals("Agustin", lista.get(1).getNombre());
		assertEquals("Gonzalo", lista.get(2).getNombre());
	}
	
	
}