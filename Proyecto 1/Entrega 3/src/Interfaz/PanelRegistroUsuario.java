package Interfaz;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistroUsuario extends JPanel implements ActionListener{
	private VentanaPrincipal ventana;
	private JLabel lblTitulo;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblEmail;
	private JLabel lblId;
	private JLabel lblPais;
	private JLabel lblTipo;
	private JLabel lblUsuario;
	private JLabel lblContrasenia;
	private JLabel lblFoto;
	
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTextField txtId;
	private JTextField txtUsuario;
	private JTextField txtContrasenia;

	private JComboBox<String> comboPais;
	private JComboBox<String> comboTipo;
	
	private JButton btnFoto;
	private JButton btnRegistrar;
	
	private String rol = "";
	
	
	public PanelRegistroUsuario(VentanaPrincipal ventana) {
		// TODO Auto-generated constructor stub
		this.ventana = ventana;
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.insets = new Insets(10, 10, 10, 10);
		
		
		lblTitulo = new JLabel("Ingrese informaci�n para registrar usuario");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		lblNombre = new JLabel("Nombre:");
		lblApellidos = new JLabel("Apellidos:");
		lblTelefono = new JLabel("Telefono:");
		lblEmail = new JLabel("Email:");
		lblId = new JLabel("ID:");
		
		lblTipo = new JLabel("Tipo de usuario:");
		lblUsuario = new JLabel("Nombre de usuario:");
		lblContrasenia = new JLabel("Contraseña:");
		lblFoto = new JLabel("Ingrese foto de documento:");
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setActionCommand("Registrar");
		
		btnFoto = new JButton("Agregar foto");
		btnFoto.addActionListener(this);
		btnFoto.setActionCommand("Foto");
		
		txtNombre = new JTextField(20);
		txtApellidos = new JTextField(20);
		txtTelefono = new JTextField(20);
		txtEmail = new JTextField(40);
		txtId = new JTextField(20);
		txtUsuario = new JTextField(20);
		txtContrasenia = new JTextField(20);
		
		String[] opciones = {"Cliente", "Empleado", "Administrador Local"};
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(opciones);
		comboTipo = new JComboBox<String>(modelo);
		
		
		add(new JLabel(), gbc);
		gbc.gridx++;
		add(lblTitulo, gbc);
		gbc.gridx++;
		add(new JLabel(), gbc);
		
		gbc.gridx=0;
		gbc.gridy++;
		add(lblNombre, gbc);
		gbc.gridy++;
		add(lblApellidos, gbc);
		gbc.gridy++;
		add(lblTelefono, gbc);
		gbc.gridy++;
		add(lblEmail, gbc);
		gbc.gridy++;
		add(lblId, gbc);
		gbc.gridy++;
		add(lblTipo, gbc);
		gbc.gridy++;
		add(lblUsuario, gbc);
		gbc.gridy++;
		add(lblContrasenia, gbc);
		gbc.gridy++;
		add(lblFoto, gbc);

		
		gbc.gridx+=4;
		gbc.gridy = 0;
		
		gbc.gridy++;
		add(txtNombre, gbc);
		gbc.gridy++;
		add(txtApellidos, gbc);
		gbc.gridy++;
		add(txtTelefono, gbc);
		gbc.gridy++;
		add(txtEmail, gbc);
		gbc.gridy++;
		add(txtId, gbc);
		gbc.gridy++;
		add(comboTipo, gbc);
		gbc.gridy++;
		add(txtUsuario, gbc);
		gbc.gridy++;
		add(txtContrasenia, gbc);
		gbc.gridy++;
		add(btnFoto, gbc);
		
		gbc.gridx = 0;
		gbc.gridy++;
		
		add(new JLabel(), gbc);
		gbc.gridx++;
		add(btnRegistrar, gbc);
		add(new JLabel(), gbc);
		gbc.gridx++;
		
		
	}
	private void asignarRolDesdeComboBox() {
        // Obtener la opci�n seleccionada del JComboBox
        String opcionSeleccionada = (String) comboTipo.getSelectedItem();

        // Asignar el valor de rol seg�n la opci�n seleccionada
        if (opcionSeleccionada.equals("Cliente")) {
            rol = "cliente";
        } else if (opcionSeleccionada.equals("Administrador Local")) {
            rol = "administradorLocal";
        } else if (opcionSeleccionada.equals("Empleado")) {
            rol = "empleado";
        }
        
	}
	
	public void definirComboBox(String rol)
	{
		//--------------opciones del Combo box-------
				String[] opciones = null;
				if (rol.equals("cliente"))
					{opciones = new String[]{"Cliente"};}
				else if (rol.equals("administradorLocal"))
				{
					opciones = new String[]{"Empleado Sede"};
				}
				else 
				{
					opciones = new String[]{"Administrador Local","Empleado Sede"};
				}
				
				// Obtener el modelo actual del JComboBox
		        DefaultComboBoxModel<String> modeloActual = (DefaultComboBoxModel<String>) comboTipo.getModel();

		        // Limpiar el modelo actual
		        modeloActual.removeAllElements();

		        // Agregar las nuevas opciones al modelo
		        for (String nuevaOpcion : opciones) {
		            modeloActual.addElement(nuevaOpcion);
		        }
		        
		        comboTipo.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Llamamos a un m�todo que asigna el valor de rol seg�n la opci�n seleccionada
		                asignarRolDesdeComboBox();
		            }
		        });
				
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Registrar")) {
			String rol = this.rol; //deben ser "cliente","administradorLocal" o "empleado"
			System.out.print(rol);
			String username = txtUsuario.getText();
			String password = txtContrasenia.getText();
			String nombre = txtNombre.getText();
			String telefono = txtTelefono.getText();
			String email = txtEmail.getText();
			String apellido = txtApellidos.getText();
			String pais = null; //TODO
			LocalDateTime fechaNacimiento = null; //TODO
			String idLicencia=null; //TODO
			LocalDateTime fechaVencimientoLicencia=null;//TODO
			BufferedImage imagenLicencia=null; //TODO
			BufferedImage imagenDocumento = null; //TODO
			String idDocumento = null; //TODO
			try {
				this.ventana.registrarUsuario(username,password, rol,nombre, telefono,email,apellido,pais,fechaNacimiento, idLicencia,fechaVencimientoLicencia,imagenLicencia,imagenDocumento,idDocumento);
				JOptionPane.showMessageDialog(null, "Usuario creado");
				this.ventana.mostrarMenu();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Hubo un error");
				
				
			}
		} else if (e.getActionCommand().equals("Foto")) {
			String foto = JOptionPane.showInputDialog("Ingrese link de la foto");
			// Para que el usuario ingrese la dirección en la que se encuentra la imagen que debe estar en los archivos del programa
		}
		
		
		
	}

}
