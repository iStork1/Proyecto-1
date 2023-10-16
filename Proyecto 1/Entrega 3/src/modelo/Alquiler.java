package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Alquiler implements Serializable{
	private Categoria tipoCarro;
	private Sede sedeDondeRecogera;
	private LocalDateTime fechaRecoleccion; 
	private Sede sedeDondeSeEntrega;
	private LocalDateTime fechaEntrega;
	private int valorServicio;
//	-otrosConductores:Licencia[]
	public Alquiler(Categoria tipoCarro, Sede sedeDondeRecogera, LocalDateTime fechaRecoleccion,
			Sede sedeDondeSeEntrega, LocalDateTime fechaEntrega) {
		this.tipoCarro = tipoCarro;
		this.sedeDondeRecogera = sedeDondeRecogera;
		this.fechaRecoleccion = fechaRecoleccion;
		this.sedeDondeSeEntrega = sedeDondeSeEntrega;
		this.fechaEntrega = fechaEntrega;
		
//		if ()
		
		
		
		//this.valorServicio = valorServicio;
	}
	
	

}
