package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class LlamadaLocal extends Llamada{

	public LlamadaLocal(LocalDateTime fechaYHoraComienzo, 
			int duracionEnMinutos, Telefono origen, Telefono destino) {
		super(fechaYHoraComienzo, duracionEnMinutos, origen, destino);
	}

	@Override
	public double calcularCosto() {
		return this.getDuracionEnMinutos();
	}
}
