package br.com.util.partterns.strategy;

public class UsaStrategy {
    public String fazStrategy(Modelo modelo, Strategy strategy){
        return strategy.faz(modelo);
    }
}
