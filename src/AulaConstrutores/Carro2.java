package AulaConstrutores;

public class Carro2 {
    protected String cor;
    protected String marca;
    protected String modelo;
    protected boolean isLigado;
    protected int velocidade;

    public Carro2 (String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.isLigado = true;
        this.velocidade = 0;
    }

    public void desligar() {
        isLigado = false;
    }

    public void ligar() {
        isLigado = true;
    }

    public void acelerar() {
        this.velocidade += 10;
        System.out.printf("Você acelerou e sua velocidade é de: %dkm/h", this.velocidade);
    }

    public void frear() {
        this.velocidade -= 10;
        System.out.printf("Você freou e sua velocidade é de: %dkm/h", this.velocidade);
    }

    public void verificarEstadoAtual() {
        System.out.println("O seu " + modelo + " está atualmente a " + this.velocidade + "km/h");
    }

    public boolean isLigado() {
        return this.isLigado;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca; // ou marca.getNome() caso tenha um método getNome a classe Marca
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getVelocidade() {
        return velocidade;
    }

}


