package ar.edu.unlp.info.oo1.parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String destino;
	private LocalDate fechaDeExportacion;
	private String nombreEmpresa;
	private List<Item> items = new ArrayList<>();
	
	public Pedido(String destino, LocalDate fechaDeExportacion, String nombreEmpresa) {
		this.destino = destino;
		this.fechaDeExportacion = fechaDeExportacion;
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public Factura facturar() {
		return new Factura(this.fechaDeExportacion, this.items);
	}

	public String getDestino() {
		return destino;
	}

	public LocalDate getFechaDeExportacion() {
		return fechaDeExportacion;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public List<Item> getItems() {
		return items;
	}
}
