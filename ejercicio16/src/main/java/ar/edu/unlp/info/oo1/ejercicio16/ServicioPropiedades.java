package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
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
	
	public Reserva hacerReservaEstricta(Propiedad propiedad, DateLapse periodo, Usuario usuario) {
		return propiedad.hacerReserva(periodo, usuario, "Estricta");
	}
	
	public Reserva hacerReservaModerada(Propiedad propiedad, DateLapse periodo, Usuario usuario) {
		return propiedad.hacerReserva(periodo, usuario, "Moderada");
	}
	
	public Reserva hacerReservaFlexible(Propiedad propiedad, DateLapse periodo, Usuario usuario) {
		return propiedad.hacerReserva(periodo, usuario, "Flexible");
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
	
	public double calcularIngresosDePropietario(Usuario usuario, LocalDate desde, LocalDate hasta) {
		return this.propiedades.stream().
				filter(p -> p.getPropietario().equals(usuario)).
				mapToDouble(p -> p.getMontoEntreFechas(desde, hasta)).
				sum();
	}
}