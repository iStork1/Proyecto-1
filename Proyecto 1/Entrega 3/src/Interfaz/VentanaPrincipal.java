package Interfaz;
import java.awt.CardLayout;
import Interfaz.PanelLogin;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {
private CardLayout cardLayout = new CardLayout();
JPanel login = new JPanel();
public VentanaPrincipal() {
	this.cardLayout = cardLayout;
	this.login = login;
}


}
