import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Vtv {

	/*1) La Verificación Técnica Argentina, o VTV, 
	 * desea realizar un programa para poder consultar el estado de un auto 
	 * y generar un informe luego de la revisión de un vehículo. En este informe, 
	 * un operador deberá tener en cuenta el estado de estas tres partes del vehículo: 
	 * el motor, los frenos y el sistema de suspensión. En caso de que las tres inspecciones 
	 * resulten afirmativas, el vehículo podrá pasar la VTV. Si no es así, deberá generarse un informe 
	 * de revisión en el cual se detalla que el auto no pasó la VTV y debe realizar reparaciones
	 *  en estas partes. Se utilizará la fecha de la VTV para determinar la vigencia de un año desde 
	 *  que se pasó la VTV 
	 */
	
	private String motor;
	private String frenos;
	private String suspension;
	private String patente;
	LocalDate fecha;
	
	
	public Vtv(String motor, String frenos, String suspension, String patente) {
		this.motor = motor;
		this.frenos = frenos;
		this.suspension = suspension;
		this.patente = patente;
	}






	public LocalDate getFecha() {
		return fecha;
	}






	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}






	public String getPatente() {
		return patente;
	}





	public void setPatente(String patente) {
		this.patente = patente;
	}





	public String getMotor() {
		return motor;
	}


	public void setMotor(String motor) {
		this.motor = motor;
	}


	public String getFrenos() {
		return frenos;
	}


	public void setFrenos(String frenos) {
		this.frenos = frenos;
	}


	public String getSuspension() {
		return suspension;
	}


	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}
	
	public void revision() {
		
		patente = JOptionPane.showInputDialog("Ingrese patente");
		
		if (this.frenos == null  || this.motor == null || this.suspension == null) {
			
			JOptionPane.showMessageDialog(null, "Hay que arreglar partes, no paso la vtv");
			
			fecha = fecha.now();
			
			fecha = fecha.plusMonths(12);
			
			
			JOptionPane.showMessageDialog(null, "tiene hasta el " + fecha + " para hacer la vtv otra vez");
			
			
		} else {
			
			
			JOptionPane.showMessageDialog(null, " Esta todo correcto");
			
			
		}

		
	}
	
	
	
	
}
