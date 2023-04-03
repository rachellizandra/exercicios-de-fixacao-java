package POOI.EncapsulamentoParte2;

public class Conta {
    protected String titular;
    protected String numeroDaConta;
    protected double saldo;

    public Conta(String titular, String numeroDaConta, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(this.saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double valor) {
        double novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);
    }

    public void depositar(double valor) {
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);
    }

    public void transferir(double valor, Conta contaDestino) {
        double novoSaldoContaOrigem = getSaldo() - valor;
        double novoSaldoContaDestino = contaDestino.getSaldo() + valor;

        setSaldo(novoSaldoContaOrigem);

        contaDestino.setSaldo(novoSaldoContaDestino);
    }

    public void pagar(double valor) {
        double novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);
    }
}
