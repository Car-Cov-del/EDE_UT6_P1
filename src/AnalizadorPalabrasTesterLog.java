public class AnalizadorPalabrasTesterLog {

	public static void main(String[] args) {
		test("missisippi"); // expect: i (not m or s)
		test("debug"); // expect: 0 (no duplicate letters)
		test("test"); // expect: t
		test("contento"); // expect: o (not n or t)
	}

	public static void test(String s) {
		AnalizadorPalabras ap = new AnalizadorPalabras(s);
		char resultado = ap.primerCaracterMultiple();
		if (resultado == 0) {
			System.out.println("No hay caracteres multiples.");
		} else {
			System.out.println("Primer caracter multiple = " + resultado);
		}
	}
}

//Ejercicio 5 -
//AnalizadorPalabras II
//Ejecuta AnalizadorPalabrasTesterLog.
//Añade un Logger a la clase AnalizadorPalabras, con un manejador de archivo denominado analizadorPalabras.log
//Modifica el método encontrar()para que al entrar al método escriba en el log con nivel info:
//Entrando a encontrar con caracter=X y posicion=Y, siendo X e Y los parámetros de entrada
//Saliendo de encontrar con i=Z, siendo Z el valor de la variable i
//A partir del resultado del fichero de log, explica porqué no funciona el método primerCaracterMultiple, y corrige el método encontrar en consecuencia.
//Tras corregir el error, configura el nivel del Log para que sólo muestre los mensajes de warning.
//No hemos dado el logger