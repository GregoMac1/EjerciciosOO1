package ar.edu.unlp.info.oo1.ejercicio17;

import java.util.List;
import java.util.ArrayList;

public class ServicioClientes {
	private List<String> telefonos = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	
	public void agregarNumeroDeTelefono(String telefono) {
		this.telefonos.add(telefono);
	}
	
	public Cliente registrarPersonaFisica(String nombre, String direccion, String dni) {
		String telefono = this.telefonos.remove(0);
		Cliente cliente = new PersonaFisica(nombre, direccion, telefono, dni);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Cliente registrarPersonaJuridica(String nombre, String direccion, String cuit, String tipo) {
		String telefono = this.telefonos.remove(0);
		Cliente cliente = new PersonaJuridica(nombre, direccion, telefono, cuit, tipo);
		this.clientes.add(cliente);
		return cliente;
	}
}
