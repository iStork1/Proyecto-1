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
	private Vehiculo vehiculoAlquilado;
//	-otrosConductores:Licencia[]
	
	
	
	public Alquiler(Categoria tipoCarro, Sede sedeDondeRecogera, LocalDateTime fechaRecoleccion,
			Sede sedeDondeSeEntrega, LocalDateTime fechaEntrega, Inventario inventario) {
		this.tipoCarro = tipoCarro;
		this.sedeDondeRecogera = sedeDondeRecogera;
		this.fechaRecoleccion = fechaRecoleccion;
		this.sedeDondeSeEntrega = sedeDondeSeEntrega;
		this.fechaEntrega = fechaEntrega;
		
		vehiculoAlquilado=inventario.conseguirCarro(fechaRecoleccion, sedeDondeRecogera, tipoCarro);
		
		
		
		//this.valorServicio = valorServicio;
	}
	
	public boolean hayVehiculo()
	{
		return this.vehiculoAlquilado!=null;
	}
	
	

}
