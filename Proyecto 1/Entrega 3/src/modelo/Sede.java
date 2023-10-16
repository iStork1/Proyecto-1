package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sede {
	public ArrayList<Usuario> Empleados=new ArrayList<Usuario>();
	private String nombre;
	private String direccion;
	private String HorariosAtencion;
	
	
	public Sede() {
		
	}
	public String getnombre() {

		return this.nombre;
	}

}
