package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

public class PoliticaEstricta implements PoliticaDeCancelacion{
	
	@Override
	public double getMontoAReembolsar(Reserva reserva, double precio, LocalDate fechaDeCancelacion) {
		return 0;
	}
}
