package Exericicio;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);

		int vetor[] = new int[10];
	

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = s.nextInt();

		}

		for (int j : vetor) {

			Arrays.sort(vetor);

			System.out.println(j);

		}

	}

}
