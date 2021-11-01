package ar.edu.unlp.info.oo1.ejercicio19;

public class Direccion {
	private String calle;
	private String numero;
	private String piso;
	private String depto;
	
	public Direccion(String calle, String numero, String piso, String depto) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.depto = depto;
	}

	public String getCalle() {
		return calle;
	}

	public String getNumero() {
		return numero;
	}

	public String getPiso() {
		return piso;
	}

	public String getDepto() {
		return depto;
	}
}
