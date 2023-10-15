package modelo;

import java.awt.image.BufferedImage;
import java.time.LocalDate;

public class Licencia {

	private String numeroLic;
	private String paisExpedicion;
	private LocalDate fechaVencimientoLic;
	private BufferedImage imagenLic;
	
	
	
	public Licencia(String num, String pais, LocalDate fecha, BufferedImage imagen) {
		numeroLic = num;
		paisExpedicion = pais;
		fechaVencimientoLic = fecha;
		imagenLic = imagen;
	}

}
