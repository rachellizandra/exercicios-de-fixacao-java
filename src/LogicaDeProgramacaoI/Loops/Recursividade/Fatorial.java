package LogicaDeProgramacaoI.Loops.Recursividade;

import javax.swing.*;

public class Fatorial {
    //Método recursivo para cálculo de fatorial
    public int fatorialRecursivo(int num) {
        if(num == 0) {
            return 1;
        }
        return num * fatorialRecursivo(num - 1);
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));

        Fatorial fatorial = new  Fatorial();

        number = fatorial.fatorialRecursivo(number);

        JOptionPane.showMessageDialog(null, "O fatorial é: " + number);
    }
}
