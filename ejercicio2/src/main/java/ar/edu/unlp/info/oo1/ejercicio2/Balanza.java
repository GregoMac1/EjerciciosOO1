package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal = this.pesoTotal + producto.getPeso();
		this.precioTotal = this.precioTotal + producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
		return ticket;
	}
}
