package Loops;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        /**
         * Faça um programa que peça uma nota, entre zero e dez.
         * Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
         */

        Scanner scan = new Scanner(System.in);

        double nota = 0d;

        while (nota > 0 || nota < 10){

            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Número inválido. Digite um numero de 0 a 10");
            } else {
                System.out.println("Nota:" + nota);
                break;
            }
        }

    }
}