//Produto de Reais: Crie um vetor de float com 4 elementos e calcule o produto (multiplicação) de todos os valores.

import java.util.Scanner;
public class exerc_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] vetor = new float[4];
        float contador = 1;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um valor: ");
            int a = sc.nextInt();
            vetor[i] = a;
            contador = contador * a;
        }
        System.out.println(contador);
    }
}
