package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public abstract class Contrato {
	private LocalDate fechaInicio;
	
	public Contrato(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
	
	public abstract boolean estaVigente();
	
	public abstract double getMontoBasico(Empleado empleado);
}
