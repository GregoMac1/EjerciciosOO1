package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class Recibo {
	private String nombre;
	private String apellido;
	private String cuil;
	private double antiguedad;
	private LocalDate fechaDeRecibo;
	private double montoTotal;
	
	public Recibo(String nombre, String apellido, String cuil, double antiguedad, double montoTotal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.antiguedad = antiguedad;
		this.fechaDeRecibo = LocalDate.now();
		this.montoTotal = montoTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCuil() {
		return cuil;
	}

	public double getAntiguedad() {
		return antiguedad;
	}

	public LocalDate getFechaDeRecibo() {
		return fechaDeRecibo;
	}

	public double getMontoTotal() {
		return montoTotal;
	}
}
