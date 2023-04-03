package LogicaDeProgramacaoI.Loops.ComandosDeRepeticao;

import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**
         * 1) Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar
         * Algoritmos!”
         */

//        int num = 0;
//        while(num <= 20) {
//            System.out.println("Eu gosto de estudar algoritmos!");
//            num++;
//        }

        /**
         * Escreva um algoritmo que calcule a soma dos números de 1 a 15.
         */

//        int soma = 0;
//        for(int i = 1; i <= 15; i++) {
//            soma +=i;
//        }
//        System.out.println("A soma entre os numeros de 1 a 15 é: " + soma);

        /**
         * Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
         */

//        System.out.println("Digite o seu usuario:");
//        String usuario = scan.nextLine();
//
//        int numero = 0;
//        while (numero < 10) {
//            System.out.println(usuario);
//            numero++;
//        }

        /**
         * Leia o nome um número do usuário um número N e escreva o nome dele na tela N
         * vezes.
         */
//        System.out.println("Digite o seu usuario:");
//        String usuario = scan.nextLine();
//        System.out.println("Digite quantas vezes quer que seu nome apareça na tela");
//        int vezes = scan.nextInt();
//        int numero = 0;
//
//        while(numero < vezes) {
//            System.out.println(usuario);
//            numero++;
//        }

        /**
         * Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
         * números.
         */

//        int numeros;
//        int soma = 0;
//
//        for(int i = 0; i < 10; i++){
//            System.out.printf("Digite o %d numero: ", (i+1));
//            numeros = scan.nextInt();
//            soma += numeros;
//        }
//        System.out.println("A soma destes numeros é: " + soma);

        /**
         *6) Leia a idade de 20 pessoas e exiba a soma das idades.
         * 7) Leia a idade de 20 pessoas e exiba a média das idades.
         * 8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
         * 9) Leia o nome e a idade de 20 pessoas e exiba o nome da pessoa mais nova.
         */

//        //String nome;
//        int idade;
//
//        int maior = Integer.MIN_VALUE;
//        int menor = Integer.MAX_VALUE;
//        int maiorDeIdade = 0;
//        float media = 0f;
//        float soma = 0;
//
//        int cont = 0;
//
//        for(int i = 0; i < 5; i++) {
//            //System.out.println("Digite o nome da %d pessoa:");
//           // nome = scan.nextLine();
//            System.out.printf("Digite a idade da %d pessoa:", (i + 1));
//            idade = scan.nextInt();
//
//            soma += idade;
//
//            media = soma / 5;
//
//            if(idade > 18) {
//                cont++;
//            }
//
//        }
//        System.out.println("A soma das idades é: " + soma);
//        System.out.println("A media das idades é: " + media);
//        System.out.println("A quantidade de maiores de idade é: " + cont);


        /**
         * Crie um algoritmo que leia um número do usuário e exiba a sua tabuada de
         * multiplicação.
         */

//        System.out.println("Digite um número e veja a sua tabuada completa:");
//        int numero = scan.nextInt();
//
//        int resultado = 0;
//
//        for(int i = 0; i < 10; i++) {
//            for(int j = 0; j < 10; j++) {
//                resultado = numero * j;
//                System.out.println(numero + "x" + j + "= " + resultado);
//            }
//        }

        /**
         * Escreva um algoritmo que leia 5 números do usuário e exiba quantos números são
         * maiores do que 8.
         */

//        int numeros = 0;
//        int cont = 0;
//
//        for(int i = 0; i < 5; i++) {
//            System.out.printf("Informe o %d numero:", (i + 1));
//            numeros = scan.nextInt();
//
//            if(numeros > 8) {
//                cont++;
//            }
//        }
//        System.out.println(cont);

        /**
         * Escreva um algoritmo que leia 5 números do usuário e exiba quantos números são
         * pares
         */

//        int numeros = 0;
//        int cont = 0;
//
//        for(int i = 0; i < 5; i++) {
//            System.out.printf("Informe o %d numero:", (i + 1));
//            numeros = scan.nextInt();
//
//            if(numeros % 2 == 0) {
//                cont++;
//            }
//        }
//        System.out.println(cont);

        /**
         * Faça um algoritmo que leia 5 números e, ao final, escreva quantos estão entre 0 e
         * 100.
         */

//        int numeros = 0;
//        int cont = 0;
//
//        for(int i = 0; i < 5; i++) {
//            System.out.printf("Informe o %d numero:", (i + 1));
//            numeros = scan.nextInt();
//
//            if(numeros >= 0 && numeros <= 100) {
//                cont++;
//            }
//        }
//        System.out.println(cont);

        /**
         * Faça um algoritmo que leia 5 números e, ao final, escreva quantos estão entre 0 e
         * 100, quantos estão entre 101 e 200 e quantos são maiores de 200.
         */

//        int numeros = 0;
//        int cont1 = 0;
//        int cont2 = 0;
//        int cont3 = 0;
//
//        for(int i = 0; i < 5; i++) {
//            System.out.printf("Informe o %d numero:", (i + 1));
//            numeros = scan.nextInt();
//
//            if(numeros >= 0 && numeros <= 100) {
//                cont1++;
//            }
//
//            if(numeros > 101 && numeros <= 200) {
//                cont2++;
//            }
//
//            if(numeros > 200) {
//                cont3++;
//            }
//        }
//        System.out.println(cont1);
//        System.out.println(cont2);
//        System.out.println(cont3);

        /**
         * Escreva um algoritmo que leia uma sequência de números do usuário e realize a
         * soma desses números. Encerre a execução quando um número negativo for digitado.
         */

        int soma = 0;
        int n = 0;

        while (n >= 0) {

            if (n >= 0) {

                System.out.println("Digite um número inteiro: ");

                n = scan.nextInt();

                soma = n + soma;

                System.out.println("Resultado:" + soma);

            }

        }
    }
}

