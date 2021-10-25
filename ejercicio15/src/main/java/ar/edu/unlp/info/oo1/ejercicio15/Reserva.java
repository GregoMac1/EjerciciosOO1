package ar.edu.unlp.info.oo1.ejercicio15;

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
}
