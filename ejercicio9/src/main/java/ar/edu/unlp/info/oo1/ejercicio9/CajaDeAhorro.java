package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {
	public CajaDeAhorro() {};
	
	public CajaDeAhorro(double monto) {
		super(monto);
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo() >= (monto + (2 * monto) / 100);
	}

	@Override
	protected void extraerSinControlar(double monto) {
		this.setSaldo(this.getSaldo() - (monto + (2 * monto) / 100));
	}
}
