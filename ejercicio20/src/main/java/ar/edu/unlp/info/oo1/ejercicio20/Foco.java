package ar.edu.unlp.info.oo1.ejercicio20;

public class Foco {
	private String fabricante;
	private int cantCiclosDeEncendido;
	private boolean estaVencido;
	
	public Foco(String fabricante, int cantCiclosDeEncendido) {
		this.fabricante = fabricante;
		this.cantCiclosDeEncendido = cantCiclosDeEncendido;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getCantCiclosDeEncendido() {
		return cantCiclosDeEncendido;
	}

	public boolean estaVencido() {
		return estaVencido;
	}

	public void restarCiclo() {
		if (cantCiclosDeEncendido > 0) {
			this.cantCiclosDeEncendido -= 1;
			if (this.cantCiclosDeEncendido == 0)
				estaVencido = true;
		}
	}
}
