package ar.edu.unlp.info.oo1.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fecha, 
			double monto, double porcentaje) {
		this.fechaDeConstitucion = fecha;
		this.montoDepositado = monto;
		this.porcentajeDeInteresDiario = porcentaje;
	}
	
	public double getValorActual() {
		long cantDias = this.fechaDeConstitucion.until(LocalDate.now(), ChronoUnit.DAYS);
		double incrementoDiario = (this.porcentajeDeInteresDiario * this.montoDepositado) / 100;
		return this.montoDepositado + (incrementoDiario + cantDias);
	}
}
