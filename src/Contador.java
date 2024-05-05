public class Contador {
	private int resultado;
		
	public Contador() {
		this.resultado = 0;
	}

	public int getResultado() {
		return resultado;
	}

	public void contar() {
		for (int i = 0; i < 100; i++) {
			resultado += i + 1;
		}
	}
	
	public void triContarDesde0() {
		resultado = 0;
		this.contar();
		this.contar();
		this.contar();
		
		if (resultado %2 == 0) {
			// Forzamos una excepción de tipo ArithmeticException
			resultado = resultado / (resultado - resultado);
		}
	}
}

//Ejercicio 1 - Contador
//Pon un punto de ruptura en la clase Contador y sigue la ejecución del método contar.
//¿Cuanto vale resultado cuando i=3?
//resultado vale 6 cuándo i=3
//¿Cuanto vale resultado dentro de triContarDesde0 tras la segunda llamada a contar?
//Valdrá 10100 (Aún no se ha realizado la tercera llamada)