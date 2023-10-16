package modelo;

import java.time.LocalDate;

public class Reserva {

		private Categoria tipoCarro;
		private Sede sedeDondeRecogera;
		private Sede lugarRecoleccion;
		private LocalDate fechaRecoleccion; 
		private Sede sedeDondeSeEntrega;
		private LocalDate fechaEntrega;
		private int valorServicio;
//		-otrosConductores:Licencia[]
		public Reserva(Categoria tipoCarro, Sede sedeDondeRecogera, Sede lugarRecoleccion, LocalDate fechaRecoleccion,
				Sede sedeDondeSeEntrega, LocalDate fechaEntrega, int valorServicio) {
			this.tipoCarro = tipoCarro;
			this.sedeDondeRecogera = sedeDondeRecogera;
			this.lugarRecoleccion = lugarRecoleccion;
			this.fechaRecoleccion = fechaRecoleccion;
			this.sedeDondeSeEntrega = sedeDondeSeEntrega;
			this.fechaEntrega = fechaEntrega;
			this.valorServicio = valorServicio;
		}
}
