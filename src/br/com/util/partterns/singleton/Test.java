package br.com.util.partterns.singleton;

public class Test {
    public static void main(String[] args) {
        // Não conseguimos instanciar class A pois o contrutor esta privado
        //ClassA a = new ClassA();

        //O metodo public getInstance é quem gerencia a instanciação dessa classe.
        ClassA.getInstance().setValue(false);
        ClassA.getInstance().trueOrFalse();
    }
}
