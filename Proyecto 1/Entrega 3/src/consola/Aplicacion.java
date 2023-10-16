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
	
	public void pedirCredenciales()
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
		
		
		}
		private int mostrarmenu()
		{
			System.out.println("Menu");
			Object[] resultado = this.renticar.getcontrolUsuarios().generarMenuSegunUsuario(); 
			System.out.println((String) resultado[0]);
			System.out.println("14. Salir de la aplicación.");
		
			return (int) resultado[1];
		}
	
	private void ejecutarOpcionUsuario() {
		
		boolean funcionando=true;
		while (funcionando == true)
		{	int nOpciones = this.mostrarmenu();
			int opcion = Integer.parseInt(input("Ingrese la opción que desea ejecutar: "));
			
			if (opcion>0 & opcion<=nOpciones)
			{//TODO ejecutar opciones
			}
			if (opcion ==14) {funcionando = false;}
			
			else {System.out.println("Ingrese una opción válida.");}
		}	
		
		
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException 
	{
		Aplicacion aplicacion= new Aplicacion();
		
		aplicacion.pedirCredenciales();
		
		aplicacion.ejecutarOpcionUsuario();
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
