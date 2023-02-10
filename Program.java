package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numI;
		double media,abmedia = 0,somaV=0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] numR = new double[n];
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			numR[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		for(int i =0; i<n; i++) {
			somaV+= numR[i];
		}
		
		media = somaV/n;
		
		System.out.printf("MÉDIA DO VETOR: %.3f\n",media);
		
		double num_am[] = new double[n];
		int i;
		
		for(i=0; i<n; i++) {
			if(numR[i]<media) {
			abmedia++;
			
			}
		}
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		
		for(i=0;i<abmedia;i++) {
			if(numR[i]<media) {
				num_am[i]=numR[i];
				System.out.printf("%.1f\n",num_am[i]);
				
		}
		
		
	}
		
		sc.close();

}
}
/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 


*/
