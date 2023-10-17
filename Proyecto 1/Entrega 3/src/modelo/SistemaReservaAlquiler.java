package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class SistemaReservaAlquiler {
	private ArrayList<Reserva> reservas;
	private ArrayList<Alquiler> alquileres;
	
	private Alquiler alquilerEnCurso;
	private Reserva reservaEnCurso;
	private File archivo;
	
	
	public SistemaReservaAlquiler(File archivo)
	{
		this.archivo=archivo;
		ArrayList[] listas = this.leerArchivo();
		
		this.reservas = listas[0];
		this.alquileres = listas[1];
		
		if (this.reservas == null && this.alquileres ==null) {
            this.reservas = new ArrayList<>(); // Si no se pudo cargar, crea un nuevo HashMap
            this.alquileres = new ArrayList<>();
            
        }
	}
	
	
	private ArrayList[] leerArchivo() 
	{
		try {
            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ArrayList[] listas = (ArrayList[]) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            return listas;
		} catch (IOException | ClassNotFoundException e) {
            // Si ocurre una excepción al cargar, simplemente regresamos null
            return null;
        }
		
	}
	
	
	public void guardarReservasAlquileres() throws IOException 
	{
		FileOutputStream fileOut = new FileOutputStream(this.archivo);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        
        ArrayList[] listas = {this.reservas,this.alquileres};
        
        // Escribir el HashMap en el archivo
        objectOut.writeObject(listas);

        // Cerrar el flujo
        objectOut.close();
        fileOut.close();
		
	}
	
	
	
	
	
	public boolean crearAlquiler(Categoria tipoCarro, Sede sedeDondeRecogera, LocalDateTime fechaRecoleccion,
			Sede sedeDondeSeEntrega, LocalDateTime fechaEntrega, Inventario inventario) throws IOException 
	{
		alquilerEnCurso = new Alquiler(tipoCarro, sedeDondeRecogera,  fechaRecoleccion,
				sedeDondeSeEntrega, fechaEntrega,inventario);
		
		if(alquilerEnCurso.hayVehiculo())
		{
		alquileres.add(alquilerEnCurso);
		
		alquilerEnCurso = null;
		
		this.guardarReservasAlquileres();
		return true;
		}
		else {return false;}
	};
	
	public void crearReserva(Categoria tipoCarro, Sede sedeDondeRecogera, LocalDate fechaRecoleccion,
			Sede sedeDondeSeEntrega, LocalDate fechaEntrega) throws IOException 
	{
		reservaEnCurso = new Reserva(tipoCarro,sedeDondeRecogera, fechaRecoleccion,
				sedeDondeSeEntrega,fechaEntrega);
		
		reservas.add(reservaEnCurso);
		reservaEnCurso=null;
		
		this.guardarReservasAlquileres();
		
	};
}
