package ar.edu.unlp.info.oo1.parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ServicioPedidos {
	private List<Pedido> pedidos = new ArrayList<>();
	private List<Factura> facturas = new ArrayList<>();
	
	public Pedido darDeAltaPedido(String destino, LocalDate fechaDeExportacion, String nombreEmpresa) {
		Pedido p = new Pedido(destino, fechaDeExportacion, nombreEmpresa);
		this.pedidos.add(p);
		return p;
	}
	
	public void agregarBienAPedido(Pedido pedido, String descripcion, 
			int cantUnidades, double pesoUnitario, double precioUnitario) {
		pedido.agregarItem(new Bien(descripcion, cantUnidades, pesoUnitario, precioUnitario));
	}
	
	public void agregarServicioAPedido(Pedido pedido, String descripcion, 
			double costoDeMateriales, double costoDeManoDeObra) {
		pedido.agregarItem(new Servicio(descripcion, costoDeMateriales, costoDeManoDeObra));
	}
	
	public Factura facturarPedido(Pedido pedido) {
		Factura factura = pedido.facturar();
		this.facturas.add(factura);
		return factura;
	}
	
	public Factura getFacturaConMayorCosto(LocalDate fechaInicio, LocalDate fechaFin) {
		return this.facturas.stream().
				filter(f -> (f.getFechaDeFacturacion().isEqual(fechaInicio) || 
						f.getFechaDeFacturacion().isAfter(fechaInicio)) && 
						(f.getFechaDeFacturacion().isEqual(fechaFin) || 
								f.getFechaDeFacturacion().isBefore(fechaFin))).
				max(Comparator.comparing(f -> f.getCostoFinal())).
				get();
	}
}
