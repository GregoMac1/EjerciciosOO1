package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones = new ArrayList<>();
	
	public Inversor(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double valorActual() {
		return this.inversiones.stream().
				mapToDouble((Inversion i) -> i.getValorActual()).
				sum();
	}
}
