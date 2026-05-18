//Soma Simples: Crie um vetor de inteiros com 3 elementos e imprima a soma dos valores armazenados.

import java.util.Scanner;
public class exerc_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor [] = new int[3];
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um número inteiro");
            int a = sc.nextInt();
            vetor[i] = a;
            contador += a;
        }
        System.out.println("Vetor: " + contador);
    }
}
