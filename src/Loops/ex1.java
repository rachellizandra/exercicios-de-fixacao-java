package Loops;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //FOR -> o for é utilizado quando sabemos quantas vezes iremos executar um determinado comando ou código
        for(int cont =0; cont < 5; cont++) {
            System.out.println(cont + "- Rachel Lizandra");
        }
        System.out.println("Fim do programa");

        //WHILE -> é utilizado quando não sabemos quantas vezes o código será executado
        int cont = 0;
        while(cont < 5) {
            System.out.println(cont + "- Rachel Lizandra");
            cont++;
        }
        System.out.println("Fim do programa");

        // outro exemplo:
//        System.out.println("Digite quantas vezes você quer imprimir seu nome:");
//        int max = scan.nextInt();
//        int cont = 0;
//        while(cont < max) {
//            System.out.println(cont + "- Rachel Lizandra");
//            cont++;
//        }
//        System.out.println("Fim do programa");

        //DO-WHILE -> é utilizado quando sabemos que o comando ou código deve ser executado pelo menos 1 vez
        do {
            System.out.println(cont + "- Rachel Lizandra");
            cont++;
        } while(cont < 0);

    }

}
