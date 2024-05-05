public class ContadorMain {

	public static void main(String[] args) {
		Contador contador = new Contador();
		
		contador.contar();
		System.out.println("Ha contado " + contador.getResultado());
		
		contador.triContarDesde0();
		System.out.println("Ha tricontado " + contador.getResultado());
	}

}
