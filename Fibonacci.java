package Exercicios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int auxiliar = 0, item1 = 0, item2 = 1, numeroDigitado;
		boolean verificarNumero = false;
		System.out.println("Digite o valor que desejar para encontrar na sequência de Fibonacci");
		numeroDigitado = read.nextInt();	
		System.out.println("*******SEQUENCIA DE FIBONACCI********");
			for( int i = 0; i < 30;i++)
			{
				if(i == 0) {
			 System.out.println(item1);
				auxiliar = item2;
				}
				else if(i == 1)
					System.out.println(item2);
				else{
					System.out.println(auxiliar);
					item1 = auxiliar;
					auxiliar = auxiliar + item2;
					item2 = item1;
				}
			if(numeroDigitado == item1) {
				verificarNumero = true;
			}
			
			}
			if(verificarNumero)
				System.out.println("O numero Digitado Pertence a Sequencia de Fibonacci");
			else
				System.out.println("Não pertence a sequência de Fibonacci");

	}

}
