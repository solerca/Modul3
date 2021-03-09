package m3;

import java.util.Arrays;

public class fase2 {
	public static void main(String[] args) {
//	Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). 
//	Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. 

		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";

		String arrayCiutats[] = { ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6 };
		Arrays.sort(arrayCiutats);

		for (int i = 0; i < arrayCiutats.length; i++) {
			if (i < 5) {
				System.out.print(arrayCiutats[i] + ", ");
			} else {
				System.out.print(arrayCiutats[i] + ". ");
			}

		}

	}
}
