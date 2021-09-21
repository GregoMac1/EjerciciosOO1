package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

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
		List<Factura> facturas = new ArrayList<>();
		for (int i = 0; i < this.usuarios.size(); i++) {
			facturas.add(usuarios.get(i).facturarEnBaseA(precioKWh));
		}
		return facturas;
	}
	
	public double consumoTotalActiva() {
		return this.usuarios.stream().mapToDouble(Usuario::ultimoConsumoActiva).sum();
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
