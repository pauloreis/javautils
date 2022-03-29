package br.com.util.partterns.strategy;

public class StrategyB implements Strategy{
    public String faz(Modelo modelo){
        return "Strategy Faz B: " + modelo.getPropiedade();
    }
}
