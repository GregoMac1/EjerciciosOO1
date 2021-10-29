package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class LlamadaInterurbana extends Llamada{
	private double distanciaEnKM;

	public LlamadaInterurbana(LocalDateTime fechaYHoraComienzo, int duracionEnMinutos, 
			Telefono origen, Telefono destino, double distanciaEnKM) {
		super(fechaYHoraComienzo, duracionEnMinutos, origen, destino);
		this.distanciaEnKM = distanciaEnKM;
	}

	@Override
	public double calcularCosto() {
		double costoPorMinuto;
		if (this.distanciaEnKM < 100)
			costoPorMinuto = 2;
		else if (this.distanciaEnKM < 500)
			costoPorMinuto = 2.5;
		else
			costoPorMinuto = 3;
		return 5 + costoPorMinuto * this.getDuracionEnMinutos();
	}
}
