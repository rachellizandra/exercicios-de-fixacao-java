package POOI.EncapsulamentoParte1;

//para consultar qualquer pessoas

public class ConsultarPessoa{
    public Pessoa[] consultarPessoaPorNome(Pessoa[] pessoas, String nome) {
        Pessoa[] pessoasEncontradas = new Pessoa[pessoas.length];
        int contPessoas = 0;

        for(int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getNome().equals(nome)) {
                pessoasEncontradas[contPessoas++] = pessoas[i];
            }
        }

        Pessoa[] retorno = new Pessoa[contPessoas];

        for(int i = 0; i < contPessoas; i++) {
            retorno[i] = pessoasEncontradas[i];
        }
        return retorno;
    }
}
