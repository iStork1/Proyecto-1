package modelo;

import java.io.File;
import java.util.*;

public class Inventario {
	Map<String, List<Vehiculo>> Vehiculos = new HashMap<>();
	File archivo;
	
	
	private Vehiculo getVehiculo(String placa) {
		for (Map.Entry<String, List<Vehiculo>> entrada : Vehiculos.entrySet()) {
		    String sede = entrada.getKey();
		    List<Vehiculo> listaDeVehiculos = entrada.getValue();
		    System.out.println("Sede: " + sede);
		    for (Vehiculo vehiculo : listaDeVehiculos) {
                if (vehiculo.getPlaca().equals(placa)){
                	Vehiculo vehiculoEncontrado=vehiculo;
                	
                }
            }
        }
		
	}
	public Registro getLogVehiculo (String placa) {
		
	}
	public void cambiarSedeVehiculo() {
		
	}
	public void agregarVehiculo(Vehiculo vehiculo) {
		if (Vehiculos.containsKey(vehiculo.getnombreSede()) {
            // Si la sede ya existe, obtener la lista de vehículos asociada
            List<Vehiculo> listaDeVehiculos = Vehiculos.get(nombreSede);
            listaDeVehiculos.add(vehiculo);
	 }
		else {
			List<Vehiculo> nuevaListaDeVehiculos = new ArrayList<>();
            nuevaListaDeVehiculos.add(vehiculo);
            Vehiculos.put(Vehiculo.getsedeUbicado().getnombreSede(), nuevaListaDeVehiculos);
		}
	}
	public void eliminarVehiculo(String placa) {
		
	}
	
	
	public Inventario(File archivo)
	{
		this.archivo = archivo;
	}
	
		
}