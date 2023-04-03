package LogicaDeProgramacaoI.Loops.ExerciciosDiversos;

import java.util.Scanner;

public class questao10E11 {
    public static void main(String[] args) {

        /**
         * Faça um programa que receba dois números inteiros e gere os números inteiros que
         * estão no intervalo compreendido por eles.
         *
         * Altere o programa anterior para mostrar no final a soma dos números.
         *
         */

        Scanner scan = new Scanner(System.in);

        int menorNumero = 0;
        int diferenca = 0;
        //int soma = 0;

        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();

        if(num1 < num2) {
            menorNumero = num1;
        } else {
            menorNumero = num2;
        }

        diferenca = Math.abs(num1 - num2);

        for(int i = 1; i < diferenca; i++) {
            System.out.println(menorNumero + i + "");
        }


//        if(num1 > num2) {
//            for(int i = num2; i < num1; i++){
//                soma+=i;
//            }
//        } else if(num1 < num2) {
//            for(int i = num1; i < num2; i++) {
//                soma+=i;
//            }
//        } else {
//            System.out.println("O numeros são iguais");
//        }
//        System.out.println("A soma dos numeros foi:" + soma);
    }
}
