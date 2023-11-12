package modelo;

import java.util.ArrayList;

import renticar.Renticar;

public class Categoria {
//	-idCategoria:String
//
//	//(temporada alta y temporada baja), se consulta en el static de aplicación
//	-tarifaDia:int
//
//	-valorEntregaOtraSede:int
//	-valorConductorAdicional:int
	
	private int idCategoria;
	private String nombre;
	private int tarifaDia;
	private int valorEntregaOtraSede;
	private int valorConductorAdicional;
	
	private static ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	
	
	public Categoria(int valorEntregaOtraSede, int valorConductorAdicional,String nombre) {
		this.idCategoria = categorias.size();
		this.nombre =nombre;
		this.tarifaDia = Renticar.getTemporada();
		this.valorEntregaOtraSede = valorEntregaOtraSede;
		this.valorConductorAdicional = valorConductorAdicional;
		
		categorias.add(this);
	}
	
	public static ArrayList<Categoria> getCategorias()
	{
		return categorias;
	}	
	
	public static Categoria getCategoria(String nombreBuscado)
	{	boolean centinela=true;
		int i =0;
		while (centinela)
		{
			if (categorias.get(i).getNombre().equals(nombreBuscado))
			{centinela=false;}
			else {i++;}
		}
		return categorias.get(i);
	}
	
	public String getNombre()
	{return nombre;}
	
	public static String[] getCategorias1()
	{
		String[] vectorCategorias = new String[categorias.size()+2];
		
		vectorCategorias[0] = " ------------------------- ";
		for (int i = 0; i < categorias.size(); i++) {
			vectorCategorias[i+1] = categorias.get(i).getNombre();
        }
		vectorCategorias[categorias.size()+1] = "Crear una nueva categoria";
		return vectorCategorias;
	}
	
	
	
	
	
}
