//Média de Turma: Desenvolva um programa que utilize um vetor para armazenar as notas de 5 alunos e calcule a média aritmética da turma.

import java.util.Scanner;
public class exerc_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[5];
        double contador = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor: ");
            double valor = sc.nextInt();
            vetor[i] = valor;
            contador += valor;
        }
        contador = contador / 5;
        System.out.println(contador);


    }
}
