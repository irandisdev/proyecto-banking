
public class Empleado extends Usuario {
	private String posicion;
	private double salario;
	private int numeroEmpleado;

	public Empleado(String nombre, String correo, String telefono, String posicion, double salario,
			int numeroEmpleado) {
		super(nombre, correo, telefono);
		this.posicion = posicion;
		this.salario = salario;
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	@Override
	public boolean puedeIniciarSesion() {
		// TODO Auto-generated method stub
		return false;
	}
}