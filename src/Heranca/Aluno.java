package Heranca;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    //public Aluno(int matricula, String curso) {
//        super(matricula, curso);
//    }

    public void cancelarMatricula() {
        System.out.println("Matricula cancelada do aluno: " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
