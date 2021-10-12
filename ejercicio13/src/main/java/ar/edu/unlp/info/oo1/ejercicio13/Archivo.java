package ar.edu.unlp.info.oo1.ejercicio13;

public class Archivo {
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTamano() {
		return this.nombre.length();
	}
}
