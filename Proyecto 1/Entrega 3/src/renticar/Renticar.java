package renticar;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import modelo.Categoria;
import modelo.ControlUsuarios;
import modelo.HorarioAtencion;
import modelo.Inventario;
import modelo.Licencia;
import modelo.Sede;
import modelo.Sedes;
import modelo.SistemaReservaAlquiler;
import modelo.Usuario;
import modelo.Vehiculo;

public class Renticar {
	private Usuario administradorGeneral;
	public static int precioPorTemporada; //alta, baja, media , precio

	private ControlUsuarios controlUsuarios;
	private SistemaReservaAlquiler sistemaReservaAlquiler;
	private Sedes controlSedes;
	
	
	
	
	
	
	private Inventario inventario;
	
	
	
	public Renticar() throws IOException
	{	
		File archivoUsuarios = new File("usuarios.txt");
		File archivoReservaAlquiler = new File("reservAlquiler.txt");
		File archivoInventario = new File("inventario.txt");
		File archivoSedes=new File("sedes.txt");
		
		
		this.controlUsuarios = new ControlUsuarios(archivoUsuarios);
		
		this.administradorGeneral = new Usuario("admin","admin","administradorGeneral");
		
		controlUsuarios.crearAdministrador(this.administradorGeneral,"admin");
		
		//this.sistemaReservaAlquiler = new SistemaReservaAlquiler(archivoReservaAlquiler);//TODO
		
		this.inventario = new Inventario(archivoInventario);
		
		this.controlSedes = new Sedes(archivoSedes);
		
		
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
	
//	public void alquilarVehiculo() throws IOException
//	{
//		
////		Categoria tipoCarro, Sede sedeDondeRecogera, Sede lugarRecoleccion, LocalDate fechaRecoleccion,
////		Sede sedeDondeSeEntrega, LocalDate fechaEntrega, int valorServicio
//		
//		if (!this.controlUsuarios.getUsuario().puedeAlquilar())
//		{this.completarDatos();}
//		
//		Categoria tipoCarro = this.seleccionarCategoria();
//		
//		Sede sedeDondeRecogera =  this.seleccionarSede();
//		
//		
//		System.out.println("Seleccione la fecha en la que recogera el vehículo");
//		
//		LocalDateTime fechaRecoleccion = this.definirFecha();
//		
//		Sede sedeDondeSeEntrega = this.seleccionarSede();
//		
//		System.out.println("Seleccione la fecha en la que devolverá el vehículo");
//		
//		LocalDateTime fechaEntrega = this.definirFecha();
//		
//		
//	
//		
//		if (this.sistemaReservaAlquiler.crearAlquiler(tipoCarro, sedeDondeRecogera, fechaRecoleccion,
//				sedeDondeSeEntrega, fechaEntrega, this.inventario,this.controlUsuarios.getUsuario()))
//		{System.out.println("El alquiler fue creado");}
//		
//		else {System.out.println("El alquiler no fue creado, no se encontró un vehículo que cumpla con sus requerimientos");}
//	}
//	
//	
//	private Sede seleccionarSede()
//	{
//		//sedes ArrayList<Sede>
//		
//		boolean funcionando=true;
//		int indexSede = 0;
//		while(funcionando)
//		
//		
//		{
//		System.out.println("Seleccione una de las siguientes sedes:");
//		for (int i = 0;i<this.sedes.size();i++)
//		{
//			System.out.println(i+". "+this.sedes.get(i).getnombre());
//		}
//		indexSede = Integer.parseInt(Aplicacion.input("->"));
//		
//		if (indexSede >0 & indexSede <this.sedes.size())
//			{funcionando = false;}
//		
//		}
//		
//		return this.sedes.get(indexSede);
//	}
//	
//	
//	private LocalDateTime definirFecha()
//	{
//		LocalDateTime fechaHora = null;
//		boolean funcionando = true;
//		while(funcionando)
//		{
//		int anio = Integer.parseInt(Aplicacion.input("Año: "));
//		int mes = Integer.parseInt(Aplicacion.input("Mes (en números de 1 a 12): "));
//		int dia = Integer.parseInt(Aplicacion.input("Dia: "));
//		
//		int hora = Integer.parseInt(Aplicacion.input("Hora (solo la parte de la hora de 0 a 23): "));
//		int minuto = Integer.parseInt(Aplicacion.input("Minuto (de 0 a 59): "));
//		
//		try {
//		fechaHora = LocalDateTime.of(anio, mes, dia, hora, minuto); // Año, mes, día, hora, minuto
//		funcionando = false;
//		}catch (DateTimeException e) {
//	        System.out.println("Error: Fecha y hora no válidas. Verifica los valores ingresados.");
//	    }catch (NumberFormatException e) {
//	        System.out.println("Error: Ingresa valores numéricos válidos.");
//	    }
//		
//		}
//		
//		
//		return fechaHora;
//		
//	}
//	
//	
	
//	public void crearUsuarioEmpleado() throws IOException
//	{
//		
//		String rol=null;
//		
//		String username = Aplicacion.input("Ingrese el username: ");
//		String password = Aplicacion.input("Ingrese el password: ");
//		if (this.controlUsuarios.getRolUsuarioActual().equals("administradorLocal"))
//		{rol = "empleado";}
//		else {rol = this.seleccionarRol();}
//		
//		this.controlUsuarios.crearUsuario(username, password, rol);
//		
//		System.out.println("Usuario creado correctamente.");
//	}
//	
	public void crearUsuario(String username,String password, String rol,String nombre,String telefono,String email,String apellido,String pais,LocalDateTime fechaNacimiento, String idLicencia,LocalDateTime fechaVencimientoLicencia,BufferedImage imagenLicencia,BufferedImage imagenDocumento,String idDocumento) throws IOException
	{		
		this.controlUsuarios.crearUsuario(username, password, rol);
		this.controlUsuarios.verificarCredencialesUsuario(username, password);
		this.completarDatos(nombre,telefono,email,apellido,pais,fechaNacimiento,idLicencia,fechaVencimientoLicencia,imagenLicencia,imagenDocumento, idDocumento);
	}	
	public void completarDatos(String nombre,String telefono,String email,String apellido,String pais,LocalDateTime fechaNacimiento,String idLicencia,LocalDateTime fechaVencimientoLicencia,BufferedImage imagenLicencia,BufferedImage imagenDocumento,String idDocumento)
	{
		Usuario usuario = this.controlUsuarios.getUsuario();
		
		//Licencia licencia = //todo
		
		
		Licencia licencia = this.definirLicencia(idLicencia,pais,fechaVencimientoLicencia,imagenLicencia);
				
		usuario.aniadirDatosCliente(nombre, telefono, email, fechaNacimiento, pais, imagenDocumento,licencia,apellido,idDocumento);
		
		
		
	}
//	
	private Licencia definirLicencia(String numero,String pais,LocalDateTime fechaVencimiento,BufferedImage imagen)
	{
		Licencia licencia = new Licencia(numero, pais, fechaVencimiento, imagen);
		return licencia;
	}
//	
//	
//	private String seleccionarRol()
//	{
//			boolean funcionando=true;
//			String rol =null;
//			int opcion=0;
//			while(funcionando)
//			{
//			System.out.println("Seleccione uno de los siguientes usuarios:");
//			
//			System.out.println("1. Administrador sede");
//			System.out.println("2. Empleado");
//			try {opcion = Integer.parseInt(Aplicacion.input("->"));}
//			catch(NumberFormatException e) {System.out.println("Ingresa un valor numérico");}
//			
//			
//			if (opcion == 1)
//				{rol="administradorLocal";
//				funcionando = false;}
//			if (opcion ==2)
//				{rol = "empleado";
//				funcionando=false;
//				}
//			}
//			
//			return rol;
//		
//	}
	//modificado para interfaz grafica
	public void agregarVehiculo(String modelo,Categoria categoria,String color,String placa,String transmision,Sede sedeUbicado)
	{
		//Categoria categoria,String modelo, String color, String transmision, String estado, Sede sedeUbicado, LocalDateTime fechaDisponible, boolean disponible, Usuario clienteTiene
		

		String estado = "disponible";
		LocalDateTime fechaDisponible = LocalDateTime.now();
		
				
		Vehiculo vehiculo =new Vehiculo(categoria, modelo, color, transmision, estado, sedeUbicado, fechaDisponible, true,placa);
		
		this.inventario.agregarVehiculo(vehiculo);
	}
	
	public void eliminarVehiculo(String placa)
	{
		this.inventario.eliminarVehiculo(placa);
	}
	public Vehiculo darVehiculo(String placa)
	{
		return this.inventario.getVehiculo(placa);
	}
	public void crearSede(String nombre,String direccion,HorarioAtencion horariosAtencion) throws IOException
	{
		this.controlSedes.crearSede(nombre, direccion,horariosAtencion);
	}
	
	public String[] darSedes()
	{
		return this.controlSedes.darSedes();
	}
	public Sede darSede(String nomSede)
	{
		return this.controlSedes.getSede(nomSede);
	}
	
	
//	
//	
//	public void cambiarEstadoVehiculo()
//	{
//		String placa = Aplicacion.input("Ingrese la placa del vehículo: ");
//		
//		Vehiculo vehiculo = this.inventario.getVehiculo(placa);
//		
//		String estado = this.getEstado();
//		
//		vehiculo.setEstado(estado, null);
//	}
//	
//	
//	public String getEstado()
//	{
//		String[] estados = {"disponible","alquilado","mantenimiento"};
//		int opcion=0;
//		boolean funcionando=true;
//		while (funcionando)
//		{
//		for (int i = 0; i<estados.length;i++)
//		{
//			System.out.println(i+". "+estados[i]);
//		}
//		
//		try {opcion = Integer.parseInt(Aplicacion.input("->"));funcionando=false;}
//		catch(NumberFormatException e) {System.out.println("Ingresa un valor numérico");}
//		}
//		return estados[opcion];
//	}
//	
//	public void entregarVehiculo()
//	{
//		String placa = Aplicacion.input("Ingrese la placa del vehículo para entregar: ");
//		
//		Vehiculo vehiculo = this.inventario.getVehiculo(placa);
//		
//		
//		vehiculo.setEstado("alquilado", vehiculo.getAlquiler().getUsuario());
//		
//		vehiculo.setDisponible(false);
//		
//		//TODO: agregar conductores adicionales
//	}
//	
//	public void recibirVehiculo()
//	{
//		String placa = Aplicacion.input("Ingrese la placa del vehículo para recibir: ");
//		
//		Vehiculo vehiculo = this.inventario.getVehiculo(placa);
//		
//		
//		vehiculo.setEstado("disponible", null);
//		
//		vehiculo.setDisponible(true);
//	}
	
	//Interfaz para el manejo de usuarios
	public boolean loggin(String usuario,String password) {
		return this.getcontrolUsuarios().verificarCredencialesUsuario(usuario, password);
		
	}
	
	 

}
