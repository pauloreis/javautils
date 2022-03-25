package br.com.util.polimorfismo;

public class Teste {
    public static void main(String[] args) {

        ClasseA a = new ClasseA();
        ClasseB b = new ClasseB();

        //Classe polimorfica
        //Pode receber A ou B
        ClasseX x = new ClasseX();

        x.setStr("A");
        String srtA = x.metodoX1(a);
        System.out.println(srtA);

        x.setStr("B");
        String strB = x.metodoX1(b);
        System.out.println(strB);
    }
}
