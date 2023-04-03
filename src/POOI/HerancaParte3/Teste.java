package POOI.HerancaParte3;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(); // tem acesso aos atributos tanto da propria classe quanto da classe mãe
//
//        Professor prof = new Professor();
//
//        Pessoa pessoa = new Pessoa();
//
//        aluno.setNome("Maria");
//
//        prof.setTelefoneCelular("851674861516");
//
//        String telefone = prof.getTelefoneCelular();
//        System.out.println(telefone);
        aluno.metodoQualquer();
        String teste = aluno.getCpf();
        System.out.println(teste);

        //Pessoa aluno = new Aluno(); // não tem acesso aos atributos específicos da classe filha aluno
        //Pessoa professor = new Professor(); // essas duas instancias são muito utilizadas em polimorfismo


    }
}
