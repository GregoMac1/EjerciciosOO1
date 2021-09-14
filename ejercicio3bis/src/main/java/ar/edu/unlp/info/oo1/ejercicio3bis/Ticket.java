package ar.edu.unlp.info.oo1.ejercicio3bis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos = new ArrayList<>();
	
	public Ticket() {}
	
	public Ticket(List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.productos.addAll(productos);
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(Producto::getPeso).sum();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
	}

	public double impuesto() {
		return (21 * this.getPrecioTotal()) / 100;
	}
}
