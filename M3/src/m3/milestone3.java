package m3;

import java.util.Scanner;
import java.util.ArrayList;

public class milestone3 {

	public static void main(String[] args) {
//		Escriviu un programa que donat un numero N retorni la seq��ncia de Fibonacci
//		fins al numero N.La seq��ncia de Fibonacci �s la s�rie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//		El n�mero seg�ent es troba sumant els dos n�meros anteriors. 

		System.out.println("introdueix el numero N");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(0);
		numeros.add(1);

		for (int i = 2; i <= n; i++) {
			numeros.add(numeros.get((i - 1)) + numeros.get((i - 2)));
			if (i == 2) {
				System.out.print(numeros.get(0) + ", " + numeros.get(1) + ", " + numeros.get(i) + ", ");
			} else {
				System.out.print(numeros.get(i) + ", ");
			}
		}
		scan.close();
	}
}
