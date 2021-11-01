package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.ArrayList;
import java.util.List;

public class ServicioProductos {
	private List<Producto> productos = new ArrayList<>();
	private List<Pedido> pedidos = new ArrayList<>();
	
	public Producto ponerProductoALaVenta(String nombre, String descripcion, 
			double precio, int cantUnidades, Usuario vendedor) {
		Producto p = new Producto(nombre, descripcion, precio, cantUnidades, vendedor);
		this.productos.add(p);
		return p;
	}
	
	public List<Producto> buscarProducto(String nombre) {
		return this.productos.stream().
				filter(p -> p.getNombre().equals(nombre)).
				toList();
	}
	
	public void crearPedido(Usuario cliente, Producto producto, int cantSolicitada, 
			MedioDePago medioDePago, MedioDeEnvio medioDeEnvio) {
		if (producto.tieneUnidadesDisponibles(cantSolicitada)) {
			producto.restarUnidades(cantSolicitada);
			this.pedidos.add(new Pedido(cliente, producto, cantSolicitada, medioDePago, medioDeEnvio));
		}
	}
}
