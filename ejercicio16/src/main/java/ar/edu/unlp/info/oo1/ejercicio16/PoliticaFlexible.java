package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaDeCancelacion {

	@Override
	public double getMontoAReembolsar(Reserva reserva, double precio, LocalDate fechaDeCancelacion) {
		return (fechaDeCancelacion.isBefore(reserva.getPeriodo().getFrom()) ? reserva.calcularPrecio(precio) : 0);
	}
}
