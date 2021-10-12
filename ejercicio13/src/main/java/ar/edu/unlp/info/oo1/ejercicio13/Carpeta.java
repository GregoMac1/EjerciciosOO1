package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails = new ArrayList<>();
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarEmail(Email email) {
		this.emails.remove(email);
	}
	
	public List<Email> getEmails() {
		return emails;
	}
	
	public Email emailQueContiene(String texto) {
		for (Email e:emails) {
			if (e.contiene(texto))
				return e;
		}
		return null;
	}
	
	public int getTamano() {
		return this.emails.stream().mapToInt((Email e) -> e.getTamano()).sum();
	}
}
