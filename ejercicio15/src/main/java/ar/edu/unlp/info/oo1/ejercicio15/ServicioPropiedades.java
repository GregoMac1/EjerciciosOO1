package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unlp.info.oo1.ejercicio14.DateLapse;

public class ServicioPropiedades {
	private List<Propiedad> propiedades = new ArrayList<>();
	
	public Propiedad registrarPropiedad(Usuario u, String nombre, double precio, 
			String descrpicion, String direccion) {
		Propiedad p = new Propiedad(nombre, descrpicion, precio, direccion, u);
		this.propiedades.add(p);
		return p;
	}
	
	public Reserva hacerReserva(Propiedad propiedad, DateLapse periodo, Usuario usuario) {
		return propiedad.hacerReserva(periodo, usuario);
	}
	
	public List<Propiedad> getPropiedadesDisponibles(DateLapse periodo) {
		return this.propiedades.stream().
				filter(p -> p.estaDisponible(periodo)).
				toList();
	}
	
	public List<Reserva> getReservasDeUsuario(Usuario usuario) {
		List<Reserva> reservas = new ArrayList<>();
		for (Propiedad p : this.propiedades) {
			reservas.addAll(p.getReservasDeUsuario(usuario));
		}
		return reservas;
	}
}
