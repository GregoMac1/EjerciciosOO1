package ar.edu.unlp.info.oo1.parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
	private LocalDate fechaDeFacturacion;
	private LocalDate fechaDeExportacion;
	private List<Item> items = new ArrayList<>();
	
	public Factura(LocalDate fechaDeExportacion, List<Item> items) {
		this.fechaDeFacturacion = LocalDate.now();
		this.fechaDeExportacion = fechaDeExportacion;
		this.items = items;
	}
	
	public double getCostoBasico() {
		return this.items.stream().
				mapToDouble(i -> i.calcularCosto()).
				sum();
	}
	
	public double getCostoDeExportacion() {
		return this.getCostoBasico() * 0.05;
	}
	
	public double getCostoFinal() {
		return this.getCostoBasico() + this.getCostoDeExportacion();
	}

	public LocalDate getFechaDeFacturacion() {
		return fechaDeFacturacion;
	}
	
	public LocalDate getFechaDeExportacion() {
		return fechaDeExportacion;
	}
	
	public List<Item> getItems() {
		return items;
	}
}
