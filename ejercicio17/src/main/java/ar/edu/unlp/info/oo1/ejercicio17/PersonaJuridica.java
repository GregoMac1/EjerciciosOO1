package ar.edu.unlp.info.oo1.ejercicio17;

public class PersonaJuridica extends Cliente{
	private String telefono;
	private String cuit;
	private String tipo;

	public PersonaJuridica(String nombre, String direccion, 
			String telefono, String cuit, String tipo) {
		super(nombre, direccion, telefono);
		this.telefono = telefono;
		this.cuit = cuit;
		this.tipo = tipo;
	}
}
