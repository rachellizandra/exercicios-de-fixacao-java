package Loops;

import java.util.Scanner;

public class questao7 {

    public static void main(String[] args) {
        /**
         * Faça um programa que leia 5 números e informe o maior número.
         */

        Scanner scan = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        int numero;
        //int cont = 0;

        // usando o while
//        while(cont < 5) {
//            System.out.printf("Digite o %d numero:", (cont + 1));
//            numero = scan.nextInt();
//            cont++;
//
//            if(numero > maior) {
//                maior = numero;
//            }
//        }
//        System.out.println("O maior numero foi: " + maior);

        //usando o for
        for(int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d numero: ", (i + 1));
            numero = scan.nextInt();

            if(numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior numero foi: " + maior);
    }
}
