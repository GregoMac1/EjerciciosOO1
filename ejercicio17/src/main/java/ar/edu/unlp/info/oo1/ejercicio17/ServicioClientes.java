package ar.edu.unlp.info.oo1.ejercicio17;

import java.util.List;
import java.util.ArrayList;

public class ServicioClientes {
	private List<Telefono> telefonos = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	
	public void agregarNumeroDeTelefono(Telefono telefono) {
		this.telefonos.add(telefono);
	}
	
	private Telefono getTelefonoDisponible() {
		return this.telefonos.remove(this.telefonos.size() - 1);
	}
	
	public Cliente registrarPersonaFisica(String nombre, String direccion, String dni) {
		Cliente cliente = new PersonaFisica(nombre, direccion, this.getTelefonoDisponible(), dni);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Cliente registrarPersonaJuridica(String nombre, String direccion, String cuit, String tipo) {
		Cliente cliente = new PersonaJuridica(nombre, direccion, this.getTelefonoDisponible(), cuit, tipo);
		this.clientes.add(cliente);
		return cliente;
	}
}
