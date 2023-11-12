package Interfaz;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistroUsuario extends JPanel implements ActionListener{

	private JLabel lblTitulo;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblId;
	private JLabel lblTipo;
	private JLabel lblUsuario;
	private JLabel lblContrasenia;
	private JLabel lblFoto;
	
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtId;
	private JTextField txtUsuario;
	private JTextField txtContrasenia;

	private JComboBox<String> comboTipo;
	
	private JButton btnFoto;
	private JButton btnRegistrar;
	
	
	public PanelRegistroUsuario() {
		// TODO Auto-generated constructor stub
		
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
		lblId = new JLabel("ID:");
		lblTipo = new JLabel("Tipo de usuario:");
		lblUsuario = new JLabel("Nombre de usuario:");
		lblContrasenia = new JLabel("Contraseña:");
		lblFoto = new JLabel("Ingrese foto de documento:");
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setActionCommand("Registrar");
		
		
		comboTipo = new JComboBox<String>();
		comboTipo.addItem("Cliente");
		comboTipo.addItem("Empleado");
		comboTipo.addItem("Administrador");
		
		txtNombre = new JTextField(20);
		txtApellidos = new JTextField(20);
		txtId = new JTextField(20);
		txtUsuario = new JTextField(20);
		txtContrasenia = new JTextField(20);
		
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
