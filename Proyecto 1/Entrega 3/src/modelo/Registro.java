package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Registro {
	private ArrayList<ArrayList<Object>> registro;
	public Registro() {
		ArrayList<ArrayList<Object>> registro=new ArrayList<>();
	}
	public void agregarRegistro(LocalDateTime fecha,String estado,Usuario cliente) {
		ArrayList<Object> listaRegistros=new ArrayList<>();
		listaRegistros.add(fecha);
		listaRegistros.add(estado);
		listaRegistros.add(cliente);
		registro.add(listaRegistros);
	}
}
