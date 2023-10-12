package Logica;

public class EmpleadoTiempoCompleto extends Empleado{

	public EmpleadoTiempoCompleto(int dias) {
		super(dias);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 70*this.dias;
	}

/*public EmpleadoTiempoCompleto(int dias) {
		super(dias);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 70*this.dias;
	}*/

}
