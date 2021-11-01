package ar.edu.unlp.info.oo1.ejercicio19;

public class Pedido {
	private Usuario cliente;
	private Producto producto;
	private int cantSolicitada;
	private MedioDePago medioDePago;
	private MedioDeEnvio medioDeEnvio;
	
	public Pedido(Usuario cliente, Producto producto, int cantSolicitada, 
			MedioDePago medioDePago, MedioDeEnvio medioDeEnvio) {
		this.cliente = cliente;
		this.producto = producto;
		this.cantSolicitada = cantSolicitada;
		this.medioDePago = medioDePago;
		this.medioDeEnvio = medioDeEnvio;
	}
	
	public double calcularCostoTotal() {
		double precioProducto = this.producto.getPrecio() * this.cantSolicitada;
		return precioProducto + 
				this.medioDePago.calcularPrecio(precioProducto) + 
				this.medioDeEnvio.calcularPrecio(this.producto.getVendedor().getDireccion(), 
						this.cliente.getDireccion());
	}

	public Usuario getCliente() {
		return cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantSolicitada() {
		return cantSolicitada;
	}

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public MedioDeEnvio getMedioDeEnvio() {
		return medioDeEnvio;
	}
}
