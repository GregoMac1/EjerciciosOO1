package ar.edu.unlp.info.oo1.parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {
	private ServicioPedidos servicioPedidos;
	private Pedido pedido1;
	private Factura factura1;
	
	@BeforeEach
	public void setup() {
		servicioPedidos = new ServicioPedidos();
		pedido1 = new Pedido("Berlin", LocalDate.of(2021, 12, 8), "Amazon");
	}
	
	@Test
	public void facturaSinItemsTest() {
		factura1 = pedido1.facturar();
		assertEquals(0, factura1.getCostoFinal());
	}
	
	@Test
	public void facturaConItemsTest() {
		servicioPedidos.agregarBienAPedido(pedido1, "Manguera Riego", 500, 3.4, 122);
		servicioPedidos.agregarServicioAPedido(pedido1, "Mesa de teleayuda", 3000, 6000);
		factura1 = pedido1.facturar();
		assertEquals(79905, factura1.getCostoFinal());
	}
}
