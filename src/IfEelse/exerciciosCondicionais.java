package IfEelse;

import java.util.Scanner;

public class exerciciosCondicionais {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**
         * . Escreva um algoritmo em JAVA que leia um número e informe se ele é divisível por
         * 10, por 5 ou por 2 ou se não é divisível por nenhum deles.
         */

//        System.out.println("Digite um numero:");
//        int numero = scan.nextInt();
//
//        if(numero % 10 == 0) {
//            System.out.println("É divisível por 10");
//        } else if(numero % 5 == 0) {
//            System.out.println("É divisível por 5");
//        } else if(numero % 2 == 0) {
//            System.out.println("É divisível por 2");
//        } else {
//            System.out.println("Não é divisível por 10, por 5 e nem por 2");
//        }

        /**
         * Construa um algoritmo em JAVA para determinar se o indivíduo esta com um peso
         * favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é
         * definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do
         * indivíduo. Ou seja IMC = peso/altura^2
         */

//        System.out.println("Digite seu peso:");
//        double peso = scan.nextDouble();
//
//        System.out.println("Digite sua altura:");
//        double altura = scan.nextDouble();
//
//        double imc = 0;
//
//        imc = peso / (altura * altura);
//
//        if(imc < 20) {
//            System.out.println("ABAIXO DO PESO");
//        } else if(imc > 20 && imc <= 25) {
//            System.out.println("PESO NORMAL");
//        } else if (imc > 25 && imc <= 30) {
//            System.out.println("SOBRE O PESO");
//        } else if (imc > 30 && imc <= 40) {
//            System.out.println("OBESO");
//        }  else if (imc > 40) {
//            System.out.println("OBESO MÓRBIDO");
//        }

        /**
         * A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo com
         * o saldo médio no último ano. Fazer um algoritmo em JAVA que leia o saldo
         * médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir.
         * Imprimir uma mensagem informando o saldo médio e o valor de crédito.
         */

//        System.out.println("Digite seu saldo médio");
//        double saldoMedio = scan.nextDouble();
//        double valorCredito = 0;
//
//        if(saldoMedio <= 500) {
//            valorCredito = 0;
//            System.out.println("Você não receberá credito");
//        } else if (saldoMedio > 500 && saldoMedio <= 1000) {
//            valorCredito = saldoMedio + (saldoMedio * 0.3);
//        } else if (saldoMedio > 1000 && saldoMedio <= 3000) {
//            valorCredito = saldoMedio + (saldoMedio * 0.4);
//        } else if (saldoMedio > 3000) {
//            valorCredito = saldoMedio + (saldoMedio * 0.5);
//        }
//        System.out.println("Seu saldo médio é: " + saldoMedio);
//        System.out.println("O valor de credito recebido será: " + valorCredito);

        /**
         * Crie um algoritmo em JAVA que leia a idade de uma pessoa e informe a sua
         * classe eleitoral:
         *  não eleitor (abaixo de 16 anos);
         *  eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
         *  eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).
         */

//        System.out.println("Digite sua idade:");
//        int idade = scan.nextInt();
//
//        if(idade < 16) {
//            System.out.println("Não é eleitor ainda");
//        } else if(idade >= 18 && idade <= 65) {
//            System.out.println("Eleitor obrigatório");
//        } else if (idade >= 16 && idade < 18 || idade > 65 ){
//            System.out.println("Eleitor facultativo");
//        }

        /**
         * Criar um algoritmo em JAVA que informe a quantidade total de calorias de uma
         * refeição a partir do usuário que deverá informar o prato, a sobremesa e a bebida (veja
         * a tabela a seguir).
         *
         * Sugestão: enumere cada opção de prato, sobremesa e bebida. Ou seja: Prato: 1 -
         * vegetariano, 2 – Peixe, 3 – Frango, 4 – Carne; Sobremesa: 1 – Abacaxi, 2 – Sorvete diet, 3 –
         * Mouse diet, 4 – Mouse chocolate; Bebida: 1 – Chá, 2 - Suco de laranja, 3 – Suco de melão,
         * 4 – Refrigerante diet.
         */

//        System.out.println("Digite o numero do prato que deseja");
//        System.out.println("1- Vegetariano");
//        System.out.println("2- Peixe");
//        System.out.println("3- Frango");
//        System.out.println("4- Carne");
//        int prato = scan.nextInt();
//
//        System.out.println("Digite o numero da sobremesa que deseja");
//        System.out.println("1- Abacaxi");
//        System.out.println("2- Sorvete Diet");
//        System.out.println("3- Mousse diet");
//        System.out.println("4- Mousse chocolate");
//        int sobremesa = scan.nextInt();
//
//        System.out.println("Digite o numero da bebida que deseja");
//        System.out.println("1- Chá");
//        System.out.println("2- Suco de laranja");
//        System.out.println("3- Suco de limão");
//        System.out.println("4- Refrigerante Diet");
//        int bebida = scan.nextInt();
//
//        double caloriasPrato = 0;
//        double caloriasSobremesa = 0;
//        double caloriasBebida = 0;
//        double totalCalorias = 0;
//
//        if(prato == 1) {
//            caloriasPrato = 180;
//        } else if(prato == 2) {
//            caloriasPrato = 230;
//        } else if(prato == 3) {
//            caloriasPrato = 250;
//        } else if(prato == 4) {
//            caloriasPrato = 350;
//        }
//
//        if(sobremesa == 1) {
//            caloriasSobremesa = 75;
//        } else if(sobremesa == 2) {
//            caloriasSobremesa = 110;
//        } else if(sobremesa == 3) {
//            caloriasSobremesa = 170;
//        } else if (sobremesa == 4) {
//            caloriasSobremesa = 200;
//        }
//
//        if(bebida == 1) {
//            caloriasBebida = 20;
//        } else if(bebida == 2) {
//            caloriasBebida = 70;
//        } else if(bebida == 3) {
//            caloriasBebida = 100;
//        } else if (bebida == 4) {
//            caloriasBebida = 65;
//        }
//
//        totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;
//
//        System.out.println("O total de calorias dessa refeição será: " + totalCalorias);


        /**
         * Criar um algoritmo em PORTUGOL que leia o um número inteiro entre 1 e 7 e escreva o
         * dia da semana correspondente. Caso o usuário digite um número fora desse intervalo,
         * deverá aparecer uma mensagem informando que não existe dia da semana com esse
         * número.
         */

//        System.out.println("Digite um numero inteiro de 1 a 7");
//        int numero = scan.nextInt();
//
//        switch(numero) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sábado");
//                break;
//            default:
//                System.out.println("Numero inválido. Digite um numero de 1 a 7");
//                break;
//        }

        /**
         * Construa um algoritmo em JAVA que determine (imprima) se um dado número N
         * inteiro (recebido através do teclado) é PAR ou ÍMPAR.
         */

//        System.out.println("Digite um numero inteiro");
//        int numero = scan.nextInt();
//
//        if(numero % 2 == 0) {
//            System.out.println("É par");
//        } else {
//            System.out.println("É impar");
//        }

        /**
         * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
         * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
         * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
         */

//        System.out.println("Digite quantos anos, meses e dias você tem");
//        int anos = scan.nextInt();
//        int meses = scan.nextInt();
//        int dias = scan.nextInt();
//
//        dias = (anos * 365) + (meses * 30) + dias;
//        System.out.println(dias + " dias");

        /**
         * Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
         * números 4, 5 e 6. A soma das duas médias. A média das médias.
         */
//        int num1 = 8;
//        int num2 = 9;
//        int num3 = 7;
//
//        int num4 = 4;
//        int num5 = 5;
//        int num6 = 6;
//
//        float media1 = (num1 + num2 + num3) / 3;
//        float media2 = (num4 + num5 + num6) / 3;
//
//        float mediaDasMedias = (media1 + media2) / 2;
//
//        System.out.println("Media 1: " + media1);
//        System.out.println("Media 2: " + media2);
//        System.out.println("Media das medias: " + mediaDasMedias);

        /**
         * Escrever um algoritmo que lê:
         * - a porcentagem do IPI a ser acrescido no valor das peças
         * - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
         * - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
         * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
         * Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
         */

//        System.out.println("Digite a porcentagem do IPI:");
//        int ipi = scan.nextInt();
//
//        System.out.println("Digite o código da peça:");
//        System.out.println("1- Peça 1");
//        System.out.println("2- Peça 2");
//        int peca = scan.nextInt();
//
//        int quant1 = 0;
//        int quant2 = 0;
//
//        double valor1 = 65.50;
//        double valor2 = 49.90;
//
//        double resultado = 0;
//
//        if(peca == 1)  {
//            System.out.println("Quantas peças deseja?");
//            quant1 = scan.nextInt();
//        } else if(peca == 2) {
//            System.out.println("Quantas peças deseja?");
//            quant2 = scan.nextInt();
//        }
//        resultado = ((valor1*quant1) + (valor2*quant2))*(ipi/100 + 1);
//        System.out.println("O valor total da compra é: " + resultado + " reais.");

        /**
         * Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
         * calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
         * (1SM=R$788,00)
         */
//        double salarioMinimo;
//        double seuSalario;
//        double qtdSalariosMinimos;
//
//        System.out.println("Digite o valor do salário mínimo: ");
//        salarioMinimo = scan.nextDouble();
//
//        System.out.println("Digite o seu salario: ");
//        seuSalario = scan.nextDouble();
//
//
//        qtdSalariosMinimos = seuSalario / salarioMinimo;
//
//        if (seuSalario > salarioMinimo) {
//            System.out.println((int) qtdSalariosMinimos + "SM=R$" + (seuSalario - salarioMinimo));
//        } else {
//            System.out.println("Faltam R$" + ((seuSalario - salarioMinimo) * -1) + " reais para você alcançar o salário mínimo");
//        }

        /**
         * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
         * antecessor e seu sucessor.
         */
        System.out.println("Digite um número");
        int num= scan.nextInt();

        int antecessor=0;
        int sucessor=0;

        antecessor = num -1;
        sucessor = num +1;

        System.out.println("O antecessor de " + num + " é " + antecessor);
        System.out.println("O sucessor de " + num + " é " + sucessor);

    }
}
