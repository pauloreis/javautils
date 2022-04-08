package br.com.util.partterns.templateMethod;

public class ClassFilhaA extends ClassPai{
    @Override
    public String fazAlgo(){
        return "Fazendo algo... A";
    }

    @Override
    protected boolean deveFazerAlgo(Boolean valor) {
        // aplicar regra xpto
        return valor;
    }
}
