package POOI.HerancaParte1;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

//    public Funcionario(String setor, boolean trabalhando) {
//        super(setor, trabalhando);
//    }

    public void mudarTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
