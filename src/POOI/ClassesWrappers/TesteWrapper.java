package POOI.ClassesWrappers;

public class TesteWrapper {
    public static void main(String[] args) {

        // Tipos primitivos no Java
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000L;
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true;
        char a = 'a';

        //OBS: Java é uma linguagem orientada a objetos, porém não é 100% orientada a objetos
        // justamente por causa desses tipos primitivos acima.
        // A partir do Java 5, uma nova funcionalidade foi introduzida que são as classes wrappers
        // que são as classes que representam os tipos primitivos do Java. São essas classes abaixo:

        Short num7;
        // ou:
        // Short num8 = new Short(num1); num1 é um tipo primitivo short
        Short num8 = new Short((short) 1); // ((short) 1) indica o casting do valor short para ser usado na instância corretamente
        Byte num9;
        //Byte num10 = new Byte(num2);
        Byte num10 = new Byte((byte) 10);
        Integer num0 = new Integer(100);
        Long num11 = new Long(10000L);

        Float num12 = new Float(3.5f);
        Double num13 = new Double(3.5555);

        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');

        // problemas com exceptions: NumberFormatException
        // Integer num14 = new Integer("1000hh");
        //Double num15 = new Double("3,5"); //para quem usar pc no brasil

        //Cada classe wrapper possui métodos que irão retornar valores:
        System.out.println(num12.floatValue());

        //Parse -> transformar um valor em outro
        int num16 = Integer.parseInt("10000");
        double num17 = Double.parseDouble("3.555");
        System.out.println(num17);

        // As classes wrappers também possuem métodos valueof que transforma o tipo primitivo em uma instância da classe wrapper
        Integer num18 = Integer.valueOf(1343);
        System.out.println(num18);

        // Para comparar as classes wrappers e sabendo que não se compara instâncias de classes com operador ==
        // utilizamos o método equals
        System.out.println(num13.equals(num6));

    }
}
