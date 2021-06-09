package clubHOMERO;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class Club {

	private String nombre;
	private Set<Cliente> clientes;

	public Club(String nombre) {
		this.nombre = nombre;
		this.clientes = new TreeSet<>();

	}

	public Boolean agregarCliente(Cliente nuevoCliente) {
		return this.clientes.add(nuevoCliente);
		
	}

	public Set<Cliente> obtenerListaCliente() {
		return this.clientes;
	}

	public Integer obtenerCantidadDeClientes() {
		return this.clientes.size();
	}
	
	public Set<Cliente> obtenerClientesPorNombreYEdad() {
		Comparator<Cliente> nuevoOrden = new OrdenPorNombreYEdad();
		Set<Cliente> tresetordenNE = new TreeSet<Cliente>(nuevoOrden);
		tresetordenNE.addAll(clientes);

		return tresetordenNE;
	}

	

}
