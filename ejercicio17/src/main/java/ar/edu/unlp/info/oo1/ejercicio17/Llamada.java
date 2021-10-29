package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public abstract class Llamada {
	private LocalDateTime fechaYHoraComienzo;
	private int duracionEnMinutos;
	private Telefono origen;
	private Telefono destino;
	
	public Llamada(LocalDateTime fechaYHoraComienzo, 
			int duracionEnMinutos, Telefono origen, Telefono destino) {
		this.fechaYHoraComienzo = fechaYHoraComienzo;
		this.duracionEnMinutos = duracionEnMinutos;
		this.origen = origen;
		this.destino = destino;
	}

	public LocalDateTime getFechaYHoraComienzo() {
		return fechaYHoraComienzo;
	}

	public int getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public Telefono getOrigen() {
		return origen;
	}

	public Telefono getDestino() {
		return destino;
	}

	public abstract double calcularCosto();
}
