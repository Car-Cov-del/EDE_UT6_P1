public class AnalizadorPalabrasTester {

	public static void main(String[] args) {
		test("aardvark"); // esperado: a
		test("ccoo"); // esperado: c (no o)
		test("debug"); // esperado: 0 (no hay letras duplicadas)
		test("severo"); // esperado: 0 (la e no se repite)
	}

	public static void test(String s) {
		AnalizadorPalabras ap = new AnalizadorPalabras(s);
		char resultado = ap.primerCaracterRepetido();
		if (resultado == 0) {
			System.out.println("No hay caracteres repetidos.");
		} else {
			System.out.println("Primer caracter repetido = " + resultado);
		}
	}
}

//Ejercicio 3 – AnalizadorPalabras I
//Ejecuta AnalizadorPalabrasTester
//Crea una captura donde se vea la excepción y el motivo del fallo.
//Explica el porqué del error y soluciónalo.
//Crea otra captura de pantalla con la solución que has codificado.
//Vuelve a ejecutar el tester y comprueba que ya no salta la excepción.