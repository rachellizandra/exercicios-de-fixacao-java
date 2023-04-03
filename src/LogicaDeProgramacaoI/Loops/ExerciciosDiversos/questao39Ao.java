package LogicaDeProgramacaoI.Loops.ExerciciosDiversos;

import java.util.Scanner;

public class questao39Ao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**
         * Faça um programa que leia dez conjuntos de dois valores, o primeiro
         * representando o número do aluno e o segundo representando a sua
         * altura em centímetros. Encontre o aluno mais alto e o mais baixo.
         * Mostre o número do aluno mais alto e o número do aluno mais baixo,
         * junto com suas alturas.
         */

//        int numero = 0;
//        int numeroAlto = 0;
//        int numeroBaixo = 0;
//        double altura = 0;
//        double maior = Integer.MIN_VALUE;
//        double menor = Integer.MAX_VALUE;
//
//        for(int i = 0; i < 10; i++) {
//            System.out.printf("Digite o número do aluno %d", (i+1));
//            numero = scan.nextInt();
//            System.out.printf("Digite a altura do aluno %d", (i+1));
//            altura = scan.nextDouble();
//
//            if(altura > maior) {
//                maior = altura;
//                numeroAlto = numero;
//            }
//            if(altura < menor) {
//                menor = altura;
//                numeroBaixo = numero;
//            }
//        }
//        System.out.println("Número do aluno mais alto: " + numeroAlto + "\nAltura: " + maior);
//        System.out.println("Número do aluno mais baixo: " + numeroBaixo + "\nAltura: " + menor);

        /**
         * .Foi feita uma estatística em cinco cidades brasileiras para coletar
         * dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
         * . Código da cidade;
         * a. Número de veículos de passeio (em 1999);
         * b. Número de acidentes de trânsito com vítimas (em
         * 1999). Deseja-se saber:
         * c. Qual o maior e menor índice de acidentes de transito e a que
         * cidade pertence;
         * d. Qual a média de veículos nas cinco cidades juntas;
         * e. Qual a média de acidentes de trânsito nas cidades com menos
         * de 2.000 veículos de passeio.
         */

//        int maiorIndice = Integer.MIN_VALUE;
//        int menorIndice = Integer.MAX_VALUE;
//        int codigo = 0;
//        int veiculos = 0;
//        int acidentes = 0;
//        int codigoMaiorIndice = 0;
//        int codigoMenorIndice = 0;
//        int totalVeiculos = 0;
//        int cidadesMenosDe2000 = 0;
//        int acidentesCidadesMenos2000 = 0;
//        double mediaVeiculos = 0;
//        double mediaAcidentes = 0;
//
//        for(int i = 0; i < 5; i++) {
//            System.out.printf("Digite o código da cidade %d", (i+1));
//            codigo = scan.nextInt();
//            System.out.println("Digite o número de veículos:");
//            veiculos = scan.nextInt();
//            System.out.println("Digite o número de acidentes");
//            acidentes = scan.nextInt();
//
//            if(acidentes > maiorIndice) {
//                maiorIndice = acidentes;
//                codigoMaiorIndice = codigo;
//            }
//            if(acidentes < menorIndice) {
//                menorIndice = acidentes;
//                codigoMenorIndice = codigo;
//            }
//
//            totalVeiculos += veiculos;
//
//            if(veiculos < 2000) {
//                cidadesMenosDe2000++;
//                acidentesCidadesMenos2000++;
//            }
//        }
//        mediaVeiculos = totalVeiculos / 5;
//        mediaAcidentes = acidentesCidadesMenos2000 / cidadesMenosDe2000;
//
//        System.out.println("Maior indice de acidentes: " + maiorIndice + "Código da cidade: " + codigoMaiorIndice);
//        System.out.println("Menor indice de acidentes: " + menorIndice + "Código da cidade: " + codigoMenorIndice);
//        System.out.println("Média de veículos: " + mediaVeiculos);
//        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mediaAcidentes);

        /**
         * Faça um programa que receba o valor de uma dívida e mostre uma
         * tabela com os seguintes dados: valor da dívida, valor dos juros,
         * quantidade de parcelas e valor da parcela.
         * o Os juros e a quantidade de parcelas seguem a tabela abaixo:
         * Quantidade de Parcelas % de Juros sobre o valor inicial da dívida
         * 1 0
         * 3 10
         * 6 15
         * 9 20
         * 12 25
         * Exemplo de saída do programa:
         * Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela
         * R$ 1.000,00 0 1 R$ 1.000,00
         * R$ 1.100,00 100 3 R$ 366,00
         * R$ 1.150,00 150 6 R$ 191,67
         */

//    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//    int soma = 0;
//    for(int i = 0; i < array.length; i++) {
//        soma += array[i];
//    }
//        System.out.println(soma);
//    }

        //array = lista de n elementos
        //matriz = lista de n x m elementos
        //matriz == array de arrays

//        double[][] notasAlunos = new double[3][4];
//
//        notasAlunos[0][0] = 9.1;
//        notasAlunos[0][1] = 8.6;
//        notasAlunos[0][2] = 8.0;
//        notasAlunos[0][3] = 7.5;
//
//        notasAlunos[1][0] = 9;
//        notasAlunos[1][1] = 8;
//        notasAlunos[1][2] = 7;
//        notasAlunos[1][3] = 7.75;
//
//        notasAlunos[2][0] = 10;
//        notasAlunos[2][1] = 9.4;
//        notasAlunos[2][2] = 7;
//        notasAlunos[2][3] = 7.6;
//
//        double soma = 0;
//
//        for(int i = 0; i < notasAlunos.length; i++){
//            for(int j = 0; j < notasAlunos[i].length; j++){
//                soma += notasAlunos[i][j];
//                System.out.println(notasAlunos[i][j] + "");
//            }
//            System.out.println(" ");
//            System.out.println("Soma: " + soma);
//        }

//        int [][][] matrizCubo = new int[3][3][3];
//        int somaCubo = 0;
//        int somaPares = 0;
//        int somaImpares = 0;
//
//        for(int i = 0; i < matrizCubo.length; i++) {
//            for(int j = 0; j < matrizCubo[i].length; j++){
//                for(int k = 0; k < matrizCubo[i][j].length; k++){
//                    matrizCubo[i][j][k] = i + j + k;
//                }
//            }
//        }
//
//        for(int i = 0; i < matrizCubo.length; i++) {
//            for(int j = 0; j < matrizCubo[i].length; j++){
//                for(int k = 0; k < matrizCubo[i][j].length; k++){
//                    somaCubo += matrizCubo[i][j][k];
//
//                    if(matrizCubo[i][j][k] % 2 == 0) {
//                        somaPares += matrizCubo[i][j][k];
//                    } else {
//                        somaImpares += matrizCubo[i][j][k];
//                    }
//                }
//            }
//        }
//        System.out.println("Soma total: " + somaCubo);
//        System.out.println("Soma pares: " + somaPares);
//        System.out.println("Soma ímpares: " + somaImpares);

        //matrizes ou arrays irregulares
        System.out.println("Digite o número de pessoas que serão entrevistadas");
        int numEntrevistados = scan.nextInt();
        String[][] nomesFilhos = new String[numEntrevistados][];

        for(int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Digite a quantidade de filhos:");
            int qtdFilhos = scan.nextInt();
            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println("Digite o nome do filho " + (j + 1));
                nomesFilhos[i][j] = scan.next();
            }
        }
        for(int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filhos");
            for(int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }


}
