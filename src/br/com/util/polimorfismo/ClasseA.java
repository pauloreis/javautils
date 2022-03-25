package br.com.util.polimorfismo;

//Classe que implementa contrato
public class ClasseA implements Contrato{

    private ClasseXUtil xUtil;

    //Instanciamos a classe que implementa
    public ClasseA() {
        this.xUtil = new ClasseXUtil();
    }

    //Utilizamos a classe que implementa para não repetir código na classeB
    @Override
    public String metodoC1(String str) {
        return this.xUtil.implementacao(str);
    }
}
