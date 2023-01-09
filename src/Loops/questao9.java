package Loops;

import java.util.Scanner;

public class questao9 {

    public static void main(String[] args) {
        /**
         * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
         */

        for(int numeros = 1; numeros < 50; numeros++) {
            if(numeros % 2 != 0) {
                System.out.println(numeros);
            }
        }
    }
}

