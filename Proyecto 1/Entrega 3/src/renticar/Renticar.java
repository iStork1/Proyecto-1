package renticar;

import java.io.File;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import consola.Aplicacion;
import modelo.Categoria;
import modelo.ControlUsuarios;
import modelo.Inventario;
import modelo.Sede;
import modelo.SistemaReservaAlquiler;
import modelo.Usuario;

public class Renticar {
	private Usuario administradorGeneral;
	public static int precioPorTemporada; //alta, baja, media , precio

	private ControlUsuarios controlUsuarios;
	private SistemaReservaAlquiler sistemaReservaAlquiler;
	
	private ArrayList<Sede> sedes;//TODO
	
	
	private Inventario inventario;
	
	public Renticar() throws IOException
	{	
		File archivoUsuarios = new File("usuarios.txt");
		File archivoReservaAlquiler = new File("reservAlquiler.txt");
		File archivoInventario = new File("inventario.txt");
		
		
		this.controlUsuarios = new ControlUsuarios(archivoUsuarios);
		
		this.administradorGeneral = new Usuario("admin","admin","administradorGeneral");
		
		controlUsuarios.crearAdministrador(this.administradorGeneral,"admin");
		
		this.sistemaReservaAlquiler = new SistemaReservaAlquiler();//TODO
		
		//this.inventario = new Inventario(archivoInventario);
		
		
		
	}
	
	public static int getTemporada() {
		return precioPorTemporada;
	}

	public static void setTemporada(int temporada) {
		Renticar.precioPorTemporada = temporada;
	}

	
	public ControlUsuarios getcontrolUsuarios()
	{
		return controlUsuarios;
	}

	public SistemaReservaAlquiler getSistemaReservaAlquiler() {
		return sistemaReservaAlquiler;
	}

//	public Inventario getInventario() {
//		return inventario;
//	}
	
	public void alquilarVehiculo()
	{
		
//		Categoria tipoCarro, Sede sedeDondeRecogera, Sede lugarRecoleccion, LocalDate fechaRecoleccion,
//		Sede sedeDondeSeEntrega, LocalDate fechaEntrega, int valorServicio
		
		
		
		Categoria tipoCarro = this.seleccionarCategoria();
		
		Sede sedeDondeRecogera =  this.seleccionarSede();
		
		
		System.out.println("Seleccione la fecha en la que recogera el vehículo");
		
		LocalDateTime fechaRecoleccion = this.definirFecha();
		
		Sede sedeDondeSeEntrega = this.seleccionarSede();
		
		System.out.println("Seleccione la fecha en la que devolverá el vehículo");
		
		LocalDateTime fechaEntrega = this.definirFecha();
		
		
	
		
		this.sistemaReservaAlquiler.crearAlquiler(tipoCarro, sedeDondeRecogera, fechaRecoleccion,
				sedeDondeSeEntrega, fechaEntrega);
	}
	
	private Categoria seleccionarCategoria()
	{
		ArrayList<Categoria> categorias = Categoria.getCategorias();
		
		boolean funcionando=true;
		int indexCategoria = 0;
		while(funcionando)
		
		
		{
		System.out.println("Seleccione una de las siguientes categorias:");
		for (int i = 0;i<categorias.size();i++)
		{
			System.out.println(i+". "+categorias.get(i).getIdCategoria());
		}
		indexCategoria = Integer.parseInt(Aplicacion.input("->"));
		
		if (indexCategoria >0 & indexCategoria <categorias.size())
			{funcionando = false;}
		
		}
		
		return categorias.get(indexCategoria);
	}
	
	private Sede seleccionarSede()
	{
		//sedes ArrayList<Sede>
		
		boolean funcionando=true;
		int indexSede = 0;
		while(funcionando)
		
		
		{
		System.out.println("Seleccione una de las siguientes sedes:");
		for (int i = 0;i<this.sedes.size();i++)
		{
			System.out.println(i+". "+this.sedes.get(i).getnombre());
		}
		indexSede = Integer.parseInt(Aplicacion.input("->"));
		
		if (indexSede >0 & indexSede <this.sedes.size())
			{funcionando = false;}
		
		}
		
		return this.sedes.get(indexSede);
	}
	
	private LocalDateTime definirFecha()
	{
		LocalDateTime fechaHora = null;
		boolean funcionando = true;
		while(funcionando)
		{
		int anio = Integer.parseInt(Aplicacion.input("Año: "));
		int mes = Integer.parseInt(Aplicacion.input("Mes (en números de 1 a 12): "));
		int dia = Integer.parseInt(Aplicacion.input("Dia: "));
		
		int hora = Integer.parseInt(Aplicacion.input("Hora (solo la parte de la hora de 0 a 23): "));
		int minuto = Integer.parseInt(Aplicacion.input("Minuto (de 0 a 59): "));
		
		try {
		fechaHora = LocalDateTime.of(anio, mes, dia, hora, minuto); // Año, mes, día, hora, minuto
		funcionando = false;
		}catch (DateTimeException e) {
	        System.out.println("Error: Fecha y hora no válidas. Verifica los valores ingresados.");
	    }catch (NumberFormatException e) {
	        System.out.println("Error: Ingresa valores numéricos válidos.");
	    }
		
		}
		
		
		return fechaHora;
		
	}
	
	
	

}
