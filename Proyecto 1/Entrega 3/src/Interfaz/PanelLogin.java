package Interfaz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PanelLogin extends JPanel implements ActionListener{
	
	private JTextField usernameField;
    private JPasswordField passwordField;
    private VentanaPrincipal ventana;
    
    public PanelLogin(VentanaPrincipal ventana) {
    	this.ventana = ventana;
    	
    	
    	setPreferredSize(new Dimension(400, 300));
        // Configura el diseño del panel
        setLayout(new GridBagLayout());

        // Crea etiquetas y campos de texto
        JLabel usernameLabel = new JLabel("Usuario:");
        JLabel passwordLabel = new JLabel("Contrase�a");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        // Crea un botón de inicio de sesión
        JButton loginButton = new JButton("Iniciar Sesi�n");
        loginButton.addActionListener(this);
        
        JButton registroButton = new JButton("�Nuevo cliente?");
        registroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes verificar el nombre de usuario y contraseña
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                String passwordString = new String(password);

                // Comprueba si las credenciales son correctas (simulado)
                if (username.equals("usuario") && passwordString.equals("contraseña")) {
                    JOptionPane.showMessageDialog(null, "Aun no implementado");
                } else {
                    JOptionPane.showMessageDialog(null, "Aun no implementado");
                }
            }
        });

        // Agrega los componentes al panel usando GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.insets = new Insets(10, 10, 10, 10); // M�rgenes internos
        
        
        add(usernameLabel, gbc);

        gbc.gridy++;
        add(usernameField, gbc);

        gbc.gridy++;
        add(passwordLabel, gbc);

        gbc.gridy++;
        add(passwordField, gbc);
        gbc.gridwidth = 2;
        gbc.gridy++;
        add(loginButton, gbc);
        
        gbc.gridx+=2;
        add(registroButton, gbc);
    }
    
    public void actionPerformed( ActionEvent evento )
    {
                // Aquí puedes verificar el nombre de usuario y contraseña
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                String passwordString = new String(password);

                // Comprueba si las credenciales son correctas (simulado)
                if (this.ventana.inicioSesion(username,passwordString)) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }
            }
     
    
}