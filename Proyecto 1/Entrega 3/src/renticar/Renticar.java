package renticar;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import modelo.ControlUsuarios;
import modelo.Inventario;
import modelo.Sede;
import modelo.SistemaReservaAlquiler;
import modelo.Usuario;

public class Renticar {
	private Usuario administradorGeneral;
	public static String temporada; //alta, baja, media //TODO

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
	
	public static String getTemporada() {
		return temporada;
	}

	public static void setTemporada(String temporada) {
		Renticar.temporada = temporada;
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
	
	
	

}
