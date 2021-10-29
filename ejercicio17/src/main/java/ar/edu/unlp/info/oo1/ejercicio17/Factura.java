package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class Factura {
	private Cliente cliente;
	private LocalDate fechaDeFacturacion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double montoTotal;
	
	public Factura(Cliente cliente, LocalDate fechaDeFacturacion, 
			LocalDate fechaInicio, LocalDate fechaFin, double montoTotal) {
		this.cliente = cliente;
		this.fechaDeFacturacion = fechaDeFacturacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.montoTotal = montoTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public LocalDate getFechaDeFacturacion() {
		return fechaDeFacturacion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public double getMontoTotal() {
		return montoTotal;
	}
}
