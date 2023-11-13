package Interfaz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelReserva extends JPanel implements ActionListener{
	
	private VentanaPrincipal ventana;
	
	private JLabel lblTitulo;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	
	private JComboBox<String> combo1;
	private JComboBox<String> combo2;
	private JComboBox<String> combo3;
	
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	
	private JButton btnCrear;

	public PanelReserva(VentanaPrincipal ventana) {
		// TODO Auto-generated constructor stub
		
		this.ventana = ventana;
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.insets = new Insets(10, 10, 10, 10);
		
		lblTitulo = new JLabel("Crear una nueva reserva:");
		lbl1 = new JLabel("Sede recolección:");
		lbl2 = new JLabel("Sede devolución:");
		lbl3 = new JLabel("Tipo de vehículo:");
		lbl4 = new JLabel("Valor del servicio:");
		lbl5 = new JLabel("Fecha de recolección (dd-mm-aaaa):");
		lbl6 = new JLabel("Fecha de devolución (dd-mm-aaaa):");
		
		String[] opciones1 = {"Sede 1", "Sede 2", "Sede 3"};
        DefaultComboBoxModel<String> modelo1 = new DefaultComboBoxModel<>(opciones1);
		combo1 = new JComboBox<String>(modelo1);
		
		String[] opciones2 = {"Sede 1", "Sede 2", "Sede 3"};
        DefaultComboBoxModel<String> modelo2 = new DefaultComboBoxModel<>(opciones2);
		combo2 = new JComboBox<String>(modelo2);
		
		String[] tipos = {"Tipo 1", "Tipo 2", "Tipo 3"};
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(tipos);
		combo3 = new JComboBox<String>(modelo);
		
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt3 = new JTextField();
		
		btnCrear = new JButton("Crear reserva");
		btnCrear.addActionListener(this);
		btnCrear.setActionCommand("Crear");
		
		
		add(new JLabel(), gbc);
		gbc.gridx++;
		add(lblTitulo, gbc);
		gbc.gridx++;
		add(new JLabel(), gbc);
		
		gbc.gridx=0;
		gbc.gridy++;
		add(lbl1, gbc);
		gbc.gridy++;
		add(lbl2, gbc);
		gbc.gridy++;
		add(lbl3, gbc);
		gbc.gridy++;
		add(lbl4, gbc);
		gbc.gridy++;
		add(lbl5, gbc);
		gbc.gridy++;
		add(lbl6, gbc);

		
		gbc.gridx+=4;
		gbc.gridy = 0;
		
		gbc.gridy++;
		add(combo1, gbc);
		gbc.gridy++;
		add(combo2, gbc);
		gbc.gridy++;
		add(combo3, gbc);
		gbc.gridy++;
		add(txt1, gbc);
		gbc.gridy++;
		add(txt2, gbc);
		gbc.gridy++;
		add(txt3, gbc);
		
		gbc.gridx = 0;
		gbc.gridy++;
		
		add(new JLabel(), gbc);
		gbc.gridx++;
		add(btnCrear, gbc);
		add(new JLabel(), gbc);
		gbc.gridx++;
		
		
		txt1.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Crear")) {
			//TODO
		}
		
	}

}
