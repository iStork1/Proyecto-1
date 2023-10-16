package modelo;

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
	
	
	public Categoria(String idCategoria, int tarifaDia, int valorEntregaOtraSede, int valorConductorAdicional) {
		this.idCategoria = idCategoria;
		this.tarifaDia = tarifaDia;
		this.valorEntregaOtraSede = valorEntregaOtraSede;
		this.valorConductorAdicional = valorConductorAdicional;
	}
	
	
	
}
