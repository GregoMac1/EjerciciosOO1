package ar.edu.unlp.info.oo1.ejercicio17;

public class PersonaFisica extends Cliente{
	private String dni;

	public PersonaFisica(String nombre, String direccion, String telefono, String dni) {
		super(nombre, direccion, telefono);
		this.dni = dni;
	}
}
