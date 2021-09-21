package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Factura> facturas = new ArrayList<>();
	private List<Consumo> consumos = new ArrayList<>();
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDomicilio() {
		return domicilio;
	}

	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public void agregarFactura(Factura factura){
		this.facturas.add(factura);
	}
	
	public double ultimoConsumoActiva() {
		return this.ultimoConsumo().getConsumoEnergiaActiva();
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		return new Factura(LocalDate.now(), 
				this.ultimoConsumo().costoEnBaseA(precioKWh), 
				this.ultimoConsumo().factorDePotencia() > 0.8 ? 10 : 0, 
				this);
	}

	public List<Factura> getFacturas() {
		return facturas;
	}
	
	public Consumo ultimoConsumo() {
		LocalDate fecha = LocalDate.of(1, 1, 1);
		Consumo consumo = null;
		for (int i = 0; i < this.consumos.size(); i++) {
			if (consumos.get(i).getFecha().isAfter(fecha)) {
				fecha = consumos.get(i).getFecha();
				consumo = consumos.get(i);
			}
		}
		return consumo;
	}
}
