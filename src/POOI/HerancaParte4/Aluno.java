package POOI.HerancaParte4;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public void verificarAcesso() {
        //this.nomeVisibilidade = "visível pelo this quando o modificador de acesso na classe mãe estava default ou public"; //ou pelo super
        //super.nomeVisibilidade = "visível pelo super quando o modificador de acesso na classe mãe estava default ou public";

        this.setNomeVisibilidade("visivel pq foi criado um metodo set na classe mãe quando o modificador de acesso mudou para private");
        super.setNomeVisibilidade("visivel pq foi criado um metodo set na classe mãe quando o modificador de acesso mudou para private");
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone); // super -> faz referência a superclasse
        this.curso = curso; // this -> faz referência a própria classe
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        super.setCpf("366962626");
            // ou
        //this.setCpf("45441651");
    }


}
