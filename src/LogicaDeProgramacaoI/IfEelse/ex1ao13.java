package LogicaDeProgramacaoI.IfEelse;

import java.util.Scanner;

public class ex1ao13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**
         * Faça um Programa que peça dois números e imprima o maior deles
         *
         */

//        System.out.println("Digite o primeiro numero");
//        int num1 = scan.nextInt();
//
//        System.out.println("Digite o segundo numero");
//        int num2 = scan.nextInt();
//
//        if(num1 > num2){
//            System.out.println(num1 + " é maior que " + num2);
//        } else {
//            System.out.println(num2 + "é maior que " + num1);
//        }

        /**
         * Faça um Programa que peça um valor e mostre na tela se o valor é
         * positivo ou negativo
         */

//        System.out.println("Digite um numero");
//        int numero = scan.nextInt();
//
//        if(numero > 0) {
//            System.out.println(numero + " é positivo");
//        } else {
//            System.out.println(numero + " é negativo");
//        }

        /**
         *
         * Faça um Programa que verifique se uma letra digitada é "F" ou "M".
         * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
         */

//        System.out.println("Digite seu sexo: 'F' ou 'M'");
//        String input = scan.next();
//
//        if(input.equalsIgnoreCase("f")) {
//            System.out.println("F - feminino");
//        } else if(input.equalsIgnoreCase("m")) {
//            System.out.println("M - masculino");
//        } else {
//            System.out.println("Sexo inválido");
//        }


        /**
         * Faça um Programa que verifique se uma letra digitada é vogal ou
         * consoante.
         */

//                System.out.println("Digite uma letra");
//                String input = scan.next();
//
//                if(input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e") ||
//                input.equalsIgnoreCase("i") || input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u")) {
//            System.out.println("É vogal");
//        } else {
//            System.out.println("É consoante");
//        }

//        switch(input) {
//            case "a":
//            case "e":
//            case "i":
//            case "o":
//            case "u":
//                System.out.println("É vogal");
//                break;
//            default:
//                System.out.println("É consoante");
//                break;
//        }

        /**
         *
         * Faça um programa para a leitura de duas notas parciais de um aluno.
         * O programa deve calcular a média alcançada por aluno e apresentar:
         * o A mensagem "Aprovado", se a média alcançada for maior ou
         * igual a sete;
         * o A mensagem "Reprovado", se a média for menor do que sete;
         * o A mensagem "Aprovado com Distinção", se a média for igual a
         * dez.
         */

//        System.out.println("Digite a primeira nota do aluno: ");
//        float nota1 = scan.nextFloat();
//        System.out.println("Digite a segunda nota do aluno: ");
//        float nota2 = scan.nextFloat();
//        float media = 0f;
//
//        media = (nota1 + nota2)/2;
//
//        if(media == 10) {
//            System.out.println("APROVADO COM DISTINÇÃO");
//        } else if (media >= 7) {
//            System.out.println("APROVADO");
//        } else if(media < 7) {
//            System.out.println("REPROVADO");
//        }

        /**
         *
         * Faça um Programa que leia três números e mostre o maior deles.
         */

//        System.out.println("Digite o primeiro numero");
//        int num1 = scan.nextInt();
//
//        System.out.println("Digite o segundo numero");
//        int num2 = scan.nextInt();
//
//        System.out.println("Digite o terceiro numero");
//        int num3 = scan.nextInt();
//
//        if(num1 > num2 && num1 > num3){
//            System.out.println(num1 + " é maior que " + num2 + " e " + num3);
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println(num2 + " é maior que " + num1 + " e " + num3);
//        } else if(num3 > num1 && num3 > num2) {
//            System.out.println(num3 + " é maior que " + num1 + " e " + num2);
//        }

        /**
         *
         * Faça um Programa que leia três números e mostre o maior e o menor
         * deles.
         */


//        System.out.println("Digite o primeiro numero");
//        int num1 = scan.nextInt();
//
//        System.out.println("Digite o segundo numero");
//        int num2 = scan.nextInt();
//
//        System.out.println("Digite o terceiro numero");
//        int num3 = scan.nextInt();
//
//        if(num1 > num2 && num1 > num3){
//            System.out.println(num1 + " é maior que " + num2 + " e " + num3);
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println(num2 + " é maior que " + num1 + " e " + num3);
//        } else if(num3 > num1 && num3 > num2) {
//            System.out.println(num3 + " é maior que " + num1 + " e " + num2);
//        }
//
//        if(num1 < num2 && num1 < num3){
//            System.out.println(num1 + " é menor que " + num2 + " e " + num3);
//        } else if (num2 < num1 && num2 < num3) {
//            System.out.println(num2 + " é menor que " + num1 + " e " + num3);
//        } else if(num3 < num1 && num3 < num2) {
//            System.out.println(num3 + " é menor que " + num1 + " e " + num2);
//        }

        /**
         * Faça um programa que pergunte o preço de três produtos e informe
         * qual produto você deve comprar, sabendo que a decisão é sempre
         * pelo mais barato.
         */

//        System.out.println("Digite o preço do primeiro produto");
//        double preco1 = scan.nextDouble();
//
//        System.out.println("Digite o preço do segundo produto");
//        double preco2 = scan.nextDouble();
//
//        System.out.println("Digite o preço do terceiro produto");
//        double preco3 = scan.nextDouble();
//
//        if(preco1 < preco2 && preco1 < preco3){
//            System.out.println("Compre o produto 1");
//        } else if (preco2 < preco1 && preco2 < preco3) {
//            System.out.println("Compre o produto 2");
//        } else if(preco3 < preco1 && preco3 < preco2) {
//            System.out.println("Compre o produto 3");
//        }

        /**
         * Faça um Programa que pergunte em que turno você estuda. Peça
         * para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
         * mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
         * Inválido!", conforme o caso.
         */

//                System.out.println("Digite qual turno você estuda");
//                String input = scan.next();
//
//                if(input.equalsIgnoreCase("m")) {
//                    System.out.println("Bom dia!");
//                } else if (input.equalsIgnoreCase("v")) {
//                    System.out.println("Boa tarde!");
//                } else if (input.equalsIgnoreCase("n")) {
//                    System.out.println("Boa noite!");
//                } else {
//                    System.out.println("Valor inválido");
//                }

        /**
         * As Organizações Tabajara resolveram dar um aumento de salário aos
         * seus colaboradores e lhe contraram para desenvolver o programa que
         * calculará os reajustes.
         * o Faça um programa que recebe o salário de um colaborador e o
         * reajuste segundo o seguinte critério, baseado no salário atual:
         * o salários até R$ 280,00 (incluindo) : aumento de 20%
         * o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
         * o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
         * o salários de R$ 1500,00 em diante : aumento de 5% Após o
         * aumento ser realizado, informe na tela:
         * o o salário antes do reajuste;
         * o o percentual de aumento aplicado;
         * o o valor do aumento;
         * o o novo salário, após o aumento.
         */

//        System.out.println("Digite o salário do colaborador");
//        double salarioAnterior = scan.nextDouble();
//        double salarioReajustado = 0;
//        double aumento = 0;
//        double percentual;
//
//
//        if(salarioAnterior <= 280.00) {
//            percentual = 0.2;
//            aumento = salarioAnterior * percentual;
//            salarioReajustado = salarioAnterior + aumento;
//        } else if(salarioAnterior > 280.00 && salarioAnterior <= 700.00) {
//            percentual = 0.15;
//            aumento = salarioAnterior * percentual;
//            salarioReajustado = salarioAnterior + aumento;
//        } else if(salarioAnterior > 700.00 && salarioAnterior <= 1500.00) {
//            percentual = 0.05;
//            aumento = salarioAnterior * percentual;
//            salarioReajustado = salarioAnterior + aumento;
//        } else if (salarioAnterior > 1500.00) {
//            percentual = 0.05;
//            aumento = salarioAnterior * percentual;
//            salarioReajustado = salarioAnterior + aumento;
//        } else {
//            System.out.println("Digite um valor válido");
//        }
//
//        System.out.println("Salario antes do reajuste: "+ salarioAnterior);
//        System.out.println("Percentual aplicado: "+ (percentual * 100) + "%");
//        System.out.println("Aumento em reais: "+ aumento);
//        System.out.println("Salario depois do reajuste: "+ salarioReajustado);

        /**
         * Faça um programa para o cálculo de uma folha de pagamento,
         * sabendo que os descontos são do Imposto de Renda, que depende do
         * salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
         * FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
         * a empresa que deposita). O Salário Líquido corresponde ao Salário
         * Bruto menos os descontos. O programa deverá pedir ao usuário o
         * valor da sua hora e a quantidade de horas trabalhadas no mês.
         * o Desconto do IR:
         * o Salário Bruto até 900 (inclusive) - isento
         * o Salário Bruto até 1500 (inclusive) - desconto de 5%
         * o Salário Bruto até 2500 (inclusive) - desconto de 10%
         * o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
         * as informações, dispostas conforme o exemplo abaixo. No
         * exemplo o valor da hora é 5 e a quantidade de hora é 220.
         */

//        System.out.println("Informe quanto custa o valor da hora trabalhada");
//        double valorHora = scan.nextDouble();
//
//        System.out.println("Informe quantas horas você trabalha por mês");
//        int horasTrabalhadas = scan.nextInt();
//
//        double salarioBruto = valorHora * horasTrabalhadas;
//        double salarioLiquido = 0;
//        double percentual = 0;
////
//        if(salarioBruto <= 900.00) {
//            percentual = 0;
//        } else if(salarioBruto > 900.00 && salarioBruto <= 1500.00) {
//            percentual = 5;;
//        } else if(salarioBruto > 1500.00 && salarioBruto <= 2500.00) {
//            percentual = 10;
//        } else if(salarioBruto > 2500.00) {
//            percentual = 20;
//        }
//
//        double ir = (salarioBruto / 100) * percentual;
//        double inss = (salarioBruto / 100) * 10;
//        double fgts = (salarioBruto / 100) * 11;
//        double totalDescontos = ir + inss;
//        salarioLiquido = salarioBruto - totalDescontos;
//
//        System.out.println("Salario bruto: "+ salarioBruto);
//        System.out.println("Salario liquido: "+ salarioLiquido);

        /**
         * Faça um Programa que leia um número e exiba o dia correspondente
         * da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
         * aparecer valor inválido.
         */

        System.out.println("Digite um numero de 1 a 7");
        int input = scan.nextInt();

        switch(input) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Digite um numero valido");
                break;
        }
    }

}
