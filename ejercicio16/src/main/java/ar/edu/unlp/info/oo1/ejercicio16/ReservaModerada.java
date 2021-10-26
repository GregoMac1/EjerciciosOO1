package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio14.DateLapse;

public class ReservaModerada extends Reserva{

	public ReservaModerada(DateLapse periodo, Usuario inquilino) {
		super(periodo, inquilino);
	}
	
	public double getMontoAReembolsar(double precio) {
		if (LocalDate.now().plusDays(7).isBefore(this.getPeriodo().getFrom())
				|| LocalDate.now().plusDays(7).isEqual(this.getPeriodo().getFrom()))
			return this.calcularPrecio(precio);
		else if (LocalDate.now().plusDays(2).isBefore(this.getPeriodo().getFrom())
				|| LocalDate.now().plusDays(2).isEqual(this.getPeriodo().getFrom()))
			return this.calcularPrecio(precio) / 2;
		else
			return 0;
	}
}
