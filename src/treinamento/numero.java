package treinamento;

import java.util.Scanner;

public class numero {
	
	/*
	 Escreva uma função que aceite um array de 10 inteiros (entre 0 e 9), 
	 que retorne uma string desses números na forma de um número de telefone. 	 
	 */

	public static void main(String[] args) {
		int[] numero = new int[11];
		Scanner sc = new Scanner(System.in);

		try (sc) {
		    for (int i = 0; i < numero.length; i++) {
		        System.out.println("Digite o " + (i + 1) + ":");
		        numero[i] = sc.nextInt();
		        if (numero[i] >= 10) {
		            System.out.println("Somente números entre 0 - 9");
		            return;
		        }
		    }
		}

		String numeroFormatado = "";
		for (int numeroAux : numero) {
		    numeroFormatado += numeroAux;
		}

		String formatada = String.format("(%s) %s-%s", numeroFormatado.substring(0, 2), numeroFormatado.substring(2, 6), numeroFormatado.substring(6));
		System.out.println(formatada);

	}
	

}
