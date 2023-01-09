package Loops;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        /**
         * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual
         * ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
         */

        Scanner scan = new Scanner(System.in);
        String usuario, senha;

        System.out.println("Digite o nome de usuario: ");
        usuario = scan.nextLine();

        do{
            System.out.println("Digite a senha: ");
            senha = scan.nextLine();

            if(senha.equals(usuario)){
                System.out.println("A senha não pode ser igual ao nome de usuario! tente novamente.");
            }
        }while(senha.equals(usuario));
    }

}
