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
	
	private String idCategoria;
	private int tarifaDia;
	private int valorEntregaOtraSede;
	private int valorConductorAdicional;
	
	private static ArrayList<Categoria> categorias;
	
	
	public Categoria(String idCategoria, int valorEntregaOtraSede, int valorConductorAdicional) {
		this.idCategoria = idCategoria;
		this.tarifaDia = Renticar.getTemporada();
		this.valorEntregaOtraSede = valorEntregaOtraSede;
		this.valorConductorAdicional = valorConductorAdicional;
		
		categorias.add(this);
	}
	
	public static ArrayList<Categoria> getCategorias()
	{
		return categorias;
	}	
	
	public String getIdCategoria()
	{return idCategoria;}
	
	
	
	
}
