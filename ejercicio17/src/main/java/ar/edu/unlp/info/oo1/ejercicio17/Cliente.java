package ar.edu.unlp.info.oo1.ejercicio17;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private String telefono;
	
	public Cliente(String nombre, String direccion, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
}
