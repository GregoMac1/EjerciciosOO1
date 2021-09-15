package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean isOn;
	private List<Farola> neighbors = new ArrayList<>();
	
	public boolean isOn() {
		return this.isOn;
	}
	
	public List<Farola> getNeighbors() {
		return this.neighbors;
	}
	
	public void turnOn() {
		if (this.isOn() == false) {
			this.isOn = true;
			for (Farola neighbor:this.getNeighbors()) {
				neighbor.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if (this.isOn() == true) {
			this.isOn = false;
			for (Farola neighbor:this.getNeighbors()) {
				neighbor.turnOff();
			}
		}
	}
	
	private void addNeighbor(Farola farola) {
		this.neighbors.add(farola);
	}
	
	public void pairWithNeighbor(Farola farola) {
		if (!this.neighbors.contains(farola)) {
			this.addNeighbor(farola);
			farola.addNeighbor(this);
		}
	}
}
