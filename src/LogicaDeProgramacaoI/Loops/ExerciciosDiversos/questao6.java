package LogicaDeProgramacaoI.Loops.ExerciciosDiversos;

public class questao6 {
    public static void main(String[] args) {
        /**
         * Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
         * Depois modifique o programa para que ele mostre os números um ao lado do outro.
         *
         */

        int numeros = 0;
        while(numeros < 20) {
            numeros++;
            System.out.println(numeros);
            //System.out.printf("%d ", numeros);
        }
    }
}
