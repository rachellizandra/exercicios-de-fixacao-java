package LogicaDeProgramacaoI.Loops.ExerciciosDiversos;
import java.util.Scanner;

public class questao29Ao38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**
         * O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,
         * com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente
         * deve pagar ele desenvolveu um tabela que contém o número de itens
         * que o cliente comprou e ao lado o valor da conta. Desta forma a
         * atendente do caixa precisa apenas contar quantos itens o cliente está
         * levando e olhar na tabela de preços. Você foi contratado para
         * desenvolver o programa que monta esta tabela de preços, que conterá
         * os preços de 1 até 50 produtos, conforme o exemplo abaixo:
         *  Lojas Quase Dois - Tabela de preços
         * o 1 - R$ 1.99
         * o 2 - R$ 3.98
         * o ...
         * o 50 - R$ 99.50
         */

//        System.out.println("Quantos itens o cliente vai comprar?");
//        int qtdItens = scan.nextInt();
//        double valorUnitario = 1.99;
//        double produto = 0;
//
//        if(qtdItens <= 50) {
//            System.out.println("Loja Quase Dois - Tabela de preços");
//            for(int i = 1; i <= qtdItens; i++) {
//                produto = valorUnitario * i;
//                System.out.println("- " + i + " unid R$ " + produto);
//            }
//        } else {
//            System.out.println("Verifique tabela para compras acima de 50 unidades");
//        }

        /**
         * .O Sr. Manoel Joaquim expandiu seus negócios para além dos
         * negócios de 1,99 e agora possui uma loja de conveniências. Faça um
         * programa que implemente uma caixa registradora rudimentar. O
         * programa deverá receber um número desconhecido de valores
         * referentes aos preços das mercadorias. Um valor zero deve ser
         * informado pelo operador para indicar o final da compra. O programa
         * deve então mostrar o total da compra e perguntar o valor em dinheiro
         * que o cliente forneceu, para então calcular e mostrar o valor do troco.
         * Após esta operação, o programa deverá voltar ao ponto inicial, para
         * registrar a próxima compra. A saída deve ser conforme o exemplo
         * abaixo:
         * o Lojas Tabajara
         * o Produto 1: R$ 2.20
         * o Produto 2: R$ 5.80
         * o Produto 3: R$ 0
         * o Total: R$ 9.00
         * o Dinheiro: R$ 20.00
         * o Troco: R$ 11.00
         */

//        double total = 0;
//        int produto = 0;
//        double valor = 0;
//
//        while(true) {
//            produto++;
//            System.out.printf("Digite o valor do produto %d", produto);
//            valor = scan.nextDouble();
//
//            if(valor == 0) {
//                break;
//            } else {
//                total += valor;
//            }
//        }
//        System.out.println("Valor dado em dinheiro:");
//        double dinheiro = scan.nextDouble();
//        double troco = dinheiro - total;
//
//        System.out.println("Lojas Tabajara");
//        for(int i = 0; i < valor; i++) {
//            System.out.printf("Produto %d: ", (i + 1));
//        }
//        System.out.println("Total de produtos: " + produto);
//        System.out.println("- Total: R$ " + total + "\n- Dinheiro: R$ " + dinheiro + "\n- Troco: R$ " + troco);

        /**
         * .O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
         * implantar a metodologia da tabelinha, que já é um sucesso na sua loja
         * de 1,99. Você foi contratado para desenvolver o programa que monta
         * a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
         * informado pelo usuário, conforme o exemplo abaixo:
         * o Preço do pão: R$ 0.18
         * o Panificadora Pão de Ontem - Tabela de preços
         * o 1 - R$ 0.18
         * o 2 - R$ 0.36
         * o ...
         * o 50 - R$ 9.00
         */

//        System.out.println("Digite quantos serão comprados:");
//        int qtdPaes = scan.nextInt();
//        double valorUnit = 0.18;
//        double produto = 0;
//
//        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
//        if(qtdPaes <= 50) {
//            for(int i = 0; i <= qtdPaes; i++) {
//                produto = i * valorUnit;
//                System.out.println("° " + i + " - R$ " + produto);
//            }
//        } else {
//            System.out.println("Verifique tabela para compras acima de 50 unidades");
//        }

        /**
         * Faça um programa que calcule o fatorial de um número inteiro
         * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
         * conforme o exemplo abaixo:
         * o Fatorial de: 5
         * o 5! = 5 . 4 . 3 . 2 . 1 = 120
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
//        System.out.println("Fatorial de: " + numero);
//        System.out.println(numero + "!" +" = "+ fatorial);

        /**
         * O Departamento Estadual de Meteorologia lhe contratou para
         * desenvolver um programa que leia as um conjunto indeterminado de
         * temperaturas, e informe ao final a menor e a maior temperaturas
         * informadas, bem como a média das temperaturas.
         */

//        System.out.println("Informe a quantidade de temperaturas que deseja:");
//        int qtdTemp = scan.nextInt();
//
//        double maior = Integer.MIN_VALUE;
//        double menor = Integer.MAX_VALUE;
//        double valor = 0;
//        double soma = 0;
//        double media = 0;
//
//        for(int i = 0; i < qtdTemp; i++){
//            System.out.printf("Digite a temperatura %d", (i+1));
//            valor = scan.nextDouble();
//
//            if(valor > maior) {
//                maior = valor;
//            } else if (valor < menor) {
//                menor = valor;
//            }
//            soma += valor;
//        }
//        media = soma / qtdTemp;
//
//        System.out.println("Maior temperatura: " + maior + "°C");
//        System.out.println("Menor temperatura: " + menor + "°C");
//        System.out.printf("Media: %2s", media + "°C");

        /**
         * Os números primos possuem várias aplicações dentro da
         * Computação, por exemplo na Criptografia. Um número primo é aquele
         * que é divisível apenas por um e por ele mesmo. Faça um programa
         * que peça um número inteiro e determine se ele é ou não um número
         * primo.
         */

//        System.out.println("Digite um numero:");
//        int num = scan.nextInt();
//        boolean primo = true;
//
//        for(int i = 2; i < num; i++){
//            if(num % i == 0) {
//                System.out.println("não é primo - divisível por " + i);
//                primo = false;
//            }
//        }
//        if(primo) {
//            System.out.println("É um numero primo");
//        }

        /**
         * Encontrar números primos é uma tarefa difícil. Faça um programa que
         * gera uma lista dos números primos existentes entre 1 e um número
         * inteiro informado pelo usuário.
         */

//        System.out.println("Digite um numero inteiro");
//        int num = scan.nextInt();
//        boolean primo;
//
//        for(int i = 1; i <= num; i++) {
//            primo = true;
//            for(int j = 2; j < i; j++) {
//                if(i % j == 0) {
//                    System.out.println(i + " não é primo pois divisível por: " + j);
//                    primo = false;
//                }
//            }
//            if(primo) {
//                System.out.println(i);
//            }
//        }

        /**
         * Desenvolva um programa que faça a tabuada de um número qualquer
         * inteiro que será digitado pelo usuário, mas a tabuada não deve
         * necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
         * devem ser informados também pelo usuário, conforme exemplo
         * abaixo:
         */

//        System.out.println("Digite um numero para tabuada");
//        int num = scan.nextInt();
//
//        boolean invalido = true;
//        int numFinal, numInicial;
//
//        do{
//            System.out.println("Digite um numero inicial");
//            numInicial = scan.nextInt();
//
//            System.out.println("Digite um numero final");
//            numFinal = scan.nextInt();
//
//            if(numFinal > numInicial) {
//                break;
//            }
//        } while(invalido);
//
//        System.out.println("Tabuada de " + num + ":");
//        System.out.println("Começar por: " + numInicial);
//        System.out.println("Terminar em: " + numFinal);
//        System.out.println();
//
//        for(int i = numInicial; i <= numFinal; i++) {
//            System.out.println(num + " x " + i + " = " + (num*i));
//        }

        /**
         * Uma academia deseja fazer um senso entre seus clientes para
         * descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para
         * isto você deve fazer um programa que pergunte a cada um dos
         * clientes da academia seu código, sua altura e seu peso. O final da
         * digitação de dados deve ser dada quando o usuário digitar 0 (zero) no
         * campo código. Ao encerrar o programa também deve ser informados
         * os códigos e valores do cliente mais alto, do mais baixo, do mais gordo
         * e do mais magro, além da média das alturas e dos pesos dos clientes
         */
//
//        System.out.println("Informe a quantidade de clientes");
//        int qtdClientes = scan.nextInt();
//
//        double altura = 0;
//        double peso = 0;
//        boolean naoTerminar = true;
//        int codigo;
//        int codigoMaisAlto = 0;
//        int codigoMaisBaixo = 0;
//        int codigoMaisGordo = 0;
//        int codigoMaisMagro = 0;
//        double maiorAltura = Integer.MIN_VALUE;
//        double menorAltura = Integer.MAX_VALUE;
//        double maiorPeso = Integer.MIN_VALUE;
//        double menorPeso = Integer.MAX_VALUE;
//        double somaAltura = 0;
//        double somaPeso = 0;
//        double mediaAltura = 0;
//        double mediaPeso = 0;
//
//        while(naoTerminar) {
//            System.out.println("Digite o código do cliente");
//            codigo = scan.nextInt();
//            if(codigo == 0) {
//                break;
//            }
//            qtdClientes++;
//
//            System.out.println("Digite o valor da sua altura em metros");
//            altura = scan.nextDouble();
//            System.out.println("Digite o valor do seu peso em kg:");
//            peso = scan.nextDouble();
//
//            if(altura > maiorAltura) {
//                maiorAltura = altura;
//                codigoMaisAlto = codigo;
//            } else if (altura < menorAltura) {
//                menorAltura = altura;
//                codigoMaisBaixo = codigo;
//            }
//
//            if(peso > maiorPeso) {
//                maiorPeso = peso;
//                codigoMaisGordo = codigo;
//            } else if (peso < menorPeso) {
//                menorPeso = peso;
//                codigoMaisMagro = codigo;
//            }
//            somaAltura += altura;
//            somaPeso += peso;
//
//        }
//
//        mediaAltura = somaAltura / qtdClientes;
//        mediaPeso = somaPeso / qtdClientes;
//
//        System.out.println("Cliente mais alto: " + maiorAltura + " Código: " + codigoMaisAlto);
//        System.out.println("Cliente mais baixo: " + menorAltura + " Código: " + codigoMaisBaixo);
//        System.out.println("Cliente mais magro: " + menorPeso + " Código: " + codigoMaisMagro);
//        System.out.println("Cliente mais gordo: " + maiorPeso + " Código: " + codigoMaisGordo);
//        System.out.println("Média das alturas:" + mediaAltura );
//        System.out.println("Média dos pesos" + mediaPeso);

        /**
         * Um funcionário de uma empresa recebe aumento salarial anualmente:
         * Sabe-se que:
         * Esse funcionário foi contratado em 1995, com salário inicial de
         * R$ 1.000,00;
         * a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
         * b. A partir de 1997 (inclusive), os aumentos salariais sempre
         * correspondem ao dobro do percentual do ano anterior. Faça um
         * programa que determine o salário atual desse funcionário. Após
         * concluir isto, altere o programa permitindo que o usuário digite o
         * salário inicial do funcionário.
         */

//        double salario = 1000.00;
//        int ano = 1997;
//        System.out.println("Digite o ano atual:");
//        int anoAtual = scan.nextInt();
//        double aumento = 0.015;
//
//        double novoSalario = salario + (aumento * salario);
//
//        while (ano <= anoAtual) {
//            aumento = 2 * aumento;
//            novoSalario = novoSalario + (aumento * novoSalario);
//            ano++;
//        }
//        System.out.println("O salário em " + anoAtual + " é " + novoSalario + " reais.");

    }

}
