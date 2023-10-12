package Logica;

public class EmpleadoMedioTiempo extends Empleado {

	public EmpleadoMedioTiempo(int dias) {
		super(dias);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 33*this.dias;
	}

}
