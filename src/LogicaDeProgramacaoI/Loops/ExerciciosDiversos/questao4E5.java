package LogicaDeProgramacaoI.Loops.ExerciciosDiversos;

import java.util.Scanner;


public class questao4E5 {

    public static void main(String[] args) {

        /**
         * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
         * e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
         * Faça um programa que calcule e escreva o número de anos necessários para que a população do país A
         * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
         *
         * Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
         * Valide a entrada e permita repetir a operação.
         */

        Scanner scan = new Scanner(System.in);
//        double populacaoA = 80_000;
//        double populacaoB = 200_000;
//        int anos = 0;
//
//        while(populacaoA < populacaoB) {
//            populacaoA += (populacaoA * 0.03);
//            populacaoB += (populacaoB * 0.015);
//            anos++;
//        }
//        System.out.printf("A população A irá passar a população B em %d anos", anos);
//

        System.out.println("Digite a quantidade da população A:");
        double populacaoA = scan.nextDouble();
        System.out.println("Digite a taxa de crescimento da população A:");
        float taxaA = scan.nextFloat();

        System.out.println("Digite a quantidade da população B:");
        double populacaoB = scan.nextDouble();
        System.out.println("Digite a taxa de crescimento da população B:");
        float taxaB = scan.nextFloat();
        int anos = 0;

        do {
            if(populacaoA > populacaoB) {
                System.out.println("População A ultrapassou a população B");
            } else {
                populacaoA += (populacaoA * (taxaA/100));
                populacaoB += (populacaoB * (taxaB/100));
                anos++;
                System.out.printf("A população A irá passar a população B em %d anos", anos);
            }
        } while(populacaoA < populacaoB);
  }
}
