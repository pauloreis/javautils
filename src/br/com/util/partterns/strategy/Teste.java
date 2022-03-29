package br.com.util.partterns.strategy;

public class Teste {
    // Quando sabemos qual caminho seguir o partner Strategy é mais adequado.
    // Quando não sabemos qual caminho seguir, o partner Factory é mais adequado.

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        modelo.setPropiedade("Propriedade do Modelo");

        UsaStrategy usaStrategy = new UsaStrategy();
        String str = usaStrategy.fazStrategy(modelo, new StrategyB());

        System.out.println(str);
    }
}
