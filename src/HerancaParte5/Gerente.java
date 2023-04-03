package HerancaParte5;

import java.math.BigDecimal;
import java.util.Arrays;

public class Gerente extends Empregado {
    private int contEmpregados;
    private Empregado[] subordinados;

    public Gerente(String nome, int matricula, BigDecimal salario) {
        super(nome, matricula, salario);
        this.subordinados = new Empregado[10];
        //super.salario = BigDecimal.valueOf(salario.doubleValue() * 1.2); // para dar um aumento de 20% no salario do gerente
    }

    @Override
    public void trabalhar() {
        System.out.printf("O gerente %s está trabalhando...", this.getNome());
    }

    public void contratar(Empregado novoEmpregado) {
        this.subordinados[contEmpregados] = novoEmpregado;
        this.contEmpregados++;
    }

    public void demitir(int indiceEmpregado) {
        this.subordinados[contEmpregados] = null;
        this.contEmpregados--;
    }

    public int getContEmpregados() {
        return contEmpregados;
    }

    public void setContEmpregados(int contEmpregados) {
        this.contEmpregados = contEmpregados;
    }

    public Empregado[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Empregado[] subordinados) {
        this.subordinados = subordinados;
    }

    @Override
    public String toString() {
        return "Gerente:" +
                "\nNúmero de empregados = " + contEmpregados +
                "\nNome subordinados = " + Arrays.toString(subordinados) +
                '}';
    }
}
