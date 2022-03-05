package br.exercicios_dio.Arrays;
/*Crie um vetor de 6 numeros inteiros
 e depois mostre na ordem inversa. */
public class ex_01 {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6 };
        int count = 0;
        System.out.println("Vetor: ");
        while(count < (vetor.length )){
            System.out.println(vetor[count]);
            count++;
        }
        System.out.println("Ordem inversa: ");

        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }
}
