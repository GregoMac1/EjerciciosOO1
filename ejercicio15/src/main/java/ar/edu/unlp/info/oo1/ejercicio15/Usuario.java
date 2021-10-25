package ar.edu.unlp.info.oo1.ejercicio15;

public class Usuario {
	private String nombre;
	private String direccion;
	private String dni;
	
	public Usuario(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getDni() {
		return dni;
	}
}
