package ar.edu.unlp.info.oo1.ejercicio16;

import ar.edu.unlp.info.oo1.ejercicio14.DateLapse;

public class ReservaEstricta extends Reserva{

	public ReservaEstricta(DateLapse periodo, Usuario inquilino) {
		super(periodo, inquilino);
	}
	
	public double getMontoAReembolsar(double precio) {
		return 0;
	}
}
