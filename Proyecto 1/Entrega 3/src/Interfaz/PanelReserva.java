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

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class PanelReserva extends JPanel implements ActionListener{
	
	private VentanaPrincipal ventana;
	
	private JLabel lblTitulo;
	private JLabel lblSedeRec;
	private JLabel lblSedeDev;
	private JLabel lblTipo;
	private JLabel lblValor;
	private JLabel lblFechaRec;
	private JLabel lblFechaDev;
	
	private JComboBox<String> comboSedeRec;
	private JComboBox<String> comboSedeDev;
	private JComboBox<String> comboTipo;
	
	private JTextField txt1;
	
	
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
		
		//El manejo de fechas se hará sin atribución
		
		UtilDateModel model = new UtilDateModel();
		
		JDatePanelImpl datePanelRec = new JDatePanelImpl(model, null);
		JDatePickerImpl datePickerRec = new JDatePickerImpl(datePanelRec, null);
		
		JDatePanelImpl datePanelDev = new JDatePanelImpl(model, null);
		JDatePickerImpl datePickerDev = new JDatePickerImpl(datePanelDev, null);
		
		
		lblTitulo = new JLabel("Crear una nueva reserva:");
		lblSedeRec = new JLabel("Sede recolección:");
		lblSedeDev = new JLabel("Sede devolución:");
		lblTipo = new JLabel("Tipo de vehículo:");
		lblValor = new JLabel("Valor del servicio:");
		lblFechaRec = new JLabel("Fecha de recolección:");
		lblFechaDev = new JLabel("Fecha de devolución:");
		
		
		comboSedeRec = new JComboBox<>(this.ventana.darSedes());
		
		comboSedeDev = new JComboBox<>(this.ventana.darSedes());
		
		String[] tipos = {"Manual", "Semiautomática", "automática", "Manumática"};
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(tipos);
		comboTipo = new JComboBox<String>(modelo);
		
		txt1 = new JTextField();
		
		
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
		add(lblSedeRec, gbc);
		gbc.gridy++;
		add(lblSedeDev, gbc);
		gbc.gridy++;
		add(lblTipo, gbc);
		gbc.gridy++;
		add(lblValor, gbc);
		gbc.gridy++;
		add(lblFechaRec, gbc);
		gbc.gridy++;
		add(lblFechaDev, gbc);

		
		gbc.gridx+=4;
		gbc.gridy = 0;
		
		gbc.gridy++;
		add(comboSedeRec, gbc);
		gbc.gridy++;
		add(comboSedeDev, gbc);
		gbc.gridy++;
		add(comboTipo, gbc);
		gbc.gridy++;
		add(txt1, gbc);
		gbc.gridy++;
		add(datePickerRec, gbc);
		gbc.gridy++;
		add(datePickerDev, gbc);
		
		gbc.gridx = 0;
		gbc.gridy++;
		
		add(new JLabel(), gbc);
		gbc.gridx++;
		add(btnCrear, gbc);
		add(new JLabel(), gbc);
		gbc.gridx++;
		
		
		txt1.setEditable(false);
		
		txt1.setSize(30,150);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Crear")) {
			//TODO
		}
		
	}

}
