package ar.edu.unlp.info.oo1.ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import ar.edu.unlp.info.oo1.ejercicio14.DateLapse;

public class Reserva {
	private DateLapse periodo;
	private Usuario inquilino;
	
	public Reserva(DateLapse periodo, Usuario inquilino) {
		this.periodo = periodo;
		this.inquilino = inquilino;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

	public Usuario getInquilino() {
		return inquilino;
	}
	
	public double calcularPrecio(double precio) {
		return precio * this.periodo.sizeInDays();
	}
	
	public double getMontoEntreFechas(double precio, LocalDate desde, LocalDate hasta) {
		int sizeInDays = (int)desde.until(hasta, ChronoUnit.DAYS);
		int cantDias = 0;
		for (int i = 0; i < sizeInDays; i++) {
			if (this.periodo.includesDate(desde))
				cantDias++;
			desde.plusDays(1);
		}
		return precio * cantDias;
	}
}
