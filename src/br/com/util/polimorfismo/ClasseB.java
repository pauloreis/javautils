package br.com.util.polimorfismo;

//Classe que implementa contrato (Interface)
public class ClasseB implements Contrato{

    private ClasseXUtil xUtil;

    //Instanciamos a classe que implementa
    public ClasseB() {
        this.xUtil = new ClasseXUtil();
    }

    //Utilizamos a classe que implementa para não repetir código na classeA
    @Override
    public String metodoC1(String str) {
        return this.xUtil.implementacao(str);
    }
}
