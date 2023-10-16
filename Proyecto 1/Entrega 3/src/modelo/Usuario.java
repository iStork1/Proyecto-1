package modelo;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.time.LocalDate;

public class Usuario implements Serializable{

	private String username;
	private String contrasenia;
	private String rol;
	
	private String nombres;
	private String telefono;
	private String email;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private BufferedImage imagenDocumento;
	
	
	
	public Usuario(String usuario, String contrasenia, String rol) {
		this.username = usuario;
		this.contrasenia = contrasenia;
		this.rol = rol;
	}
	
	
	public boolean verificarCredenciales(String pUsuario, String pContrasenia) {
		if (pUsuario.equals(username)) {
			if (pContrasenia.equals(contrasenia)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
				
	}
	
	
	public String getRol() {
		return rol;
	}
	
	
	public boolean puedeAlquilar() {
		if (nombres != null && telefono != null && email != null && fechaNacimiento != null && nacionalidad != null && imagenDocumento != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void aniadirDatosCliente(String nom, String tel, String ema, LocalDate fecha, String nacio, BufferedImage imagen) {
		nombres = nom;
		telefono = tel;
		email = ema;
		fechaNacimiento = fecha;
		nacionalidad = nacio;
		imagenDocumento = imagen;
	}
	
	
	
}
