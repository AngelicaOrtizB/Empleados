package Logica;

public abstract class Empleado {
	protected int dias;

	public Empleado(int dias) {
		this.dias = dias;
	}
	
	public abstract double calcularSalario();

}
