package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate fechaNac;
	private LocalDate fechaInicio;
	private boolean tieneConyuge;
	private boolean tieneHijos;
	
	
	public Empleado(String nombre, String apellido, String cuil, LocalDate fechaNac, 
			boolean tieneConyuge, boolean tieneHijos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaNac = fechaNac;
		this.fechaInicio = LocalDate.now();
		this.tieneConyuge = tieneConyuge;
		this.tieneHijos = tieneHijos;
	}
}
