package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class LlamadaInternacional extends Llamada{
	private String paisOrigen;
	private String paisDestino;
	
	public LlamadaInternacional(LocalDateTime fechaYHoraComienzo, int duracionEnMinutos, 
			Telefono origen, Telefono destino, String paisOrigen, String paisDestino) {
		super(fechaYHoraComienzo, duracionEnMinutos, origen, destino);
		this.paisOrigen = paisOrigen;
		this.paisDestino = paisDestino;
	}

	@Override
	public double calcularCosto() {
		return this.getDuracionEnMinutos() * 
				(this.getFechaYHoraComienzo().getHour() >= 8 && 
				this.getFechaYHoraComienzo().getHour() < 20 ? 4 : 3);
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public String getPaisDestino() {
		return paisDestino;
	}
}
