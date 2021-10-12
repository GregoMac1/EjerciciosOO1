package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {
	private Cilindro uno, dos, tres;
	
	@BeforeEach
	public void setUp() {
		uno = new Cilindro("Vidrio", "Rojo", 4, 7);
		dos = new Cilindro("Vidrio", "Rojo", 10, 3);
		tres = new Cilindro("Vidrio", "Rojo", 8, 15);
	}
}
