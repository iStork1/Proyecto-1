package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaReservaAlquiler {
	private ArrayList<Reserva> reservas;
	private ArrayList<Alquiler> alquileres;
	
	private Alquiler alquilerEnCurso;
	private Reserva reservaEnCurso;
	
	public void crearAlquiler(Categoria tipoCarro, Sede sedeDondeRecogera, Sede lugarRecoleccion, LocalDate fechaRecoleccion,
			Sede sedeDondeSeEntrega, LocalDate fechaEntrega, int valorServicio) 
	{
		alquilerEnCurso = new Alquiler(tipoCarro, sedeDondeRecogera, lugarRecoleccion, fechaRecoleccion,
				sedeDondeSeEntrega, fechaEntrega, valorServicio);
		
		alquileres.add(alquilerEnCurso);
		
		alquilerEnCurso = null;
		
		
		
	};
	
	public void crearReserva(Categoria tipoCarro, Sede sedeDondeRecogera, Sede lugarRecoleccion, LocalDate fechaRecoleccion,
			Sede sedeDondeSeEntrega, LocalDate fechaEntrega, int valorServicio) 
	{
		reservaEnCurso = new Reserva(tipoCarro,sedeDondeRecogera, lugarRecoleccion, fechaRecoleccion,
				sedeDondeSeEntrega,fechaEntrega,valorServicio);
		
		reservas.add(reservaEnCurso);
		reservaEnCurso=null;
		
	};
}
