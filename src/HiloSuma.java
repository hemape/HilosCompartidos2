public class HiloSuma extends Thread {

	// Variables
	Suma sum;

	public HiloSuma(Suma sm) {
		this.sum = sm;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Sumando " + i + " en el hilo " + this.getName());
			sum.nuevoValor(i);
			System.out.println("Calculadno media del hilo " + this.getName() + " con " + sum.getCount()
					+ " valores sumados " + sum.media());
		}
		System.out.println("Sumas del hilo " + this.getName() + " finalizado");
	}
}
