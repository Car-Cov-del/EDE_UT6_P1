public class AnalizadorPalabrasTesterRepetidas {

	public static void main(String[] args) {
		test("mississippiii"); // expect: 4 (ss, ss, pp, iii)
		test("test"); // expect: 0 (sin letras repetidas)
		test("aabbcdaaaabb"); // expect: 4 (aa, bb, aaaa, bb)
	}

	public static void test(String s) {
		AnalizadorPalabras ap = new AnalizadorPalabras(s);
		int resultado = ap.contarCaracteresRepetidos();
		System.out.println(resultado + " caracteres repetidos.");
	}
}

//Ejercicio 6 – Analizador Palabras III
//Ejecuta AnalizadorPalabrasTesterRepetidas.
//Pon un punto de ruptura a la entrada del método de contarCaracteresRepetidos,
//y mediante una ejecución paso a paso evalúa los valores de this, ce i.
//Revisa las condiciones y corrige los errores.
//Realiza una ejecución con cobertura y comprueba
//qué métodos del AnalizadorPalabras se han ejecutado.
//Crea diferentes capturas de pantalla con los valores
//de las variables antes y después de corregir el fallo.

//El problema es que no revisa la primera letra en el bucle, esto se arregla cambiando un 1 por un 0