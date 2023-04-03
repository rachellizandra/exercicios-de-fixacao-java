package LogicaDeProgramacaoI.Loops.ExerciciosDiversos;

import java.util.Scanner;

public class questao3 {

    public static void main(String[] args) {
        /**
         * 3. Faça um programa que leia e valide as seguintes informações:
         *
         * a. Nome: maior que 3 caracteres;
         *
         * b. Idade: entre 0 e 150;
         *
         * c. Salário: maior que zero;
         *
         * d. Sexo: 'f' ou 'm';
         *
         * e. Estado Civil: 's', 'c', 'v', 'd';
         */

        Scanner scan = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        //int idade;
       //ouble salario;

        //(a)
//        System.out.println("Informe o seu nome:");
//        nome = scan.nextLine();
//
//        while(nome.length < 3) {
//            System.out.println("Nome muito curto Informe seu nome completo");
//            nome = scan.nextLine();
//        }

        //(b)
//        System.out.println("Digite sua idade que deve ser entre 0 e 150");
//        idade = scan.nextInt();
//
//        while(idade < 0 || idade > 150) {
//            System.out.println("ERRO: informe uma idade entre 0 e 150");
//            idade = scan.nextInt();
//        }
//        System.out.println("Sua idade é: " + idade);


        //(c)
//        System.out.println("Digite seu salário:");
//        salario = scan.nextDouble();
//
//        while(salario < 0) {
//            System.out.println("Salário menor do que 0!");
//            salario = scan.nextDouble();
//        }
//        System.out.println("Seu salário é:" + salario);

        //(d)
//        System.out.println("  Informe seu sexo: F -- M ");
//        sexo = scan.next();
//
//        while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")){
//            System.out.println("Sexo inválido, digite novamente");
//            sexo=scan.next();
//        }
//        System.out.println("Seu sexo é: " +sexo);


        //(e)
        System.out.println("Informe seu estado civil: 's', 'c', 'v', 'd'");
        estadoCivil = scan.next();

        while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")){
            System.out.println("Estado civil inválido, digite novamente");
            estadoCivil = scan.next();
        }
        System.out.println("Seu estado civil é: " + estadoCivil);
    }

}
