package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta{
	private double limiteDeDescubierto;
	
	public CuentaCorriente() {
		limiteDeDescubierto = 0;
	}
	
	public CuentaCorriente(double monto) {
		super(monto);
		limiteDeDescubierto = 0;
	}

	public double getLimiteDeDescubierto() {
		return limiteDeDescubierto;
	}

	public void setLimiteDeDescubierto(double limiteDeDescubierto) {
		this.limiteDeDescubierto = limiteDeDescubierto;
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() + this.getLimiteDeDescubierto()) >= monto;
	}

	@Override
	protected void extraerSinControlar(double monto) {
		this.setSaldo(this.getSaldo() - monto);
	}
}
