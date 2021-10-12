package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas = new ArrayList<>();
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarEmail(email);
		destino.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		Email emailDeInbox = this.inbox.emailQueContiene(texto);
		if (emailDeInbox != null)
			return emailDeInbox;
		else {
			Email emailDeCarpeta;
			for (Carpeta c:carpetas) {
				emailDeCarpeta = c.emailQueContiene(texto);
				if (emailDeCarpeta != null)
					return emailDeCarpeta;
			}
		}
		return null;
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt((Carpeta c) -> c.getTamano()).sum()
				+ this.inbox.getTamano();
	}
}
