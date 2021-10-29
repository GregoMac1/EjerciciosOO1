package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public abstract class Contrato {
	private Empleado empleado;
	private LocalDate fechaFin;
	
	public Contrato(Empleado empleado, LocalDate fechaFin) {
		this.empleado = empleado;
		this.fechaFin = fechaFin;
	}
	
	
}
