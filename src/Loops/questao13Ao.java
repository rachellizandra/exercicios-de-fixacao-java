package Loops;

import java.util.Scanner;

public class questao13Ao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**
         * Faça um programa que peça dois números, base e expoente, calcule e
         * mostre o primeiro número elevado ao segundo número. Não utilize a
         * função de potência da linguagem.
         */

//        System.out.println("Digite um numero para base");
//        int base = scan.nextInt();
//
//        System.out.println("Digite um numero para o expoente");
//        int expoente = scan.nextInt();
//
//        int resultado = 1;
//
//        for(int i = 0; i < expoente; i++) {
//            resultado = i * base;
//            resultado = base * resultado;
//        }
//        System.out.println(resultado);

        /**
         * Faça um programa que peça 10 números inteiros, calcule e mostre a
         * quantidade de números pares e a quantidade de números impares
         */

//        int cont1 = 0;
//        int cont2 = 0;
//        for(int i = 0; i < 10; i++) {
//            System.out.printf("Digite o %d numero:", (i+1));
//            int numero = scan.nextInt();
//            if(numero % 2 == 0) {
//                cont1++;
//            } else {
//                cont2++;
//            }
//        }
//        System.out.println("Quantidade de numeros pares: " + cont1);
//        System.out.println("Quantidade de numeros pares: " + cont2);

        /**
         * A série de Fibonacci é formada pela seqüência
         * 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
         * até o n−ésimo termo
         */

//        System.out.println("Digite o numero de termos da série de Fibonacci");
//        int termos = scan.nextInt();
//
//        int numero = 1;
//        int numeroAnterior = 0;
//
//        for (int i = 0; i < termos; i++) {
//            System.out.println(numero);
//            int aux = numero;
//            numero += numeroAnterior;
//            numeroAnterior = aux;
//        }

        /**
         * A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
         * Faça um programa que gere a série até que o valor seja maior que 500.
         */


//        System.out.println("Digite o numero de termos da série de Fibonacci");
//        int termos = scan.nextInt();
//
//        int numero = 1;
//        int numeroAnterior = 0;
//
//        for (int i = 0; i < termos; i++) {
//            if(numero < 500) {
//                System.out.println(numero);
//                int aux = numero;
//                numero += numeroAnterior;
//                numeroAnterior = aux;
//            } else {
//                System.out.println("O proximo valor será maior que 500");
//            }

            // ou
//            int ultimo = 1;
//            int penultimo = 1;
//            System.out.println(ultimo);
//            System.out.println(penultimo);
//
//            int termos = 0;
//
//            while (termos < 500) {
//                termos = ultimo + penultimo;
//                penultimo = ultimo;
//                ultimo = termos;
//
//                if(termos < 500) {
//                    System.out.println(termos);
//                } else {
//                    System.out.println("O proximo valor será maior que 500");
//                }
//
//            }

        /**
         * Faça um programa que calcule o fatorial de um número inteiro
         * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
         */

//        System.out.println("Digite um numero:");
//        int numero = scan.nextInt();
//
//        int cont = 1;
//        int fatorial = 1;
//
//        while(cont <= numero) {
//            fatorial *= cont;
//            cont += 1;
//        }
//        System.out.println(fatorial);

        /**
         * Faça um programa que calcule o mostre a média aritmética de N
         * notas.
         */
    }
}
