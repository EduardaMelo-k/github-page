//Soma de Posições Pares: Crie um vetor de 10 inteiros e calcule a soma apenas dos elementos que estão armazenados nas posições (índices) pares.

import java.util.Scanner;
public class exerc_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int [10];
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = sc.nextInt();
            if (i % 2 == 0) {
                cont += vetor[i];
            } else {
            }

        }
        System.out.println(cont);
    }
}
