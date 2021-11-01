package ar.edu.unlp.info.oo1.ejercicio19;

public class Usuario {
	private String nombre;
	private Direccion direccion;
	
	public Usuario(String nombre, Direccion direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}
}
