package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.ArrayList;
import java.util.List;

public class ServicioUsuarios {
	private List<Usuario> vendedores = new ArrayList<>();
	private List<Usuario> clientes = new ArrayList<>();
	
	public Usuario registrarVendedor(String nombre, Direccion direccion) {
		Usuario u = new Usuario(nombre, direccion);
		this.vendedores.add(u);
		return u;
	}
	
	public Usuario buscarVendedor(String nombre) {
		return this.vendedores.stream().
				filter(u -> u.getNombre().equals(nombre)).
				findAny().
				orElse(null);
	}
	
	public Usuario registrarCliente(String nombre, Direccion direccion) {
		Usuario u = new Usuario(nombre, direccion);
		this.clientes.add(u);
		return u;
	}
	
	public Usuario buscarCliente(String nombre) {
		return this.clientes.stream().
				filter(u -> u.getNombre().equals(nombre)).
				findAny().
				orElse(null);
	}
}
