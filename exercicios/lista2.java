package exercicios;

public class lista2 {
	
	public static void main(String[] args) {
		
		//Exercicio 1a
		
		int vetA[] = new int[10];
		
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = vetA.length - i;
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("\n");
		
		//Exercicio 1b
		
		int vetB[] = new int[11];
		
		for (int i = 0; i < vetB.length; i++) {
			vetB[i] = i * i;
			System.out.print(vetB[i] + " ");
		}
		
		System.out.println("\n");
		
		//Exercicio 1c
		
		int vetC[] = new int[10];
		
		for (int i = 0; i < vetC.length; i++) {
			if(i < vetC.length / 2) {
				vetC[i] = i + 1;
			}
			else {
				vetC[i] = (i * 10) - 40;
			}
		System.out.print(vetC[i] + " ");
		}
		
		System.out.println("\n");
		
		
		//Exercicio 2
		
		double vet2[] = {1.2, 3.0, 4.4, 2.4, 5.1, 2.5, 7.3, 5.0};
		
		for (int i = 0; i < vet2.length; i++) {
			System.out.print(vet2[i] + " ");
		}
		
		System.out.println("\n");
		
		
		//Exercicio 3
		
		int vet3[] = {2, 4, -1, 43, -34, -2, 5, -17, 8};
		int cont = 0;
		
		for (int i = 0; i < vet3.length; i++) {
			if (vet3[i] < 0) {
				cont = cont + 1;
			}
		}
		
		System.out.print("Total de elementos negativos: " + cont);
		
		System.out.println("\n");
		
		
		//Exercicio 4
		
		int a[] = {2, 4, 4, 5, 2, 6, 4, 6, 5, 4, 3, 1, 53, 5, 2, 45, 4, 5, 10};
		int x = 4;
		int cont2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				cont2++;
			}
		}
		
		System.out.println("Quantidade de vezes que o numero 4 aparece no array: " + cont2);
		
		System.out.println("\n");
		
		
		//Exercicio 5
		
		int vet5[] = {2, 4, -1, 43, -34, -2, 5, -17, 8, 6, -4, 0, 0, 3, -2, 5, 8, 0};
		boolean tipoElemento[] = new boolean[vet5.length];
		
		for (int i = 0; i < vet5.length; i++) {
			for (int j = 0; j < tipoElemento.length; j++) {
				if (vet5[i] > 0) {
					tipoElemento[j] = true;
				}
				else {
					tipoElemento[j] = false;
				}
				
			}
			System.out.print(tipoElemento[i] + " ");
		}
		
		System.out.println("\n");
		
		
		//Exercicio 6
		
		int vet6[] = {2, 4, -1, 43, -34, -2, 5, -17, 8, 6, -4, 0, 0, 3, -2, 5, 8, 0};
		//int comparador = 0;
		int maior = 0;
		
		for (int i = 0; i < vet6.length; i++) {
			if (vet6[i] > maior) {
				maior = vet6[i];
			}
			
		}
		
		System.out.print(maior);
		
		
		System.out.println("\n");
		
		
		//Exercicio 7
		
		int vet7[] = {2, 4, 1, 43, 34, 2, 5, 17, 8, 6, 4, 23, 28, 3, 2, 5, 8, 31, 55};
		
		for (int i = 0; i < vet7.length; i++) {
			if (vet7[i] % 2 == 0) {
				vet7[i] = 1;
			}
			else {
				vet7[i] = -1;
			}
			System.out.print(vet7[i] + " ");
		}
	}

}
 