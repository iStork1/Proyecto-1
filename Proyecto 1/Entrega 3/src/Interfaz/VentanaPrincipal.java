package Interfaz;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import Interfaz.PanelLogin;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {
	
	private CardLayout cardLayout;
	private JPanel loginPanel;
	private JPanel contPanel= new JPanel();


	public VentanaPrincipal() {
		setSize( 750, 600 );
		setTitle( "Renticar" );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		
		this.cardLayout =  new CardLayout();
		this.loginPanel = new PanelLogin(this);
		this.contPanel.setLayout(cardLayout);;

		
		
		contPanel.add(loginPanel, "login");
        cardLayout.show(contPanel, "login");
        
        setLayout(new BorderLayout());

        setLocationRelativeTo(null);
        add(contPanel, BorderLayout.CENTER);
        //pack();
        
        
	}
	
	public boolean inicioSesion(String username,String passwordString){
		
		//cardLayout.show(contPanel, "menu");
		return true;
	}
	

	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setResizable( false );
		ventana.setVisible(true);
	}


}
