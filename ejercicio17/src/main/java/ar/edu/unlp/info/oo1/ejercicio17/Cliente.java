package ar.edu.unlp.info.oo1.ejercicio17;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private Telefono telefono;
	
	public Cliente(String nombre, String direccion, Telefono telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public Telefono getTelefono() {
		return telefono;
	}
}
