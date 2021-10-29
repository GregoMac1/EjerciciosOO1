package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo1.ejercicio14.DateLapse;
import ar.edu.unlp.info.oo1.ejercicio14.DateLapseTarea1;

public class ServicioLlamadas {
	private List<Llamada> llamadas = new ArrayList<>();
	
	public Llamada registarLlamadaLocal(LocalDateTime fechaYHoraComienzo, int duracionEnMinutos, 
			Telefono origen, Telefono destino) {
		Llamada llamada = new LlamadaLocal(fechaYHoraComienzo, duracionEnMinutos, origen, destino);
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public Llamada registarLlamadaInterurbana(LocalDateTime fechaYHoraComienzo, int duracionEnMinutos, 
			Telefono origen, Telefono destino, double distanciaEnKM) {
		Llamada llamada = new LlamadaInterurbana(fechaYHoraComienzo, duracionEnMinutos, origen, destino, distanciaEnKM);
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public Llamada registarLlamadaInternacional(LocalDateTime fechaYHoraComienzo, int duracionEnMinutos, 
			Telefono origen, Telefono destino, String paisOrigen, String paisDestino) {
		Llamada llamada = new LlamadaInternacional(fechaYHoraComienzo, duracionEnMinutos, origen, destino, paisOrigen, paisDestino);
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public Factura facturarLlamadasDeCliente(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin) {
		DateLapse periodo = new DateLapseTarea1(fechaInicio, fechaFin);
		double montoTotal = this.llamadas.stream().
		filter(l -> l.getOrigen().equals(cliente.getTelefono())).
		filter(l -> periodo.includesDate(l.getFechaYHoraComienzo().toLocalDate())).
		mapToDouble(l -> (cliente instanceof PersonaFisica ? l.calcularCosto() * 0.9 : l.calcularCosto())).
		sum();
		return new Factura(cliente, LocalDate.now(), fechaInicio, fechaFin, montoTotal);
	}
}
