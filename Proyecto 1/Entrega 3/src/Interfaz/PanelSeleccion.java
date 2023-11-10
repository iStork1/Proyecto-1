package Interfaz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSeleccion extends JPanel implements ActionListener{

	private JLabel lblTitulo;
	private JButton btnVerVehiculos;
	private JButton btnRegistrarVehiculos;
	private JButton btnEliminarVehiculos;
	private JButton btnRegistrarEmpleado;
	private JButton btnCrearReserva;
	private JButton btnModificarReserva;
	
	public PanelSeleccion() {
		// TODO Auto-generated constructor stub
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.insets = new Insets(10, 10, 10, 10);
		
		lblTitulo = new JLabel("Elegir ventana");
		btnVerVehiculos = new JButton("Ver vehículos");
		btnVerVehiculos.addActionListener(this);
		btnVerVehiculos.setActionCommand("VerVerhiculo");
		btnRegistrarVehiculos = new JButton("Registrar vehículo");
		btnRegistrarVehiculos.addActionListener(this);
		btnRegistrarVehiculos.setActionCommand("RegistrarVerhiculo");
		btnEliminarVehiculos = new JButton("Eliminar vehículo");
		btnEliminarVehiculos.addActionListener(this);
		btnEliminarVehiculos.setActionCommand("EliminarVerhiculo");
		btnRegistrarEmpleado = new JButton("Registrar empleado");
		btnRegistrarEmpleado.addActionListener(this);
		btnRegistrarEmpleado.setActionCommand("RegistrarEmpleado");
		btnCrearReserva = new JButton("Crear reserva");
		btnCrearReserva.addActionListener(this);
		btnCrearReserva.setActionCommand("CrearReserva");
		btnModificarReserva = new JButton("Modificar reserva");
		btnModificarReserva.addActionListener(this);
		btnModificarReserva.setActionCommand("ModificarReserva");
		
		
		add(lblTitulo, gbc);
		gbc.gridy++;
		gbc.gridy++;
		add(btnVerVehiculos, gbc);
		gbc.gridy++;
		add(btnRegistrarVehiculos, gbc);
		gbc.gridy++;
		add(btnEliminarVehiculos, gbc);
		gbc.gridy++;
		add(btnRegistrarEmpleado, gbc);
		gbc.gridy++;
		add(btnCrearReserva, gbc);
		gbc.gridy++;
		add(btnModificarReserva, gbc);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("VerVerhiculo")){
			//Cambiar a la ventana a la de ver vehículos
		}else if(e.getActionCommand().equals("RegistrarVerhiculo")){
			//Cambiar ventana a registro de vehículos
		}else if(e.getActionCommand().equals("EliminarVerhiculo")){
			//Cambiar ventana a eliminar vehículos
		}else if(e.getActionCommand().equals("RegistrarEmpleado")){
			//Cambiar ventana a registro de empleados
		}else if(e.getActionCommand().equals("CrearReserva")){
			//Cambiar ventana a creador de reservas
		}else if(e.getActionCommand().equals("ModificarReserva")){
			//Cambiar ventana a modificador de reservas
		}
	}

}
