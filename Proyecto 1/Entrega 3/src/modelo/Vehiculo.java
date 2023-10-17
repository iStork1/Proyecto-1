package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vehiculo {
	private Categoria categoria;
	private Registro registro;
	private String placa;
	private String marca;
	private String modelo;
	private String color;
	private String transmision;
    private String estado;//disponible,alquilado,mantenimiento o --
    private Sede sedeUbicado;
    private LocalDateTime fechaDisponible;
    private boolean disponible;
    private Usuario clienteTiene;
    
    private Alquiler alquiler;
    
    
    public void setAlquiler(Alquiler alquiler)
    	{this.alquiler=alquiler;}
    public Alquiler getAlquiler()
    {return alquiler;}
    

    // Constructor
    public Vehiculo(Categoria categoria,String modelo, String color, String transmision, String estado, Sede sedeUbicado, LocalDateTime fechaDisponible, boolean disponible,String placa) {
        this.categoria=categoria;
    	this.modelo = modelo;
        this.color = color;
        this.transmision = transmision;
        this.estado = estado;
        this.sedeUbicado = sedeUbicado;
        this.fechaDisponible = fechaDisponible;
        this.disponible = disponible;

        this.registro= new Registro();
        
        this.placa = placa;
    }
    public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

    public boolean estaDisponible(LocalDateTime fecha,Categoria categoria) {
		if (categoria.equals(this.categoria) && fecha.isAfter(fechaDisponible))  {
			return true;
		}
		else {
			return false;
		}
    }
    
    public void setEstado(String estado,Usuario clienteTiene) {
    	this.estado=estado;
    	LocalDateTime fechaDisponible = LocalDateTime.now();
    	this.registro.agregarRegistro(fechaDisponible, estado, clienteTiene);
    }
    public Registro getRegistro() {
		return registro;
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
