package Presentación;
import Logica.Contratista;
import Logica.Empleado;
import Logica.EmpleadoMedioTiempo;
import Logica.EmpleadoTiempoCompleto;

public class Principal {
	
	public Principal() {
		// TODO Auto-generated constructor stub
		Empleado e;
		e= new EmpleadoMedioTiempo(8);
		System.out.println(e.calcularSalario());
		e= new Contratista(8);
		System.out.println(e.calcularSalario());
		e= new EmpleadoTiempoCompleto(8);
		System.out.println(e.calcularSalario());
		
	}

	public static void main(String[] args) {
		new Principal();
	}

}
