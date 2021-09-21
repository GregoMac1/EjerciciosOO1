package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;

public class Factura {
	private LocalDate fecha;
	private double montoEnergiaActiva;
	private double descuento;
	private Usuario usuario;
	
	public Factura(LocalDate fecha, double montoEnergiaActiva, 
			double descuento, Usuario usuario) {
		this.fecha = fecha;
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.usuario = usuario;
	}
	
	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}

	public double montoTotal() {
		return montoEnergiaActiva - ((descuento * montoEnergiaActiva) / 100);
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getDescuento() {
		return descuento;
	}

	public Usuario usuario() {
		return usuario;
	}	
}
