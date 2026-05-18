//Manipulação de Índices: Crie um vetor com os valores {1, 2, 3, 4, 5}. Substitua o terceiro elemento (índice 2) pelo número 0 e imprima o vetor resultante.

public class exerc_4 {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5};
        for (int i = 0; i < vetor.length; i++) {
            if (i == 2) {
                System.out.println(0);
            } else {
                System.out.println(vetor[i]);
            }
        }
    }
}
