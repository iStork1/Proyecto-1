package Interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PanelLogin extends JPanel{
	private JTextField usernameField;
    private JPasswordField passwordField;

    public void LoginPanel() {
        // Configura el diseño del panel
        setLayout(new GridLayout(3, 2));

        // Crea etiquetas y campos de texto
        JLabel usernameLabel = new JLabel("Usuario:");
        JLabel passwordLabel = new JLabel("Contraseña");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        // Crea un botón de inicio de sesión
        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes verificar el nombre de usuario y contraseña
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                String passwordString = new String(password);

                // Comprueba si las credenciales son correctas (simulado)
                if (username.equals("usuario") && passwordString.equals("contraseña")) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }
            }
        });

        // Agrega los componentes al panel
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                JFrame frame = new JFrame("Inicio de Sesión");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setSize(300, 150);
//                frame.add(new LoginPanel());
//                frame.setVisible(true);
//            }
//        });
//    }
}