public class AnalizadorPalabras {

	private String palabra;

	public AnalizadorPalabras(String palabra) {
		this.palabra = palabra;
	}

	/**
	 * Obtiene el primer caracter repetido. Se considera <i>repetido</i>s si hay dos
	 * al menos dos ocurrencias adyacentes. Por ejemplo, la "l" se repite en
	 * "paella", pero no la "a".
	 * 
	 * @return El primer caracter repetido, si no, 0.
	 */
	public char primerCaracterRepetido() {
		for (int i = 0; i < palabra.length()-1; i++) {
			char ch = palabra.charAt(i);
			if (ch == palabra.charAt(i + 1))
				return ch;
		}
		return 0;
	}

	/**
	 * Obtiene la primera ocurrencia m�ltiple de un caracter.
	 * Un caracter es <i>multiple</i> si aparece al menos dos veces en la palabra,
	 * no necesariamente en posiciones contiguas. Por ejemplo, en "contento", 
	 * tanto la no' como la 't' y la 'o' ser�an m�ltiples.
	 * 
	 * @return el primer caracter m�ltiple, o 0 si no encuentra ninguno
	 */
	public char primerCaracterMultiple() {
		for (int i = 0; i < palabra.length(); i++) {
			char ch = palabra.charAt(i);
			if (encontrar(ch, i) >= 0)
				return ch;
		}
		return 0;
	}

	private int encontrar(char caracter, int posicion) {
		for (int i = posicion; i < palabra.length(); i++) {
			if (palabra.charAt(i) == caracter) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Cuenta los grupo de caracteres repetidos. Por ejemplo, "mississippi!!!" tiene
	 * 4 grupos: ss, ss, pp and !!!.
	 * 
	 * @return n�mero de grupos de caracteres repetidos
	 */
	public int contarCaracteresRepetidos() {
		int c = 0;
		for (int i = 0; i < palabra.length() - 1; i++) {
			if (palabra.charAt(i) == palabra.charAt(i + 1)) // encuentra una repetici�n
			{
				if (i == 0 || palabra.charAt(i - 1) != palabra.charAt(i)) // es el inicio
					c++;
			}
		}
		return c;
	}

}
