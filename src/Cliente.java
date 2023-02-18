// OBJETO CLIENTE - new Cliente()

public class Cliente extends Usuario { // Los clientes son usuarios pero no empleados hereda de usuario
	private double saldo;
	private int numeroCliente;

	public Cliente(String nombre, String correo, String telefono, double saldo, int numeroCliente) {
		super(nombre, correo, telefono);
		this.saldo = saldo;
		this.numeroCliente = numeroCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	@Override
	public boolean puedeIniciarSesion() {
		if (nombreDeUsuario == getCorreo()) {
			if (claveUsuario == getContrasena()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}