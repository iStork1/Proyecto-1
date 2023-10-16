package consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import renticar.Renticar;

public class Aplicacion {
	private Renticar renticar;
	
	
	public Aplicacion() throws IOException 
	{
		this.renticar=new Renticar();
	}
	
//	+pedirCredencialesyMostrarMenu():String //rol
//	+ejecutarOpcionUsuario(String):void
	
	public void pedirCredencialesyMostrarMenu()
	{
		boolean centinela;
		System.out.println("Bienvenido a la aplicación de Renticar");
		System.out.println("\n--------------------------------------\nPara iniciar:");
		
		String username = input("Ingrese su username: ");
		String password = input("Ingrese su password: ");
		
		centinela = this.renticar.getcontrolUsuarios().verificarCredencialesUsuario(username, password);
		
		while (!centinela)
		{
			System.out.println("¡Credenciales incorrectas!");
			String usernamep = input("Ingrese su username: ");
			String passwordp = input("Ingrese su password: ");
			
			centinela=this.renticar.getcontrolUsuarios().verificarCredencialesUsuario(usernamep, passwordp);
		}
		System.out.println("Menu");
		System.out.println(this.renticar.getcontrolUsuarios().generarMenuSegunUsuario());
		
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException 
	{
		Aplicacion aplicacion= new Aplicacion();
		
		
	}
	
	
	
	
	//input funcion
	
	public static String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje);
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	

}
