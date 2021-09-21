package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro cuentaUno, cuentaDos, cuentaTres;
	
	@BeforeEach
	public void setUp() {
		cuentaUno = new CajaDeAhorro(100);
		cuentaDos = new CajaDeAhorro(510);
		cuentaTres = new CajaDeAhorro();		
	}
	
	@Test
	public void testExtraer() {
		assertTrue(cuentaUno.extraer(50));
		assertTrue(cuentaDos.extraer(500));
		assertFalse(cuentaTres.extraer(50));
		assertEquals(49, cuentaUno.getSaldo());
		assertEquals(0, cuentaDos.getSaldo());
		assertEquals(0, cuentaTres.getSaldo());
	}
	
	@Test
	public void testTransferir() {
		assertTrue(cuentaUno.transferirACuenta(50, cuentaDos));
		assertFalse(cuentaTres.transferirACuenta(100, cuentaUno));
		assertEquals(49, cuentaUno.getSaldo());
		assertEquals(560, cuentaDos.getSaldo());
		assertEquals(0, cuentaTres.getSaldo());
	}
}
