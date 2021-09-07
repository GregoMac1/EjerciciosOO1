package ar.edu.unlp.info.oo1.ejercicio3bis;

import java.util.ArrayList;
import java.util.List;
//import ar.edu.unlp.info.oo1.ejercicio3.Item;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<>();
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(Producto::getPeso).sum();
	}

	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(productos);
		return ticket;
	}
}
