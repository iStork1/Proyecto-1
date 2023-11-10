package Interfaz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistroVehiculo extends JPanel implements ActionListener {

	
	private JLabel lblTitulo;
	private JLabel lblId;
	private JLabel lblMarca;
	private JLabel lblPlaca;
	private JLabel lblTipo;
	private JLabel lblSede;
	private JLabel lblModelo;
	private JLabel lblColor;
	private JLabel lblCapacidad;
	
	private JTextField txtId;
	private JTextField txtMarca;
	private JTextField txtPlaca;
	private JTextField txtTipo;
	private JTextField txtSede;
	private JTextField txtModelo;
	private JTextField txtColor;
	private JTextField txtCapacidad;
	
	private JButton btnRegistrar;
	
	
	public PanelRegistroVehiculo() {
		// TODO Auto-generated constructor stub
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.insets = new Insets(10, 10, 10, 10);
		
		
		lblTitulo = new JLabel("Ingrese información para registrar vehículo");
		lblId = new JLabel("ID:");
		lblMarca = new JLabel("Marca:");
		lblPlaca = new JLabel("Placa:");
		lblTipo = new JLabel("Tipo de transmisión:");
		lblSede = new JLabel("Sede:");
		lblModelo = new JLabel("Modelo:");
		lblColor = new JLabel("Color:");
		lblCapacidad = new JLabel("Capacidad:");
		
		btnRegistrar = new JButton("Rgistrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setActionCommand("Registrar");
		
		txtCapacidad = new JTextField();
		txtColor = new JTextField();
		txtId = new JTextField();
		txtMarca = new JTextField();
		txtTipo = new JTextField();
		txtSede = new JTextField();
		txtPlaca = new JTextField();
		txtModelo = new JTextField();
		
		add(lblTitulo, gbc);
		gbc.gridy++;
		add(lblId, gbc);
		gbc.gridy++;
		add(lblMarca, gbc);
		gbc.gridy++;
		add(lblPlaca, gbc);
		gbc.gridy++;
		add(lblTipo, gbc);
		gbc.gridy++;
		add(lblSede, gbc);
		gbc.gridy++;
		add(lblModelo, gbc);
		gbc.gridy++;
		add(lblColor, gbc);
		gbc.gridy++;
		add(lblCapacidad, gbc);
		
		gbc.gridx++;
		gbc.gridy = 0;
		
		gbc.gridy++;
		add(txtId, gbc);
		gbc.gridy++;
		add(txtMarca, gbc);
		gbc.gridy++;
		add(txtPlaca, gbc);
		gbc.gridy++;
		add(txtTipo, gbc);
		gbc.gridy++;
		add(txtSede, gbc);
		gbc.gridy++;
		add(txtModelo, gbc);
		gbc.gridy++;
		add(txtColor, gbc);
		gbc.gridy++;
		add(txtCapacidad, gbc);
		
		gbc.gridx = 0;
		gbc.gridy++;
		
		add(btnRegistrar, gbc);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Registrar")) {
			//Cambiar los páneles por el pánel de selección de ventana y guardar los datos de los txt's
		}
	}

}
