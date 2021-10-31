package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato{
	private double sueldoMensual;
	private double montoPorConyuge;
	private double montoPorHijos;
	
	public ContratoDePlanta(LocalDate fechaInicio, double sueldoMensual, 
			double montoPorConyuge, double montoPorHijos) {
		super(fechaInicio);
		this.sueldoMensual = sueldoMensual;
		this.montoPorConyuge = montoPorConyuge;
		this.montoPorHijos = montoPorHijos;
	}

	@Override
	public boolean estaVigente() {
		return true;
	}
	
	@Override
	public double getMontoBasico(Empleado empleado) {
		return this.sueldoMensual + 
				(empleado.tieneConyuge() ? this.montoPorConyuge : 0) +
				(empleado.tieneHijos() ? this.montoPorHijos : 0);
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public double getMontoPorConyuge() {
		return montoPorConyuge;
	}

	public double getMontoPorHijos() {
		return montoPorHijos;
	}
}
