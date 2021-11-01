package ar.edu.unlp.info.oo1.parcial;

public class Bien implements Item{
	private String descripcion;
	private int cantUnidades;
	private double pesoUnitario;
	private double precioUnitario;

	public Bien(String descripcion, int cantUnidades, double pesoUnitario, double precioUnitario) {
		this.descripcion = descripcion;
		this.cantUnidades = cantUnidades;
		this.pesoUnitario = pesoUnitario;
		this.precioUnitario = precioUnitario;
	}

	public double calcularCosto() {
		double costo = this.cantUnidades * this.precioUnitario;
		if (this.pesoUnitario * this.cantUnidades > 1000)
			costo += costo * 0.1;
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCantUnidades() {
		return cantUnidades;
	}

	public double getPesoUnitario() {
		return pesoUnitario;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}
}
