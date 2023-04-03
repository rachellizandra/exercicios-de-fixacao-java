package POOI.EncapsulamentoParte1;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        Coordenador coord = new Coordenador();
        Livro livro = new Livro();
        Pessoa pessoa = new Pessoa();

        aluno.setNome("Raissa");
        System.out.println(aluno.getNome());

        //consultarPessoaPorNome(); verificar com o professor
    }

}
