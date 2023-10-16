package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Reserva implements Serializable {

		private Categoria tipoCarro;
		private Sede sedeDondeRecogera;
		
		private LocalDate fechaRecoleccion; 
		private Sede sedeDondeSeEntrega;
		private LocalDate fechaEntrega;
		private int valorServicio;
//		-otrosConductores:Licencia[]
		public Reserva(Categoria tipoCarro, Sede sedeDondeRecogera, LocalDate fechaRecoleccion,
				Sede sedeDondeSeEntrega, LocalDate fechaEntrega) {
			this.tipoCarro = tipoCarro;
			this.sedeDondeRecogera = sedeDondeRecogera;
			
			this.fechaRecoleccion = fechaRecoleccion;
			this.sedeDondeSeEntrega = sedeDondeSeEntrega;
			this.fechaEntrega = fechaEntrega;
			//this.valorServicio = valorServicio;
		}
}
