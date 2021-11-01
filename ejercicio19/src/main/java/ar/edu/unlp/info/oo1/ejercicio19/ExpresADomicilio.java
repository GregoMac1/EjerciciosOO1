package ar.edu.unlp.info.oo1.ejercicio19;

public class ExpresADomicilio implements MedioDeEnvio{
	private Mapa mapa;

	public double calcularPrecio(Direccion dirVendedor, Direccion dirCliente) {
		return 0.5 * mapa.distanciaEntre(dirVendedor, dirCliente);
	}
}
