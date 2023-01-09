package AulaConstrutores;

public class MainTeste {

    public static void main(String[] args) {
        Suv suv = new Suv("TESTE1", "TESTE2", "TESTE3", true);

        System.out.println(suv.cor + suv.marca + suv.modelo);
    }
}
