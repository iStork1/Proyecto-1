package modelo;

import java.time.LocalDate;

public class Vehiculo {
	private String placa;
	private String marca;
	private String modelo;
	private String color;
	private String transmision;
    private String estado;
    private Sede sedeUbicado;
    private LocalDate fechaDisponible;
    private boolean limpieza;
    private boolean mantenimiento;
    private Usuario clienteTiene;

    // Constructor
    public Vehiculo(String modelo, String color, String transmision, String estado, Sede sedeUbicado, LocalDate fechaDisponible, boolean limpieza, boolean mantenimiento, Usuario clienteTiene) {
        this.modelo = modelo;
        this.color = color;
        this.transmision = transmision;
        this.estado = estado;
        this.sedeUbicado = sedeUbicado;
        this.fechaDisponible = fechaDisponible;
        this.limpieza = limpieza;
        this.mantenimiento = mantenimiento;
        this.clienteTiene = clienteTiene;
    }
	
	public String getnombreSede() {
		return sedeUbicado.getnombre();
	}

	public Sede getsedeUbicado() {
		return sedeUbicado;
	}

	public Object getPlaca() {
		return placa;
	}

}
