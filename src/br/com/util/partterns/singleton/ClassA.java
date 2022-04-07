package br.com.util.partterns.singleton;

public class ClassA {
    private Boolean value;

    private static ClassA instancia;

    // Construtor default private impede a instanciação da classe fora dela mesma.
    private ClassA() {

    }

    // para pegar a instancia da classe verificamos se ainda não foi instanciada por segurança.
    // se ja foi, retornamos ela mesma
    public static synchronized ClassA getInstance(){
        if(instancia == null){
            instancia = new ClassA();
        }
        return instancia;
    }

    public void trueOrFalse(){
        System.out.println("Setou: " + this.value);
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
