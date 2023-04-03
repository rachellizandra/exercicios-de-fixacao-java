package POOI.EncapsulamentoParte2;

public class Main {
    public static void main(String[] args) {
        Conta contaDaRachel = new Conta("Rachel", "123", 500.50);

        Conta contaDaThamires = new Conta("Thamires", "555", 250.66);

        System.out.println("Valor antes do saque: " + contaDaRachel.getSaldo());

        contaDaRachel.sacar(20.50);

        System.out.println("Valor depois do saque: " + contaDaRachel.getSaldo());

        contaDaRachel.transferir(25.99, contaDaThamires);

        System.out.println("Saldo Rachel: " + contaDaRachel.getSaldo() + "\nSaldo Thamires: " + contaDaThamires.getSaldo());

    }



}
