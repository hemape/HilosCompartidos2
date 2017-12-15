
public class Principal {

	public static void main(String[] args) {

		// Creamos suma
		Suma sum = new Suma();

		// Creacion de hilos
		Thread th1 = new HiloSuma(sum);
		Thread th2 = new HiloSuma(sum);
		Thread th3 = new HiloSuma(sum);
		Thread th4 = new HiloSuma(sum);
		Thread th5 = new HiloSuma(sum);
		Thread th6 = new HiloSuma(sum);

		// Iniciamos hilos
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();

		// Resultados finales
		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
			th6.join();
			System.out.println("Suma final: " + sum.getSuma());
			System.out.println("Media de la suma: " + sum.media());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
