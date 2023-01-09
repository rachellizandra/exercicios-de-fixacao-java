package Arrays;

import java.util.Arrays;

public class ex2 {

    public static void main(String[] args) {
        final int tam = 8;
        int[] num = new int[tam];
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] numerosAleatorios = {9, 5, 8, 6, 3, 2, 4, 7};

        num[0] = 10;
        num[1] = 8;
        num[2] = 15;
        num[3] = 0;
        num[4] = 20;


        //Arrays.sort(numerosAleatorios);
        //Arrays.fill(numerosAleatorios, 10);
        //System.arraycopy(numeros, 0, numerosAleatorios, 0, tam);

        System.out.printf("Os arrays são iguais? %s ", Arrays.equals(numeros, numerosAleatorios) ? "Sim" : "Não");

        for(int i =0; i < numerosAleatorios.length; i++) {
            System.out.println(numerosAleatorios[i]);
        }
        System.out.println();

        for(int i =0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // ou

        for(int n : numeros) {
            System.out.printf("\n - %d", n);
        }
    }

}
