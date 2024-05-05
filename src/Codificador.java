import java.util.Scanner;

public class Codificador {

	//No deberían ser estáticos

	private int cantidadVocales;
	private int clave;
	private StringBuilder mensaje;

	public Codificador(String texto, int clave) {
		this.clave = clave;
		this.mensaje = new StringBuilder(texto);
	}

	//Los métodos para codificar y decodificar no funcionaban bien
	public void codificar() {
		for (int i = 0; i < mensaje.length(); i++) {
			int valorInt = (int) mensaje.charAt(i);
			int valorCodificado = valorInt + clave * cantidadVocales;
			while (valorCodificado > 126) {
				valorCodificado -= 95;
			}
			while (valorCodificado < 32) {
				valorCodificado += 95;
			}
			char caracterCodificado = (char) valorCodificado;
			mensaje.setCharAt(i, caracterCodificado);
		}
		System.out.println(mensaje);
	}

	public void decodificar() {
		for (int i = 0; i < mensaje.length(); i++) {
			int valorInt = (int) mensaje.charAt(i);
			int valorDecodificado = valorInt - clave * cantidadVocales;
			while (valorDecodificado > 126) {
				valorDecodificado -= 95;
			}
			while (valorDecodificado < 32) {
				valorDecodificado += 95;
			}
			char caracterDecodificado = (char) valorDecodificado;
			mensaje.setCharAt(i, caracterDecodificado);
		}
		System.out.println(mensaje);
	}

	//Busco manualmente el número de vocales en lugar de ser un valor estático
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce el mensaje: ");
		String s = in.nextLine();
		System.out.print("Introduce la clave: ");
		int clave = in.nextInt();

		Codificador codificador = new Codificador(s, clave);

		int cantidadVocales = 0;
		for (int i = 0; i < s.length(); i++) {
			char letra = s.charAt(i);
			if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I'
					|| letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U') {
				cantidadVocales++;
			}
		}
		codificador.cantidadVocales = cantidadVocales;

		System.out.print("¿Quieres codificar o decodificar [C/D]?: ");
		String opcion = in.next();

		if (opcion.equalsIgnoreCase("C")) {
			codificador.codificar();
		} else if (opcion.equalsIgnoreCase("D")) {
			codificador.decodificar();
		} else {
			System.out.println("Opción incorrecta");
		}

		in.close();
	}
}

//Ejercicio 7.- Codificador
//La clase Codificador no tiene errores de compilación/ejecución, pero no funciona correctamente.
//Debes encontrar los errores, documentarlos y corregirlos (mediante capturas de pantalla).
//Primero, lee el código y entiende cual es el objetivo de la clase.
//A continuación, ejecuta el código paso a paso y evalúa el contenido de las variables.
