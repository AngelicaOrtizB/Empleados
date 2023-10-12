package Logica;

public class Contratista extends Empleado{

	public Contratista(int dias) {
		super(dias);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 30* this.dias;
	}

}
