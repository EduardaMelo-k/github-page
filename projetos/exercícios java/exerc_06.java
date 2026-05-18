//Preenchimento Dinâmico: Peça ao usuário para definir o tamanho N de um vetor, preencha-o com números inteiros e exiba o vetor completo ao final.

import java.util.Arrays;
import java.util.Scanner;
public class exerc_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Defina o tamanho n do vetor");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores do vetor");
            vetor[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(vetor));




    }
}
