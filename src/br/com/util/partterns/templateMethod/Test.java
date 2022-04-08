package br.com.util.partterns.templateMethod;

public class Test {
    public static void main(String[] args) {
        ClassPai a = new ClassFilhaA();
        String valor = a.fazerSimOuNao(false);
        System.out.println(valor);
    }
}
