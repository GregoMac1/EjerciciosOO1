package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas = new ArrayList<>();
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double volumenDeMaterial(String material) {
		return this.piezas.stream().
				filter((Pieza p) -> p.getMaterial().equals(material)).
				mapToDouble((Pieza p) -> p.getVolumen()).
				sum();
	}
	
	public double superficieDeColor(String color) {
		return this.piezas.stream().
				filter((Pieza p) -> p.getColor().equals(color)).
				mapToDouble((Pieza p) -> p.getSuperficie()).
				sum();
	}
}
