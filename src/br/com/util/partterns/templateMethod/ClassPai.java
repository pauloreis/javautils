package br.com.util.partterns.templateMethod;

public abstract class ClassPai {
    protected abstract String fazAlgo();
    protected abstract boolean deveFazerAlgo(Boolean valor);

    public String fazerSimOuNao(Boolean valor){
        if(deveFazerAlgo(valor)){
            return fazAlgo();
        }
        return "Não faz nada";
    }
}
