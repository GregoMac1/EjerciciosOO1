package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos = new ArrayList<>();
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public boolean contiene(String texto) {
		return (this.titulo.contains(texto) || this.cuerpo.contains(texto));
	}
	
	public void agregarAdjunto(Archivo adjunto) {
		this.adjuntos.add(adjunto);
	}
	
	public List<Archivo> getAdjuntos() {
		return adjuntos;
	}
	
	public int getTamano() {
		return this.adjuntos.stream().mapToInt((Archivo a) -> a.getTamano()).sum();
	}
}
