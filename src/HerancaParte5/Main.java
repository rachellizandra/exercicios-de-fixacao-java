package HerancaParte5;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorSalario = new BigDecimal(265);
        Gerente gerente = new Gerente("rachel", 23, valorSalario);

        //System.out.println(gerente.getSalario());

        Empregado empregado1 = new Empregado("diego", 26, valorSalario);
        Empregado empregado2 = new Empregado("amanda", 2, valorSalario);
        gerente.contratar(empregado1);
        gerente.contratar(empregado2);
        String teste = gerente.toString();
        System.out.println(teste);
    }
}
