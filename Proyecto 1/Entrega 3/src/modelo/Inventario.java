package modelo;

import java.util.*;

public class Inventario {
	Map<String, List<Vehiculo>> Vehiculos = new HashMap<>();
	
	public Inventario(Map<String, List<Vehiculo>> Vehiculos) {
		this.Vehiculos=Vehiculos;
	}
	public Map<String, List<Vehiculo>> getInventario(){
		return Vehiculos;	
	}
	private Vehiculo getVehiculo(String placa) {
		for (Map.Entry<String, List<Vehiculo>> entrada : Vehiculos.entrySet()) {
		    String sede = entrada.getKey();
		    List<Vehiculo> listaDeVehiculos = entrada.getValue();
		    System.out.println("Sede: " + sede);
		    for (Vehiculo vehiculo : listaDeVehiculos) {
                if (vehiculo.getPlaca().equals(placa)){
                	return vehiculo;
                }
            }
        }
		return null;
	}
	public Registro getLogVehiculo (String placa) {
		return null;
		
	}
	public void cambiarSedeVehiculo() {
		
	}
	public void agregarVehiculo(Vehiculo vehiculo) {
		if (Vehiculos.containsKey(vehiculo.getnombreSede())) {
            // Si la sede ya existe, obtener la lista de vehículos asociada
            List<Vehiculo> listaDeVehiculos = Vehiculos.get(vehiculo.getnombreSede());
            listaDeVehiculos.add(vehiculo);
	 }
		else {
			List<Vehiculo> nuevaListaDeVehiculos = new ArrayList<>();
            nuevaListaDeVehiculos.add(vehiculo);
            Vehiculos.put(vehiculo.getsedeUbicado().getnombre(), nuevaListaDeVehiculos);
		}
	}
	public void eliminarVehiculo(String placa) {
		
	}
	
		
}
