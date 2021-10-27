package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

public class PoliticaModerada implements PoliticaDeCancelacion {

	@Override
	public double getMontoAReembolsar(Reserva reserva, double precio, LocalDate fechaDeCancelacion) {
		if (fechaDeCancelacion.plusDays(7).isBefore(reserva.getPeriodo().getFrom())
				|| fechaDeCancelacion.plusDays(7).isEqual(reserva.getPeriodo().getFrom()))
			return reserva.calcularPrecio(precio);
		else if (fechaDeCancelacion.plusDays(2).isBefore(reserva.getPeriodo().getFrom())
				|| fechaDeCancelacion.plusDays(2).isEqual(reserva.getPeriodo().getFrom()))
			return reserva.calcularPrecio(precio) / 2;
		else
			return 0;
	}
}
