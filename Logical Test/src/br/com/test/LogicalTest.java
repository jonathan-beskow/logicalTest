package br.com.test;

public class LogicalTest {

	public static void main(String[] args) {
		contador("dasdsadasdsa");
	}

	public static void contador(String text) {
		String regex = "[a-zA-Z]+";
		char[] letras = text.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			char c = letras[i];

			if (String.valueOf(c).matches(regex)) {
				int n = 1;
				for (int j = i + 1; j < letras.length; j++) {
					if (c == letras[j]) {
						n++;
						letras[j] = 0;
					}
				}
				System.out.println(c + " : " + n);

			}

		}
	}

}
