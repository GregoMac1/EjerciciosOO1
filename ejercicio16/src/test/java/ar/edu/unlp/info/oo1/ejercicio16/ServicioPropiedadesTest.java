package ar.edu.unlp.info.oo1.ejercicio16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ar.edu.unlp.info.oo1.ejercicio14.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicioPropiedadesTest {
	private ServicioPropiedades servicio;
	private ServicioPropiedades servicio2;
	private Usuario usuario, usuario2;
	private Propiedad propiedad, propiedad2;
	private PoliticaFlexible cancelacion;
	
	@BeforeEach
	public void setup() {
		servicio = new ServicioPropiedades();
		servicio2 = new ServicioPropiedades();
		usuario = new Usuario("Javier", "49 1182", "44110258");
		usuario2 = new Usuario("Martin", "56 2234", "22333111");
		cancelacion = new PoliticaFlexible();
	    propiedad = servicio.registrarPropiedad(
	    		usuario, "Propiedad1", 15, "Lujosa", "20 e 45 y 46", cancelacion);
	    
	}
	
	@Test
	public void registrarPropiedadTest() {
	    assertTrue(servicio.getPropiedades().contains(propiedad));
	    servicio2.registrarPropiedad(
	    		usuario2, "Propiedad2", 30, "Cara", "67 e 1 y 2", cancelacion);
	    assertFalse(servicio2.getPropiedades().contains(propiedad));    
	}
	
	@Test
	public void hacerReservaTest() {
		DateLapse periodo = new DateLapseTarea1(LocalDate.of(2021, 10, 30), LocalDate.of(2021, 11, 5));
		Reserva reserva = propiedad.hacerReserva(periodo, usuario);
		assertTrue(propiedad.getReservas().contains(reserva));
		Reserva reserva2 = new Reserva(periodo, usuario2);
		assertFalse(propiedad.getReservas().contains(reserva2));
	}
	
	@Test
	public void eliminarReservaTest() {
		DateLapse periodo = new DateLapseTarea1(LocalDate.of(2021, 10, 28),LocalDate.of(2021, 11, 5));
		DateLapse periodo2 = new DateLapseTarea1(LocalDate.of(2021, 11, 28),LocalDate.of(2021, 11, 30));
		Reserva reserva2 = propiedad.hacerReserva(periodo2, usuario);
		Reserva reserva = propiedad.hacerReserva(periodo, usuario);
		propiedad.eliminarReserva(reserva);
		propiedad.eliminarReserva(reserva2);
		assertTrue(propiedad.getReservas().contains(reserva2));
		assertFalse(propiedad.getReservas().contains(reserva));
	}
	
	@Test
	public void propiedadesDisponibles() {
	    DateLapse periodo = new DateLapseTarea1(LocalDate.of(2021, 10, 30), LocalDate.of(2021, 11, 5));
	    DateLapse periodo2 = new DateLapseTarea1(LocalDate.of(2021, 11, 30), LocalDate.of(2021, 12, 5));
	    propiedad.hacerReserva(periodo, usuario2);
	    propiedad2.hacerReserva(periodo2, usuario2);
	    assertTrue(servicio.getPropiedadesDisponibles(periodo2).contains(propiedad));
	    assertFalse(servicio.getPropiedadesDisponibles(periodo2).contains(propiedad2));
	}
	
	@Test
	public void calcularPrecioReservTest() {
		DateLapse periodo = new DateLapseTarea1(LocalDate.of(2021, 10, 30), LocalDate.of(2021, 11, 5));
		Reserva reserva = new Reserva(periodo, usuario);
		assertEquals(90, reserva.calcularPrecio(15));
		assertNotEquals(80, reserva.calcularPrecio(15));
	}
	
	@Test
	public void reservasUsuarioTest() {
		List<Reserva> reservasUsuario = new ArrayList<Reserva>();
		Propiedad propiedad = servicio.registrarPropiedad(usuario, "Propiedad1", 15, "Lujosa", "20 e 45 y 46", cancelacion);
	    Propiedad propiedad2 = servicio.registrarPropiedad(usuario2, "Propiedad2", 30, "Cara", "67 e 1 y 2", cancelacion);
	    DateLapse periodo = new DateLapseTarea1(LocalDate.of(2021, 10, 30), LocalDate.of(2021, 11, 5));
	    DateLapse periodo2 = new DateLapseTarea1(LocalDate.of(2021, 11, 30), LocalDate.of(2021, 12, 5));
	    Reserva reserva = propiedad.hacerReserva(periodo, usuario2);
	    Reserva reserva2 = propiedad2.hacerReserva(periodo2, usuario2);
	    Reserva reserva3 = propiedad.hacerReserva(periodo2, usuario);
	    reservasUsuario.add(reserva);
	    reservasUsuario.add(reserva2);
	    assertEquals(reservasUsuario,servicio.getReservasDeUsuario(usuario2));
	    assertNotEquals(reservasUsuario,servicio.getReservasDeUsuario(usuario)); 
	}
    
	@Test
	public void gananciasUsuarioTest() {
		Propiedad propiedad = servicio.registrarPropiedad(usuario, "Propiedad1", 15, "Lujosa", "20 e 45 y 46", cancelacion);
	    Propiedad propiedad2 = servicio.registrarPropiedad(usuario2, "Propiedad2", 30, "Cara", "67 e 1 y 2", cancelacion);
	    DateLapse periodo = new DateLapseTarea1(LocalDate.of(2021,10,30),LocalDate.of(2021,11,5));
	    DateLapse periodo2 = new DateLapseTarea1(LocalDate.of(2021,11,30),LocalDate.of(2021,12,5));
	    DateLapse periodo3 = new DateLapseTarea1(LocalDate.of(2021,12,3),LocalDate.of(2021,12,5));
	    Reserva reserva = propiedad.hacerReserva(periodo, usuario);
	    Reserva reserva2 = propiedad2.hacerReserva(periodo2, usuario);
	    Reserva reserva3 = propiedad.hacerReserva(periodo2, usuario);
	    assertEquals(50,servicio.calcularIngresosDePropietario(usuario, periodo3.getFrom(), periodo3.getTo()));
	}
}