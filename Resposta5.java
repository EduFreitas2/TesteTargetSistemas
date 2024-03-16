package Exercicios;

import java.util.Scanner;

public class Resposta5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String palavraDigitada = "";
		System.out.println("Digite uma palavra para inverter");
		palavraDigitada = read.next();	
		String nova = "";
		for(int i = palavraDigitada.length() - 1; i >= 0; i--)
		{
			nova = nova + palavraDigitada.charAt(i) ;
		}
		System.out.println("Palavra invertida: "+ nova);
	}

}
