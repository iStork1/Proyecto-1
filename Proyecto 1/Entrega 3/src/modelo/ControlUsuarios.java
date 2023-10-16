package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ControlUsuarios {

	
	private HashMap<String, Usuario> usuarios;
	private File archivo;
	private Usuario usuarioActual;
	
	
 	public ControlUsuarios(File archivo) {
        this.archivo = archivo;
        this.usuarios = cargarUsuariosDesdeArchivo(); // Intenta cargar el HashMap desde el archivo
        if (this.usuarios == null) {
            this.usuarios = new HashMap<>(); // Si no se pudo cargar, crea un nuevo HashMap
        }
    }

    // Método para cargar el HashMap desde el archivo
    @SuppressWarnings("unchecked")
	private HashMap<String, Usuario> cargarUsuariosDesdeArchivo() {
        try {
            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            HashMap<String, Usuario> usuarios = (HashMap<String, Usuario>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            return usuarios;
        } catch (IOException | ClassNotFoundException e) {
            // Si ocurre una excepción al cargar, simplemente regresamos null
            return null;
        }
    }
	

	
	


	public boolean verificarCredencialesUsuario(String username, String password) 
	{
		
		boolean respuesta;
		if (usuarios.containsKey(username))
		{
			Usuario usuario = usuarios.get(username);
			
			if (usuario.verificarCredenciales(username, password))
			{
				respuesta = true;
				this.usuarioActual=usuario;
			}
			else {respuesta = false;}
		}
		else  { respuesta = false;}
		
		return respuesta;
		
	}
	


	
	public void guardarUsuariosRegistrados() throws IOException 
	{
		FileOutputStream fileOut = new FileOutputStream(this.archivo);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

        // Escribir el HashMap en el archivo
        objectOut.writeObject(usuarios);

        // Cerrar el flujo
        objectOut.close();
        fileOut.close();
		
	}
	
	public String generarMenuSegunUsuario() {
		
		String rol = this.usuarioActual.getRol();
		
		String menubase = "1. Alquilar un carro\n2. Reservar un carro.";
		String menu =new String();
		if (rol.equals("cliente"))
		{
			menu = menubase;
		}
		
		return menu;
		
	}
	
	public void crearUsuario(String username, String password, String rol) throws IOException {
		
		Usuario nuevoUsuario = new Usuario(username,password,rol);
		
		usuarios.put(username,nuevoUsuario);
		
		this.guardarUsuariosRegistrados();
		
	}
	
	public void crearAdministrador(Usuario usuario,String username) throws IOException {
		
		if (!this.usuarios.containsKey(username))
		{usuarios.put(username,usuario);}
		
		this.guardarUsuariosRegistrados();
		
	}
}
