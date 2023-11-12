package modelo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Map.Entry;

public class Inventario {
	private Map<String, ArrayList<Vehiculo>> Vehiculos = new HashMap<>();
	private File archivo;
	public Map<String, ArrayList<Vehiculo>> getInventario(){
		return Vehiculos;	
	}
	public Vehiculo getVehiculo(String placa) {
		for (Entry<String, ArrayList<Vehiculo>> entrada : Vehiculos.entrySet()) {
		    String sede = entrada.getKey();
		    List<Vehiculo> listaDeVehiculos = entrada.getValue();
//		    System.out.println("Sede: " + sede); para probar que funcione
		    for (Vehiculo vehiculo : listaDeVehiculos) {
                if (vehiculo.getPlaca().equals(placa)){
                	return vehiculo;
                }
            }
        }
		System.out.println("No se encontró el vehiculo");
		return null;
	}
	public Registro getLogVehiculo (String placa) {
		Vehiculo vehiculo=getVehiculo(placa);
		Registro log=vehiculo.getRegistro();
		return log;
		
	}
	public void cambiarSedeVehiculo(Vehiculo vehiculo,Sede sedeDondeSeRecoje , Sede sedeDondeSeDeja) {
		ArrayList<Vehiculo> ListaSedeDondeSeRecoje=Vehiculos.get(sedeDondeSeRecoje.getNombre());
		ArrayList<Vehiculo> ListaSedeDondeSeDeja=Vehiculos.get(sedeDondeSeDeja.getNombre());
		ListaSedeDondeSeRecoje.remove(vehiculo);
		ListaSedeDondeSeDeja.add(vehiculo);
		
	}
	public void agregarVehiculo(Vehiculo vehiculo) {
		if (Vehiculos.containsKey(vehiculo.getnombreSede())) {
            // Si la sede ya existe, obtener la lista de vehículos asociada
            List<Vehiculo> listaDeVehiculos = Vehiculos.get(vehiculo.getnombreSede());
            listaDeVehiculos.add(vehiculo);
	 }
		else {
			ArrayList<Vehiculo> nuevaListaDeVehiculos = new ArrayList<>();
            nuevaListaDeVehiculos.add(vehiculo);
            Vehiculos.put(vehiculo.getsedeUbicado().getNombre(), nuevaListaDeVehiculos);
		}
	}
	public void eliminarVehiculo(String placa) {
		Vehiculo vehiculo=getVehiculo(placa);
		String SedeVehiculo=vehiculo.getnombreSede();
		ArrayList<Vehiculo> listaVehiculos = Vehiculos.get(SedeVehiculo);
		listaVehiculos.remove(vehiculo);
	}
	public Inventario(File archivo)
	{
		
		this.archivo = archivo;
	}
	public Vehiculo conseguirCarro(LocalDateTime fecha ,Sede sede,Categoria categoria ) {
		String nombreSede=sede.getNombre();
		List<Vehiculo> listaDeVehiculosEnSede = Vehiculos.get(nombreSede);
		for (Vehiculo vehiculo: listaDeVehiculosEnSede) {
			if (vehiculo.estaDisponible(fecha, categoria)) {
				return vehiculo;
			}
		}
		return null;
		
	}
//	public void iniciarInventario() {
//		if (archivo.exists()) {
//            System.out.println("El archivo ya existe.");
//        } else {
//            try {
//                // Intenta crear el archivo
//                boolean creado = archivo.createNewFile();
//                if (creado) {
//                    System.out.println("El archivo se ha creado exitosamente.");
//                } else {
//                    System.out.println("No se pudo crear el archivo.");
//                }
//            } catch (IOException e) {
//                System.out.println("Error al crear el archivo: " + e.getMessage());
//            }
//        }
//    }
	}
	
