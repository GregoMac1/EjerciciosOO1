package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.List;
import java.util.ArrayList;

public class ServicioUsuarios {
	private List<Usuario> usuarios = new ArrayList<>();
	
	public Usuario registrarUsuario(String nombre, String direccion, String dni) {
		Usuario u = new Usuario(nombre, direccion, dni);
		this.usuarios.add(u);
		return u;
	}
}
