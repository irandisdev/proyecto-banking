// ENTIDAD CUENTA (OBJETO)
public class Cuenta {
	// ATRIBUTOS
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	// CONSTRUCTOR
	public Cuenta(int numeroCuenta) {
		if (numeroCuenta < 100) {
			System.out.println("!!! ALERTA: Los numero de cuenta deben comenzar en 100.\n");
			this.numero = 100;
		} else {
			this.numero = numeroCuenta;
		}
	}
	// FINAL DE CONSTRUCTOR

	// Metodo depositar
	void depositar(double valorAAgregar) {
		this.saldo = this.saldo + valorAAgregar;
	}

	// Metodo retirar
	public boolean retirar(double valorRetirar) {

		if (this.saldo >= valorRetirar) {
			this.saldo -= valorRetirar;
			return true;
		} else {
			return false;
		}

	}

	// Metodo transferir Argumento del metodo
	public boolean transferir(double valor, Cuenta account) {

		// evalua lo que se intenta hacer
		if (this.saldo >= valor) {
			this.saldo -= valor;
			account.depositar(valor);
			return true;
		} else {
			return false;
		}

	}
	// GETTERS AND SETTERS
	public void setTitular(Cliente nuevoTitular) {
		this.titular = nuevoTitular;
	}

	public Cliente getTitular() {
		return titular;

	}

	public double getSaldo() {
		return this.saldo;
	}

	// Agencia setter and getter
	public void setAgencia(int nuevaAgencia) {
		if (nuevaAgencia > 0) {
			// Asegurandome que Agencia nunca sera un numero negativo
			this.agencia = nuevaAgencia;
		} else {
			System.out.println("!!! ALERTA: Agencia no puede ser un numero negativo.\n");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
}