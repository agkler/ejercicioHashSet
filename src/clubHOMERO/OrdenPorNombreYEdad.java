package clubHOMERO;

import java.util.Comparator;

public class OrdenPorNombreYEdad implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		if (o1.getEdad().compareTo(o2.getEdad()) != 0) {
			return o1.getEdad().compareTo(o2.getEdad());
		}

		return o1.getNombre().compareTo(o2.getNombre());

	}
}
