package ar.edu.unlp.info.oo1.ejercicio17;

public class PersonaJuridica extends Cliente{
	private String cuit;
	private String tipo;

	public PersonaJuridica(String nombre, String direccion, 
			Telefono telefono, String cuit, String tipo) {
		super(nombre, direccion, telefono);
		this.cuit = cuit;
		this.tipo = tipo;
	}

	public String getCuit() {
		return cuit;
	}

	public String getTipo() {
		return tipo;
	}
}
