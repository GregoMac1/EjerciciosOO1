package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateLapseTest {
	DateLapse prueba;
	DateLapse uno;
	DateLapse dos;
	DateLapse tres;
	DateLapse cuatro;
	
	@BeforeEach
	void setUp() {
		prueba = new DateLapseTarea1(LocalDate.of(2021, 12, 10), LocalDate.of(2021, 12, 20));
		uno = new DateLapseTarea1(LocalDate.of(2021, 12, 1), LocalDate.of(2021, 12, 31));
		dos = new DateLapseTarea3(LocalDate.of(2021, 12, 1), LocalDate.of(2021, 12, 8));
		tres = new DateLapseTarea1(LocalDate.of(2021, 12, 1), LocalDate.of(2021, 12, 5));
		cuatro = new DateLapseTarea3(LocalDate.of(2021, 12, 10), LocalDate.of(2021, 12, 15));
	}
	
	@Test
	public void testFechas() {
		assertTrue(prueba.overlaps(uno));
		assertFalse(prueba.overlaps(dos));
		assertFalse(prueba.overlaps(tres));
		assertTrue(prueba.overlaps(cuatro));
	}
}
