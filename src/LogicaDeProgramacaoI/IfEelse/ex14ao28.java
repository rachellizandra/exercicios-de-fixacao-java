package LogicaDeProgramacaoI.IfEelse;

import java.util.Scanner;

public class ex14ao28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**
         * .Faça um programa que lê as duas notas parciais obtidas por um aluno
         * numa disciplina ao longo de um semestre, e calcule a sua média. A
         * atribuição de conceitos obedece à tabela abaixo:
         * o Média de Aproveitamento Conceito
         * o Entre 9.0 e 10.0 A
         * o Entre 7.5 e 9.0 B
         * o Entre 6.0 e 7.5 C
         * o Entre 4.0 e 6.0 D
         * o Entre 4.0 e zero E
         */

//        System.out.println("Digite a primeira nota do aluno: ");
//        float nota1 = scan.nextFloat();
//        System.out.println("Digite a segunda nota do aluno: ");
//        float nota2 = scan.nextFloat();
//        float media = 0f;
//
//        media = (nota1 + nota2)/2;
//
//        if(media > 9.0 && media < 10.0) {
//            System.out.println("A | media: " + media);
//        } else if (media <= 9.0 && media > 7.5) {
//            System.out.println("B | media: " + media);
//        } else if(media <= 7.5 && media > 6.0) {
//            System.out.println("C | media: " + media);
//        } else if(media <= 6.0 && media > 4.0) {
//            System.out.println("D | media: " + media);
//        } else if(media <= 4.0 && media > 0) {
//            System.out.println("E | media: " + media);
//        }
//
//        if(media >= 6.0 && media <= 10) {
//            System.out.println("APROVADO");
//        } else {
//            System.out.println("REPROVADO");
//        }

        /**
         * Faça um Programa que peça os 3 lados de um triângulo. O programa
         * deverá informar se os valores podem ser um triângulo. Indique, caso
         * os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
         * escaleno.
         * o Dicas:
         * o Três lados formam um triângulo quando a soma de quaisquer
         * dois lados for maior que o terceiro;
         * o Triângulo Equilátero: três lados iguais;
         * o Triângulo Isósceles: quaisquer dois lados iguais;
         * o Triângulo Escaleno: três lados diferentes;
         *
         */

//        System.out.println("Digite as dimensões de um triângulo:");
//        int lado1 = scan.nextInt();
//        int lado2 = scan.nextInt();
//        int lado3 = scan.nextInt();
//
//        if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado3 + lado1 > lado2)) {
//            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
//                System.out.println("É um triangulo equilatero");
//            } else if ((lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado2 != lado1) || (lado3 == lado1 && lado3 != lado2)) {
//                System.out.println("É um triangulo isoceles");
//            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
//                System.out.println("É um triangulo escaleno");
//            } else {
//                System.out.println("Não é um triangulo");
//            }

        /**
         * Faça um Programa que leia um número inteiro menor que 1000 e
         * imprima a quantidade de centenas, dezenas e unidades do mesmo.
         * o Observando os termos no plural a colocação do "e", da vírgula
         * entre outros. Exemplo:
         * o 326 = 3 centenas, 2 dezenas e 6 unidades
         * o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
         * 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
         */

//        System.out.println("Digite um numero inteiro");
//        int numero = scan.nextInt();
//
//        if(numero > 0) {
//            // Extraindo a unidade
//            int unidade = numero % 10;
//
//            //Eliminando a unidade de nosso número
//            numero = (numero - unidade)/10;
//
//            //Extraindo a dezena
//            int dezena = numero % 10;
//
//            //Eliminando a dezena do número original, fica a centena
//            numero = (numero - dezena)/10;
//            int centena = numero;
//
//            System.out.println(numero + ", centena: " + centena + ", dezena " + dezena + ", unidades " + unidade);
//        } else {
//            System.out.println("Digite um numero positivo");
//        }

        /**
         * Faça um programa que calcule as raízes de uma equação do segundo
         * grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
         * b e c e fazer as consistências, informando ao usuário nas seguintes
         * situações:
         * a. Se o usuário informar o valor de A igual a zero, a equação não é
         * do segundo grau e o programa não deve fazer pedir os demais
         * valores, sendo encerrado;
         * b. Se o delta calculado for negativo, a equação não possui raizes
         * reais. Informe ao usuário e encerre o programa;
         * c. Se o delta calculado for igual a zero a equação possui apenas
         * uma raiz real; informe-a ao usuário;
         * d. Se o delta for positivo, a equação possui duas raiz reais;
         * informe-as ao usuário;
         */
//        System.out.println("Digite o valor de a:");
//        int a = scan.nextInt();
//
//
//        if (a == 0) {
//            System.out.println("A equação não é do segundo grau");
//        } else {
//
//            System.out.println("Digite o valor de b:");
//            int b = scan.nextInt();
//            System.out.println("Digite o valor de c:");
//            int c = scan.nextInt();
//
//            double delta = (b * b) - (4 * a * c);
//             double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
        //     double x2 = ((-b) - Math.sqrt(delta)) / (2*a);

//            if (delta < 0) {
//                System.out.println("A equação não possui raízes reais");
//            } else if (delta == 0) {
//                System.out.println("A equação possui apenas uma raiz real");
//            } else if (delta > 0) {
//                System.out.println("A equação possui duas raizes reais");
//            }
//        }

        /**
         *Faça um Programa que peça um número correspondente a um
         * determinado ano e em seguida informe se este ano é ou não bissexto.
         */
//        System.out.println("Digite um ano:");
//        int ano = scan.nextInt();
//
//        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
//            System.out.println("É bissexto");
//        } else {
//            System.out.println("Não é bissexto");
//        }


        /**
         * Faça um Programa que peça uma data no formato dd/mm/aaaa e
         * determine se a mesma é uma data válida.
         */

//        System.out.println("Digite uma data no formato dd/mm/aaaa");
//        int dd = scan.nextInt();
//        int mm = scan.nextInt();
//        int aa = scan.nextInt();
//
//        System.out.printf("%2d/%2d/%4d", dd, mm, aa);
//
//        System.out.println();
//
//        //para checar o ano
//
//        if(aa >= 1900 && aa <= 9999) {
//            //para checar o mês
//            if(mm >= 1 && mm <= 12) {
//                // para checar o dia
//                if((dd >= 1 && dd <= 31) && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)) {
//                    System.out.println("Essa data é válida");
//                } else if ((dd >= 1 && dd <= 30) && (mm == 4 || mm == 6 || mm == 9 || mm == 11)) {
//                    System.out.println("Essa data é válida");
//                } else if((dd >= 1 && dd <= 28) && (mm == 2)) {
//                    System.out.println("Essa data é válida");
//                } else if(dd == 29 && mm == 2 && (aa % 400 == 0 || (aa % 4 == 0 && aa % 100 != 0))) {
//                    System.out.println("Essa data é válida");
//                } else {
//                    System.out.println("Essa data não é válida");
//                }
//            } else {
//                System.out.println("Esse mês não é válido");
//            }
//        } else {
//            System.out.println("Essa data não é válida");
//        }

        /**
         * Faça um Programa para um caixa eletrônico. O programa deverá
         * perguntar ao usuário a valor do saque e depois informar quantas notas
         * de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5,
         * 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600
         * reais. O programa não deve se preocupar com a quantidade de notas
         * existentes na máquina.
         * . Exemplo 1: Para sacar a quantia de 256 reais, o programa
         * fornece duas notas de 100, uma nota de 50, uma nota de 5 e
         * uma nota de 1;
         * a. Exemplo 2: Para sacar a quantia de 399 reais, o programa
         * fornece três notas de 100, uma nota de 50, quatro notas de 10,
         * uma nota de 5 e quatro notas de 1.
         */
        //REFAZER
//        System.out.println("Digite o valor que deseja sacar");
//        int valor = scan.nextInt();
//
//        if(valor < 10 || valor > 600) {
//            System.out.println("O valor mínimo é 10 reais e máximo de 600 reais");
//        } else {
//            int notaDe100 = valor % 100;
//            int notaDe50 = valor % 50;
//            int notaDe10 = valor % 10;
//            int notaDe5 = valor % 5;
//            int notaDe1 = valor % 1;
//
//            if (notaDe100 > 0 && notaDe50 > 0 && notaDe10 > 0 && notaDe5 > 0 && notaDe1 > 0) {
//                System.out.println("cem: " + notaDe100 + "cinquenta: " + notaDe50 + "dez: " + notaDe10 + "cinco: " + notaDe5 + "um: " + notaDe1);
//            }
//        }

        /**
         * Faça um Programa que peça um número inteiro e determine se ele é
         * par ou impar. Dica: utilize o operador módulo (resto da divisão).
         */

//        System.out.println("Digite um numero inteiro:");
//        int numero = scan.nextInt();
//
//        if(numero % 2 != 0) {
//            System.out.println("É um numero impar");
//        } else {
//            System.out.println("É numero par");
//        }

        /**
         * Faça um Programa que peça um número e informe se o número é
         * inteiro ou decimal. Dica: utilize uma função de arredondamento.
         */

//        System.out.println("Digite um numero:");
//        double numero = scan.nextDouble();

        /**
         * Faça um Programa que leia 2 números e em seguida pergunte ao
         * usuário qual operação ele deseja realizar. O resultado da operação
         * deve ser acompanhado de uma frase que diga se o número é:
         * . par ou ímpar;
         * a. positivo ou negativo;
         * b. inteiro ou decimal.
         */

//        System.out.println("Digite o primeiro numero");
//        int num1 = scan.nextInt();
//
//        System.out.println("Digite o segundo numero");
//        int num2 = scan.nextInt();
//
//        System.out.println("Escolha a operação desejada");
//        String operacao = scan.next();
//
//        double resultado = 0;
//        boolean valida = true;
//
//        switch(operacao) {
//            case "+": resultado = num1 + num2; break;
//            case "-": resultado = num1 + num2; break;
//            case "*": resultado = num1 * num2; break;
//            case "/":
//                if(num2 == 0) {
//                    resultado = 0;
//                } else {
//                    resultado = num1 / num2;
//                }
//                break;
//            default:
//                System.out.println("Operação inválida");
//                valida = false;
//        }
//
//        if(valida) {
//            System.out.println("Resultado: " + resultado);
//            if(resultado >= 0) {
//                System.out.println("Resultado positivo");
//            } else {
//                System.out.println("Resultado negativo");
//            }
//
//            if(resultado % 2 == 0) {
//                System.out.println("Resultado par");
//            } else {
//                System.out.println("Resultado ímpar");
//            }
//        }

        /**
         * Faça um programa que faça 5 perguntas para uma pessoa sobre um
         * crime. As perguntas são:
         * . "Telefonou para a vítima?"
         * a. "Esteve no local do crime?"
         * b. "Mora perto da vítima?"
         * c. "Devia para a vítima?"
         * d. "Já trabalhou com a vítima?" O programa deve no final emitir
         * uma classificação sobre a participação da pessoa no crime. Se
         * a pessoa responder positivamente a 2 questões ela deve ser
         * classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
         * como "Assassino". Caso contrário, ele será classificado como
         * "Inocente"
         */

//        System.out.println("Telefonou para a vítima?");
//        String resp1 = scan.next();
//
//        System.out.println("Esteve no local do crime?");
//        String resp2 = scan.next();
//
//        System.out.println("Mora perto da vítima?");
//        String resp3 = scan.next();
//
//        System.out.println("Devia para a vítima?");
//        String resp4 = scan.next();
//
//        System.out.println("Já trabalhou com a vítima?");
//        String resp5 = scan.next();
//
//        int cont = 0;
//
//        if(resp1.equalsIgnoreCase("S")) {
//            cont++;
//        }
//        if(resp2.equalsIgnoreCase("S")) {
//            cont++;
//        }
//        if(resp3.equalsIgnoreCase("S")) {
//            cont++;
//        }
//        if(resp4.equalsIgnoreCase("S")) {
//            cont++;
//        }
//        if(resp5.equalsIgnoreCase("S")) {
//            cont++;
//        }
//
//        if(cont == 2) {
//            System.out.println("SUSPEITO");
//        } else if(cont == 3 || cont == 4) {
//            System.out.println("CUMPLICE");
//        } else if (cont == 5) {
//            System.out.println("ASSASSINO");
//        } else if(cont == 0) {
//            System.out.println("INOCENTE");
//        }

        /**
         * .Um posto está vendendo combustíveis com a seguinte tabela de
         * descontos:
         * . Álcool:
         * a. até 20 litros, desconto de 3% por litro
         * b. acima de 20 litros, desconto de 5% por litro
         * Gasolina:
         * c. até 20 litros, desconto de 4% por litro
         * d. acima de 20 litros, desconto de 6% por litro Escreva um
         * algoritmo que leia o número de litros vendidos, o tipo de
         * combustível (codificado da seguinte forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo cliente
         * sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
         * do litro do álcool é R$ 1,90.
         */

//
//        System.out.println("Você deseja álcool ou gasolina?");
//        String combustivel = scan.next();
//
//        System.out.println("Quantos litros?");
//        double litrosTotais = scan.nextDouble();
//
//        double alcool = 1.9;
//        double gasolina = 2.5;
//
//        //para álcool
//        double desconto1 = 0.03;
//        double desconto2 = 0.05;
//
//        //para álcool
//        double desconto3 = 0.04;
//        double desconto4 = 0.06;
//
//        double valorFinal = 0;
//
//        if(combustivel.equalsIgnoreCase("A")) {
//            if(litrosTotais <= 20) {
//                valorFinal = (litrosTotais * alcool) - (litrosTotais * alcool * desconto1);
//                System.out.println("Você pagará R$" + valorFinal + " reais");
//            } else if(litrosTotais > 20) {
//                valorFinal = (litrosTotais * alcool) - (litrosTotais * alcool * desconto2);
//                System.out.println("Você pagará R$" + valorFinal + " reais");
//            }
//        } else if(combustivel.equalsIgnoreCase("G")) {
//            if(litrosTotais <= 20) {
//                valorFinal = (litrosTotais * gasolina) - (litrosTotais * gasolina * desconto3);
//                System.out.println("Você pagará R$" + valorFinal + " reais");
//            } else if(litrosTotais > 20) {
//                valorFinal = (litrosTotais * gasolina) - (litrosTotais * gasolina * desconto4);
//                System.out.println("Você pagará R$" + valorFinal + " reais");
//            }
//        }

        /**
         *
         * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
         * Até 5 Kg Acima de 5 Kg
         * Morango R$ 2,50 por Kg R$ 2,20 por Kg
         * Maçã R$ 1,80 por Kg R$ 1,50 por Kg
         * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
         * compra ultrapassar R$ 25,00, receberá ainda um desconto de
         * 10% sobre este total. Escreva um algoritmo para ler a
         * quantidade (em Kg) de morangos e a quantidade (em Kg) de
         * maças adquiridas e escreva o valor a ser pago pelo cliente.
         */

//        System.out.println("Quantos kg de maçã você deseja?");
//        double maca = scan.nextDouble();
//        System.out.println("Quantos kg de morango você deseja?");
//        double morango = scan.nextDouble();
//
//        double totalPreco = 0;
//        double precoMaca = 0;
//        double precoMorango = 0;
//        double totalFrutas = maca + morango;
//
//        if(maca <= 5) {
//            precoMaca = 1.8;
//        } else if (maca > 5){
//            precoMaca = 1.5;
//        }
//
//        if(morango <= 5) {
//            precoMorango = 2.5;
//        } else if (morango > 5){
//            precoMorango = 2.2;
//        }
//
//        totalPreco = (maca * precoMaca) + (morango * precoMorango);
//
//        if(totalFrutas > 8 || totalPreco > 25) {
//            totalPreco = totalPreco - (totalPreco * 0.1);
//        }
//
//        System.out.println("O preço total foi:" + totalPreco);

        /**
         * O Hipermercado Tabajara está com uma promoção de carnes que é
         * imperdível. Confira:
         * o Até 5 Kg Acima de 5 Kg
         * o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
         * o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
         * o Picanha R$ 6,90 por Kg R$ 7,80 por Kg
         * Para atender a todos os clientes, cada cliente poderá levar
         * apenas um dos tipos de carne da promoção, porém não há
         * limites para a quantidade de carne por cliente. Se compra for
         * feita no cartão Tabajara o cliente receberá ainda um desconto
         * de 5% sobre o total a compra. Escreva um programa que peça
         * o tipo e a quantidade de carne comprada pelo usuário e gere
         * um cupom fiscal, contendo as informações da compra: tipo e
         * quantidade de carne, preço total, tipo de pagamento, valor do
         * desconto e valor a pagar.
         */

        System.out.println("Entre com o tipo da carne:");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipo = scan.nextInt();

        System.out.println("Entre com a quantidade (kg):");
        double qtd = scan.nextDouble();

        double precoKg = 0;

        if (tipo == 1){

            System.out.println(qtd + "kg - file duplo");

            if (qtd < 5){
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }


        } else if (tipo == 2){

            System.out.println(qtd + "kg - alcatra");

            if (qtd < 5){
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
        } else if (tipo == 3){

            System.out.println(qtd + "kg - picanha");

            if (qtd < 5){
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        }

        double total = qtd * precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão? digite 1 para sim:");
        int cartao = scan.nextInt();

        if (cartao == 1){
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }

    }
}

