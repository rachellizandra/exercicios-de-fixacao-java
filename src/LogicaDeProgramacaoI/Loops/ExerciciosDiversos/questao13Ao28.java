package LogicaDeProgramacaoI.Loops.ExerciciosDiversos;

import java.util.Scanner;

public class questao13Ao28 {

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

//        System.out.println("Digite a quantidade de numeros que deseja:");
//        int qtd = scan.nextInt();
//        float notas = 0f;
//        float soma = 0f;
//        float media = 0f;
//
//        for(int i = 0; i < qtd; i++) {
//            System.out.printf("Digite a %d nota:", (i+1));
//            notas = scan.nextFloat();
//            soma += notas;
//        }
//        media = soma / qtd;
//        System.out.println("A média das notas foi: " + media);

        /**
         * Altere o programa anterior para que ele aceite apenas números entre 0
         * e 1000.
         */
//
//        System.out.println("Digite a quantidade de numeros que deseja:");
//        int qtd = scan.nextInt();
//        float notas = 0f;
//        float soma = 0f;
//        float media = 0f;
//
//        if(qtd > 0 && qtd < 1000) {
//            for(int i = 0; i < qtd; i++) {
//                System.out.printf("Digite a %d nota:", (i + 1));
//                notas = scan.nextFloat();
//                soma += notas;
//            }
//            media = soma / qtd;
//            System.out.println("A media das notas foi:" + media);
//        } else {
//            System.out.println("Digite numeros entre 0 e 1000");
//        }

        /**
         * Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
         * o fatorial várias vezes e limitando o fatorial a números inteiros positivos
         * e menores que 16.
         */

//        System.out.println("Digite um numero:");
//        int numero = scan.nextInt();
//
//        int cont = 1;
//        int fatorial = 1;
//
//        if(numero > 0 && numero < 16) {
//            while(cont <= numero) {
//                fatorial *= cont;
//                cont += 1;
//            }
//            System.out.println("O fatorial de " + numero + " é " + fatorial);
//        } else {
//            System.out.println("Digite numeros inteiros positivos e menores que 16.");
//        }

        /**
         * .Faça um programa que mostre todos os primos entre 1 e N sendo N
         * um número inteiro fornecido pelo usuário. O programa deverá mostrar
         * também o número de divisões que ele executou para encontrar os
         * números primos. Serão avaliados o funcionamento, o estilo e o número
         * de testes (divisões) executados.
         */

//        System.out.println("Digite o numero maximo:");
//        int numeroMax = scan.nextInt();
//
//        int divisoes = 0;
//
//        for(int i = 1; i <= numeroMax; i++) {
//            if(i % 2 == 1 && i != 2) {
//                divisoes++;
//                System.out.println(i);
//            } else {
//                divisoes++;
//            }
//        }
//        System.out.println("Numero de divisões: " + divisoes);


        /**
         * Faça um programa que, dado um conjunto de N números, determine o
         * menor valor, o maior valor e a soma dos valores.
         */

//        System.out.println("Digite quantos numeros deseja:");
//        int qtd = scan.nextInt();
//        int numeros;
//
//        int maior = Integer.MIN_VALUE;
//        int menor = Integer.MAX_VALUE;
//        int soma = 0;
//
//        for(int i = 0; i < qtd; i++) {
//            System.out.printf("Digite o %d numero:", (i + 1));
//            numeros = scan.nextInt();
//
//            if(numeros < menor) {
//                menor = numeros;
//            } else if(numeros > maior) {
//                maior = numeros;
//            }
//            soma += numeros;
//        }
//        System.out.println("Maior: " + maior);
//        System.out.println("Menor: " + menor);
//        System.out.println("Soma: " + soma);

        /**
         * .Faça um programa que peça para n pessoas a sua idade, ao final o
         * programa devera verificar se a média de idade da turma varia entre 0 e
         * 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
         * ou idosa, conforme a média calculada.
         */

//        System.out.println("Quantas pessoas deseja?");
//        int pessoas = scan.nextInt();
//        int idade;
//        int soma = 0;
//        float media = 0f;
//
//        for(int i = 0; i < pessoas; i++) {
//            System.out.printf("Digite a idade da %d pessoa", (i + 1));
//            idade = scan.nextInt();
//
//            soma += idade;
//        }
//        media = soma / pessoas;
//
//        if(media > 0 && media <= 25) {
//            System.out.println("Jovem");
//        }else if(media > 26 && media <= 60) {
//            System.out.println("Adulta");
//        } else if(media > 60) {
//            System.out.println("Idosa");
//        }
//
//        System.out.println("Media das idades:" + media);

        /**
         * Numa eleição existem três candidatos. Faça um programa que peça o
         * número total de eleitores. Peça para cada eleitor votar e ao final
         * mostrar o número de votos de cada candidato.
         */

//        System.out.println("Digite o total de eleitores:");
//        double eleitores = scan.nextDouble();
//        System.out.println("Digite qual dos candidatos deseja votar:");
//        System.out.println("1- Carlos Felino");
//        System.out.println("2- Jorel");
//        System.out.println("3- Irmão do Jorel");
//
//        int cont1 = 0;
//        int cont2 = 0;
//        int cont3 = 0;
//
//        int escolha;
//
//        for(int i = 0; i < eleitores; i++) {
//            System.out.printf("Escolha do eleitor %d:", (i + 1));
//            escolha = scan.nextInt();
//            switch (escolha) {
//                case 1: cont1++;
//                    break;
//                case 2: cont2++;
//                    break;
//                case 3: cont3++;
//                    break;
//                default:
//                    System.out.println("Escolha um dos 3 candidatos");
//                    break;
//            }
//        }
//        System.out.println("Quantidade de votos do candidato 1: " + cont1);
//        System.out.println("Quantidade de votos do candidato 2: " + cont2);
//        System.out.println("Quantidade de votos do candidato 3: " + cont3);

        /**
         * Faça um programa que calcule o número médio de alunos por turma.
         * Para isto, peça a quantidade de turmas e a quantidade de alunos para
         * cada turma. As turmas não podem ter mais de 40 alunos.
         */

//        System.out.println("Digite a quantidade de turmas");
//        int turmas = scan.nextInt();
//
//        System.out.println("Digite a quantidade de alunos");
//        int alunos = scan.nextInt();
//
//        float media = 0f;
//
//        for(int i = 0; i < alunos; i++) {
//            media = alunos / turmas;
//        }
//
//        if(media > 40) {
//            System.out.println("A turmas não podem ter mais de 40 alunos");
//        } else {
//            System.out.println("Media de alunos por turma: " + media);
//        }

        /**
         * Faça um programa que calcule o valor total investido por um
         * colecionador em sua coleção de CDs e o valor médio gasto em cada
         * um deles. O usuário deverá informar a quantidade de CDs e o valor
         * para em cada um.
         */

        System.out.println("Informe a quantidade de CDs:");
        int qtdCds = scan.nextInt();
        double valorCd;
        double valorTotal = 0;
        double media = 0f;

        for(int i = 0; i < qtdCds; i++) {
            System.out.printf("Informe o valor do cd %d:", (i + 1));
            valorCd = scan.nextDouble();

            valorTotal += valorCd;
            media = valorTotal / qtdCds;
        }
        System.out.println("O valor investido é:" + valorTotal);
        System.out.println("O valor médio de cada Cd é:" + media);

    }
}
