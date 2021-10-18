package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.List;
import java.util.ArrayList;

public class OOBnB {
	private List<Usuario> usuarios = new ArrayList<>();
	
	public Usuario registrarUsuario(String nombre, String direccion, String dni) {
		Usuario u = new Usuario(nombre, direccion, dni);
		this.usuarios.add(u);
		return u;
	}
	
	public Propiedad registrarPropiedad(Usuario u, String nombre, double precio, 
			String descrpicion, String direccion) {
		Propiedad p = new Propiedad(nombre, descrpicion, precio, direccion);
		u.agregarPropiedad(p);
		return p;
	}
}
