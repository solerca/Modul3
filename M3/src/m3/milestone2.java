package m3;

import java.util.Scanner;

public class milestone2 {

	public static void main(String[] args) {

//		En aquest exercici crearàs un array bidimensional on introduiràs 3 notes
//		per a 5 alumnes. Es calcularà la nota mitjana de cada alumna i s'indicarà si 
//		han suspès o no.
//		Crea un array bidimensional capaç de guardar 3 notes de 5 alumnes.
//		Omple l'array amb un bucle demanant els valors per pantalla (nota
//		entre 0 i 10), has d'identificar per pantalla quan és una agrupació d'un alumne nou.
//		Recorre l'array, fes la Mitjana aritmètica de les 3 notes i indica si l'alumne 
//		ha aprovat o suspès.

		String[][] alumnesNotes = new String[5][4];

		for (int i = 0; i < alumnesNotes.length; i++) {
			System.out.println("introdueix nom de l'alumne " + (i + 1));
			Scanner scan = new Scanner(System.in);
			alumnesNotes[i][0] = scan.next();
			for (int j = 1; j < alumnesNotes[i].length; j++) {
				System.out.println("Introdueix la nota " + (j) + " de " + alumnesNotes[i][0] + " (0/10):");
				alumnesNotes[i][j] = scan.next();
				if (Double.parseDouble(alumnesNotes[i][j]) < 0 || Double.parseDouble(alumnesNotes[i][j]) > 10) {
					System.out.println("La nota introduïda és incorrecte. torni a introduir-la.");
					j--;
				}
			}
			double mitja = (Double.parseDouble(alumnesNotes[i][1]) + Double.parseDouble(alumnesNotes[i][2])
					+ Double.parseDouble(alumnesNotes[i][3])) / 3;
			if (mitja < 5) {
				System.out.println("L'alumne " + alumnesNotes[i][0] + " ha suspès.");
			} else {
				System.out.println("L'alumne " + alumnesNotes[i][0] + " ha aprobat.");
			}
			scan.close();
		}
	
	}

}
