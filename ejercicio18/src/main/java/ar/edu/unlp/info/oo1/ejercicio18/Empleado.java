package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate fechaNac;
	private LocalDate fechaInicio;
	private boolean tieneConyuge;
	private boolean tieneHijos;
	private List<Contrato> contratos = new ArrayList<>();
	
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
	
	public void agregarContrato(Contrato contrato) {
		this.contratos.add(contrato);
	}
	
	public Contrato getContratoActual() {
		return this.contratos.stream().
				filter(c -> c.getFechaInicio().isBefore(LocalDate.now())).
				max((Contrato c1, Contrato c2) -> c1.getFechaInicio().compareTo(c2.getFechaInicio())).
				orElse(null);
	}
	
	public boolean contratoVigente() {
		try { //si el empleado no tiene ningun contrato, esto da error
			return this.getContratoActual().estaVigente();
		}
		catch (Exception e) {
			return false;
		}
	}
	
	private double getAntiguedad() {
		return this.fechaInicio.until(LocalDate.now(), ChronoUnit.YEARS);
	}
	
	private double getMontoTotal() {
		try {
			double antiguedad = this.getAntiguedad();
			double aumento = 0;
			if (antiguedad >= 20)
				aumento = 1;
			else if (antiguedad >= 15)
				aumento = 0.70;
			else if (antiguedad >= 10)
				aumento = 0.50;
			else if (antiguedad >= 5)
				aumento = 0.30;
			return this.getContratoActual().getMontoBasico(this) +
					this.getContratoActual().getMontoBasico(this) * aumento;
		}
		catch (Exception e) {
			return 0;
		}
	}
	
	public Recibo generarRecibo() {
		return new Recibo(nombre, apellido, cuil, this.getAntiguedad(), this.getMontoTotal());
	}
	
	public String getCuil() {
		return cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public boolean tieneConyuge() {
		return tieneConyuge;
	}

	public boolean tieneHijos() {
		return tieneHijos;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}
}
