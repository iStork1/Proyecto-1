package Interfaz;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.io.IOException;

import Interfaz.PanelLogin;
import modelo.ControlUsuarios;
import renticar.Renticar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {
	
	private Renticar renticar;
	private CardLayout cardLayout;
	private JPanel loginPanel;
	private JPanel seleccionPanel;
	private JPanel registroVehiculoPanel;
	private JPanel contPanel= new JPanel();


	public VentanaPrincipal() throws IOException {
		
		this.renticar=new Renticar();
		setSize( 750, 600 );
		setTitle( "Renticar" );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		
		this.cardLayout =  new CardLayout();
		this.loginPanel = new PanelLogin(this);
		this.contPanel.setLayout(cardLayout);
		this.seleccionPanel = new PanelSeleccion();
		this.registroVehiculoPanel = new PanelRegistroVehiculo();

		
		
		contPanel.add(loginPanel, "login");
		contPanel.add(seleccionPanel, "menu");
		contPanel.add(registroVehiculoPanel, "registroVehiculo");
        cardLayout.show(contPanel, "registroVehiculo");
        
        setLayout(new BorderLayout());

        setLocationRelativeTo(null);
        add(contPanel, BorderLayout.CENTER);
        //pack();
        
        
	}
	
	public boolean inicioSesion(String username,String passwordString){
		
		//cardLayout.show(contPanel, "menu");
		return this.renticar.loggin(username, passwordString);
	}
	
	public void mostrarMenu() 
	{
		cardLayout.show(contPanel, "menu");
	}
	

	public static void main(String[] args) throws IOException {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setResizable( false );
		ventana.setVisible(true);
	}


}
