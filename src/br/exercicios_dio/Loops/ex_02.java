package br.exercicios_dio.Loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem se o valor for invalido
e continue pedindo até que o usuário informe
um valor valido
 */

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota:");
        nota = scan.nextInt();
        while(nota <0 | nota > 10){
            System.out.println("Digite uma nota:");
            nota = scan.nextInt();
        }

        System.out.println("Muito obrigado");
    }
}
