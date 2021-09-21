package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cuentaUno, cuentaDos, cuentaTres;
	
	@BeforeEach
	public void setUp() {
		cuentaUno = new CuentaCorriente(100);
		cuentaDos = new CuentaCorriente(500);
		cuentaTres = new CuentaCorriente();
		cuentaUno.setLimiteDeDescubierto(0);
		cuentaDos.setLimiteDeDescubierto(1000);
		cuentaTres.setLimiteDeDescubierto(100);
	}
	
	@Test
	public void testExtraer() {
		assertTrue(cuentaUno.extraer(50));
		assertTrue(cuentaDos.extraer(500));
		assertTrue(cuentaTres.extraer(50));
		assertEquals(50, cuentaUno.getSaldo());
		assertEquals(0, cuentaDos.getSaldo());
		assertEquals(-50, cuentaTres.getSaldo());
	}
	
	@Test
	public void testTransferir() {
		assertTrue(cuentaUno.transferirACuenta(50, cuentaDos));
		assertEquals(50, cuentaUno.getSaldo());
		assertEquals(550, cuentaDos.getSaldo());
		assertTrue(cuentaDos.transferirACuenta(1500, cuentaTres));
		assertEquals(-950, cuentaDos.getSaldo());
		assertEquals(1500, cuentaTres.getSaldo());
	}
}