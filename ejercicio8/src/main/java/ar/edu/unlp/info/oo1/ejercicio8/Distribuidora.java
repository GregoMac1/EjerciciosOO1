package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios = new ArrayList<>();
	
	public Distribuidora(double precioKWh) {
		this.precioKWh = precioKWh;
	}
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public List<Factura> facturar() {
		return this.usuarios.stream().
				map((Usuario usuario) -> usuario.facturarEnBaseA(precioKWh)).
				collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		return this.usuarios.stream().
				mapToDouble(Usuario::ultimoConsumoActiva).
				sum();
	}
	
	public void precioKWh(double precio) {
		this.precioKWh = precio;
	}

	public double getPrecioKW() {
		return precioKWh;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
}
