package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicioEmpleados {
	private List<Empleado> empleados = new ArrayList<>();

	public void darDeAltaEmpleado(String nombre, String apellido, String cuil, LocalDate fechaNac, 
			boolean tieneConyuge, boolean tieneHijos) {
		this.empleados.add(new Empleado(nombre, apellido, cuil, fechaNac, tieneConyuge, tieneHijos));
	}
	
	public Empleado buscarEmpleado(String cuil) {
		return this.empleados.stream().
				filter(e -> e.getCuil().equals(cuil)).
				findAny().
				orElse(null);
	}
	
	public void darDeBajaEmpleado(Empleado empleado) {
		if (this.empleados.contains(empleado))
			this.empleados.remove(empleado);
	}
	
	public void cargarContratoPorHoras(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin, 
			double valorPorHora, double cantHorasPorMes) {
		empleado.agregarContrato(new ContratoPorHoras(fechaInicio, fechaFin, valorPorHora, cantHorasPorMes));
	}
	
	public void cargarContratoDePlanta(Empleado empleado, LocalDate fechaInicio, double sueldoMensual, 
			double montoPorConyuge, double montoPorHijos) {
		empleado.agregarContrato(new ContratoDePlanta(fechaInicio, sueldoMensual, montoPorConyuge, montoPorHijos));
	}
	
	public List<Empleado> getEmpleadosContratoVencido() {
		return this.empleados.stream().
				filter(e -> !e.contratoVigente()).
				toList();
	}
	
	public List<Recibo> generarRecibosDeCobro() {
		return this.empleados.stream().
				filter(e -> e.contratoVigente()).
				map(e -> e.generarRecibo()).
				toList();
	}
}
