package Interfaz;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.io.IOException;

import Interfaz.PanelLogin;
import modelo.Categoria;
import modelo.ControlUsuarios;
import modelo.Sede;
import modelo.Vehiculo;
import renticar.Renticar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {
	
	private Renticar renticar;
	private CardLayout cardLayout;
	private JPanel loginPanel;
	private JPanel seleccionPanel;
	private JPanel registroVehiculoPanel;
	private JPanel registroVehiculoUsuario;
	private JPanel contPanel= new JPanel(); //este es un contenedor
	private JPanel principalPanel;

	public VentanaPrincipal() throws IOException {
		
		this.renticar=new Renticar();
		setSize( 750, 600 );
		setTitle( "Renticar" );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		
		this.cardLayout =  new CardLayout();
		this.contPanel.setLayout(cardLayout);
		
		//paneles
		this.loginPanel = new PanelLogin(this);
		this.seleccionPanel = new PanelSeleccion(this);
		this.registroVehiculoPanel = new PanelRegistroVehiculo(this);
		registroVehiculoUsuario= new PanelRegistroUsuario();
		this.principalPanel=new PanelPrincipal(this);
		
		
		contPanel.add(loginPanel, "login");
		contPanel.add(registroVehiculoUsuario, "registroUsuario");
		contPanel.add(seleccionPanel, "menu");
		contPanel.add(registroVehiculoPanel, "registroVehiculo");
		contPanel.add(principalPanel, "principal");

        cardLayout.show(contPanel, "login");
        
        setLayout(new BorderLayout());

        setLocationRelativeTo(null);
        add(contPanel, BorderLayout.CENTER);
        //pack();
        
        
	}
	
	//metodos para conectar con la l�gica
	public boolean inicioSesion(String username,String passwordString){
		
		//cardLayout.show(contPanel, "menu");
		return this.renticar.loggin(username, passwordString);
	}
	
	public void registrarVehiculo(String modelo,Categoria categoria,String color,String placa,String transmision,Sede sedeUbicado) 
	{
		this.renticar.agregarVehiculo(modelo,categoria,color,placa,transmision,sedeUbicado);
	}
	
	public Vehiculo darVehiculo(String placa)
	{
		return this.renticar.darVehiculo(placa);
	}
	
	public void eliminarVehiculo(String placa)
	{
		this.renticar.eliminarVehiculo(placa);
	}
	
	public String[] darSedes()
	{
		return this.renticar.darSedes();
	}
	public Sede darSede(String nomSede)
	{
		return this.renticar.darSede(nomSede);
	}
	
	//metodos para cambiar layouts
	public void mostrarMenu() 
	{
		cardLayout.show(contPanel, "menu");
	}
	public void mostraRegistro() 
	{
		cardLayout.show(contPanel, "registroUsuario");
	}
	public void mostrarPanelVehiculo()
	{
		cardLayout.show(contPanel, "registroVehiculo");
	}
	
	public void mostrarPanelPrincipal()
	{
		cardLayout.show(contPanel, "principal");
	}
	

	public static void main(String[] args) throws IOException {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setResizable( false );
		ventana.setVisible(true);
	}


}
