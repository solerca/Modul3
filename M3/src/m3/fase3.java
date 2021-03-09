package m3;

import java.util.Arrays;

public class fase3 {
	public static void main(String[] args) {
//		Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu
//		els noms modificats en un nou array(ArrayCiutatsModificades). 
//		Mostreu per consola l’array modificat i ordenat per ordre alfabetic. 
		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";


		String arrayCiutats[] = { ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6 };
		String[] arrayCiutatsModificades = new String [arrayCiutats.length];
		for (int i = 0; i < arrayCiutats.length; i++) {
			arrayCiutatsModificades[i] = arrayCiutats[i].replace('a', '4');
		}
		Arrays.sort(arrayCiutatsModificades);
		for (int i = 0; i < arrayCiutatsModificades.length; i++) {
			if (i < 5) {
				System.out.print(arrayCiutatsModificades[i] + ", ");
			} else {
				System.out.print(arrayCiutatsModificades[i] + ". ");
			}
		}
	}
}
