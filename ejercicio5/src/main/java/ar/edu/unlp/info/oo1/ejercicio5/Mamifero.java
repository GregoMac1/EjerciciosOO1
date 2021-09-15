package ar.edu.unlp.info.oo1.ejercicio5;

import java.time.LocalDate;

public class Mamifero { //creo que esta todo bien pero no se como hacer que ancestro devuelva falso si lo llamo con el mismo objeto que el param
	private String identificador;
	private String especie;
	private LocalDate fechaNac;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero() {};
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null)
			return this.getMadre().getPadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null)
			return this.getMadre().getMadre();
		else
			return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null)
			return this.getPadre().getPadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre() != null)
			return this.getPadre().getMadre();
		else
			return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		if (this.equals(mamifero))
			return true;
		else {
			if (this.getMadre() == null && this.getPadre() == null)
				return false;
			else {
				if (this.getMadre() != null) {
					if (this.getMadre().tieneComoAncestroA(mamifero))
						return true;
				}
				if (this.getPadre() != null) {
					if (this.getPadre().tieneComoAncestroA(mamifero))
						return true;
				}
			}
			return false;
		}
	}
}
