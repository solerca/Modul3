package m3;

public class fase4 {
	public static void main(String[] args) {
//		Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays
//		sera la llargada de cada string ( string nomCiutat.Length).  
//		Ompliu els nous arrays lletra per lletra. 
//		Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). 

		char ciutat1[] = { 'B', 'a', 'r', 'c', 'e', 'l', 'o', 'n', 'a' };
		char ciutat2[] = { 'M', 'a', 'd', 'r', 'i', 'd' };
		char ciutat3[] = { 'V', 'a', 'l', 'e', 'n', 'c', 'i', 'a' };
		char ciutat4[] = { 'M', 'a', 'l', 'a', 'g', 'a' };
		char ciutat5[] = { 'C', 'a', 'd', 'i', 's' };
		char ciutat6[] = { 'S', 'a', 'n', 't', 'a', 'n', 'd', 'e', 'r' };
		char ciutats[][] = { ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6 };

		for (int i = 0; i < ciutats.length; i++) {		//recórrer l'array ciutats
			char aux;	
			for (int j = 0; j < ciutats[i].length / 2; j++) {		//invertir els arrays un per un
				aux = ciutats[i][j];
				ciutats[i][j] = ciutats[i][ciutats[i].length - 1 - j];
				ciutats[i][ciutats[i].length - 1 - j] = aux;
			}
			System.out.println(ciutats[i]);
		}

	}
}
