package LogicaDeProgramacaoI.Loops.ExerciciosDiversos;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        /**
         * Faça um programa que leia 5 números e informe a soma e a média dos números.
         */

        Scanner scan = new Scanner(System.in);

        int numero;
        //int cont = 0;
        float soma = 0f;
        float media = 0f;

//        while(cont < 5) {
//            System.out.printf("Digite o %d numero: ", (cont + 1));
//            numero = scan.nextInt();
//            cont++;
//
//            soma += numero;
//
//            media = soma / 5;
//        }
//
//        System.out.println("A soma dos numeros é: " + soma);
//        System.out.println("A media dos numeros é: " + media);

        for(int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d numero:", (i +1));
            numero = scan.nextInt();

            soma += numero;
            media = soma / 5;
        }
        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A media dos numeros é: " + media);
    }
}
