package ar.edu.unlp.info.oo1.ejercicio19;

public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int cantUnidades;
	private Usuario vendedor;
	
	public Producto(String nombre, String descripcion, double precio, 
			int cantUnidades, Usuario vendedor) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantUnidades = cantUnidades;
		this.vendedor = vendedor;
	}
	
	public boolean tieneUnidadesDisponibles(int cant) {
		return this.cantUnidades >= cant;
	}
	
	public void restarUnidades(int cant) {
		if (this.tieneUnidadesDisponibles(cant))
			this.cantUnidades -= cant;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCantUnidades() {
		return cantUnidades;
	}

	public Usuario getVendedor() {
		return vendedor;
	}
}
