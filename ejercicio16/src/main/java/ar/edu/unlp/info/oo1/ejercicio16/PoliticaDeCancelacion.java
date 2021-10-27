package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

public interface PoliticaDeCancelacion {
	
	public double getMontoAReembolsar(Reserva reserva, double precio, LocalDate fechaDeCancelacion);
	
}
