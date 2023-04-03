package POOI.AulaConstrutores;

public class Suv extends Carro2 {

    private boolean isQuatroPorQuatro;

//    public Suv(String cor, String marca, String modelo, boolean isLigado, int velocidade, boolean isQuatroPorQuatro) {
//        super(cor, marca, modelo, isLigado, velocidade);
//        this.isQuatroPorQuatro = isQuatroPorQuatro;
//    }

    public Suv(String cor, String marca, String modelo, boolean isQuatroPorQuatro) {
        super(cor, marca, modelo);
        this.isQuatroPorQuatro = isQuatroPorQuatro;
    }

    public boolean isQuatroPorQuatro() {
        return isQuatroPorQuatro;
    }

    public void setQuatroPorQuatro(boolean quatroPorQuatro) {
        isQuatroPorQuatro = quatroPorQuatro;
    }
}
