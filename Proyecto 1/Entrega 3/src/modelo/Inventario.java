import java.util.*

public class Inventario {
	Map<Sede, List<Vehiculo>> Vehiculos = new HashMap<>();
	
	private Vehiculo getVehiculo(String placa) {
		for (Map.Entry<String, List<Vehiculo>> entrada : Vehiculos.entrySet()) {
		    String sede = entrada.getKey();
		    List<Vehiculo> listaDeVehiculos = entrada.getValue();
		    System.out.println("Sede: " + sede);
		    for (Vehiculo vehiculo : listaDeVehiculos) {
                if vehiculo.getPlaca().equals(placa);
                	return Vehiculo
            }
        }
	}
	public Registro getLogVehiculo (String placa) {
		
	}
	public void cambiarSedeVehiculo() {
		
	}
	public agregarVehiculo(Vehiculo) {
		if (Vehiculos.containsKey(nombreSede)) {
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
	public eliminarVehiculo(String placa) {
		
	}
	
		
}
