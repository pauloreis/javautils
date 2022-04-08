package br.com.util.partterns.templateMethod;

public class ClassFilhaB extends ClassPai{

    @Override
    public String fazAlgo(){
        return "Fazendo algo... B";
    }

    @Override
    protected boolean deveFazerAlgo(Boolean valor) {
        // aplicar regra xyz
        return valor;
    }
}
