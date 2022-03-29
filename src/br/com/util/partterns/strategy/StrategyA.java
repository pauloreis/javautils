package br.com.util.partterns.strategy;

public class StrategyA implements Strategy{
    public String faz(Modelo modelo){
        return "Strategy Faz A: " + modelo.getPropiedade();
    }
}
