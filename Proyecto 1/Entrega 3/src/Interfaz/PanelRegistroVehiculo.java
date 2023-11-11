package Interfaz;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Categoria;
import modelo.Sede;

public class PanelRegistroVehiculo extends JPanel implements ActionListener {
	private VentanaPrincipal ventana;
	
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
	
	
	public PanelRegistroVehiculo(VentanaPrincipal ventana) {
		// TODO Auto-generated constructor stub
		this.ventana = ventana;
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.insets = new Insets(10, 10, 10, 10);
		
		
		lblTitulo = new JLabel("Ingrese informaci�n para registrar veh�culo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15)); //hay que buscar una especie de directorio de funtes
		lblId = new JLabel("ID:");
		lblMarca = new JLabel("Marca:");
		lblPlaca = new JLabel("Placa:");
		lblTipo = new JLabel("Tipo de transmisi�n:");
		lblSede = new JLabel("Sede:");
		lblModelo = new JLabel("Modelo:");
		lblColor = new JLabel("Color:");
		lblCapacidad = new JLabel("Capacidad:");
		
		btnRegistrar = new JButton("Rgistrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setActionCommand("Registrar");
		
		txtCapacidad = new JTextField(20);
		txtColor = new JTextField(20);
		txtId = new JTextField(20);
		txtMarca = new JTextField(20);
		txtTipo = new JTextField(20);
		txtSede = new JTextField(20);
		txtPlaca = new JTextField(20);
		txtModelo = new JTextField(20);
		
		//hice esto para poner el titulo en el centro
		add(new JLabel(), gbc);
		gbc.gridx++;
		add(lblTitulo, gbc);
		gbc.gridx++;
		add(new JLabel(), gbc);
		
		gbc.gridx=0;
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
		
		gbc.gridx+=4;
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
		
		//lo mismo que con el t�tulo
		add(new JLabel(), gbc);
		gbc.gridx++;
		add(btnRegistrar, gbc);
		add(new JLabel(), gbc);
		gbc.gridx++;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Registrar")) {
//			TODO agregar las cosas para registrar
//			this.ventana.registrarVehiculo(); String modelo,Categoria categoria,String color,String placa,String transmision,Sede sedeUbicado
			this.ventana.mostrarMenu();
		}
	}

}
