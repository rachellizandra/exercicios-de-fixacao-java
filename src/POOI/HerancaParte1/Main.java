package POOI.HerancaParte1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        //System.out.println(p1.getNome());
        //System.out.println(p2.getMatricula());
        //System.out.println(p3.getNome());

        p1.setNome("pedro");
        p2.setNome("pedro");
        p3.setNome("pedro");
        p4.setNome("pedro");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());



    }
}
