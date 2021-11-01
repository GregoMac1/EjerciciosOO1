package ar.edu.unlp.info.oo1.parcial;

public class Servicio implements Item{
	private String descripcion;
	private double costoDeMateriales;
	private double costoDeManoDeObra;

	public Servicio(String descripcion, double costoDeMateriales, double costoDeManoDeObra) {
		this.descripcion = descripcion;
		this.costoDeMateriales = costoDeMateriales;
		this.costoDeManoDeObra = costoDeManoDeObra;
	}

	public double calcularCosto() {
		return this.costoDeMateriales + this.costoDeManoDeObra;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCostoDeMateriales() {
		return costoDeMateriales;
	}

	public double getCostoDeManoDeObra() {
		return costoDeManoDeObra;
	}
}
