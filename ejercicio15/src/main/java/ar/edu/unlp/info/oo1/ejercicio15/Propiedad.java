package ar.edu.unlp.info.oo1.ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unlp.info.oo1.ejercicio14.DateLapse;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private double precio;
	private String direccion;
	private Usuario propietario;
	private List<Reserva> reservas = new ArrayList<>();
	
	public Propiedad(String nombre, String descrpicion, 
			double precio, String direccion, Usuario propietario) {
		this.nombre = nombre;
		this.descripcion = descrpicion;
		this.precio = precio;
		this.direccion = direccion;
		this.propietario = propietario;
	}
	
	public Usuario getPropietario() {
		return this.propietario;
	}
	
	public Reserva hacerReserva(DateLapse periodo, Usuario usuario) {
		if (this.estaDisponible(periodo)) {
			Reserva reserva = new Reserva(periodo, usuario);
			this.reservas.add(reserva);
			return reserva;
		}
		else
			return null;		
	}
	
	public void eliminarReserva(Reserva reserva) {
		if (reserva.getPeriodo().getFrom().isAfter(LocalDate.now()))
			this.reservas.remove(reserva);
	}
	
	public double calcularPrecio(Reserva reserva) {
		return this.precio * reserva.getPeriodo().sizeInDays();
	}
	
	public boolean estaDisponible(DateLapse periodo) {
		for (Reserva r : reservas) {
			if (r.getPeriodo().overlaps(periodo))
				return false;
		}
		return true;
	}

	public List<Reserva> getReservasDeUsuario(Usuario usuario) {
		return this.reservas.stream().
				filter(r -> r.getInquilino().equals(usuario)).
				toList();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}
}
