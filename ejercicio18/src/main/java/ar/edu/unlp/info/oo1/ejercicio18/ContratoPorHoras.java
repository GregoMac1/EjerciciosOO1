package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato{
	private LocalDate fechaFin;
	private double valorPorHora;
	private double cantHorasPorMes;
	
	public ContratoPorHoras(LocalDate fechaInicio, LocalDate fechaFin, 
			double valorPorHora, double cantHorasPorMes) {
		super(fechaInicio);
		this.fechaFin = fechaFin;
		this.valorPorHora = valorPorHora;
		this.cantHorasPorMes = cantHorasPorMes;
	}

	@Override
	public boolean estaVigente() {
		return this.fechaFin.isAfter(LocalDate.now());
	}
	
	@Override
	public double getMontoBasico(Empleado empleado) {
		return this.valorPorHora * this.cantHorasPorMes;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public double getCantHorasPorMes() {
		return cantHorasPorMes;
	}
}
