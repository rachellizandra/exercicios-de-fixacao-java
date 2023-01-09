package AulaConstrutores;

import java.util.Scanner;

public class Aula02Carro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        String cor = "vermelho";
//        String marca = "BMW";
//        String modelo = "X5";
//        boolean isLigado = true;
//        int velocidade = 0;

//        Marca bmw = new Marca();
//        bmw.nome = "Teste";
        Carro2 carrodaRachel = new Carro2("vermelho", "bmw", "X5");
        System.out.println("Características do carro: " + carrodaRachel.cor + ", " + carrodaRachel.marca + ", " + carrodaRachel.modelo);

        int escolha;

        while(carrodaRachel.isLigado()) {
            System.out.println();
            System.out.println("Escolha uma operação");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Estado atual");
            System.out.println("0 - Desligar");
            System.out.printf("Operação: ");

            escolha = scan.nextInt();

            if(escolha == 0) {
                carrodaRachel.desligar();
            } else if(escolha == 1) {
                carrodaRachel.acelerar();
            } else if(escolha ==2) {
                if(carrodaRachel.velocidade > 0) {
                    carrodaRachel.frear();
                }else {
                    carrodaRachel.desligar();
                }
            } else if(escolha ==3) {
                carrodaRachel.verificarEstadoAtual();
            } else {
                System.out.println("Digite uma escolha válida");
            }

        }
        System.out.println("Carro desligado");
    }
}
