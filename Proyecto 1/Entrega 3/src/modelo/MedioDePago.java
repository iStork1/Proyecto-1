package modelo;

import java.time.LocalDate;

public class MedioDePago {

	private String tipoPago;
	private int numeroPago;
	private LocalDate fechaVencimientoPago;	
	

	public MedioDePago(String tipo, int numero, LocalDate fecha) {
		tipoPago = tipo;
		numeroPago = numero;
		fechaVencimientoPago = fecha;
	}
	
	
	
}
